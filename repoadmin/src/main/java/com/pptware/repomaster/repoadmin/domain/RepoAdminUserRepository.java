package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminUserRepository {
	//리파지토리
	private int user_repo_idx;
	private String user_repo_name;
	private String user_repo_path;
	private int user_repo_file_cnt;
	private long user_repo_file_size;
	
	//파일
	private int user_file_idx;
	private String user_pack_name;
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
	public String getUser_repo_name() {
		return user_repo_name;
	}
	public void setUser_repo_name(String user_repo_name) {
		this.user_repo_name = user_repo_name;
	}
	public String getUser_repo_path() {
		return user_repo_path;
	}
	public void setUser_repo_path(String user_repo_path) {
		this.user_repo_path = user_repo_path;
	}
	public int getUser_repo_file_cnt() {
		return user_repo_file_cnt;
	}
	public void setUser_repo_file_cnt(int user_repo_file_cnt) {
		this.user_repo_file_cnt = user_repo_file_cnt;
	}
	public long getUser_repo_file_size() {
		return user_repo_file_size;
	}
	public void setUser_repo_file_size(long user_repo_file_size) {
		this.user_repo_file_size = user_repo_file_size;
	}
	public int getUser_file_idx() {
		return user_file_idx;
	}
	public void setUser_file_idx(int user_file_idx) {
		this.user_file_idx = user_file_idx;
	}
	public String getUser_pack_name() {
		return user_pack_name;
	}
	public void setUser_pack_name(String user_pack_name) {
		this.user_pack_name = user_pack_name;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c_emp_no == null) ? 0 : c_emp_no.hashCode());
		result = prime * result + ((exclude_rsn == null) ? 0 : exclude_rsn.hashCode());
		result = prime * result + ((file_full_name == null) ? 0 : file_full_name.hashCode());
		result = prime * result + ((file_name == null) ? 0 : file_name.hashCode());
		result = prime * result + (int) (file_size ^ (file_size >>> 32));
		result = prime * result + ((is_exclude == null) ? 0 : is_exclude.hashCode());
		result = prime * result + ((u_emp_no == null) ? 0 : u_emp_no.hashCode());
		result = prime * result + user_file_idx;
		result = prime * result + ((user_pack_name == null) ? 0 : user_pack_name.hashCode());
		result = prime * result + user_repo_file_cnt;
		result = prime * result + (int) (user_repo_file_size ^ (user_repo_file_size >>> 32));
		result = prime * result + user_repo_idx;
		result = prime * result + ((user_repo_name == null) ? 0 : user_repo_name.hashCode());
		result = prime * result + ((user_repo_path == null) ? 0 : user_repo_path.hashCode());
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
		RepoAdminUserRepository other = (RepoAdminUserRepository) obj;
		if (c_emp_no == null) {
			if (other.c_emp_no != null)
				return false;
		} else if (!c_emp_no.equals(other.c_emp_no))
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
		if (file_name == null) {
			if (other.file_name != null)
				return false;
		} else if (!file_name.equals(other.file_name))
			return false;
		if (file_size != other.file_size)
			return false;
		if (is_exclude == null) {
			if (other.is_exclude != null)
				return false;
		} else if (!is_exclude.equals(other.is_exclude))
			return false;
		if (u_emp_no == null) {
			if (other.u_emp_no != null)
				return false;
		} else if (!u_emp_no.equals(other.u_emp_no))
			return false;
		if (user_file_idx != other.user_file_idx)
			return false;
		if (user_pack_name == null) {
			if (other.user_pack_name != null)
				return false;
		} else if (!user_pack_name.equals(other.user_pack_name))
			return false;
		if (user_repo_file_cnt != other.user_repo_file_cnt)
			return false;
		if (user_repo_file_size != other.user_repo_file_size)
			return false;
		if (user_repo_idx != other.user_repo_idx)
			return false;
		if (user_repo_name == null) {
			if (other.user_repo_name != null)
				return false;
		} else if (!user_repo_name.equals(other.user_repo_name))
			return false;
		if (user_repo_path == null) {
			if (other.user_repo_path != null)
				return false;
		} else if (!user_repo_path.equals(other.user_repo_path))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RepoAdminUserRepository [user_repo_idx=" + user_repo_idx + ", user_repo_name=" + user_repo_name
				+ ", user_repo_path=" + user_repo_path + ", user_repo_file_cnt=" + user_repo_file_cnt
				+ ", user_repo_file_size=" + user_repo_file_size + ", user_file_idx=" + user_file_idx
				+ ", user_pack_name=" + user_pack_name + ", file_full_name=" + file_full_name + ", file_name="
				+ file_name + ", is_exclude=" + is_exclude + ", file_size=" + file_size + ", c_emp_no=" + c_emp_no
				+ ", u_emp_no=" + u_emp_no + ", exclude_rsn=" + exclude_rsn + "]";
	}
	public RepoAdminUserRepository(int user_repo_idx, String user_repo_name, String user_repo_path,
			int user_repo_file_cnt, long user_repo_file_size, int user_file_idx, String user_pack_name,
			String file_full_name, String file_name, String is_exclude, long file_size, String c_emp_no,
			String u_emp_no, String exclude_rsn) {
		super();
		this.user_repo_idx = user_repo_idx;
		this.user_repo_name = user_repo_name;
		this.user_repo_path = user_repo_path;
		this.user_repo_file_cnt = user_repo_file_cnt;
		this.user_repo_file_size = user_repo_file_size;
		this.user_file_idx = user_file_idx;
		this.user_pack_name = user_pack_name;
		this.file_full_name = file_full_name;
		this.file_name = file_name;
		this.is_exclude = is_exclude;
		this.file_size = file_size;
		this.c_emp_no = c_emp_no;
		this.u_emp_no = u_emp_no;
		this.exclude_rsn = exclude_rsn;
	}
	public RepoAdminUserRepository() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
