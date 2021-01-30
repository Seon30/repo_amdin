package com.pptware.repomaster.repoadmin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminCentOS7Mapper;


@Service("com.pptware.repomaster.repoadmin.service.RepoAdminCentOS7Service")
public class RepoAdminCentOS7Service {

	@Resource(name = "com.pptware.repomaster.repoadmin.mapper.RepoAdminCentOS7Mapper")
	RepoAdminCentOS7Mapper CentOS7;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7osList() throws Exception {
		
		return CentOS7.getCentOS7osList();

	}
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7extrasList() throws Exception {

		return CentOS7.getCentOS7extrasList();

	}
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7updatesList() throws Exception {

		return CentOS7.getCentOS7updatesList();

	}
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS7plusList() throws Exception {

		return CentOS7.getCentOS7plusList();

	}

	public List<RepoAdminCentOSPrimaryPackages> searchCentOS7osList(String rpm_sourcerpm) throws Exception {
		
		return CentOS7.searchCentOS7osList(rpm_sourcerpm);

	}
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS7extrasList(String rpm_sourcerpm) throws Exception {

		return CentOS7.searchCentOS7extrasList(rpm_sourcerpm);

	}
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS7updatesList(String rpm_sourcerpm) throws Exception {

		return CentOS7.searchCentOS7updatesList(rpm_sourcerpm);

	}
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS7plusList(String rpm_sourcerpm) throws Exception {

		return CentOS7.searchCentOS7plusList(rpm_sourcerpm);

	}
	
	
	
	
	public Map<String,List<RepoAdminCentOSPrimaryPackages>> getCentOS7OSdetail(String pkgkey ,String key) throws Exception {
		Map<String,List<RepoAdminCentOSPrimaryPackages>> tempMap = new HashMap<String,List<RepoAdminCentOSPrimaryPackages>>();
		
		List<RepoAdminCentOSPrimaryPackages> tempArr = null;
		
		
		if("7OS".equals(key)) {
			//0.desc1
			tempArr = CentOS7.getCentOS7osDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS7.getCentOS7osDescription(pkgkey);
			
			tempMap.put("description", tempArr);

			//1-3. description
			tempArr = CentOS7.getCentOS7osOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS7.getCentOS7osRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS7.getCentOS7osProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			System.out.println("66666666666666666666666666666 +++++++ provides??????");
			//4. Conflicts
			tempArr = CentOS7.getCentOS7osConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			System.out.println("777777777777777777777777777777 +++++++ conflict??????"+tempArr);
			//5. obsoletes
			tempArr = CentOS7.getCentOS7osObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			System.out.println("888888888888888888888888888 +++++++ obsoletes??????"+tempArr);
		
			//6.filepath
			tempArr = CentOS7.getCentOS7osFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//7.changelog
			tempArr = CentOS7.getCentOS7osChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);			
			
		}else if("7Extras".equals(key)) {
			//0.desc1
			tempArr = CentOS7.getCentOS7extrasDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS7.getCentOS7extrasDescription(pkgkey);
			
			tempMap.put("description", tempArr);

			//1-3. description
			tempArr = CentOS7.getCentOS7extrasOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS7.getCentOS7extrasRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS7.getCentOS7extrasProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS7.getCentOS7extrasConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS7.getCentOS7extrasObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS7.getCentOS7extrasFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//7.changelog
			tempArr = CentOS7.getCentOS7extrasChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
			
		}else if("7Plus".equals(key)) {
			//0.desc1
			tempArr = CentOS7.getCentOS7plusDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS7.getCentOS7plusDescription(pkgkey);
			
			tempMap.put("description", tempArr);

			//1-3. description
			tempArr = CentOS7.getCentOS7plusOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS7.getCentOS7plusRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS7.getCentOS7plusProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS7.getCentOS7plusConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS7.getCentOS7plusObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS7.getCentOS7plusFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//7.changelog
			tempArr = CentOS7.getCentOS7plusChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
		}else if("7Updates".equals(key)) {
			//0.desc1
			tempArr = CentOS7.getCentOS7updatesDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);

			//1. description
			tempArr = CentOS7.getCentOS7updatesDescription(pkgkey);
			
			tempMap.put("description", tempArr);
			
			//1-3. description
			tempArr = CentOS7.getCentOS7updatesOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);			
			
			//2. requires
			tempArr = CentOS7.getCentOS7updatesRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS7.getCentOS7updatesProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS7.getCentOS7updatesConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS7.getCentOS7updatesObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS7.getCentOS7updatesFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//7.changelog
			tempArr = CentOS7.getCentOS7updatesChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
		}else {
			
		}
		
		return tempMap; 

	}
	

}
	