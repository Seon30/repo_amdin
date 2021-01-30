package com.pptware.repomaster.repoadmin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.domain.RepoAdminWindowsPython;
import com.pptware.repomaster.repoadmin.service.RepoAdminUserService;
import com.pptware.repomaster.repoadmin.service.RepoAdminWindowsPythonService;

@RestController
public class RepoWindowsPythonController {

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminWindowsPythonService")
	RepoAdminWindowsPythonService windowsPythonService;

	@ResponseBody
	@RequestMapping(value = "/getPythonDetail1", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail1(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail1();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

					System.out.println("pkgkey값-------"+tempVo.getFile_version());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	

	@ResponseBody
	@RequestMapping(value = "/getPythonDetail2", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail2(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail2();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail3", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail3(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail3();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail4", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail4(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail4();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail5", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail5(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail5();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail6", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail6(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail6();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail7", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail7(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail7();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail8", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail8(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail8();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail9", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail9(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail9();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail10", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail10(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail10();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail11", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail11(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail11();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/getPythonDetail12", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail12(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail12();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@RequestMapping(value = "/getPythonDetail13", method = RequestMethod.POST)
	public List<RepoAdminWindowsPython> getPythonDetail13(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminWindowsPython> returnList = new ArrayList<RepoAdminWindowsPython>();
			try {
				List<RepoAdminWindowsPython> tempList = null;
				tempList = windowsPythonService.getPythonDetail13();
				RepoAdminWindowsPython tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

//					System.out.println("pkgkey값-------"+tempVo.getPkgkey());
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	
	// Pythondesc	
		@RequestMapping(value = "/goPythonDescPage", method = RequestMethod.POST, produces = "application/json")
		private ModelAndView goPythonDescPage(String pkgkey,String table_type) {
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("pkgkey",pkgkey);
			mav.addObject("table_type",table_type);
			
			mav.setViewName("down/windowPythonDesc");
			try {
				System.out.println("이건키++++++++++++"+pkgkey+"이건 타입+++++++++++"+table_type);

			} catch (Exception e) {
				e.printStackTrace();
			}
			return mav;
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

//			 response.sendRedirect("/login");
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