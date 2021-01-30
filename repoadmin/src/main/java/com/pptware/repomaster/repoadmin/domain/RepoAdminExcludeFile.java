package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminExcludeFile {

	private int exclude_idx;
	private int file_idx;
	private String c_date;
	private String c_emp_no;
	private String u_date;
	private String u_emp_no;
	private String exclude_rsn;
	private String idx;
	
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public int getExclude_idx() {
		return exclude_idx;
	}
	public void setExclude_idx(int exclude_idx) {
		this.exclude_idx = exclude_idx;
	}
	public int getFile_idx() {
		return file_idx;
	}
	public void setFile_idx(int file_idx) {
		this.file_idx = file_idx;
	}
	public String getC_date() {
		return c_date;
	}
	public void setC_date(String c_date) {
		this.c_date = c_date;
	}
	public String getC_emp_no() {
		return c_emp_no;
	}
	public void setC_emp_no(String c_emp_no) {
		this.c_emp_no = c_emp_no;
	}
	public String getU_date() {
		return u_date;
	}
	public void setU_date(String u_date) {
		this.u_date = u_date;
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
