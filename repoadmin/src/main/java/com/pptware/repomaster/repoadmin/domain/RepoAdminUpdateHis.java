package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminUpdateHis {

	private String upld_idx;
	private String repo_idx;
	private String repo_name;
	private String upld_file_cnt;
	private String upld_file_size;
	private String c_date_s;
	private String c_date_e;
	private String c_date_view;
	private String c_emp_no;
	
	public String getUpld_idx() {
		return upld_idx;
	}
	public void setUpld_idx(String upld_idx) {
		this.upld_idx = upld_idx;
	}
	public String getRepo_name() {
		return repo_name;
	}
	public void setRepo_name(String repo_name) {
		this.repo_name = repo_name;
	}
	public String getUpld_file_cnt() {
		return upld_file_cnt;
	}
	public void setUpld_file_cnt(String upld_file_cnt) {
		this.upld_file_cnt = upld_file_cnt;
	}
	public String getUpld_file_size() {
		return upld_file_size;
	}
	public void setUpld_file_size(String upld_file_size) {
		this.upld_file_size = upld_file_size;
	}
	public String getC_date_s() {
		return c_date_s;
	}
	public void setC_date_s(String c_date_s) {
		this.c_date_s = c_date_s;
	}
	public String getC_date_e() {
		return c_date_e;
	}
	public void setC_date_e(String c_date_e) {
		this.c_date_e = c_date_e;
	}
	public String getC_emp_no() {
		return c_emp_no;
	}
	public void setC_emp_no(String c_emp_no) {
		this.c_emp_no = c_emp_no;
	}
	public String getC_date_view() {
		return c_date_view;
	}
	public void setC_date_view(String c_date_view) {
		this.c_date_view = c_date_view;
	}
	public String getRepo_idx() {
		return repo_idx;
	}
	public void setRepo_idx(String repo_idx) {
		this.repo_idx = repo_idx;
	}
	@Override
	public String toString() {
		return "RepoAdminUpdateHis [upld_idx=" + upld_idx + ", repo_idx=" + repo_idx + ", repo_name=" + repo_name
				+ ", upld_file_cnt=" + upld_file_cnt + ", upld_file_size=" + upld_file_size + ", c_date_s=" + c_date_s
				+ ", c_date_e=" + c_date_e + ", c_date_view=" + c_date_view + ", c_emp_no=" + c_emp_no + "]";
	}
}
