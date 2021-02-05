package com.pptware.repomaster.repoadmin.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptware.repomaster.repoadmin.domain.RepoAdminCentOSPrimaryPackages;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminCentOS8Mapper;


@Service("com.pptware.repomaster.repoadmin.service.RepoAdminCentOS8Service")
public class RepoAdminCentOS8Service {

	@Resource(name = "com.pptware.repomaster.repoadmin.mapper.RepoAdminCentOS8Mapper")
	RepoAdminCentOS8Mapper CentOS8;
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8appstreamList() throws Exception {
		
		return CentOS8.getCentOS8appstreamList();

	}
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8baseosList() throws Exception {

		return CentOS8.getCentOS8baseosList();

	}
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8extrasList() throws Exception {

		return CentOS8.getCentOS8extrasList();

	}
	
	public List<RepoAdminCentOSPrimaryPackages> getCentOS8plusList() throws Exception {

		return CentOS8.getCentOS8plusList();

	}

	public List<RepoAdminCentOSPrimaryPackages> getCentOS8powertoolsList() throws Exception {

		return CentOS8.getCentOS8powertoolsList();

	}

	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8appstreamList(String rpm_sourcerpm) throws Exception {
		
		return CentOS8.searchCentOS8appstreamList(rpm_sourcerpm);

	}
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8baseosList(String rpm_sourcerpm) throws Exception {

		return CentOS8.searchCentOS8baseosList(rpm_sourcerpm);

	}
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8extrasList(String rpm_sourcerpm) throws Exception {

		return CentOS8.searchCentOS8extrasList(rpm_sourcerpm);

	}
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8plusList(String rpm_sourcerpm) throws Exception {

		return CentOS8.searchCentOS8plusList(rpm_sourcerpm);

	}
	
	public List<RepoAdminCentOSPrimaryPackages> searchCentOS8powertoolsList(String rpm_sourcerpm) throws Exception {

		return CentOS8.searchCentOS8powertoolsList(rpm_sourcerpm);

	}		
	
	public Map<String,List<RepoAdminCentOSPrimaryPackages>> getCentOS8OSdetail(String pkgkey ,String key) throws Exception {
		Map<String,List<RepoAdminCentOSPrimaryPackages>> tempMap = new HashMap<String,List<RepoAdminCentOSPrimaryPackages>>();
		//9 컨트롤러에서 넘겨받은 param 을 사용해서 데이터 조회 해서 리턴 해줌 ,key 값에 부합하는 if절이 있어야 조회 작동함 없으면 무조건 공란 상태임
		List<RepoAdminCentOSPrimaryPackages> tempArr = null;
		System.out.println("((((((((pkgkey:::"+pkgkey+"))))):::::"+"((((((((key:::"+key+")))))");
		//pkgkey : 26
		//key : powertools
		if("8appstream".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8appstreamDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS8.getCentOS8appstreamDescription(pkgkey);
			
			tempMap.put("description", tempArr);

			//1-3. description
			tempArr = CentOS8.getCentOS8appstreamOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS8.getCentOS8appstreamRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8appstreamProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			System.out.println("66666666666666666666666666666 +++++++ provides??????");
			//4. Conflicts
			tempArr = CentOS8.getCentOS8appstreamConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			System.out.println("888888888888888888888888888888 +++++++ conflict??????"+tempArr);
			//5. obsoletes
			tempArr = CentOS8.getCentOS8appstreamObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			System.out.println("888888888888888888888888888 +++++++ obsoletes??????"+tempArr);
		
			//6.filepath
			tempArr = CentOS8.getCentOS8appstreamFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8appstreamChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);			
			
		}else if("8baseos".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8baseosDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS8.getCentOS8baseosDescription(pkgkey);
			
			tempMap.put("description", tempArr);

			//1-3. description
			tempArr = CentOS8.getCentOS8baseosOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS8.getCentOS8baseosRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8baseosProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8baseosConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8baseosObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8baseosFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8baseosChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
			
		}else if("8powertools".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8powertoolsDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS8.getCentOS8powertoolsDescription(pkgkey);
			
			tempMap.put("description", tempArr);

			//1-3. description
			tempArr = CentOS8.getCentOS8powertoolsOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS8.getCentOS8powertoolsRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8powertoolsProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8powertoolsConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8powertoolsObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8powertoolsFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8powertoolsChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
		}else if("8extras".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8extrasDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);

			//1. description
			tempArr = CentOS8.getCentOS8extrasDescription(pkgkey);
			
			tempMap.put("description", tempArr);
			
			//1-3. description
			tempArr = CentOS8.getCentOS8extrasOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);			
			
			//2. requires
			tempArr = CentOS8.getCentOS8extrasRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8extrasProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8extrasConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8extrasObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8extrasFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8extrasChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
		}else if("8plus".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8plusDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);

			//1. description
			tempArr = CentOS8.getCentOS8plusDescription(pkgkey);
			
			tempMap.put("description", tempArr);
			
			//1-3. description
			tempArr = CentOS8.getCentOS8plusOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);			
			
			//2. requires
			tempArr = CentOS8.getCentOS8plusRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8plusProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8plusConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8plusObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8plusFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8plusChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
	
		}else if("appstream".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8appstreamDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS8.getCentOS8appstreamDescription(pkgkey);
			
			tempMap.put("description", tempArr);
	
			//1-3. description
			tempArr = CentOS8.getCentOS8appstreamOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS8.getCentOS8appstreamRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8appstreamProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			System.out.println("66666666666666666666666666666 +++++++ provides??????");
			//4. Conflicts
			tempArr = CentOS8.getCentOS8appstreamConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			System.out.println("888888888888888888888888888888 +++++++ conflict??????"+tempArr);
			//5. obsoletes
			tempArr = CentOS8.getCentOS8appstreamObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			System.out.println("888888888888888888888888888 +++++++ obsoletes??????"+tempArr);
		
			//6.filepath
			tempArr = CentOS8.getCentOS8appstreamFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8appstreamChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);			
			
		}else if("baseos".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8baseosDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS8.getCentOS8baseosDescription(pkgkey);
			
			tempMap.put("description", tempArr);
	
			//1-3. description
			tempArr = CentOS8.getCentOS8baseosOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS8.getCentOS8baseosRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8baseosProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8baseosConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8baseosObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8baseosFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8baseosChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
			
		}else if("powertools".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8powertoolsDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS8.getCentOS8powertoolsDescription(pkgkey);
			
			tempMap.put("description", tempArr);
	
			//1-3. description
			tempArr = CentOS8.getCentOS8powertoolsOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS8.getCentOS8powertoolsRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8powertoolsProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8powertoolsConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8powertoolsObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8powertoolsFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8powertoolsChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
		}else if("extras".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8extrasDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
	
			//1. description
			tempArr = CentOS8.getCentOS8extrasDescription(pkgkey);
			
			tempMap.put("description", tempArr);
			
			//1-3. description
			tempArr = CentOS8.getCentOS8extrasOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);			
			
			//2. requires
			tempArr = CentOS8.getCentOS8extrasRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8extrasProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8extrasConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8extrasObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8extrasFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8extrasChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
		}else if("plus".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8plusDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
	
			//1. description
			tempArr = CentOS8.getCentOS8plusDescription(pkgkey);
			
			tempMap.put("description", tempArr);
			
			//1-3. description
			tempArr = CentOS8.getCentOS8plusOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);			
			
			//2. requires
			tempArr = CentOS8.getCentOS8plusRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8plusProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8plusConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8plusObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8plusFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8plusChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);
			
		}else if("baseos".equals(key)) {
			//0.desc1
			tempArr = CentOS8.getCentOS8baseosDesc1(pkgkey);
			
			tempMap.put("desc1", tempArr);
			
			//1. description
			tempArr = CentOS8.getCentOS8baseosDescription(pkgkey);
			
			tempMap.put("description", tempArr);
	
			//1-3. description
			tempArr = CentOS8.getCentOS8baseosOnlyDescription(pkgkey);
			
			tempMap.put("onlydesc", tempArr);	
			
			//2. requires
			tempArr = CentOS8.getCentOS8baseosRequires(pkgkey);
			
			tempMap.put("requires", tempArr);
			
			//3. provides
			tempArr = CentOS8.getCentOS8baseosProvides(pkgkey);
			
			tempMap.put("provides", tempArr);
			
			//4. Conflicts
			tempArr = CentOS8.getCentOS8baseosConflicts(pkgkey);
			
			tempMap.put("conflicts", tempArr);			
			
			//5. obsoletes
			tempArr = CentOS8.getCentOS8baseosObsoletes(pkgkey);
			
			tempMap.put("obsoletes", tempArr);
			
			//6.filepath
			tempArr = CentOS8.getCentOS8baseosFilePath(pkgkey);
			
			tempMap.put("filepath", tempArr);	
			
			//8.changelog
			tempArr = CentOS8.getCentOS8baseosChangelog(pkgkey);
			
			tempMap.put("changelog", tempArr);			

		}else {
			
		}
		
		return tempMap; 

	}

	
	
	
	
	
	

}
	