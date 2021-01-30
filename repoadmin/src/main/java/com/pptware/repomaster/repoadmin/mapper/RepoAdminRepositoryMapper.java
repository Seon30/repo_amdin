package com.pptware.repomaster.repoadmin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.pptware.repomaster.repoadmin.domain.RepoAdminDown;
import com.pptware.repomaster.repoadmin.domain.RepoAdminExcludeFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf;

@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminRepositoryMapper")
public interface RepoAdminRepositoryMapper {	

	public int retrieveTotalCount(String repo) throws Exception;
	
	public long retrieveTotalSize(String repo) throws Exception;
	
	public List<RepoAdminFile> retrieveFileUpdateData(String c_date , String repo ) throws Exception;

	public List<RepoAdminFile> excludeFileSearchData() throws Exception;
	
	public List<RepoAdminFile> retrieveFileSearchData(String filename ,String repo_idx ) throws Exception;
	
	public int insertExclude(RepoAdminExcludeFile file) throws Exception;
	
	public void updateFileExcludeData(int file_idx) throws Exception;
	
	public void updateFileExcludeDataN(int idx) throws Exception;
	
	public int deleteExclude(RepoAdminExcludeFile file) throws Exception;
	
	public List<RepoAdminFile> excludeFileList(String exclude_idx) throws Exception;
	
	public List<RepoAdminUserRepositoryConf> confRepository() throws Exception; 
	 
	public RepoAdminUserRepositoryConf confAll(String conf_idx) throws Exception;
	
	public void newInputConf(RepoAdminUserRepositoryConf conf) throws Exception;
	
	public RepoAdminUserRepositoryConf updateConf(RepoAdminUserRepositoryConf conf) throws Exception;
	
	public List<RepoAdminUserRepositoryConf> confName() throws Exception;
	
	public int updateConf_repo (RepoAdminUserRepositoryConf vo) throws Exception;
	
	public List<RepoAdminDown> downloadListSearch() throws Exception; 
	
	public List<RepoAdminFile> retrieveUserFileSearchData(String filename) throws Exception;

	public List<RepoAdminUserRepositoryConf> searchConfName(String conf_name ,String conf_idx) throws Exception;
	
}
