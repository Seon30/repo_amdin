package com.pptware.repomaster.repoadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pptware.repomaster.repoadmin.domain.RepoAdminExcludeFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminMain;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserPackage;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf;

@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminUserRepositoryMapper")
public interface RepoAdminUserRepositoryMapper {	
	
	public List<RepoAdminUserRepository> retrieveUserRepo(String emp_no) throws Exception;
	
	public List<RepoAdminUserPackage> retrieveUserPackList(int user_repo_idx , String emp_no) throws Exception;

	public List<RepoAdminUserPackage> retrieveUserFileList(int user_pack_idx , String emp_no) throws Exception;
	
	public List<RepoAdminUserRepository> retrieveUserFile(int user_repo_idx) throws Exception;

	public int retrieveUserRepoCnt(String c_emp_no , String c_repo) throws Exception;
	
	public String retrieveUserRepoRootPath() throws Exception;
	
	public void insertUserRepo(RepoAdminUserRepository repo) throws Exception;
	
	public RepoAdminUserRepository retrieveTargetUserRepo(RepoAdminUserRepository repo) throws Exception;

	public RepoAdminUserPackage retrieveTargetUserPack(RepoAdminUserPackage repo) throws Exception;
	
	public int retrieveUserFileCnt(RepoAdminUserPackage repo) throws Exception;
	
	public void insertUserFileData(RepoAdminUserPackage repo) throws Exception;
	
	public void updateUserFileData(RepoAdminUserPackage repo) throws Exception;
	
	public void insertUserPackData(RepoAdminUserRepository repo) throws Exception;
	
	public void updateUserRepoData(RepoAdminUserRepository repo) throws Exception;
	
	public void insertUserFileExclude(RepoAdminExcludeFile vo) throws Exception;
	
	public RepoAdminUserRepository retrieveFileFullName(int file_idx) throws Exception;

	public RepoAdminUserRepository retrieveRepoFullName(int user_repo_idx) throws Exception;
	
	public RepoAdminUserRepository retrievePackFullName(int user_pack_idx) throws Exception;
	
	public void deleteUserFileData(int file_idx) throws Exception;
	
	public void deleteUserPackData(int user_repo_idx) throws Exception;
	
	public void deleteUserRepoData(int user_pack_idx) throws Exception;
	
	public void deleteUserExcludeFileData(int file_idx) throws Exception;
	
	public void deleteRepoIdxFile(int file_idx) throws Exception;
	
	public void deleteRepoIdx(int file_idx) throws Exception;
	
	public int repoIdxCntFile(int repo_idx) throws Exception;
	
	public List<RepoAdminUserRepositoryConf> getUserRepoConfList (String[] arr);
	
	public int updateConf(RepoAdminUserRepositoryConf conf) throws Exception;
	
	public RepoAdminMain getMainInformation(String emp_no) throws Exception;
	
	public void updateisExcludeData(RepoAdminUserRepository vo) throws Exception;

}
