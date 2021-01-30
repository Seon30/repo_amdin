package com.pptware.repomaster.repoadmin.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pptware.repomaster.repoadmin.domain.RepoAdminDown;
import com.pptware.repomaster.repoadmin.domain.RepoAdminExcludeFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminRepositoryMapper;

@Service("com.pptware.repomaster.repoadmin.service.RepoAdminRepositoryService")
public class RepoAdminRepositoryService {

	@Resource(name="com.pptware.repomaster.repoadmin.mapper.RepoAdminRepositoryMapper")
	RepoAdminRepositoryMapper repository;	
	
	public int retrieveTotalCount(String repo) throws Exception {
		return repository.retrieveTotalCount(repo);
	}
	
	public long retrieveTotalSize(String repo) throws Exception {
		return repository.retrieveTotalSize(repo);
	}

	public List<RepoAdminFile> retrieveFileUpdateData(String c_date, String repo) throws Exception{
		return repository.retrieveFileUpdateData(c_date, repo);
	}
	
	public List<RepoAdminFile> excludeFileSearchData() throws Exception{
		return repository.excludeFileSearchData();
	}
	
	public List<RepoAdminFile> retrieveFileSearchData(String filename, String repo_idx) throws Exception{
		List<RepoAdminFile> arr = new ArrayList<RepoAdminFile>();
		if(repo_idx == "0") {
			arr = repository.retrieveUserFileSearchData(filename);
		}else {
			arr = repository.retrieveFileSearchData(filename, repo_idx);			
		}
		
		return arr ;
	}
	
	public int insertExclude(RepoAdminExcludeFile file) throws Exception {
		return repository.insertExclude(file);
	}	
	public void updateFileExcludeData(int file_idx) throws Exception{
		repository.updateFileExcludeData(file_idx);
	}

	public void updateFileExcludeDataN(int file_idx) throws Exception{
		repository.updateFileExcludeDataN(file_idx);
	}	
	
	public int deleteExclude(RepoAdminExcludeFile file) throws Exception {
		
		return repository.deleteExclude(file);
	}
	
	public List<RepoAdminFile> excludeFileList(String exclude_idx) throws Exception {
		return repository.excludeFileList(exclude_idx);
	}

	public void excludeFileList() {
		// TODO Auto-generated method stub
	}	
	
	public List<RepoAdminUserRepositoryConf> confRepository() throws Exception{
		return repository.confRepository();
	}
	
	
	public RepoAdminUserRepositoryConf confAll(String conf_idx) throws Exception{
		
		return repository.confAll(conf_idx);
	
	}
	
	public void newInputConf(RepoAdminUserRepositoryConf conf)throws Exception{
		repository.newInputConf(conf);
	}
	
	public RepoAdminUserRepositoryConf updateConf(RepoAdminUserRepositoryConf conf)throws Exception{
		return repository.updateConf(conf);
	}
	
	public List<RepoAdminUserRepositoryConf> confName() throws Exception{
		return repository.confName();
		
	}
	
	public int updateConf_repo (RepoAdminUserRepositoryConf vo) throws Exception {
		String checker = vo.getConf_static_idx();
		
		if("repo_conf01_idx".equals(checker)) {
			vo.setRepo_conf01_idx(vo.getConf_idx());
		}else if("repo_conf02_idx".equals(checker)) {
			vo.setRepo_conf02_idx(vo.getConf_idx());
		}else if("repo_conf03_idx".equals(checker)) {
			vo.setRepo_conf03_idx(vo.getConf_idx());
		}else if("repo_conf04_idx".equals(checker)) {
			vo.setRepo_conf04_idx(vo.getConf_idx());
		}else{
			vo.setRepo_conf05_idx(vo.getConf_idx());
		}
		
		return repository.updateConf_repo(vo);
	};

	public List<RepoAdminDown> downloadListSearch() throws Exception {
		return repository.downloadListSearch(); 
	};
	
	
	public List<RepoAdminUserRepositoryConf> searchConfName(String conf_name, String conf_idx)	throws Exception {
		
		return repository.searchConfName(conf_name, conf_idx);
		
	};
	
}

