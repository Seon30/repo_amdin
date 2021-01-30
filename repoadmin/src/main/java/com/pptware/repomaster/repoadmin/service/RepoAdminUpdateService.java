package com.pptware.repomaster.repoadmin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptware.repomaster.repoadmin.domain.RepoAdminUpdateHis;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminUpdateMapper;

@Service("com.pptware.repomaster.repoadmin.service.RepoAdminUpdateService")
public class RepoAdminUpdateService {

	@Resource(name = "com.pptware.repomaster.repoadmin.mapper.RepoAdminUpdateMapper")
	RepoAdminUpdateMapper updateMapper;

	public List<RepoAdminUpdateHis> mainTableSearch() throws Exception {

		return updateMapper.mainTableSearch();

	}
	
	public List<RepoAdminUpdateHis> updateListSearch() throws Exception {

		return updateMapper.updateListSearch();

	}

	public void updatePythonRepo() throws Exception {

		updateMapper.updatePythonRepoFiles();

	}
	
}