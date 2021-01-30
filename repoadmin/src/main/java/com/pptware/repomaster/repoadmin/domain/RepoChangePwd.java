package com.pptware.repomaster.repoadmin.domain;

public class RepoChangePwd {

	private String emp_no;
	private String emp_pw_old;
	private String emp_pw_new;
	private String emp_pw_new_valid;

	public String getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_pw_old() {
		return emp_pw_old;
	}

	public void setEmp_pw_old(String emp_pw_old) {
		this.emp_pw_old = emp_pw_old;
	}

	public String getEmp_pw_new() {
		return emp_pw_new;
	}

	public void setEmp_pw_new(String emp_pw_new) {
		this.emp_pw_new = emp_pw_new;
	}

	public String getEmp_pw_new_valid() {
		return emp_pw_new_valid;
	}

	public void setEmp_pw_new_valid(String emp_pw_new_valid) {
		this.emp_pw_new_valid = emp_pw_new_valid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emp_no == null) ? 0 : emp_no.hashCode());
		result = prime * result + ((emp_pw_new == null) ? 0 : emp_pw_new.hashCode());
		result = prime * result + ((emp_pw_old == null) ? 0 : emp_pw_old.hashCode());
		result = prime * result + ((emp_pw_new_valid == null) ? 0 : emp_pw_new_valid.hashCode());
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
		RepoChangePwd other = (RepoChangePwd) obj;
		if (emp_no == null) {
			if (other.emp_no != null)
				return false;
		} else if (!emp_no.equals(other.emp_no))
			return false;
		if (emp_pw_new == null) {
			if (other.emp_pw_new != null)
				return false;
		} else if (!emp_pw_new.equals(other.emp_pw_new))
			return false;
		if (emp_pw_old == null) {
			if (other.emp_pw_old != null)
				return false;
		} else if (!emp_pw_old.equals(other.emp_pw_old))
			return false;
		if (emp_pw_new_valid == null) {
			if (other.emp_pw_new_valid != null)
				return false;
		} else if (!emp_pw_new_valid.equals(other.emp_pw_new_valid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RepoChangePwd [emp_no=" + emp_no + ", emp_pw_old=" + emp_pw_old + ", emp_pw_new=" + emp_pw_new
				+ ", emp_pw_new_valid=" + emp_pw_new_valid + "]";
	}

	public RepoChangePwd(String emp_no, String emp_pw_old, String emp_pw_new, String emp_pw_new_valid) {
		super();
		this.emp_no = emp_no;
		this.emp_pw_old = emp_pw_old;
		this.emp_pw_new = emp_pw_new;
		this.emp_pw_new_valid = emp_pw_new_valid;
	}
	
	public RepoChangePwd() {
		super();
	}
	

}