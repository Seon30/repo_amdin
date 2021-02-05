package com.pptware.repomaster.repoadmin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;
import com.pptware.repomaster.repoadmin.domain.RepoAdminFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUbuntu;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUpdateHis;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf;
import com.pptware.repomaster.repoadmin.service.RepoAdminCentOS7Service;
import com.pptware.repomaster.repoadmin.service.RepoAdminCentOS8Service;
import com.pptware.repomaster.repoadmin.service.RepoAdminUbuntuService;
import com.pptware.repomaster.repoadmin.service.RepoAdminUserService;

@Controller
public class RepoAdminCentOSController {

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminCentOS7Service")
	RepoAdminCentOS7Service centOS7Serivce;

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminCentOS8Service")
	RepoAdminCentOS8Service centOS8Serivce;
	
	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminUbuntuService")
	RepoAdminUbuntuService ubuntuService;
	
	
	@ResponseBody
	@RequestMapping(value = "/centOS7osList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS7osList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
			try {
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS7Serivce.getCentOS7osList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);
					returnList.add(i, tempVo);

				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	

	@ResponseBody
	@RequestMapping(value = "/centOS7extrasList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS7extrasList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
		try {
				
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS7Serivce.getCentOS7extrasList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/centOS7plusList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS7plusList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
			try {
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS7Serivce.getCentOS7plusList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/centOS7updatesList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS7updatesList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
			try {
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS7Serivce.getCentOS7updatesList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}		
	
// CentOS7desc	
	@RequestMapping(value = "/goCentOS7DescPage", method = RequestMethod.POST, produces = "application/json")
	private ModelAndView goCentOS7DescPage(String pkgkey,String table_type) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("pkgkey",pkgkey);
		mav.addObject("table_type",table_type);
		
		mav.setViewName("search/centOS7desc");
		try {
			System.out.println("이건키++++++++++++"+pkgkey+"이건 타입+++++++++++"+table_type);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}	
	
// getCentOSdetail
	@ResponseBody	
	@RequestMapping(value = "/getCentOS7Detail", method = RequestMethod.POST, produces = "application/json")
	public Map<String,List<RepoAdminCentOSPrimaryPackages>> getCenOSDetail(String pkgkey,String table_type, Model model, HttpServletRequest request, HttpServletResponse response) {
		Map<String,List<RepoAdminCentOSPrimaryPackages>> tempMap = null;
		try {
			tempMap = centOS7Serivce.getCentOS7OSdetail(pkgkey,table_type);
			System.out.println("[getCentOS8Detaigl][pkgkey] >> " + pkgkey);
			System.out.println("[getCentOS8Detail][table_type] >> " + table_type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("[getCentOS8Detail][returnMap] >> " + tempMap.toString());
		return tempMap;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/searchCentOS7osList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS7osList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
		
		try {
				responseParam = centOS7Serivce.searchCentOS7osList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}

	@ResponseBody
	@RequestMapping(value = "/searchCentOS7extrasList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS7extrasList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
		
		try {
				responseParam = centOS7Serivce.searchCentOS7extrasList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}	

	@ResponseBody
	@RequestMapping(value = "/searchCentOS7updatesList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS7updatesList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
		
		try {
				responseParam = centOS7Serivce.searchCentOS7updatesList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}

	@ResponseBody
	@RequestMapping(value = "/searchCentOS7plusList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS7plusList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
	
		try {
				responseParam = centOS7Serivce.searchCentOS7plusList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}	

	
	
	
	@ResponseBody
	@RequestMapping(value = "/fileSearch2", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> fileSearch(String filename,String select_name) {
		
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
		
		try {
			if(select_name.equals("appstream")){
				responseParam = centOS8Serivce.searchCentOS8appstreamList(filename);
			}else if(select_name.equals("baseos")) {
				responseParam = centOS8Serivce.searchCentOS8baseosList(filename);
			}else if(select_name.equals("plus")) {
				responseParam = centOS8Serivce.searchCentOS8plusList(filename);
			}else if(select_name.equals("extras")) {
				responseParam = centOS8Serivce.searchCentOS8extrasList(filename);
			}else if(select_name.equals("powertools")) {
				responseParam = centOS8Serivce.searchCentOS8powertoolsList(filename);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}

	@ResponseBody
	@RequestMapping(value = "/fileSearch3", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> fileSearch3(String filename,String select_name) {
		System.out.println("이거마자ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();

		try {
			if(select_name.equals("os")){
				responseParam = centOS7Serivce.searchCentOS7osList(filename);
			}else if(select_name.equals("extras")) {
				responseParam = centOS7Serivce.searchCentOS7extrasList(filename);
			}else if(select_name.equals("plus")) {
				responseParam = centOS7Serivce.searchCentOS7plusList(filename);
			}else if(select_name.equals("updates")) {
				responseParam = centOS7Serivce.searchCentOS7updatesList(filename);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}
	

	
	@ResponseBody
	@RequestMapping(value = "/fileSearch4", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminUbuntu> fileSearch4(String filename,String select_name) {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		List<RepoAdminUbuntu> responseParam = new ArrayList<RepoAdminUbuntu>();

		try {
			if(select_name.equals("focal")){
				responseParam = ubuntuService.searchFocalPackList(filename);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}
	
	@ResponseBody
	@RequestMapping(value = "/centOS8appstreamList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS8appstreamList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
			try {
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS8Serivce.getCentOS8appstreamList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	

	@ResponseBody
	@RequestMapping(value = "/centOS8baseosList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS8baseosList(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
		
		try {
				
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS8Serivce.getCentOS8baseosList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);
					returnList.add(i, tempVo);
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/centOS8extrasList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS8extrasList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
			try {
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS8Serivce.getCentOS8extrasList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}	
	
	@ResponseBody
	@RequestMapping(value = "/centOS8plusList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS8plusList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
			try {
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS8Serivce.getCentOS8plusList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}		

	@ResponseBody
	@RequestMapping(value = "/centOS8powertoolsList", method = RequestMethod.POST)
	public List<RepoAdminCentOSPrimaryPackages> centOS8powertoolsList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminCentOSPrimaryPackages> returnList = new ArrayList<RepoAdminCentOSPrimaryPackages>();
			try {
				List<RepoAdminCentOSPrimaryPackages> tempList = null;
				tempList = centOS8Serivce.getCentOS8powertoolsList();
				RepoAdminCentOSPrimaryPackages tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}		
	
	
// CentOS8desc	
	@RequestMapping(value = "/goCentOS8DescPage", method = RequestMethod.POST, produces = "application/json")
	private ModelAndView goCentOS8DescPage(String pkgkey,String table_type) {
		ModelAndView mav = new ModelAndView();
		//2. 화면 이동 했음 
		
		mav.addObject("pkgkey",pkgkey); // 화면에서 받은 pkgkey 
		mav.addObject("table_type",table_type);  // 화면에서 받은 table_type
		
		mav.setViewName("search/centOS8_stream_desc"); //리턴해줄 view(jsp ) 

		
		System.out.println("[goCentOS8DescPage]:[pkgkey] >> "+ pkgkey);

		System.out.println("[goCentOS8DescPage]:[table_type] >> "+ table_type);
		
		return mav;
	}	
	
	@RequestMapping(value = "/goFocalPackDescPage", method = RequestMethod.POST, produces = "application/json")
	private ModelAndView goFocalPackDescPage(String idx) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("idx",idx);
		mav.setViewName("search/focalPackDesc");
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}	
	
//	@ResponseBody
//	@RequestMapping(value = "/getUbuntuDetail", method = RequestMethod.POST, produces = "application/json")	
//	private List<RepoAdminUbuntu> getUbuntuDetail(String idx,Model model, HttpServletRequest request, HttpServletResponse response) {
//		List<RepoAdminUbuntu> responseParam = new ArrayList<RepoAdminUbuntu>();
//		System.out.println("들어왔니???????????????????????????file_name="+idx+"랑 repo_idx=");
//		
//		try {
//				responseParam = ubuntuService.getUbuntuDetail(idx);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return responseParam;
//	}
//	
	
	// getCentOSdetail
		@ResponseBody	
		@RequestMapping(value = "/getUbuntuDetail", method = RequestMethod.POST, produces = "application/json")
		public Map<String,List<RepoAdminUbuntu>> getUbuntuDetail(String idx,String table_type, Model model, HttpServletRequest request, HttpServletResponse response) {
			Map<String,List<RepoAdminUbuntu>> tempMap = null;
			table_type = "focal";
			try {
				tempMap = ubuntuService.getUbuntuDetail(idx,table_type);
				System.out.println("[getCentOS8Detaigl][pkgkey] >> " + idx);
				System.out.println("[getCentOS8Detail][table_type] >> " + table_type);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("[getCentOS8Detail][returnMap] >> " + tempMap.toString());
			return tempMap;
		}	
	
	
	
// getCentOSdetail
	@ResponseBody	
	@RequestMapping(value = "/getCentOS8Detail", method = RequestMethod.POST, produces = "application/json")
	public Map<String,List<RepoAdminCentOSPrimaryPackages>> getCenOS8Detail(String pkgkey,String table_type, Model model, HttpServletRequest request, HttpServletResponse response) {
		//8 여기로 이동함
		Map<String,List<RepoAdminCentOSPrimaryPackages>> tempMap = null;
		try {
			System.out.println("[getCentOS8Detaigl][pkgkey] >> " + pkgkey);
			System.out.println("[getCentOS8Detail][table_type] >> " + table_type);
			
			tempMap = centOS8Serivce.getCentOS8OSdetail(pkgkey,table_type); // param 으로 전달 받은 값을 service로 넘기고 Map을리턴받음
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return tempMap;
	}

	
	
	
	
	@ResponseBody
	@RequestMapping(value = "/searchCentOS8appstreamList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS8osList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
		System.out.println("들어왔니???????????????????????????file_name="+rpm_sourcerpm+"랑 repo_idx=");
		
		try {
				responseParam = centOS8Serivce.searchCentOS8appstreamList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}

	@ResponseBody
	@RequestMapping(value = "/searchCentOS8baseosList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS8baseosList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
		System.out.println("들어왔니???????????????????????????file_name="+rpm_sourcerpm+"랑 repo_idx=");
		
		try {
				responseParam = centOS8Serivce.searchCentOS8baseosList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}
	
	
	@ResponseBody
	@RequestMapping(value = "/searchCentOS8extrasList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS8extrasList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
	
		try {
				responseParam = centOS8Serivce.searchCentOS8extrasList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}	

	@ResponseBody
	@RequestMapping(value = "/searchCentOS8plusList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS8plusList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();
	
		try {
				responseParam = centOS8Serivce.searchCentOS8plusList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}

	@ResponseBody
	@RequestMapping(value = "/searchCentOS8powertoolsList", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminCentOSPrimaryPackages> searchCentOS8powertoolsList(String rpm_sourcerpm) {
		List<RepoAdminCentOSPrimaryPackages> responseParam = new ArrayList<RepoAdminCentOSPrimaryPackages>();

		try {
				responseParam = centOS8Serivce.searchCentOS8powertoolsList(rpm_sourcerpm);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

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