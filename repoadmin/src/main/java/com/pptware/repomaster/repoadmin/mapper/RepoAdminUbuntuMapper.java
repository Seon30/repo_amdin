package com.pptware.repomaster.repoadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUbuntu;

@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminUbuntuMapper")
public interface RepoAdminUbuntuMapper {

	public List<RepoAdminUbuntu> getFocalPackList() throws Exception;

	public List<RepoAdminUbuntu> searchFocalPackList(String rpm_sourcerpm) throws Exception;
	
	public List<RepoAdminUbuntu> getFocalPackDesc(String idx) throws Exception;
	
}
