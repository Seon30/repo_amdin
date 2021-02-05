package com.pptware.repomaster.repoadmin.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;
import com.pptware.repomaster.repoadmin.domain.RepoAdminFile;


@Repository("com.pptware.repomaster.repoadmin.mapper.RepoAdminCentOS8Mapper")
public interface RepoAdminCentOS8Mapper {

	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamList() throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosList() throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasList() throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusList() throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsList() throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8appstreamList(String rpm_sourcerpm) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8baseosList(String rpm_sourcerpm) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8extrasList(String rpm_sourcerpm) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8plusList(String rpm_sourcerpm) throws Exception;

	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8powertoolsList(String rpm_sourcerpm) throws Exception;

	// appstream
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamDesc1(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamOnlyDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamRequires(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamChangelog(String pkgkey) throws Exception;
	
	// baseos
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosDesc1(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosOnlyDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosRequires(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosChangelog(String pkgkey) throws Exception;
	
	// powertools
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsDesc1(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsOnlyDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsRequires(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsChangelog(String pkgkey) throws Exception;
	
	// Extras
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasDesc1(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasOnlyDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasRequires(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasChangelog(String pkgkey) throws Exception;
	
	// plus
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusDesc1(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusOnlyDescription(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusRequires(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusProvides(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusConflicts(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusObsoletes(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusFilePath(String pkgkey) throws Exception;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusChangelog(String pkgkey) throws Exception;
}
