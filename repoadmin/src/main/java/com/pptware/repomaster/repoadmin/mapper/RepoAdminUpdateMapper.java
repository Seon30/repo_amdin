package com.pptware.repomaster.repoadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pptware.repomaster.repoadmin.domain.RepoAdminUpdateHis;

@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminUpdateMapper")
public interface RepoAdminUpdateMapper {

	//메인 업데이트 리스트
	public List<RepoAdminUpdateHis> mainTableSearch() throws Exception;
	
	//업데이트 리스트 조회
	public List<RepoAdminUpdateHis> updateListSearch() throws Exception;

	// Update for Python repository
	public void updatePythonRepoFiles() throws Exception;
}
