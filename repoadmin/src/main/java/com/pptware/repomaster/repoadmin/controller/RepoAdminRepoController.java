package com.pptware.repomaster.repoadmin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;
import com.pptware.repomaster.repoadmin.domain.RepoAdminDown;
import com.pptware.repomaster.repoadmin.domain.RepoAdminExcludeFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.service.RepoAdminRepositoryService;
import com.pptware.repomaster.repoadmin.service.RepoAdminUserService;


@Controller
public class RepoAdminRepoController {

	private static final Logger logger = LoggerFactory.getLogger(RepoAdminRepoController.class);

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminUserService")
	RepoAdminUserService userService;
	
	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminRepositoryService")
	RepoAdminRepositoryService repositoryService;
	
	
	@RequestMapping(value = "/userSearch", method = RequestMethod.GET, produces = "application/json")
	private String userSearch(HttpServletRequest request, Model model) {
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}		
		model.addAttribute("repo_name","user");
		model.addAttribute("repo_idx", "0");
		return "search/searchBrowser";
	}

	@RequestMapping(value = "/pythonSearch", method = RequestMethod.GET, produces = "application/json")
	private String pythonSearch(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		model.addAttribute("repo_name", "python");
		model.addAttribute("repo_idx", "1");
		
		return "search/searchBrowser";

	}
	

	@RequestMapping(value = "/centOS7Search", method = RequestMethod.GET, produces = "application/json")
	private String centOS7Search(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		model.addAttribute("repo_name","centos7");
		model.addAttribute("repo_idx", "2");
		return "search/searchBrowser";
	}

	@RequestMapping(value = "/centOS8Search", method = RequestMethod.GET, produces = "application/json")
	private String centOS8Search(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		model.addAttribute("repo_name","centos8");
		model.addAttribute("repo_idx", "3");
		return "search/searchBrowser";
	}	
	
	
	
	@RequestMapping(value = "/searchView", method = RequestMethod.POST, produces = "application/json")
	private ModelAndView searchView(String repo_idx , String c_date_s ,String upld_file_size, String search_header_text , String repo_name) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("repo_name",repo_name);
		mav.addObject("repo_idx",repo_idx);
		mav.addObject("c_date",c_date_s);
		mav.addObject("upld_file_size",upld_file_size);
		mav.addObject("search_header_text",search_header_text);
		
		mav.setViewName("search/searchBrowser");
		return mav;

	}
	
	@ResponseBody
	@RequestMapping(value = "/fileSearch", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminFile> fileSearch(String filename , String c_date, String repo_idx) {
		List<RepoAdminFile> responseParam = new ArrayList<RepoAdminFile>();
		System.out.println("들어왔니???????????????????????????file_name="+filename+"랑 repo_idx="+repo_idx);
		
		try {
			if(c_date.equals("")){
				responseParam = repositoryService.retrieveFileSearchData(filename,repo_idx);
			}else{
				responseParam = repositoryService.retrieveFileUpdateData(c_date,repo_idx);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}
	
	
	@ResponseBody
	@RequestMapping(value = "/ecxludeFileSearch", method = RequestMethod.POST, produces = "application/json")
	private List<RepoAdminFile> ecxludeFileSearch() {
		List<RepoAdminFile> responseParam = new ArrayList<RepoAdminFile>();
		try {
//				responseParam = repositoryService.excludeFileSearchData();
				
				List<RepoAdminFile> tempList = null;
				tempList = repositoryService.excludeFileSearchData();
				RepoAdminFile tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					responseParam.add(i, tempVo);
				
					System.out.println("pkgkey값-------"+tempVo.getExclude_rsn());
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}

	
	@RequestMapping("/excludeBrowser" )
	public String ecxcludeBrowser(HttpServletRequest request, Model model) {
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		} 
		return "search/excludeBrowser";
	}
		
	@ResponseBody
	@RequestMapping( value = "/insertExcludeFile",  method = RequestMethod.POST, produces = "application/json")
	    public List<RepoAdminFile> excludefile(RepoAdminExcludeFile vo ,String file_name , String c_date, String repo_idx, HttpServletRequest request, HttpServletResponse response){

		List<RepoAdminFile> responseParam = new ArrayList<RepoAdminFile>();
			HttpSession session = request.getSession();

			RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
			vo.setC_emp_no(loginVO.getEmp_no());
			vo.setU_emp_no(loginVO.getEmp_no());

			try {
				repositoryService.insertExclude(vo);
				repositoryService.updateFileExcludeData(vo.getExclude_idx());
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					if(c_date.equals("")){
						responseParam = repositoryService.retrieveFileSearchData(file_name,repo_idx);
					}else{
						responseParam = repositoryService.retrieveFileUpdateData(c_date,repo_idx);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
			return responseParam ;
		}

	
	@ResponseBody
	@RequestMapping( value = "/deleteExclude",  method = RequestMethod.POST, produces = "application/json")
	    public List<RepoAdminFile> deleteExclude(RepoAdminExcludeFile vo, Model model, HttpServletRequest request, HttpServletResponse response){
			List<RepoAdminFile> responseParam = new ArrayList<RepoAdminFile>();
			HttpSession session = request.getSession();

			RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
			vo.setC_emp_no(loginVO.getEmp_no());
			vo.setU_emp_no(loginVO.getEmp_no());
			try {
				repositoryService.deleteExclude(vo);
				repositoryService.updateFileExcludeDataN(vo.getFile_idx());
				responseParam = repositoryService.excludeFileSearchData();
			} catch (Exception e) {

				e.printStackTrace();
			}
			return responseParam;
		}
	

	@RequestMapping("/excludeList" )
	public String excludeList(HttpServletRequest request, Model model) {
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}return "search/excludeList";
	}
	
	@RequestMapping(value = "/excludeListSearch", method = RequestMethod.POST , produces = "application/json")
	public String excludeList(@RequestParam String file_name,  Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUser> returnList = null;
		RepoAdminExcludeFile eFile = new RepoAdminExcludeFile();
		try {
			repositoryService.excludeFileList();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:search/searchExclude";

	}
	
	@RequestMapping(value = "/downloadList", method = RequestMethod.GET)
	public String downloadList(HttpServletRequest request, Model model) {
	if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "downloadList";
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "/downloadListSearch", method = RequestMethod.POST, produces = "application/json")
	public List<RepoAdminDown> downloadSearch(HttpServletRequest request){
		
		List<RepoAdminDown> responseParam = new ArrayList<RepoAdminDown>();
		
		try {
			
			responseParam = repositoryService.downloadListSearch();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return responseParam;
		
	}
	
	
	
	
	
	

	
	private boolean checkSession(HttpServletRequest request) {

		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
		
		if (ObjectUtils.isEmpty(loginVO)) {
			if (excludeUrl(request)) {

				return true;

			} else if (isAjaxRequest(request)) {

				return true;

			} else {

//				 response.sendRedirect("/login");
				return false;
			}

		} else {

			if (loginVO == null) {

				return false;

			}

			session.setMaxInactiveInterval(60 * 60);
			return true;

		}

	}

	private boolean excludeUrl(HttpServletRequest request) {

		String uri = request.getRequestURI().toString().trim();

		if (uri.indexOf("Login") > -1 || uri.indexOf("login") > -1 || uri.indexOf("logout") > -1
				|| uri.indexOf("resources") > -1) {
			return true;
		} else
			return false;
	}
	
	

	private boolean isAjaxRequest(HttpServletRequest req) {

		String ajaxHeader = "AJAX";

		return req.getHeader(ajaxHeader) != null && req.getHeader(ajaxHeader).equals(Boolean.TRUE.toString());

	}
		

}
