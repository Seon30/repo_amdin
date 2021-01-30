package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminDown {
	private int file_idx;
	private int repo_idx;
	private int down_idx;
	private String filename;
	private String down_ip;
	private String down_prog_id;
	private String c_date;
	private String c_emp_no;
	private String reponame;
	public int getFile_idx() {
		return file_idx;
	}
	public void setFile_idx(int file_idx) {
		this.file_idx = file_idx;
	}
	public int getRepo_idx() {
		return repo_idx;
	}
	public void setRepo_idx(int repo_idx) {
		this.repo_idx = repo_idx;
	}
	public int getDown_idx() {
		return down_idx;
	}
	public void setDown_idx(int down_idx) {
		this.down_idx = down_idx;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getDown_ip() {
		return down_ip;
	}
	public void setDown_ip(String down_ip) {
		this.down_ip = down_ip;
	}
	public String getDown_prog_id() {
		return down_prog_id;
	}
	public void setDown_prog_id(String down_prog_id) {
		this.down_prog_id = down_prog_id;
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
	public String getReponame() {
		return reponame;
	}
	public void setReponame(String reponame) {
		this.reponame = reponame;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c_date == null) ? 0 : c_date.hashCode());
		result = prime * result + ((c_emp_no == null) ? 0 : c_emp_no.hashCode());
		result = prime * result + down_idx;
		result = prime * result + ((down_ip == null) ? 0 : down_ip.hashCode());
		result = prime * result + ((down_prog_id == null) ? 0 : down_prog_id.hashCode());
		result = prime * result + file_idx;
		result = prime * result + ((filename == null) ? 0 : filename.hashCode());
		result = prime * result + repo_idx;
		result = prime * result + ((reponame == null) ? 0 : reponame.hashCode());
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
		RepoAdminDown other = (RepoAdminDown) obj;
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
		if (down_idx != other.down_idx)
			return false;
		if (down_ip == null) {
			if (other.down_ip != null)
				return false;
		} else if (!down_ip.equals(other.down_ip))
			return false;
		if (down_prog_id == null) {
			if (other.down_prog_id != null)
				return false;
		} else if (!down_prog_id.equals(other.down_prog_id))
			return false;
		if (file_idx != other.file_idx)
			return false;
		if (filename == null) {
			if (other.filename != null)
				return false;
		} else if (!filename.equals(other.filename))
			return false;
		if (repo_idx != other.repo_idx)
			return false;
		if (reponame == null) {
			if (other.reponame != null)
				return false;
		} else if (!reponame.equals(other.reponame))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RepoAdminDown [file_idx=" + file_idx + ", repo_idx=" + repo_idx + ", down_idx=" + down_idx
				+ ", filename=" + filename + ", down_ip=" + down_ip + ", down_prog_id=" + down_prog_id + ", c_date="
				+ c_date + ", c_emp_no=" + c_emp_no + ", reponame=" + reponame + "]";
	}
	public RepoAdminDown(int file_idx, int repo_idx, int down_idx, String filename, String down_ip, String down_prog_id,
			String c_date, String c_emp_no, String reponame) {
		super();
		this.file_idx = file_idx;
		this.repo_idx = repo_idx;
		this.down_idx = down_idx;
		this.filename = filename;
		this.down_ip = down_ip;
		this.down_prog_id = down_prog_id;
		this.c_date = c_date;
		this.c_emp_no = c_emp_no;
		this.reponame = reponame;
	}
	public RepoAdminDown() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}