package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminPython {

	private String python_idx;
	private String python_ver_idx;
	private String file_version;
	private String file_real_name;
	private String operating_system;
	private String description;
	private String md5_sum;
	private long file_size;
	private String real_path;
	private String create_at;
	private String c_emp_no;
	private String update_at;
	private String python_ver_name;
	private String u_emp_no;
	public String getPython_idx() {
		return python_idx;
	}
	public void setPython_idx(String python_idx) {
		this.python_idx = python_idx;
	}
	public String getPython_ver_idx() {
		return python_ver_idx;
	}
	public void setPython_ver_idx(String python_ver_idx) {
		this.python_ver_idx = python_ver_idx;
	}
	public String getFile_version() {
		return file_version;
	}
	public void setFile_version(String file_version) {
		this.file_version = file_version;
	}
	public String getFile_real_name() {
		return file_real_name;
	}
	public void setFile_real_name(String file_real_name) {
		this.file_real_name = file_real_name;
	}
	public String getOperating_system() {
		return operating_system;
	}
	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMd5_sum() {
		return md5_sum;
	}
	public void setMd5_sum(String md5_sum) {
		this.md5_sum = md5_sum;
	}
	public long getFile_size() {
		return file_size;
	}
	public void setFile_size(long file_size) {
		this.file_size = file_size;
	}
	public String getReal_path() {
		return real_path;
	}
	public void setReal_path(String real_path) {
		this.real_path = real_path;
	}
	public String getCreate_at() {
		return create_at;
	}
	public void setCreate_at(String create_at) {
		this.create_at = create_at;
	}
	public String getC_emp_no() {
		return c_emp_no;
	}
	public void setC_emp_no(String c_emp_no) {
		this.c_emp_no = c_emp_no;
	}
	public String getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(String update_at) {
		this.update_at = update_at;
	}
	public String getPython_ver_name() {
		return python_ver_name;
	}
	public void setPython_ver_name(String python_ver_name) {
		this.python_ver_name = python_ver_name;
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
		result = prime * result + ((c_emp_no == null) ? 0 : c_emp_no.hashCode());
		result = prime * result + ((create_at == null) ? 0 : create_at.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((file_real_name == null) ? 0 : file_real_name.hashCode());
		result = prime * result + (int) (file_size ^ (file_size >>> 32));
		result = prime * result + ((file_version == null) ? 0 : file_version.hashCode());
		result = prime * result + ((md5_sum == null) ? 0 : md5_sum.hashCode());
		result = prime * result + ((operating_system == null) ? 0 : operating_system.hashCode());
		result = prime * result + ((python_idx == null) ? 0 : python_idx.hashCode());
		result = prime * result + ((python_ver_idx == null) ? 0 : python_ver_idx.hashCode());
		result = prime * result + ((python_ver_name == null) ? 0 : python_ver_name.hashCode());
		result = prime * result + ((real_path == null) ? 0 : real_path.hashCode());
		result = prime * result + ((u_emp_no == null) ? 0 : u_emp_no.hashCode());
		result = prime * result + ((update_at == null) ? 0 : update_at.hashCode());
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
		RepoAdminPython other = (RepoAdminPython) obj;
		if (c_emp_no == null) {
			if (other.c_emp_no != null)
				return false;
		} else if (!c_emp_no.equals(other.c_emp_no))
			return false;
		if (create_at == null) {
			if (other.create_at != null)
				return false;
		} else if (!create_at.equals(other.create_at))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (file_real_name == null) {
			if (other.file_real_name != null)
				return false;
		} else if (!file_real_name.equals(other.file_real_name))
			return false;
		if (file_size != other.file_size)
			return false;
		if (file_version == null) {
			if (other.file_version != null)
				return false;
		} else if (!file_version.equals(other.file_version))
			return false;
		if (md5_sum == null) {
			if (other.md5_sum != null)
				return false;
		} else if (!md5_sum.equals(other.md5_sum))
			return false;
		if (operating_system == null) {
			if (other.operating_system != null)
				return false;
		} else if (!operating_system.equals(other.operating_system))
			return false;
		if (python_idx == null) {
			if (other.python_idx != null)
				return false;
		} else if (!python_idx.equals(other.python_idx))
			return false;
		if (python_ver_idx == null) {
			if (other.python_ver_idx != null)
				return false;
		} else if (!python_ver_idx.equals(other.python_ver_idx))
			return false;
		if (python_ver_name == null) {
			if (other.python_ver_name != null)
				return false;
		} else if (!python_ver_name.equals(other.python_ver_name))
			return false;
		if (real_path == null) {
			if (other.real_path != null)
				return false;
		} else if (!real_path.equals(other.real_path))
			return false;
		if (u_emp_no == null) {
			if (other.u_emp_no != null)
				return false;
		} else if (!u_emp_no.equals(other.u_emp_no))
			return false;
		if (update_at == null) {
			if (other.update_at != null)
				return false;
		} else if (!update_at.equals(other.update_at))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RepoAdminPython [python_idx=" + python_idx + ", python_ver_idx=" + python_ver_idx + ", file_version="
				+ file_version + ", file_real_name=" + file_real_name + ", operating_system=" + operating_system
				+ ", description=" + description + ", md5_sum=" + md5_sum + ", file_size=" + file_size + ", real_path="
				+ real_path + ", create_at=" + create_at + ", c_emp_no=" + c_emp_no + ", update_at=" + update_at
				+ ", python_ver_name=" + python_ver_name + ", u_emp_no=" + u_emp_no + "]";
	}
	public RepoAdminPython(String python_idx, String python_ver_idx, String file_version, String file_real_name,
			String operating_system, String description, String md5_sum, long file_size, String real_path,
			String create_at, String c_emp_no, String update_at, String python_ver_name, String u_emp_no) {
		super();
		this.python_idx = python_idx;
		this.python_ver_idx = python_ver_idx;
		this.file_version = file_version;
		this.file_real_name = file_real_name;
		this.operating_system = operating_system;
		this.description = description;
		this.md5_sum = md5_sum;
		this.file_size = file_size;
		this.real_path = real_path;
		this.create_at = create_at;
		this.c_emp_no = c_emp_no;
		this.update_at = update_at;
		this.python_ver_name = python_ver_name;
		this.u_emp_no = u_emp_no;
	}
	public RepoAdminPython() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
