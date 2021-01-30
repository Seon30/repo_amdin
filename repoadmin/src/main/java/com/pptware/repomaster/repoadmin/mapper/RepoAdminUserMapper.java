package com.pptware.repomaster.repoadmin.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;

@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminUserMapper")
public interface RepoAdminUserMapper {

	//회원가입 
	public int createUser(RepoAdminUser user) throws Exception;

	//로그인
	public RepoAdminUser retrieveUserByLogin(@Param("emp_no") String emp_no) throws Exception;

	public RepoAdminUser retrieveUserByIdx(int idx) throws Exception;

	public RepoAdminUser retrieveUserById(String id) throws Exception;

	public List<RepoAdminUser> retrieveUserByName(String name) throws Exception;

	public List<RepoAdminUser> retrieveUserByEmail(String email) throws Exception;

	public List<RepoAdminUser> retrieveUserByLevel(int level) throws Exception;
	
	public boolean updateUser(RepoAdminUser user) throws Exception;

	public boolean deleteUserByIdx(int idx) throws Exception;
	
	public List<RepoAdminUser> searchUserList(@Param("searchType") String searchType ,@Param("searchText") String searchText) throws Exception;
	
	public void updatUserList(String emp_no, String type, String value, String pw_req_yn) throws Exception;
	
	public void updatMyInfo(RepoAdminUser user) throws Exception;
	
	public String idValidation(String emp_no) throws Exception;
	
	public int checkPwRest(RepoAdminUser user) throws Exception;
	
	public void updatePwRest(RepoAdminUser user) throws Exception;
	
	public void updatePwRest2(RepoAdminUser user) throws Exception;
	
	public void changePw(String emp_no ,String emp_pw) throws Exception;
	
	public int chkPw(String emp_no , String emp_pw) throws Exception;

	public int chkNo(String emp_no) throws Exception;

}
