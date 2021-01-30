package com.pptware.repomaster.repoadmin.mapper;

import org.springframework.stereotype.Repository;

import com.pptware.repomaster.repoadmin.domain.RepoAdminDown;
import com.pptware.repomaster.repoadmin.domain.RepoAdminFile;

@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminFileDownLoadMapper")
public interface RepoAdminFileDownLoadMapper {	

	public RepoAdminFile retrieveUserFileDown(int file_idx) throws Exception;
	
	public RepoAdminFile retrieveFileDown(int file_idx) throws Exception;
	
	public void insertDownHis(RepoAdminDown vo) throws Exception;

}
