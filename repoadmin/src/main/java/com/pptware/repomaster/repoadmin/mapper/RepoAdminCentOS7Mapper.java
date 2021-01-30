package com.pptware.repomaster.repoadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;


@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminCentOS7Mapper")
public interface RepoAdminCentOS7Mapper {

	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osList() throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasList() throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesList() throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusList() throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> searchCentOS7osList(String rpm_sourcerpm) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS7extrasList(String rpm_sourcerpm) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS7updatesList(String rpm_sourcerpm) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS7plusList(String rpm_sourcerpm) throws Exception;
	
	// OS
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osDesc1(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osOnlyDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osRequires(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osChangelog(String pkgkey) throws Exception;
	
	// centosplus
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusDesc1(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusDescription(String pkgkey) throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusOnlyDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusRequires(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusChangelog(String pkgkey) throws Exception;	

	// updates
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesDesc1(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesDescription(String pkgkey) throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesOnlyDescription(String pkgkey) throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesRequires(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesChangelog(String pkgkey) throws Exception;
	
	
	// Extras
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasDesc1(String pkgkey) throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasRequires(String pkgkey) throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasOnlyDescription(String pkgkey) throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasChangelog(String pkgkey) throws Exception;
}
