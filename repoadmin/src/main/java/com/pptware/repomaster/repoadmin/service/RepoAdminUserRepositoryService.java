package com.pptware.repomaster.repoadmin.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.pptware.repomaster.repoadmin.domain.RepoAdminExcludeFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminMain;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserPackage;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminUserRepositoryMapper;

@Service("com.pptware.repomaster.repoadmin.service.RepoAdminUserRepositoryService")
public class RepoAdminUserRepositoryService {

	/*
	 * 사용자 리파지토리 트리 구조
	 * 1.--		Map<"repo" 			,Map<"repo_dir"		, List<"리파지토리 명"	>>>
	 * 2.---	Map<"packages_dir" 	,Map<"1.리파지토리명"	, List<"패키지 명"		>>>
	 * 3.----	Map<"packages" 		,Map<"2.패키지명"		, List<"패키지 파일 명"	>>>
	 * */
	@Resource(name="com.pptware.repomaster.repoadmin.mapper.RepoAdminUserRepositoryMapper")
	RepoAdminUserRepositoryMapper repository;	
	
	public RepoAdminMain getMainInformation(String emp_no) throws Exception {
		return repository.getMainInformation(emp_no);
	}

	public int updateConf(RepoAdminUserRepositoryConf conf) throws Exception {
		int resultCount = repository.updateConf(conf);
		return resultCount;
	}

	public List<RepoAdminUserRepository> retrieveUserRepo (String emp_no) throws Exception{ 
		List<RepoAdminUserRepository> voRepoList = repository.retrieveUserRepo(emp_no);
		return voRepoList;
	} 
	

	
	public List<RepoAdminUserRepositoryConf> getUserRepoConfList (String[] arr) {
		List<RepoAdminUserRepositoryConf> confList = repository.getUserRepoConfList(arr);
		return confList;
	}
	
	public List<RepoAdminUserRepository> retrieveUserRepoList(String emp_no){
		
		List<RepoAdminUserRepository> return_arr = new ArrayList<RepoAdminUserRepository>();
		try {
			return_arr = repository.retrieveUserRepo(emp_no);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return return_arr;
	}
	public List<RepoAdminUserPackage> retrieveUserPackList(int user_repo_idx , String emp_no){
		List<RepoAdminUserPackage> return_arr = new ArrayList<RepoAdminUserPackage>();
		try {
			return_arr = repository.retrieveUserPackList(user_repo_idx,emp_no);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return return_arr;
	}
	
	public List<RepoAdminUserPackage> retrieveUserFileList(int user_pack_idx , String emp_no){
		List<RepoAdminUserPackage> return_arr = new ArrayList<RepoAdminUserPackage>();
		try {
			return_arr = repository.retrieveUserFileList(user_pack_idx,emp_no);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return return_arr;
	}
	
	/**
	 * @param 
	 * c_repo_name = 생성하려는 리파지토리 명칭
	 * emp_no = 생성자 id
	 * @return Map<String,String>
	 * MSG : 리턴 메시지 ( 생성 불가 사유 ) 
	 * KEY : Y(성공)
	 * 		 N(실패)
	 * */
	public Map<String,String> createUserRepo(String c_repo_name, String emp_no) {
		Map<String,String> returnParam = new HashMap<String, String>();
		String returnMsg = "";
		String key = "N";
		try {
			int user_repo_cnt = repository.retrieveUserRepoCnt(emp_no,emp_no+"/"+c_repo_name); // 리파지토리명이 이미 존재하는지 확인 , 디렉토리 구조상 동일 디렉토리 있으면 안됨
			
			if(user_repo_cnt<1) { // 리파지 토리 명이 겹치지 않으면
				RepoAdminUserRepository vo = new RepoAdminUserRepository();
				String user_repo_root_path = repository.retrieveUserRepoRootPath(); //사용자 리파지토리 루트패스 확인 , rm_repository - repo_idx = 0 인 root_path
				
				user_repo_root_path += "/"+emp_no;
				File dir = new File(user_repo_root_path);
				
				if(!dir.isDirectory()){					
					dir.mkdir();
				}
				
				user_repo_root_path += "/"+c_repo_name;
				dir = new File(user_repo_root_path);
				dir.mkdir();
				
				vo.setUser_repo_name(c_repo_name);
				vo.setUser_repo_path(user_repo_root_path);
				vo.setC_emp_no(emp_no);
				
				repository.insertUserRepo(vo);
				
				returnMsg = "리파지토리가 생성완료 되었습니다.";
				key = "Y";
			}else {
				returnMsg = "이미 존재하는 리파지토리 명입니다.";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		returnParam.put("MSG", returnMsg);
		returnParam.put("KEY", key);
		return returnParam;
	}
	
	public Map<String,String> createUsrePacakges(int repo_idx, String pack_name , String emp_no){
		Map<String,String> returnParam = new HashMap<String, String>();
		String returnMsg = "";
		String key = "N";
		
		try {
			RepoAdminUserRepository vo = new RepoAdminUserRepository();
			vo.setUser_repo_idx(repo_idx);
			vo.setC_emp_no(emp_no);
			vo = repository.retrieveTargetUserRepo(vo);
			String uploadFolder = vo.getUser_repo_path() + "/" + pack_name ;
	
			File saveFile = new File(uploadFolder);
			if(!saveFile.exists()){
				saveFile.mkdir();				
			}
		
			vo.setUser_repo_idx(repo_idx);
			vo.setUser_pack_name(pack_name);
			vo.setUser_repo_path(uploadFolder);
			vo.setC_emp_no(emp_no);
			
			repository.insertUserPackData(vo);
			
			returnMsg = "패키지 생성이 완료되었습니다.";
			key = "Y";
			
		} catch (Exception e) {
			returnMsg = "파일 업로드에 실패하였습니다. 관리자에게 문의하여 주세요.";
			e.printStackTrace();
		}
		
		
		
		returnParam.put("MSG", returnMsg);
		returnParam.put("KEY", key);
		
		return returnParam;
	}
	
	public Map<String,String> uploadUserPackages(MultipartFile[] uploadFile , int pack_idx, String emp_no) {
		Map<String,String> returnParam = new HashMap<String, String>();
		
		String returnMsg = "";
		String key = "N";
		
		try {
			RepoAdminUserPackage vo = new RepoAdminUserPackage();
			
			vo.setUser_pack_idx(pack_idx);
			vo.setC_emp_no(emp_no);
			vo = repository.retrieveTargetUserPack(vo);
			String uploadFolder = vo.getPack_full_path() ;
			
			int repo_idx = vo.getUser_repo_idx();
			
			File saveFile = new File(uploadFolder);
			if(!saveFile.exists()){
				saveFile.mkdir();				
			}
			
			vo.setC_emp_no(emp_no);
			
			for(MultipartFile multipartFile : uploadFile) {

				String uploadFileName = multipartFile.getOriginalFilename();
				
				uploadFileName = uploadFileName.substring(uploadFileName.lastIndexOf("\\") + 1);

				saveFile = new File(uploadFolder, uploadFileName);
				
				multipartFile.transferTo(saveFile);
				
				vo.setFile_full_name(uploadFolder+"/"+uploadFileName);
				int cnt = repository.retrieveUserFileCnt(vo);
				vo.setFile_size(multipartFile.getSize());
				vo.setUser_pack_idx(pack_idx);

				if(cnt == 0){
					vo.setFile_name(uploadFileName);
					repository.insertUserFileData(vo);
				}else{
					repository.updateUserFileData(vo);
				}
			}
			RepoAdminUserRepository voRepo = new RepoAdminUserRepository();
			voRepo.setC_emp_no(emp_no);
			voRepo.setUser_repo_idx(repo_idx);
			repository.updateUserRepoData(voRepo);
			
			returnMsg = "파일 업로드가 완료 되었습니다.";
			key = "Y";
		} catch (Exception e) {
			returnMsg = "파일 업로드에 실패하였습니다. 관리자에게 문의하여 주세요.";
			e.printStackTrace();
		}
		
		returnParam.put("MSG", returnMsg);
		returnParam.put("KEY", key);
		
		return returnParam;
	}
	
	public Map<String,String> excludeUserFile(int file_idx, String exclude_rsn ,String exclude_key, String emp_no) {
		Map<String,String> returnParam = new HashMap<String, String>();
		
		String returnMsg = "";
		String key = "N";
		String ex_key = "Y";
		RepoAdminUserRepository vo1 = new RepoAdminUserRepository();
		try {
			
			RepoAdminExcludeFile vo = new RepoAdminExcludeFile();
			vo.setFile_idx(file_idx);
			vo1.setUser_file_idx(file_idx);
			vo.setC_emp_no(emp_no);
			vo.setExclude_rsn(exclude_rsn);
			
			if("N".equals(exclude_key)) {
				repository.insertUserFileExclude(vo);
				
			}else {
				repository.deleteUserExcludeFileData(file_idx);
				ex_key = "N";
			}
			vo1.setIs_exclude(ex_key);
			
			repository.updateisExcludeData(vo1);
			
			returnMsg = "제외 처리에 성공 하였습니다.";
			key = "Y";
			
		} catch (Exception e) {
			returnMsg = "처리에 실패하였습니다. 관리자에게 문의하여 주세요.";
			e.printStackTrace();
		}
		
		
		returnParam.put("MSG", returnMsg);
		returnParam.put("KEY", key);
		
		return returnParam;
	}
	
	public Map<String,String> delUserFile(int file_idx,String emp_no) {
		Map<String,String> returnParam = new HashMap<String, String>();
		
		String returnMsg = "";
		String key = "N";
		
		try {
			
			RepoAdminUserRepository vo = repository.retrieveFileFullName(file_idx);
			String file_full_name = vo.getFile_full_name();
			File file = new File(file_full_name); 
			
			if( file.exists() ){ 
				file.delete();
			}
			
			repository.deleteUserFileData(file_idx);
			
			repository.deleteUserExcludeFileData(file_idx);

			returnMsg = "파일삭제가 완료 되었습니다.";
			key = "Y";
			
		} catch (Exception e) {
			returnMsg = "파일 삭제에 실패하였습니다. 관리자에게 문의하여 주세요.";
			e.printStackTrace();
		}
		
		
		returnParam.put("MSG", returnMsg);
		returnParam.put("KEY", key);
		
		return returnParam;
	}
	
	public Map<String,String> delUserPack(int user_pack_idx,String emp_no) {
		Map<String,String> returnParam = new HashMap<String, String>();
		
		String returnMsg = "";
		String key = "N";
		
		try {
			
			RepoAdminUserRepository vo = repository.retrievePackFullName(user_pack_idx);
			String user_pack_name = vo.getUser_pack_name();
			File pack = new File(user_pack_name); 
			
			if( pack.exists() ){ 
				pack.delete();
			}
			
			repository.deleteUserPackData(user_pack_idx);
			
			repository.deleteUserExcludeFileData(user_pack_idx);

			returnMsg = "파일삭제가 완료 되었습니다.";
			key = "Y";
			
		} catch (Exception e) {
			returnMsg = "파일 삭제에 실패하였습니다. 관리자에게 문의하여 주세요.";
			e.printStackTrace();
		}
		
		
		returnParam.put("MSG", returnMsg);
		returnParam.put("KEY", key);
		
		return returnParam;
	}
	
	public Map<String,String> delUserRepo(int user_repo_idx,String emp_no) {
		Map<String,String> returnParam = new HashMap<String, String>();
		
		String returnMsg = "";
		String key = "N";
		
		try {
			
			RepoAdminUserRepository vo = repository.retrieveRepoFullName(user_repo_idx);
			String user_repo_name = vo.getUser_repo_name();
			File repo = new File(user_repo_name); 
			
			if( repo.exists() ){ 
				repo.delete();
			}
			
			repository.deleteUserRepoData(user_repo_idx);
			
			repository.deleteUserExcludeFileData(user_repo_idx);

			returnMsg = "파일삭제가 완료 되었습니다.";
			key = "Y";
			
		} catch (Exception e) {
			returnMsg = "리파지토리 삭제에 실패하였습니다. 관리자에게 문의하여 주세요.";
			e.printStackTrace();
		}
		
		
		returnParam.put("MSG", returnMsg);
		returnParam.put("KEY", key);
		
		return returnParam;
	}
}