package com.pptware.repomaster.repoadmin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
import com.pptware.repomaster.repoadmin.domain.RepoAdminUbuntu;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.service.RepoAdminUbuntuService;


@RestController
public class RepoAdminUbuntuController {

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminUbuntuService")
	RepoAdminUbuntuService ubuntuService;
	
	@ResponseBody
	@RequestMapping(value = "/versionList", method = RequestMethod.POST)
	public List<RepoAdminUbuntu> versionList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUbuntu> returnList = new ArrayList<RepoAdminUbuntu>();
			try {
				List<RepoAdminUbuntu> tempList = null;
				tempList = ubuntuService.versionList();
				RepoAdminUbuntu tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);
				System.out.println("■■■■■■■■■■■■■ Version_idx = ["+tempVo.getVersion_idx()+"]");
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@RequestMapping(value = "/goPackList", method = RequestMethod.POST, produces = "application/json")
	private ModelAndView goPackList(String version) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("version",version);
		mav.setViewName("ubuntu/ubuntuPackList");
		try {
			System.out.println("이건키++++++++++++"+version);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}	
	
	
	@ResponseBody
	@RequestMapping(value = "/allPackageList", method = RequestMethod.POST)
	public List<RepoAdminUbuntu> allPackageList(String version, Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUbuntu> returnList = new ArrayList<RepoAdminUbuntu>();

			try {
				List<RepoAdminUbuntu> tempList = null;
				tempList = ubuntuService.allPackageList(version);
				RepoAdminUbuntu tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

					}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@RequestMapping(value = "/goPackDesc", method = RequestMethod.POST, produces = "application/json")
	private ModelAndView goPackDesc(String idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("idx",idx);
		mav.setViewName("ubuntu/ubuntuPackDesc");
		try {
			System.out.println("이건키++++++++++++"+idx);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}	

	@ResponseBody
	@RequestMapping(value = "/packageDesc", method = RequestMethod.POST)
	public List<RepoAdminUbuntu> packageDesc(String idx, Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUbuntu> returnList = new ArrayList<RepoAdminUbuntu>();
	
		System.out.println("idxidxidxidxidxidxidxidxidxidx="+idx);
			try {
				List<RepoAdminUbuntu> tempList = null;
				tempList = ubuntuService.packageDesc(idx);
				RepoAdminUbuntu tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

					}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
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