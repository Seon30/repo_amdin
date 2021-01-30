package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminUserRepositoryConf {
//conf_idx, conf_name, conf_desc, conf_body, c_date, c_emp_no, u_date, u_emp_no 
	private String conf_idx;
	private int repo_idx;
	private String repo_name;
	private String conf_static_idx;
	private String repo_conf01_idx;
	private String conf_01_nm;
	private String repo_conf02_idx;
	private String conf_02_nm;
	private String repo_conf03_idx;
	private String conf_03_nm;
	private String repo_conf04_idx;
	private String conf_04_nm;
	private String repo_conf05_idx;
	private String conf_05_nm;
	private String conf_name;
	private String conf_body;
	private String conf_desc;
	private String c_date;
	private String c_emp_no;
	private String u_date;
	private String u_emp_no;
	public String getConf_idx() {
		return conf_idx;
	}
	public void setConf_idx(String conf_idx) {
		this.conf_idx = conf_idx;
	}
	public int getRepo_idx() {
		return repo_idx;
	}
	public void setRepo_idx(int repo_idx) {
		this.repo_idx = repo_idx;
	}
	public String getRepo_name() {
		return repo_name;
	}
	public void setRepo_name(String repo_name) {
		this.repo_name = repo_name;
	}
	public String getConf_static_idx() {
		return conf_static_idx;
	}
	public void setConf_static_idx(String conf_static_idx) {
		this.conf_static_idx = conf_static_idx;
	}
	public String getRepo_conf01_idx() {
		return repo_conf01_idx;
	}
	public void setRepo_conf01_idx(String repo_conf01_idx) {
		this.repo_conf01_idx = repo_conf01_idx;
	}
	public String getConf_01_nm() {
		return conf_01_nm;
	}
	public void setConf_01_nm(String conf_01_nm) {
		this.conf_01_nm = conf_01_nm;
	}
	public String getRepo_conf02_idx() {
		return repo_conf02_idx;
	}
	public void setRepo_conf02_idx(String repo_conf02_idx) {
		this.repo_conf02_idx = repo_conf02_idx;
	}
	public String getConf_02_nm() {
		return conf_02_nm;
	}
	public void setConf_02_nm(String conf_02_nm) {
		this.conf_02_nm = conf_02_nm;
	}
	public String getRepo_conf03_idx() {
		return repo_conf03_idx;
	}
	public void setRepo_conf03_idx(String repo_conf03_idx) {
		this.repo_conf03_idx = repo_conf03_idx;
	}
	public String getConf_03_nm() {
		return conf_03_nm;
	}
	public void setConf_03_nm(String conf_03_nm) {
		this.conf_03_nm = conf_03_nm;
	}
	public String getRepo_conf04_idx() {
		return repo_conf04_idx;
	}
	public void setRepo_conf04_idx(String repo_conf04_idx) {
		this.repo_conf04_idx = repo_conf04_idx;
	}
	public String getConf_04_nm() {
		return conf_04_nm;
	}
	public void setConf_04_nm(String conf_04_nm) {
		this.conf_04_nm = conf_04_nm;
	}
	public String getRepo_conf05_idx() {
		return repo_conf05_idx;
	}
	public void setRepo_conf05_idx(String repo_conf05_idx) {
		this.repo_conf05_idx = repo_conf05_idx;
	}
	public String getConf_05_nm() {
		return conf_05_nm;
	}
	public void setConf_05_nm(String conf_05_nm) {
		this.conf_05_nm = conf_05_nm;
	}
	public String getConf_name() {
		return conf_name;
	}
	public void setConf_name(String conf_name) {
		this.conf_name = conf_name;
	}
	public String getConf_body() {
		return conf_body;
	}
	public void setConf_body(String conf_body) {
		this.conf_body = conf_body;
	}
	public String getConf_desc() {
		return conf_desc;
	}
	public void setConf_desc(String conf_desc) {
		this.conf_desc = conf_desc;
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
		return "RepoAdminUserRepositoryConf [conf_idx=" + conf_idx + ", repo_idx=" + repo_idx + ", repo_name="
				+ repo_name + ", conf_static_idx=" + conf_static_idx + ", repo_conf01_idx=" + repo_conf01_idx
				+ ", conf_01_nm=" + conf_01_nm + ", repo_conf02_idx=" + repo_conf02_idx + ", conf_02_nm=" + conf_02_nm
				+ ", repo_conf03_idx=" + repo_conf03_idx + ", conf_03_nm=" + conf_03_nm + ", repo_conf04_idx="
				+ repo_conf04_idx + ", conf_04_nm=" + conf_04_nm + ", repo_conf05_idx=" + repo_conf05_idx
				+ ", conf_05_nm=" + conf_05_nm + ", conf_name=" + conf_name + ", conf_body=" + conf_body
				+ ", conf_desc=" + conf_desc + ", c_date=" + c_date + ", c_emp_no=" + c_emp_no + ", u_date=" + u_date
				+ ", u_emp_no=" + u_emp_no + "]";
	}
	public RepoAdminUserRepositoryConf(String conf_idx, int repo_idx, String repo_name, String conf_static_idx,
			String repo_conf01_idx, String conf_01_nm, String repo_conf02_idx, String conf_02_nm,
			String repo_conf03_idx, String conf_03_nm, String repo_conf04_idx, String conf_04_nm,
			String repo_conf05_idx, String conf_05_nm, String conf_name, String conf_body, String conf_desc,
			String c_date, String c_emp_no, String u_date, String u_emp_no) {
		super();
		this.conf_idx = conf_idx;
		this.repo_idx = repo_idx;
		this.repo_name = repo_name;
		this.conf_static_idx = conf_static_idx;
		this.repo_conf01_idx = repo_conf01_idx;
		this.conf_01_nm = conf_01_nm;
		this.repo_conf02_idx = repo_conf02_idx;
		this.conf_02_nm = conf_02_nm;
		this.repo_conf03_idx = repo_conf03_idx;
		this.conf_03_nm = conf_03_nm;
		this.repo_conf04_idx = repo_conf04_idx;
		this.conf_04_nm = conf_04_nm;
		this.repo_conf05_idx = repo_conf05_idx;
		this.conf_05_nm = conf_05_nm;
		this.conf_name = conf_name;
		this.conf_body = conf_body;
		this.conf_desc = conf_desc;
		this.c_date = c_date;
		this.c_emp_no = c_emp_no;
		this.u_date = u_date;
		this.u_emp_no = u_emp_no;
	}
	public RepoAdminUserRepositoryConf() {
		super();
	}
}
