package com.pptware.repomaster.repoadmin.controller;

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
import org.springframework.web.multipart.MultipartFile;

import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserPackage;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository;
import com.pptware.repomaster.repoadmin.service.RepoAdminFileDownLoadService;
import com.pptware.repomaster.repoadmin.service.RepoAdminUserRepositoryService;

@Controller
public class RepoAdminUserRepoController {
	private static final Logger logger = LoggerFactory.getLogger(RepoAdminRepoController.class);

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminUserRepositoryService")
	RepoAdminUserRepositoryService userRepoService;
	

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminFileDownLoadService")
	RepoAdminFileDownLoadService repoAdminFileDownService;

	@RequestMapping(value = "/userRepoMng", method = RequestMethod.GET, produces = "application/json")
	private String userRepoMng(Model model, HttpServletRequest request) {

		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}

		return "userRepo/userRepoManage";
	}

	@ResponseBody
	@RequestMapping(value = "/userRepoMngSearch", method = RequestMethod.POST, produces = "application/json")
	private List<RepoAdminUserRepository> userRepoMngSearch(HttpServletRequest request) {
		HttpSession session = request.getSession();
		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
		
		return userRepoService.retrieveUserRepoList(loginVO.getEmp_no());

	}
	
	@ResponseBody
	@RequestMapping(value = "/userPackMngSearch", method = RequestMethod.POST, produces = "application/json")
	private List<RepoAdminUserPackage> userPackMngSearch(int user_repo_idx, HttpServletRequest request) {
		HttpSession session = request.getSession();
		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
		
		return userRepoService.retrieveUserPackList(user_repo_idx , loginVO.getEmp_no());

	}
	
	@ResponseBody
	@RequestMapping(value = "/userFileMngSearch", method = RequestMethod.POST, produces = "application/json")
	private List<RepoAdminUserPackage> userFileMngSearch(int user_pack_idx, HttpServletRequest request) {
		HttpSession session = request.getSession();
		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
		
		return userRepoService.retrieveUserFileList(user_pack_idx , loginVO.getEmp_no());

	}

	@ResponseBody
	@RequestMapping(value = "/createUserRepo", method = RequestMethod.POST, produces = "application/json")
	private Map<String, String> createUserRepo(String c_repo_name, HttpServletRequest request) {

		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");

		Map<String, String> returnParam = userRepoService.createUserRepo(c_repo_name, loginVO.getEmp_no());

		return returnParam;

	}

	@ResponseBody
	@RequestMapping(value = "/uploadUserPackages", method = RequestMethod.POST, produces = "application/json")
	private Map<String, String> uploadUserPackages(MultipartFile[] uploadFile, int package_idx,HttpServletRequest request) {

		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");

		Map<String, String> returnParam = userRepoService.uploadUserPackages(uploadFile, package_idx,loginVO.getEmp_no());

		return returnParam;

	}
	
	@ResponseBody
	@RequestMapping(value = "/createPackages", method = RequestMethod.POST, produces = "application/json")
	private Map<String, String> createPackages(int repo_idx, String c_pack_name,HttpServletRequest request) {

		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");

		Map<String, String> returnParam = userRepoService.createUsrePacakges(repo_idx, c_pack_name,loginVO.getEmp_no());

		return returnParam;

	}
	@ResponseBody
	@RequestMapping(value = "/excludeUserFile", method = RequestMethod.POST, produces = "application/json")
	private Map<String, String> excludeUserFile(int fild_idx, String exclude_rsn, String exclude_key,HttpServletRequest request) {

		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");

		Map<String, String> returnParam = userRepoService.excludeUserFile(fild_idx, exclude_rsn, exclude_key, loginVO.getEmp_no());

		return returnParam;
	}

	
	@ResponseBody
	@RequestMapping(value = "/delUserFile", method = RequestMethod.POST, produces = "application/json")
	private Map<String, String> delUserFile(int fild_idx, HttpServletRequest request) {

		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");

		Map<String, String> returnParam = userRepoService.delUserFile(fild_idx, loginVO.getEmp_no());

		return returnParam;
	}
	
	@ResponseBody
	@RequestMapping(value = "/delUserPack", method = RequestMethod.POST, produces = "application/json")
	private Map<String, String> delUserPack(int user_pack_idx, HttpServletRequest request) {

		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");

		Map<String, String> returnParam = userRepoService.delUserPack(user_pack_idx, loginVO.getEmp_no());

		return returnParam;
	}
	
	@ResponseBody
	@RequestMapping(value = "/delUserRepo", method = RequestMethod.POST, produces = "application/json")
	private Map<String, String> delUserRepo(int user_repo_idx, HttpServletRequest request) {

		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");

		Map<String, String> returnParam = userRepoService.delUserRepo(user_repo_idx, loginVO.getEmp_no());

		return returnParam;
	}
	
	@ResponseBody
	@RequestMapping(value = "/fileDownChecker", method = RequestMethod.POST, produces = "application/json")
	private Map<String, String> fileDownChecker(int repo_idx, int file_idx, HttpServletRequest request) {

		return repoAdminFileDownService.fileDownChecker(repo_idx,file_idx);
	}
	
	@RequestMapping(value = "/fileDownLoad")
	public void fileDownload(@RequestParam("repo_idx") int repo_idx,@RequestParam("file_idx") int file_idx ,String down_prog_id, HttpSession session, HttpServletRequest request, HttpServletResponse response ){
		
		try {
			
			repoAdminFileDownService.filDown(request, response,repo_idx, file_idx,down_prog_id); //파일다운로드 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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