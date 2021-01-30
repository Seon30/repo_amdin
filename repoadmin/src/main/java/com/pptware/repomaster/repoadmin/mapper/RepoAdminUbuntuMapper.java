package com.pptware.repomaster.repoadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUbuntu;

@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminUbuntuMapper")
public interface RepoAdminUbuntuMapper {

	public List<RepoAdminUbuntu> versionList() throws Exception;

	public List<RepoAdminUbuntu> allPackageList(String version) throws Exception;

	public List<RepoAdminUbuntu> packageDesc(String idx) throws Exception;	

}
