package com.pptware.repomaster.repoadmin.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import com.pptware.repomaster.repoadmin.domain.RepoAdminDown;
import com.pptware.repomaster.repoadmin.domain.RepoAdminFile;
import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;
import com.pptware.repomaster.repoadmin.mapper.RepoAdminFileDownLoadMapper;

@Service("com.pptware.repomaster.repoadmin.service.RepoAdminFileDownLoadService")
public class RepoAdminFileDownLoadService {

	@Resource(name = "com.pptware.repomaster.repoadmin.mapper.RepoAdminFileDownLoadMapper")
	public RepoAdminFileDownLoadMapper downMapper;
	public Map<String,String> fileDownChecker(int repo_idx, int file_idx){
		Map<String,String> returnParam = new HashMap<String, String>();
		
		RepoAdminFile vo = getFileData(repo_idx, file_idx);
		
		File file = new File(vo.getFile_full_name());
		if(file.exists()) {
			returnParam.put("key", "Y");
		}else {
			returnParam.put("key", "N");
		}		
		return returnParam;
	}
	public void filDown(HttpServletRequest request, HttpServletResponse response, int repo_idx,int file_idx,String down_prog_id) throws IOException {
		
		RepoAdminFile vo = null;
		
		RepoAdminUser userVo = (RepoAdminUser) request.getSession().getAttribute("loginUser");
		
		RepoAdminDown downVo = new RepoAdminDown();
		
		downVo.setRepo_idx(repo_idx);
		downVo.setFile_idx(file_idx);
		downVo.setDown_prog_id(down_prog_id);
		downVo.setC_emp_no(userVo.getEmp_no());
		downVo.setDown_ip(request.getRemoteAddr());
		
		try {
			downMapper.insertDownHis(downVo);
			vo = getFileData(repo_idx, file_idx);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File( vo.getFile_full_name());
		if (file.exists() && file.isFile()) {
			response.setContentType("application/octet-stream; charset=utf-8");
			response.setContentLength((int) file.length());
			String browser = getBrowser(request);
			String disposition = getDisposition(vo.getFile_name(), browser);
			response.setHeader("Content-Disposition", disposition);
			response.setHeader("Content-Transfer-Encoding", "binary");
			OutputStream out = response.getOutputStream();
			FileInputStream fis = null;
			fis = new FileInputStream(file);
			FileCopyUtils.copy(fis, out);
			if (fis != null)
				fis.close();
			out.flush();
			out.close();
		}
	}

	private String getBrowser(HttpServletRequest request) {
		String header = request.getHeader("User-Agent");
		if (header.indexOf("MSIE") > -1 || header.indexOf("Trident") > -1)
			return "MSIE";
		else if (header.indexOf("Chrome") > -1)
			return "Chrome";
		else if (header.indexOf("Opera") > -1)
			return "Opera";
		return "Firefox";
	}

	private String getDisposition(String filename, String browser)throws UnsupportedEncodingException {
		String dispositionPrefix = "attachment;filename=";
		String encodedFilename = null;
		if (browser.equals("MSIE")) {
			encodedFilename = URLEncoder.encode(filename, "UTF-8").replaceAll("\\+", "%20");
		} else if (browser.equals("Firefox")) {
			encodedFilename = "\"" + new String(filename.getBytes("UTF-8"), "8859_1") + "\"";
		} else if (browser.equals("Opera")) {
			encodedFilename = "\"" + new String(filename.getBytes("UTF-8"), "8859_1") + "\"";
		} else if (browser.equals("Chrome")) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < filename.length(); i++) {
				char c = filename.charAt(i);
				if (c > '~') {
					sb.append(URLEncoder.encode("" + c, "UTF-8"));
				} else {
					sb.append(c);
				}
			}
			encodedFilename = sb.toString();
		}
		return dispositionPrefix + encodedFilename;
	}
	
	private RepoAdminFile getFileData(int repo_idx , int file_idx) {
		RepoAdminFile vo = new RepoAdminFile();
		try {
			if(repo_idx ==0) { // user_repo
				vo = downMapper.retrieveUserFileDown(file_idx);				
			}else{ // else_repo
				vo = downMapper.retrieveFileDown(file_idx);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
}
