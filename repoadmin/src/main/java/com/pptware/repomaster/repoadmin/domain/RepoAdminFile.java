package com.pptware.repomaster.repoadmin.domain;

import java.nio.file.Path;

public class RepoAdminFile {

	private String file_idx;
	private String repo_idx;
	private String filename;
	private String file_name;
	private String file_full_name;
	private String file_path;
	private String hash_sha256;
	private String hash_md5;
	private String hash_blake2_256;
	private String file_size;
	private String c_date;
	private String c_emp_no;
	private String u_date;
	private String u_emp_no;
	
	private String is_exist;
	private String is_exclude;
	private String is_correct;
	private String name;
	private String org_path;
	private String real_path;
	private String hash_method;
	private String hash_value;
	private String is_infected;
	private String idx;
	
	private String exclude_idx;
	private String exclude_rsn;
	public String getFile_idx() {
		return file_idx;
	}
	public void setFile_idx(String file_idx) {
		this.file_idx = file_idx;
	}
	public String getRepo_idx() {
		return repo_idx;
	}
	public void setRepo_idx(String repo_idx) {
		this.repo_idx = repo_idx;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_full_name() {
		return file_full_name;
	}
	public void setFile_full_name(String file_full_name) {
		this.file_full_name = file_full_name;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public String getHash_sha256() {
		return hash_sha256;
	}
	public void setHash_sha256(String hash_sha256) {
		this.hash_sha256 = hash_sha256;
	}
	public String getHash_md5() {
		return hash_md5;
	}
	public void setHash_md5(String hash_md5) {
		this.hash_md5 = hash_md5;
	}
	public String getHash_blake2_256() {
		return hash_blake2_256;
	}
	public void setHash_blake2_256(String hash_blake2_256) {
		this.hash_blake2_256 = hash_blake2_256;
	}
	public String getFile_size() {
		return file_size;
	}
	public void setFile_size(String file_size) {
		this.file_size = file_size;
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
	public String getIs_exist() {
		return is_exist;
	}
	public void setIs_exist(String is_exist) {
		this.is_exist = is_exist;
	}
	public String getIs_exclude() {
		return is_exclude;
	}
	public void setIs_exclude(String is_exclude) {
		this.is_exclude = is_exclude;
	}
	public String getIs_correct() {
		return is_correct;
	}
	public void setIs_correct(String is_correct) {
		this.is_correct = is_correct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrg_path() {
		return org_path;
	}
	public void setOrg_path(String org_path) {
		this.org_path = org_path;
	}
	public String getReal_path() {
		return real_path;
	}
	public void setReal_path(String real_path) {
		this.real_path = real_path;
	}
	public String getHash_method() {
		return hash_method;
	}
	public void setHash_method(String hash_method) {
		this.hash_method = hash_method;
	}
	public String getHash_value() {
		return hash_value;
	}
	public void setHash_value(String hash_value) {
		this.hash_value = hash_value;
	}
	public String getIs_infected() {
		return is_infected;
	}
	public void setIs_infected(String is_infected) {
		this.is_infected = is_infected;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getExclude_idx() {
		return exclude_idx;
	}
	public void setExclude_idx(String exclude_idx) {
		this.exclude_idx = exclude_idx;
	}
	public String getExclude_rsn() {
		return exclude_rsn;
	}
	public void setExclude_rsn(String exclude_rsn) {
		this.exclude_rsn = exclude_rsn;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c_date == null) ? 0 : c_date.hashCode());
		result = prime * result + ((c_emp_no == null) ? 0 : c_emp_no.hashCode());
		result = prime * result + ((exclude_idx == null) ? 0 : exclude_idx.hashCode());
		result = prime * result + ((exclude_rsn == null) ? 0 : exclude_rsn.hashCode());
		result = prime * result + ((file_full_name == null) ? 0 : file_full_name.hashCode());
		result = prime * result + ((file_idx == null) ? 0 : file_idx.hashCode());
		result = prime * result + ((file_name == null) ? 0 : file_name.hashCode());
		result = prime * result + ((file_path == null) ? 0 : file_path.hashCode());
		result = prime * result + ((file_size == null) ? 0 : file_size.hashCode());
		result = prime * result + ((filename == null) ? 0 : filename.hashCode());
		result = prime * result + ((hash_blake2_256 == null) ? 0 : hash_blake2_256.hashCode());
		result = prime * result + ((hash_md5 == null) ? 0 : hash_md5.hashCode());
		result = prime * result + ((hash_method == null) ? 0 : hash_method.hashCode());
		result = prime * result + ((hash_sha256 == null) ? 0 : hash_sha256.hashCode());
		result = prime * result + ((hash_value == null) ? 0 : hash_value.hashCode());
		result = prime * result + ((idx == null) ? 0 : idx.hashCode());
		result = prime * result + ((is_correct == null) ? 0 : is_correct.hashCode());
		result = prime * result + ((is_exclude == null) ? 0 : is_exclude.hashCode());
		result = prime * result + ((is_exist == null) ? 0 : is_exist.hashCode());
		result = prime * result + ((is_infected == null) ? 0 : is_infected.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((org_path == null) ? 0 : org_path.hashCode());
		result = prime * result + ((real_path == null) ? 0 : real_path.hashCode());
		result = prime * result + ((repo_idx == null) ? 0 : repo_idx.hashCode());
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
		RepoAdminFile other = (RepoAdminFile) obj;
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
		if (exclude_idx == null) {
			if (other.exclude_idx != null)
				return false;
		} else if (!exclude_idx.equals(other.exclude_idx))
			return false;
		if (exclude_rsn == null) {
			if (other.exclude_rsn != null)
				return false;
		} else if (!exclude_rsn.equals(other.exclude_rsn))
			return false;
		if (file_full_name == null) {
			if (other.file_full_name != null)
				return false;
		} else if (!file_full_name.equals(other.file_full_name))
			return false;
		if (file_idx == null) {
			if (other.file_idx != null)
				return false;
		} else if (!file_idx.equals(other.file_idx))
			return false;
		if (file_name == null) {
			if (other.file_name != null)
				return false;
		} else if (!file_name.equals(other.file_name))
			return false;
		if (file_path == null) {
			if (other.file_path != null)
				return false;
		} else if (!file_path.equals(other.file_path))
			return false;
		if (file_size == null) {
			if (other.file_size != null)
				return false;
		} else if (!file_size.equals(other.file_size))
			return false;
		if (filename == null) {
			if (other.filename != null)
				return false;
		} else if (!filename.equals(other.filename))
			return false;
		if (hash_blake2_256 == null) {
			if (other.hash_blake2_256 != null)
				return false;
		} else if (!hash_blake2_256.equals(other.hash_blake2_256))
			return false;
		if (hash_md5 == null) {
			if (other.hash_md5 != null)
				return false;
		} else if (!hash_md5.equals(other.hash_md5))
			return false;
		if (hash_method == null) {
			if (other.hash_method != null)
				return false;
		} else if (!hash_method.equals(other.hash_method))
			return false;
		if (hash_sha256 == null) {
			if (other.hash_sha256 != null)
				return false;
		} else if (!hash_sha256.equals(other.hash_sha256))
			return false;
		if (hash_value == null) {
			if (other.hash_value != null)
				return false;
		} else if (!hash_value.equals(other.hash_value))
			return false;
		if (idx == null) {
			if (other.idx != null)
				return false;
		} else if (!idx.equals(other.idx))
			return false;
		if (is_correct == null) {
			if (other.is_correct != null)
				return false;
		} else if (!is_correct.equals(other.is_correct))
			return false;
		if (is_exclude == null) {
			if (other.is_exclude != null)
				return false;
		} else if (!is_exclude.equals(other.is_exclude))
			return false;
		if (is_exist == null) {
			if (other.is_exist != null)
				return false;
		} else if (!is_exist.equals(other.is_exist))
			return false;
		if (is_infected == null) {
			if (other.is_infected != null)
				return false;
		} else if (!is_infected.equals(other.is_infected))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (org_path == null) {
			if (other.org_path != null)
				return false;
		} else if (!org_path.equals(other.org_path))
			return false;
		if (real_path == null) {
			if (other.real_path != null)
				return false;
		} else if (!real_path.equals(other.real_path))
			return false;
		if (repo_idx == null) {
			if (other.repo_idx != null)
				return false;
		} else if (!repo_idx.equals(other.repo_idx))
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
		return "RepoAdminFile [file_idx=" + file_idx + ", repo_idx=" + repo_idx + ", filename=" + filename
				+ ", file_name=" + file_name + ", file_full_name=" + file_full_name + ", file_path=" + file_path
				+ ", hash_sha256=" + hash_sha256 + ", hash_md5=" + hash_md5 + ", hash_blake2_256=" + hash_blake2_256
				+ ", file_size=" + file_size + ", c_date=" + c_date + ", c_emp_no=" + c_emp_no + ", u_date=" + u_date
				+ ", u_emp_no=" + u_emp_no + ", is_exist=" + is_exist + ", is_exclude=" + is_exclude + ", is_correct="
				+ is_correct + ", name=" + name + ", org_path=" + org_path + ", real_path=" + real_path
				+ ", hash_method=" + hash_method + ", hash_value=" + hash_value + ", is_infected=" + is_infected
				+ ", idx=" + idx + ", exclude_idx=" + exclude_idx + ", exclude_rsn=" + exclude_rsn + "]";
	}
	public RepoAdminFile(String file_idx, String repo_idx, String filename, String file_name, String file_full_name,
			String file_path, String hash_sha256, String hash_md5, String hash_blake2_256, String file_size,
			String c_date, String c_emp_no, String u_date, String u_emp_no, String is_exist, String is_exclude,
			String is_correct, String name, String org_path, String real_path, String hash_method, String hash_value,
			String is_infected, String idx, String exclude_idx, String exclude_rsn) {
		super();
		this.file_idx = file_idx;
		this.repo_idx = repo_idx;
		this.filename = filename;
		this.file_name = file_name;
		this.file_full_name = file_full_name;
		this.file_path = file_path;
		this.hash_sha256 = hash_sha256;
		this.hash_md5 = hash_md5;
		this.hash_blake2_256 = hash_blake2_256;
		this.file_size = file_size;
		this.c_date = c_date;
		this.c_emp_no = c_emp_no;
		this.u_date = u_date;
		this.u_emp_no = u_emp_no;
		this.is_exist = is_exist;
		this.is_exclude = is_exclude;
		this.is_correct = is_correct;
		this.name = name;
		this.org_path = org_path;
		this.real_path = real_path;
		this.hash_method = hash_method;
		this.hash_value = hash_value;
		this.is_infected = is_infected;
		this.idx = idx;
		this.exclude_idx = exclude_idx;
		this.exclude_rsn = exclude_rsn;
	}
	public RepoAdminFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
