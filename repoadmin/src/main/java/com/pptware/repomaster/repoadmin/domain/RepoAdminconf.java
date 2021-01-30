package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminconf {

	private int conf_idx;
	private String conf_name;
	private String conf_desc;
	private String conf_body;
	private String c_date;
	private String c_emp_no;
	private String u_date;
	private String u_emp_no;
	public int getConf_idx() {
		return conf_idx;
	}
	public void setConf_idx(int conf_idx) {
		this.conf_idx = conf_idx;
	}
	public String getConf_name() {
		return conf_name;
	}
	public void setConf_name(String conf_name) {
		this.conf_name = conf_name;
	}
	public String getConf_desc() {
		return conf_desc;
	}
	public void setConf_desc(String conf_desc) {
		this.conf_desc = conf_desc;
	}
	public String getConf_body() {
		return conf_body;
	}
	public void setConf_body(String conf_body) {
		this.conf_body = conf_body;
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

	@Override
	public String toString() {
		return "RepoAdminconf [conf_idx=" + conf_idx + ", conf_name=" + conf_name + ", conf_desc=" + conf_desc
				+ ", conf_body=" + conf_body + ", c_date=" + c_date + ", c_emp_no=" + c_emp_no + ", u_date=" + u_date
				+ ", u_emp_no=" + u_emp_no + "]";
	}
	public RepoAdminconf(int conf_idx, String conf_name, String conf_desc, String conf_body, String c_date,
			String c_emp_no, String u_date, String u_emp_no) {
		super();
		this.conf_idx = conf_idx;
		this.conf_name = conf_name;
		this.conf_desc = conf_desc;
		this.conf_body = conf_body;
		this.c_date = c_date;
		this.c_emp_no = c_emp_no;
		this.u_date = u_date;
		this.u_emp_no = u_emp_no;
	}
	public RepoAdminconf() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}