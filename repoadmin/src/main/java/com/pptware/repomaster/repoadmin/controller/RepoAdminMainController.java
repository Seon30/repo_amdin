package com.pptware.repomaster.repoadmin.controller;

import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import com.pptware.repomaster.repoadmin.domain.RepoAdminFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf;
import com.pptware.repomaster.repoadmin.service.RepoAdminRepositoryService;
import com.pptware.repomaster.repoadmin.service.RepoAdminUserRepositoryService;
import com.pptware.repomaster.repoadmin.service.RepoAdminUserService;


@Controller
public class RepoAdminMainController {

	private static final Logger logger = LoggerFactory.getLogger(RepoAdminMainController.class);

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminUserService")
	RepoAdminUserService userService;

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminRepositoryService")
	RepoAdminRepositoryService repositoryService;

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminUserRepositoryService")
	RepoAdminUserRepositoryService userRepositoryService;

	
	@RequestMapping("/users/moveLogin")
	private String login(Model model) {

		return "users/moveLogin";
	}

	@Value("${repomaster.disk}")
	private String mountDisk;

	
	
	
	@RequestMapping("/")
	private String mainTemp(HttpServletRequest request, Model model, HttpSession session) throws Exception {

		int pythonCount = 0;
		int centOS7Count = 0;
		int centOS8Count = 0;
		int totalCount = 0;
		long pythonSize = 0;
		long centOS7Size = 0;
		long centOS8Size = 0;
		long totalSize = 0;
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}

		try {
			pythonCount = repositoryService.retrieveTotalCount("Python");
			centOS7Count = repositoryService.retrieveTotalCount("CentOS7");
			centOS8Count = repositoryService.retrieveTotalCount("CentOS8");
			totalCount = (pythonCount + centOS7Count + centOS8Count);

			pythonSize = repositoryService.retrieveTotalSize("Python");
			centOS7Size = repositoryService.retrieveTotalSize("CentOS7");
			centOS8Size = repositoryService.retrieveTotalSize("CentOS8");
			
			System.out.println("pythonSize??????????????????????????????????????????????????????????????"+pythonSize);
			System.out.println("centOS7Size??????????????????????????????????????????????????????????????"+centOS7Size);
			System.out.println("centOS8Size??????????????????????????????????????????????????????????????"+centOS8Size);
			totalSize = pythonSize + centOS7Size + centOS8Size ;

			File file = new File(mountDisk);
			long totalSpace = file.getTotalSpace(); // total disk space in bytes.
			long usableSpace = file.getUsableSpace(); /// unallocated / free disk space in bytes.

			double totalSpaceGB = totalSpace / 1024 / 1024 / 1024;
			double usableSpaceGB = usableSpace / 1024 / 1024 / 1024;
			double usedSpaceGB = totalSpaceGB - usableSpaceGB;

			NumberFormat nf = NumberFormat.getNumberInstance();

			model.addAttribute("pythonCount", pythonCount);
			model.addAttribute("pythonCountFormat", nf.format(pythonCount));
			model.addAttribute("pythonCountK", (int) pythonCount/1000);
			model.addAttribute("pythonCountKFormat", nf.format((int) pythonCount/1000));
			model.addAttribute("centos7Count", centOS7Count);
			model.addAttribute("centos8Count", centOS8Count);			
			model.addAttribute("centos7CountFormat", nf.format(centOS7Count));
			model.addAttribute("centos8CountFormat", nf.format(centOS8Count));
			model.addAttribute("centos7CountK", (int) centOS7Count/1000);
			model.addAttribute("centos8CountK", (int) centOS8Count/1000);
			model.addAttribute("centos7CountKFormat", nf.format((int) centOS7Count/1000));
			model.addAttribute("centos8CountKFormat", nf.format((int) centOS8Count/1000));
			model.addAttribute("totalCount", totalCount);
			model.addAttribute("totalCountFormat", nf.format(totalCount));
			model.addAttribute("totalCountK", (int) totalCount/1000);
			model.addAttribute("totalCountKFormat", nf.format((int) totalCount/1000));
			
			model.addAttribute("pythonSize", pythonSize);
			model.addAttribute("pythonSizeKFormat", nf.format((double) pythonSize/1024/1024));
			model.addAttribute("pythonSizeGFormat", nf.format((double) pythonSize/1024/1024/1024));
			model.addAttribute("centos7Size", centOS7Size);
			model.addAttribute("centos7SizeKFormat", nf.format((double) centOS7Size/1024/1024));
			model.addAttribute("centos7SizeGFormat", nf.format((double) centOS7Size/1024/1024/1024));
			model.addAttribute("centos8Size", centOS8Size);
			model.addAttribute("centos8SizeKFormat", nf.format((double) centOS8Size/1024/1024));
			model.addAttribute("centos8SizeGFormat", nf.format((double) centOS8Size/1024/1024/1024));			
			model.addAttribute("totalSize", totalSize);
			model.addAttribute("totalSizeKFormat", nf.format((double) totalSize/1024/1024));
			model.addAttribute("totalSizeGFormat", nf.format((double) totalSize/1024/1024/1024));
			
			
			model.addAttribute("pythonUse", (String.format("%.1f", ((double)pythonSize*100/totalSize))));
			model.addAttribute("pythonUseFormat", nf.format(totalSize));
			model.addAttribute("centos7Use", (String.format("%.1f", ((double)centOS7Size*100/totalSize))));
			model.addAttribute("centos7UseFormat", nf.format(totalSize));
			model.addAttribute("centos8Use", (String.format("%.1f", ((double)centOS8Size*100/totalSize))));
			model.addAttribute("centos8UseFormat", nf.format(totalSize));
			
			double smt = pythonSize*100/totalSize;
			System.out.println("먼데==================================python::::::"+smt);
			double smm = centOS7Size*100/totalSize;
			System.out.println("먼데==================================centOS7Size::::::"+smm);
			double sms = centOS8Size*100/totalSize;
			System.out.println("먼데==================================centOS8Size::::::"+sms);			
			
			model.addAttribute("totalSpaceGB", totalSpaceGB);
			model.addAttribute("usableSpaceGB", usableSpaceGB);
			model.addAttribute("usedSpaceGB", usedSpaceGB);

			model.addAttribute("mountDisk", mountDisk);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "main";
	}

	@RequestMapping(value = "/logoutAction")
	private String logoutAction(HttpServletRequest request, HttpServletResponse response, Model model,
			HttpSession session, SessionStatus status) {

		status.setComplete();
		session.removeAttribute("loginUser");

		return "users/moveLogin";

	}


	// 로그인
	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	private String loginAction(@RequestParam(required = true) String id, @RequestParam(required = true) String pw,
			Model model, HttpServletRequest request, HttpServletResponse response) {

		int pythonCount = 0;
		int centOS7Count = 0;
		int centOS8Count = 0;		
		int totalCount = 0;
		int pythonSize = 0;
		int centOS7Size = 0;
		int centOS8Size = 0;
		int totalSize = 0;
		String redirectViewName = "/";
		
		try {

			RepoAdminUser user = userService.retrieveUserByLogin(id);
			
			if (id == "") {
				model.addAttribute("ErrorMessage", "아이디를 입력해주세요.");
				return "users/moveLogin";			
			}else if (ObjectUtils.isEmpty(user)) {
				model.addAttribute("ErrorMessage", "가입이 되어있지 않은 아이디 입니다.");
				return "users/moveLogin";
			}else if (pw == "") {
				model.addAttribute("ErrorMessage", "비밀번호를 입력해주세요");
				return "users/moveLogin";	
			}else if ("0".equals(user.getEmp_lvl())) {
				model.addAttribute("ErrorMessage", "회원가입 미승인상태입니다 관리자에게 문의하여 주세요.");
				return "users/moveLogin";
			} else if ("R".equals(user.getPw_req_yn())) {
				model.addAttribute("ErrorMessage", "비밀번호 초기화 승인이 미처리 상태입니다. 관리자에게 문의하여 주세요.");
				return "users/moveLogin";
			}else if(!pw.equals(user.getEmp_pw())){
				model.addAttribute("ErrorMessage", "비밀번호가 일치하지 않습니다.");
				return "users/moveLogin";
			}

			if(!"N".equals(user.getPw_req_yn())){
			    if("Y".equals(user.getPw_req_yn())) {
				    userService.updatUserList(user.getEmp_no(), "pw","Tlsgks2020!", "S");
				    user.setPw_req_yn("S");					
			    }
			    redirectViewName = "/myInfo";
            }else{
                redirectViewName = "/";
            }

			HttpSession session = request.getSession();

			session.setAttribute("loginUser", user);
			
			pythonCount = repositoryService.retrieveTotalCount("python");
			centOS7Count = repositoryService.retrieveTotalCount("centos7");
			centOS8Count = repositoryService.retrieveTotalCount("centos8");
			totalCount = pythonCount + centOS7Count + centOS8Count;

			long orgPythonSize = repositoryService.retrieveTotalSize("python");
			long orgcentOS7Size = repositoryService.retrieveTotalSize("centos7");
			long orgcentOS8Size = repositoryService.retrieveTotalSize("centos8");

			pythonSize = (int) (orgPythonSize / 1024 / 1024 / 1024);
			centOS7Size = (int) (orgcentOS7Size / 1024 / 1024 / 1024);
			centOS8Size = (int) (orgcentOS8Size / 1024 / 1024 / 1024);
			
			totalSize = pythonSize + centOS7Size + centOS8Size;

			File file = new File(mountDisk);
			long totalSpace = file.getTotalSpace(); // total disk space in bytes.
			long usableSpace = file.getUsableSpace(); /// unallocated / free disk space in bytes.

			double totalSpaceGB = totalSpace / 1024 / 1024 / 1024;
			double usableSpaceGB = usableSpace / 1024 / 1024 / 1024;
			double usedSpaceGB = totalSpaceGB - usableSpaceGB;

			model.addAttribute("pythonCount", pythonCount);
			model.addAttribute("centos7Count", centOS7Count);
			model.addAttribute("centos8Count", centOS8Count);
			model.addAttribute("totalCount", totalCount);
			
			model.addAttribute("pythonUse", (pythonSize*100/totalSize));
			model.addAttribute("centos7Use", (centOS7Size*100/totalSize));
			model.addAttribute("centos8Use", (centOS8Size*100/totalSize));
			
			model.addAttribute("pythonSize", pythonSize);
			model.addAttribute("centos7Size", centOS7Size);
			model.addAttribute("centos8Size", centOS8Size);
			model.addAttribute("totalSize", totalSize);

			model.addAttribute("totalSpaceGB", totalSpaceGB);
			model.addAttribute("usableSpaceGB", usableSpaceGB);
			model.addAttribute("usedSpaceGB", usedSpaceGB);

			model.addAttribute("mountDisk", mountDisk);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:"+redirectViewName;

	}
	
		
	// 회원가입
	@RequestMapping("/signUp")
	public String signUp() {
		return "users/signUp";
	}



	@RequestMapping("/userManage")
	public String userManage(HttpServletRequest request, Model model) {
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}

		return "users/userManage";
	}

	@RequestMapping(value = "/repoUpdate", method = RequestMethod.GET)
	public String repoUpdate(HttpServletRequest request, Model model) {
	if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "repoUpdate";
	}
	
	@RequestMapping("/myInfo")
	public String myInfo(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "users/myInfo";
	}
		
	@RequestMapping("/centOS7")
	public String centOS7(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "search/centOS7";
	}
	
	@RequestMapping("/centOS8_stream")
	public String centOS8_stream(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "search/centOS8_stream";
	}
	
	@RequestMapping("/centOS7desc")
	public String centOS7desc(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "search/centOS7desc";
	} 
	
	@RequestMapping("/centOS8_stream_desc")
	public String centOS8_stream_desc(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "search/centOS8_stream_desc";
	} 
		
	@RequestMapping("/windowsPython")
	public String windowsPython(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "down/windowsPython";
	}
	
	@RequestMapping("/ubuntuVersion")
	public String ubuntuVersion(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "ubuntu/ubuntuVersion";
	}

	@RequestMapping("/ubuntuPackList")
	public String ubuntuPackList(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "ubuntu/ubuntuPackList";
	}

	@RequestMapping("/ubuntuPackDesc")
	public String ubuntuPackDesc(HttpServletRequest request, Model model){
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "ubuntu/ubuntuPackDesc";
	}

	
	//내정보
	@RequestMapping(value = "/myInfo", method = RequestMethod.POST)
	public String myInfo(@RequestParam String emp_no
			, @RequestParam String emp_pw_old
			, @RequestParam String emp_pw_new
			, @RequestParam String emp_pw_new_valid
			, @RequestParam String pw_req_yn, Model model, HttpServletRequest request, HttpServletResponse response) {

		RepoAdminUser user = new RepoAdminUser();
		
		if (!checkSession(request)) {
			return "users/moveLogin";
		}
		
		try {
			userService.updatMyInfo(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:users/myInfo";

	}

	
	@RequestMapping(value = "/conf", method = RequestMethod.GET)
	public String conf(HttpServletRequest request, Model model, HttpSession session) throws Exception{
		if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "users/conf";
	}

	@ResponseBody
	@RequestMapping(value = "/confUpdate", method = RequestMethod.POST)
	public int confUpdate(RepoAdminUserRepositoryConf vo , HttpServletRequest request) throws Exception{
		int resultCount = 0;
		System.out.println("request >>> : "+ vo.toString());
		HttpSession session = request.getSession();

		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
		
		vo.setU_emp_no(loginVO.getEmp_no());
		
		try {
			resultCount = repositoryService.updateConf_repo(vo);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return resultCount;
	}
	
	@ResponseBody
	@RequestMapping(value = "/confSearch", method = RequestMethod.POST)
	public List<RepoAdminUserRepositoryConf> confSearch(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUserRepositoryConf> returnList = null;
			try {
				returnList = repositoryService.confRepository();

				System.out.println("---------------------------------------요기요기"+returnList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return returnList;
	}
	
	@ResponseBody
	@RequestMapping(value = "/confName", method = RequestMethod.POST)
	public List<RepoAdminUserRepositoryConf> confNameList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUserRepositoryConf> returnList = null;
			try {
				returnList = repositoryService.confName();

				System.out.println("---------------------------------------요기요기"+returnList);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		return returnList;
	}

	
	@ResponseBody
	@RequestMapping(value = "/confFileSearch", method = RequestMethod.POST, produces = "application/json")	
	private List<RepoAdminUserRepositoryConf> confFileSearch(String conf_name , String conf_idx) {
		List<RepoAdminUserRepositoryConf> responseParam = new ArrayList<RepoAdminUserRepositoryConf>();
		System.out.println("들어왔니???????????????????????????file_name="+conf_name+"랑 conf_idx="+conf_idx);
		
		try {
				responseParam = repositoryService.searchConfName(conf_name, conf_idx);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return responseParam ;

	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "/confBody", method = RequestMethod.POST, produces = "application/json")
	public RepoAdminUserRepositoryConf confBody(Model model, HttpServletRequest request, HttpServletResponse response, RepoAdminUserRepositoryConf conf) {
		RepoAdminUserRepositoryConf returnData = null;
		try {
			returnData = repositoryService.confAll(conf.getConf_idx());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnData;
	}
	
	@ResponseBody
	@RequestMapping(value ="/confInsert", method = RequestMethod.POST, produces = "application/json")
	public Map<String,String> confInsert(HttpServletRequest request, HttpServletResponse response, RepoAdminUserRepositoryConf conf) {
		Map<String,String> returnMap = new HashMap<String, String>();
		try {
			
			HttpSession session = request.getSession();

			RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
			conf.setC_emp_no(loginVO.getEmp_no());
			conf.setU_emp_no(loginVO.getEmp_no());
			repositoryService.newInputConf(conf);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		returnMap.put("MSG", "성공!");
		return returnMap;
	}
	@RequestMapping(value = "/updateList", method = RequestMethod.GET)
	public String updateList(HttpServletRequest request, Model model) {
	if (!checkSession(request)) {
			logger.debug("-------------------------------------------------");
			return "users/moveLogin";
		}
		return "updateList";
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
