package com.pptware.repomaster.repoadmin.service;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptware.repomaster.repoadmin.domain.RepoAdminWindowsPython;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminWindowsPythonMapper;


@Service("com.pptware.repomaster.repoadmin.service.RepoAdminWindowsPythonService")
public class RepoAdminWindowsPythonService {

	@Resource(name = "com.pptware.repomaster.repoadmin.mapper.RepoAdminWindowsPythonMapper")
	RepoAdminWindowsPythonMapper windowsPython;
	
	public List<RepoAdminWindowsPython> getPythonDetail1() throws Exception {
		
		return windowsPython.getPythonDetail1();
	}

	public List<RepoAdminWindowsPython> getPythonDetail2() throws Exception {
		
		return windowsPython.getPythonDetail2();
	}

	public List<RepoAdminWindowsPython> getPythonDetail3() throws Exception {
		
		return windowsPython.getPythonDetail3();
	}

	public List<RepoAdminWindowsPython> getPythonDetail4() throws Exception {
		
		return windowsPython.getPythonDetail4();
	}

	public List<RepoAdminWindowsPython> getPythonDetail5() throws Exception {
		
		return windowsPython.getPythonDetail5();
	}

	public List<RepoAdminWindowsPython> getPythonDetail6() throws Exception {
		
		return windowsPython.getPythonDetail6();
	}

	public List<RepoAdminWindowsPython> getPythonDetail7() throws Exception {
		
		return windowsPython.getPythonDetail7();
	}

	public List<RepoAdminWindowsPython> getPythonDetail8() throws Exception {
		
		return windowsPython.getPythonDetail8();
	}

	public List<RepoAdminWindowsPython> getPythonDetail9() throws Exception {
		
		return windowsPython.getPythonDetail9();
	}
	
	public List<RepoAdminWindowsPython> getPythonDetail10() throws Exception {
		
		return windowsPython.getPythonDetail10();
	}
	
	public List<RepoAdminWindowsPython> getPythonDetail11() throws Exception {
		
		return windowsPython.getPythonDetail11();
	}
	
	public List<RepoAdminWindowsPython> getPythonDetail12() throws Exception {
		
		return windowsPython.getPythonDetail12();
	}
	
	public List<RepoAdminWindowsPython> getPythonDetail13() throws Exception {
		
		return windowsPython.getPythonDetail13();
	}
}
	