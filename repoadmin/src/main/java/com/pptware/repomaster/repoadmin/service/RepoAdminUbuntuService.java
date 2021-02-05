package com.pptware.repomaster.repoadmin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUbuntu;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminUbuntuMapper;


@Service("com.pptware.repomaster.repoadmin.service.RepoAdminUbuntuService")
public class RepoAdminUbuntuService {

	@Resource(name = "com.pptware.repomaster.repoadmin.mapper.RepoAdminUbuntuMapper")
	RepoAdminUbuntuMapper Ubuntu;
	
	public List<RepoAdminUbuntu> getFocalPackList() throws Exception {
		
		return Ubuntu.getFocalPackList();
	}


	public List<RepoAdminUbuntu> searchFocalPackList(String rpm_sourcerpm) throws Exception {
		
		return Ubuntu.searchFocalPackList(rpm_sourcerpm);
	}

	public List<RepoAdminUbuntu> getFocalPackDesc(String pkgkey) throws Exception {
		
		return Ubuntu.getFocalPackDesc(pkgkey);
	}

	public List<RepoAdminUbuntu> getUbuntuDetail2(String idx) throws Exception {
		
		return Ubuntu.getFocalPackDesc(idx);
		
	}

	
	public Map<String,List<RepoAdminUbuntu>> getUbuntuDetail(String idx ,String key) throws Exception {
		Map<String,List<RepoAdminUbuntu>> tempMap = new HashMap<String,List<RepoAdminUbuntu>>();
		
		List<RepoAdminUbuntu> tempArr = null;
		
	System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■"+idx +"->>>>>>>key"+key);
			//0.desc1
			tempArr = Ubuntu.getFocalPackDesc(idx);
			
			tempMap.put("focal", tempArr);
			

		
		return tempMap; 

	}	
		
	
	
	
	

}
	