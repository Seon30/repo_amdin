package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminUser {

	private String emp_no;
	private String emp_pw;
	private String emp_pw_re;
	private String emp_nm;
	private String emp_profile;
	private String emp_email;
	private String emp_lvl;
	private String pw_req_yn;
	private String c_date;
	private String c_emp_no;
	private String u_date;
	private String u_emp_no;

	public RepoAdminUser() {
		super();
	}

	public String getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_pw() {
		return emp_pw;
	}

	public void setEmp_pw(String emp_pw) {
		this.emp_pw = emp_pw;
	}

	public String getEmp_pw_re() {
		return emp_pw_re;
	}

	public void setEmp_pw_re(String emp_pw_re) {
		this.emp_pw_re = emp_pw_re;
	}

	public String getEmp_nm() {
		return emp_nm;
	}

	public void setEmp_nm(String emp_nm) {
		this.emp_nm = emp_nm;
	}

	public String getEmp_profile() {
		return emp_profile;
	}

	public void setEmp_profile(String emp_profile) {
		this.emp_profile = emp_profile;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_lvl() {
		return emp_lvl;
	}

	public void setEmp_lvl(String emp_lvl) {
		this.emp_lvl = emp_lvl;
	}

	public String getPw_req_yn() {
		return pw_req_yn;
	}

	public void setPw_req_yn(String pw_req_yn) {
		this.pw_req_yn = pw_req_yn;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c_date == null) ? 0 : c_date.hashCode());
		result = prime * result + ((c_emp_no == null) ? 0 : c_emp_no.hashCode());
		result = prime * result + ((emp_email == null) ? 0 : emp_email.hashCode());
		result = prime * result + ((emp_lvl == null) ? 0 : emp_lvl.hashCode());
		result = prime * result + ((emp_nm == null) ? 0 : emp_nm.hashCode());
		result = prime * result + ((emp_no == null) ? 0 : emp_no.hashCode());
		result = prime * result + ((emp_profile == null) ? 0 : emp_profile.hashCode());
		result = prime * result + ((emp_pw == null) ? 0 : emp_pw.hashCode());
		result = prime * result + ((emp_pw_re == null) ? 0 : emp_pw_re.hashCode());
		result = prime * result + ((pw_req_yn == null) ? 0 : pw_req_yn.hashCode());
		result = prime * result + ((u_date == null) ? 0 : u_date.hashCode());
		result = prime * result + ((u_emp_no == null) ? 0 : u_emp_no.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RepoAdminUser other = (RepoAdminUser) obj;
		if (c_date == null) {
			if (other.c_date != null)
				return false;
		} else if (!c_date.equals(other.c_date))
			return false;
		if (c_emp_no == null) {
			if (other.c_emp_no != null)
				return false;
		} else if (!c_emp_no.equals(other.c_emp_no))
			return false;
		if (emp_email == null) {
			if (other.emp_email != null)
				return false;
		} else if (!emp_email.equals(other.emp_email))
			return false;
		if (emp_lvl == null) {
			if (other.emp_lvl != null)
				return false;
		} else if (!emp_lvl.equals(other.emp_lvl))
			return false;
		if (emp_nm == null) {
			if (other.emp_nm != null)
				return false;
		} else if (!emp_nm.equals(other.emp_nm))
			return false;
		if (emp_no == null) {
			if (other.emp_no != null)
				return false;
		} else if (!emp_no.equals(other.emp_no))
			return false;
		if (emp_profile == null) {
			if (other.emp_profile != null)
				return false;
		} else if (!emp_profile.equals(other.emp_profile))
			return false;
		if (emp_pw == null) {
			if (other.emp_pw != null)
				return false;
		} else if (!emp_pw.equals(other.emp_pw))
			return false;
		if (emp_pw_re == null) {
			if (other.emp_pw_re != null)
				return false;
		} else if (!emp_pw_re.equals(other.emp_pw_re))
			return false;
		if (pw_req_yn == null) {
			if (other.pw_req_yn != null)
				return false;
		} else if (!pw_req_yn.equals(other.pw_req_yn))
			return false;
		if (u_date == null) {
			if (other.u_date != null)
				return false;
		} else if (!u_date.equals(other.u_date))
			return false;
		if (u_emp_no == null) {
			if (other.u_emp_no != null)
				return false;
		} else if (!u_emp_no.equals(other.u_emp_no))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RepoAdminUser [emp_no=" + emp_no + ", emp_pw=" + emp_pw + ", emp_pw_re=" + emp_pw_re + ", emp_nm="
				+ emp_nm + ", emp_profile=" + emp_profile + ", emp_email=" + emp_email + ", emp_lvl=" + emp_lvl
				+ ", pw_req_yn=" + pw_req_yn + ", c_date=" + c_date + ", c_emp_no=" + c_emp_no + ", u_date=" + u_date
				+ ", u_emp_no=" + u_emp_no + "]";
	}

	public RepoAdminUser(String emp_no, String emp_pw, String emp_pw_re, String emp_nm, String emp_profile,
			String emp_email, String emp_lvl, String pw_req_yn, String c_date, String c_emp_no, String u_date,
			String u_emp_no) {
		super();
		this.emp_no = emp_no;
		this.emp_pw = emp_pw;
		this.emp_pw_re = emp_pw_re;
		this.emp_nm = emp_nm;
		this.emp_profile = emp_profile;
		this.emp_email = emp_email;
		this.emp_lvl = emp_lvl;
		this.pw_req_yn = pw_req_yn;
		this.c_date = c_date;
		this.c_emp_no = c_emp_no;
		this.u_date = u_date;
		this.u_emp_no = u_emp_no;
	}


}
