package com.pptware.repomaster.repoadmin.controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pptware.repomaster.repoadmin.domain.RepoAdminUpdateHis;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.domain.RepoChangePwd;
import com.pptware.repomaster.repoadmin.service.RepoAdminUpdateService;
import com.pptware.repomaster.repoadmin.service.RepoAdminUserService;

@RestController
public class RepoAdminRestController {

	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminUserService")
	RepoAdminUserService userService;
	
	@Resource(name = "com.pptware.repomaster.repoadmin.service.RepoAdminUpdateService")
	RepoAdminUpdateService updateService;

	@RequestMapping(value = "/signUpValidation", method = RequestMethod.POST)
	public Map<String,String> signUpValidation(RepoAdminUser user, Model model, HttpServletRequest request, HttpServletResponse response) {

		Map<String,String> returnMap = new HashMap<String, String>();
		
		try {
			
			int idCheck = userService.chkNo(user.getEmp_no());
			
			Pattern empNoPt = Pattern.compile("^[0-9]|[a-zA-Z]*$"); 
			Pattern empNmPt = Pattern.compile("^[가-힣]{2,4}|[a-zA-Z]{2,10}|\\s[a-zA-Z]{2,10}+$"); 
			Pattern empPwPt = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}+$"); 
			Pattern empEmailPt = Pattern.compile("\\\\w+@\\\\w+\\\\.\\\\w+(\\\\.\\\\w+)?");
			
			Matcher noMach = empNoPt.matcher(user.getEmp_pw());
			Matcher nmMach = empNmPt.matcher(user.getEmp_pw());
			Matcher pwMach = empPwPt.matcher(user.getEmp_pw());
			Matcher emailMach = empEmailPt.matcher(user.getEmp_pw());
			
			if(user.getEmp_no().length()==0) {
				returnMap.put("ID", "emp_no");
				returnMap.put("MSG", "아이디를 입력해주세요.");
			}else if(idCheck==1) {
				returnMap.put("ID", "emp_no");
				returnMap.put("MSG", "중복되는 아이디가 있습니다.");			
			}else if(user.getEmp_no().length() < 5 || user.getEmp_no().length() > 15) {
				returnMap.put("ID", "emp_no");
				returnMap.put("MSG", "아이디는 최소 6자리에서 14자리 입니다.");				
			}else if((!noMach.find())) {
				returnMap.put("ID", "emp_no");
				returnMap.put("MSG", "아이디는 6~14자리의 숫자,영문 대소문자만 입력 가능합니다.");

			}else if(user.getEmp_nm().length()==0) {
				returnMap.put("ID", "emp_nm");
				returnMap.put("MSG", "이름을 입력해주세요.");
			}else if(!(user.getEmp_nm().length() >= 2 && user.getEmp_nm().length() <= 746)) {
				returnMap.put("ID", "emp_nm");
				returnMap.put("MSG", "이름은 최소 2자리 이상으로 입력해주세요.");				
			}else if((!nmMach.find())) {
				returnMap.put("ID", "emp_nm");
				returnMap.put("MSG", "이름은 최소 2자리 이상의 한글, 영문 대소문자만 입력 가능합니다.");				
				
			}else if(user.getEmp_pw().length()==0) {
				returnMap.put("ID", "emp_pw");
				returnMap.put("MSG", "비밀번호를 입력해주세요.");
			}else if(!(user.getEmp_pw().length() >= 8 && user.getEmp_pw().length() <= 20)) {
				returnMap.put("ID", "emp_pw");
				returnMap.put("MSG", "비밀번호는 최소 8자리에서 20자리 입니다.");
			}else if(user.getEmp_pw().contains(user.getEmp_no())){
				returnMap.put("MSG", "비밀번호에 아이디가 포함되어 있습니다.");
				returnMap.put("ID", "emp_pw_new");	
			}else if((!pwMach.find())) {
				returnMap.put("ID", "emp_pw");
				returnMap.put("MSG", "비밀번호는 8~20자리의 영문 대소문자,숫자,특수문자를 포함해야 합니다.");	
				
			}else if(user.getEmp_pw_re().length()==0) {
				returnMap.put("MSG", "비밀번호 재확인을 입력해주세요");
				returnMap.put("ID", "emp_pw_new_re");
			}else if(user.getEmp_pw() == user.getEmp_pw_re()) {
				returnMap.put("MSG", "비밀번호가 일치하지 않습니다");
				returnMap.put("ID", "emp_pw_new_re");	
				
				
			}else if(user.getEmp_email().length()==0) {
				returnMap.put("ID", "emp_email");
				returnMap.put("MSG", "이메일을 입력해주세요.");	
			}else if((!emailMach.find())) {
				returnMap.put("ID", "emp_no");
				returnMap.put("MSG", "이메일 형식을 지켜주세요.");				

				returnMap.put("MSG", "OK");
				user.setC_emp_no(user.getEmp_no());
				user.setU_emp_no(user.getEmp_no());
				userService.createUser(user);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return returnMap;

}
	@RequestMapping(value = "/idValidation", method = RequestMethod.POST)
	public String idValidation(RepoAdminUser user, Model model, HttpServletRequest request, HttpServletResponse response) {
		String returnMsg = "";
		try {
			returnMsg = userService.idValidation(user.getEmp_no());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMsg;

	}
	@RequestMapping(value = "/pwResetReq", method = RequestMethod.POST)
	public Map<String,String> pwResetReq(RepoAdminUser user, Model model, HttpServletRequest request, HttpServletResponse response) {
		Map<String,String> returnMap = new HashMap<String, String>();
		try {
			int userCount = userService.checkPwRest(user);
			if(userCount==0) {
				returnMap.put("MSG", "아이디 혹은 이메일 주소가 잘못되었습니다.");
			}else {
				userService.updatePwRest(user);
				returnMap.put("key", "OK");
				returnMap.put("MSG", "비밀번호 초기화 요청되었습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnMap;

	}
	@RequestMapping(value = "/dashUpdateList", method = RequestMethod.POST)
	public @ResponseBody List<RepoAdminUpdateHis> dashUpdateList(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUpdateHis> returnList = new ArrayList<RepoAdminUpdateHis>();
		try {
			List<RepoAdminUpdateHis> tempList = null;
			RepoAdminUpdateHis tempVo = null;
			tempList = updateService.mainTableSearch();
//			NumberFormat nf = NumberFormat.getNumberInstance();
			for(int i = 0 ; i< tempList.size() ; i++) {
				tempVo = tempList.get(i);
				String tempCnt = tempVo.getUpld_file_cnt();
				if (null == tempCnt || tempCnt.isEmpty()) tempCnt = "0";
//				tempVo.setUpld_file_cnt(nf.format(Integer.parseInt(tempCnt)));
//				try {
//					tempVo.setUpld_file_size(nf.format(Long.parseLong(tempVo.getUpld_file_size())));
//				} catch (NumberFormatException nfe) {
//					tempVo.setUpld_file_size("0");
//				} catch (Exception e) {
//					tempVo.setUpld_file_size("0");
//				}
				returnList.add(i, tempVo);
				
				
				System.out.println("tempVo++++++++++++++++++++++++++++++"+tempVo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return returnList;

	}

	@RequestMapping(value = "/userManageSearch", method = RequestMethod.POST , produces = "application/json")
	public List<RepoAdminUser> userManage(@RequestParam String searchType, @RequestParam String searchText, Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUser> returnList = null;
		
		try {
			returnList = userService.searchUserList(searchType, searchText);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return returnList;
	}
	@RequestMapping(value = "/userManageUpdate", method = RequestMethod.POST , produces = "application/json")
	public void userManageUpdatePw(@RequestParam String emp_no, @RequestParam String type, @RequestParam String val, Model model, HttpServletRequest request, HttpServletResponse response) {
		String values = val;
		
		if("pw".equals(type)) {
			values = "Tlsgks2020!";
		}
		try {
			userService.updatUserList(emp_no, type,values,"Y");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/changePw", method = RequestMethod.POST , produces = "application/json")
	public Map<String,String> changePw(RepoAdminUser user, RepoChangePwd changePwd,
			             Model model, HttpServletRequest request, HttpServletResponse response) {
		Map<String,String> returnMap = new HashMap<String, String>();
		try {
			int pwCheck = userService.chkPw(changePwd.getEmp_no(),changePwd.getEmp_pw_old());
			Pattern empPwPt = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$"); 
			Matcher pwMach = empPwPt.matcher(changePwd.getEmp_pw_new());
		
			if(pwCheck==0) {
				returnMap.put("MSG", "기존 비밀번호가 일치하지 않습니다.");
				returnMap.put("ID", "emp_pw_old");
			}else if(changePwd.getEmp_pw_new().length()==0) {
				returnMap.put("MSG", "기존 비밀번호를입력해주세요");
				returnMap.put("ID", "emp_pw_old");
			}else if(changePwd.getEmp_pw_new().length()==0) {
				returnMap.put("MSG", "새로운 비밀번호를입력해주세요");
				returnMap.put("ID", "emp_pw_new");
			}else if(changePwd.getEmp_pw_new() == changePwd.getEmp_pw_old()) {
				returnMap.put("MSG", "새로운 비밀번호가 기존 비밀번호와 동일합니다.");
				returnMap.put("ID", "emp_pw_new");
			}else if(changePwd.getEmp_pw_new_valid().length()==0) {
				returnMap.put("MSG", "새로운 비밀번호를 재확인을 입력해주세요");
				returnMap.put("ID", "emp_pw_new_valid");
			}else if(changePwd.getEmp_pw_new().contains(changePwd.getEmp_no())){
				returnMap.put("MSG", "비밀번호에 아이디가 포함되어 있습니다.");
				returnMap.put("ID", "emp_pw_new");
			}else if(!pwMach.find()) {
				returnMap.put("MSG", "새로운 비밀번호를 8~20자리의 영대소문자, 숫자, 특수문자를 포함해서 입력해주세요.");
				returnMap.put("ID", "emp_pw_new");
			}else{
				returnMap.put("MSG", "OK");
				
				userService.changePw(changePwd.getEmp_no(),changePwd.getEmp_pw_new());
				userService.updatePwRest2(user);

			}
				
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	
		return returnMap;
	}
	
	
	@RequestMapping(value = "/updateListSearch", method = RequestMethod.POST)
	public List<RepoAdminUpdateHis> updateListSearch(Model model, HttpServletRequest request, HttpServletResponse response) {
		List<RepoAdminUpdateHis> returnList = new ArrayList<RepoAdminUpdateHis>();
			try {
				List<RepoAdminUpdateHis> tempList = null;
				tempList = updateService.updateListSearch();
				RepoAdminUpdateHis tempVo = null;
				for(int i = 0 ; i< tempList.size() ; i++) {

					tempVo = tempList.get(i);

					returnList.add(i, tempVo);

				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		return returnList;
	}

	@RequestMapping(value = "/updatePythonRepo", method = RequestMethod.POST , produces = "application/json")
	public void updatePythonRepo(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		try {

			updateService.updatePythonRepo();

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
}
