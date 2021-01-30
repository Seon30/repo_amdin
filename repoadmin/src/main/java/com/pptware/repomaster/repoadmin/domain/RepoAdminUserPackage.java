package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminUserPackage {
	//리파지토리
	private int user_pack_idx;
	private int user_repo_idx;
	private String user_pack_name;
	private String pack_full_path;
	
	//파일
	private int user_file_idx;
	private String file_full_name;
	private String file_name;
	private String is_exclude;
	private long file_size;
	private String c_emp_no;
	private String u_emp_no;
	private String exclude_rsn;
	
	
	public int getUser_repo_idx() {
		return user_repo_idx;
	}
	public void setUser_repo_idx(int user_repo_idx) {
		this.user_repo_idx = user_repo_idx;
	}
	public int getUser_pack_idx() {
		return user_pack_idx;
	}
	public void setUser_pack_idx(int user_pack_idx) {
		this.user_pack_idx = user_pack_idx;
	}
	public String getUser_pack_name() {
		return user_pack_name;
	}
	public void setUser_pack_name(String user_pack_name) {
		this.user_pack_name = user_pack_name;
	}
	public String getPack_full_path() {
		return pack_full_path;
	}
	public void setPack_full_path(String pack_full_path) {
		this.pack_full_path = pack_full_path;
	}
	public int getUser_file_idx() {
		return user_file_idx;
	}
	public void setUser_file_idx(int user_file_idx) {
		this.user_file_idx = user_file_idx;
	}
	public String getFile_full_name() {
		return file_full_name;
	}
	public void setFile_full_name(String file_full_name) {
		this.file_full_name = file_full_name;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getIs_exclude() {
		return is_exclude;
	}
	public void setIs_exclude(String is_exclude) {
		this.is_exclude = is_exclude;
	}
	public long getFile_size() {
		return file_size;
	}
	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}
	public String getC_emp_no() {
		return c_emp_no;
	}
	public void setC_emp_no(String c_emp_no) {
		this.c_emp_no = c_emp_no;
	}
	public String getU_emp_no() {
		return u_emp_no;
	}
	public void setU_emp_no(String u_emp_no) {
		this.u_emp_no = u_emp_no;
	}
	public String getExclude_rsn() {
		return exclude_rsn;
	}
	public void setExclude_rsn(String exclude_rsn) {
		this.exclude_rsn = exclude_rsn;
	}
	
	
	
	
		
}
