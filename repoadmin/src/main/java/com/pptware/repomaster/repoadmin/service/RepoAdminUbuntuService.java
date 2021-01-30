package com.pptware.repomaster.repoadmin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptware.repomaster.repoadmin.domain.RepoAdminUbuntu;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminUbuntuMapper;


@Service("com.pptware.repomaster.repoadmin.service.RepoAdminUbuntuService")
public class RepoAdminUbuntuService {

	@Resource(name = "com.pptware.repomaster.repoadmin.mapper.RepoAdminUbuntuMapper")
	RepoAdminUbuntuMapper Ubuntu;
	
	public List<RepoAdminUbuntu> versionList() throws Exception {
		
		return Ubuntu.versionList();
	}


	public List<RepoAdminUbuntu> allPackageList(String version) throws Exception {
		
		return Ubuntu.allPackageList(version);
	}

	public List<RepoAdminUbuntu> packageDesc(String idx) throws Exception {
		
		return Ubuntu.packageDesc(idx);
	}


}
	