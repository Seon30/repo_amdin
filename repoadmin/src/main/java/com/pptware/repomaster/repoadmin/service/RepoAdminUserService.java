package com.pptware.repomaster.repoadmin.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.domain.RepoAdminWindowsPython;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminUserMapper;

@Service("com.pptware.repomaster.repoadmin.service.RepoAdminUserService")
public class RepoAdminUserService {

	@Resource(name = "com.pptware.repomaster.repoadmin.mapper.RepoAdminUserMapper")
	RepoAdminUserMapper userMapper;

	public int createUser(RepoAdminUser user) throws Exception {

		return userMapper.createUser(user);

	}
	
	//추가
	public int signUpValidation(RepoAdminUser user, String emp_pw_re, Model model, HttpServletRequest request, HttpServletResponse response ) throws Exception {
		
		return userMapper.createUser(user);

	}
	

	public RepoAdminUser retrieveUserByIdx(int idx) throws Exception {

		return userMapper.retrieveUserByIdx(idx);

	}

	public RepoAdminUser retrieveUserById(String id) throws Exception {

		return userMapper.retrieveUserById(id);

	}

	public List<RepoAdminUser> retrieveUserByName(String name) throws Exception {

		return userMapper.retrieveUserByName(name);

	}

	public List<RepoAdminUser> retrieveUserByEmail(String email) throws Exception {

		return userMapper.retrieveUserByEmail(email);

	}

	public List<RepoAdminUser> retrieveUserByLevel(int level) throws Exception {

		return userMapper.retrieveUserByLevel(level);

	}

	public RepoAdminUser retrieveUserByLogin(String emp_no) throws Exception {

		return userMapper.retrieveUserByLogin(emp_no);

	}

	public boolean updateUser(RepoAdminUser user) throws Exception {

		return userMapper.updateUser(user);

	}
	
	public boolean deleteUserByIdx(int idx) throws Exception {
		return userMapper.deleteUserByIdx(idx);
	}
	
	public List<RepoAdminUser> searchUserList(String searchType , String searchText) throws Exception {

		return userMapper.searchUserList(searchType,searchText);

	}
	public void updatUserList(String emp_no, String type, String value , String pw_req_yn) throws Exception{
		userMapper.updatUserList(emp_no,type,value ,pw_req_yn);
	}
	public void updatMyInfo(RepoAdminUser user) throws Exception{
		userMapper.updatMyInfo(user);
	}
	public String idValidation(String emp_no) throws Exception{
		return userMapper.idValidation(emp_no);
	}
	public int checkPwRest(RepoAdminUser user) throws Exception{
		return userMapper.checkPwRest(user);
	}
	public int chkPw(String emp_no,String emp_pw_old) throws Exception{
		return userMapper.chkPw(emp_no,emp_pw_old);
	}	
	public int chkNo(String emp_no) throws Exception{
			return userMapper.chkNo(emp_no);
	}
	public void updatePwRest(RepoAdminUser user) throws Exception{
		userMapper.updatePwRest(user);
	}
	public void updatePwRest2(RepoAdminUser user) throws Exception{
		userMapper.updatePwRest2(user);
	}
	public void changePw(String emp_no ,String emp_pw) throws Exception{
		userMapper.changePw(emp_no,emp_pw);
	}

}
