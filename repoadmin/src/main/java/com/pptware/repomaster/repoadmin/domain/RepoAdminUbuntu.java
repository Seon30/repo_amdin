package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminUbuntu {

	
	String package_1row_desc;
	String package_list;
	String idx;
	String version_idx;
	String version;
	String version_name;
	String section_idx;
	String section_name;
	String section_desc;
	String packge_architecture;
	String package_priority;
	String package_installed_size;
	String package_depends;
	String package_suggests;
	String package_download_size;
	String package_desc;
	String package_recommends;
	String package_enhances;
	String create_on;
	String update_on;
	public String getPackage_1row_desc() {
		return package_1row_desc;
	}
	public void setPackage_1row_desc(String package_1row_desc) {
		this.package_1row_desc = package_1row_desc;
	}
	public String getPackage_list() {
		return package_list;
	}
	public void setPackage_list(String package_list) {
		this.package_list = package_list;
	}
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getVersion_idx() {
		return version_idx;
	}
	public void setVersion_idx(String version_idx) {
		this.version_idx = version_idx;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVersion_name() {
		return version_name;
	}
	public void setVersion_name(String version_name) {
		this.version_name = version_name;
	}
	public String getSection_idx() {
		return section_idx;
	}
	public void setSection_idx(String section_idx) {
		this.section_idx = section_idx;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}
	public String getSection_desc() {
		return section_desc;
	}
	public void setSection_desc(String section_desc) {
		this.section_desc = section_desc;
	}
	public String getPackge_architecture() {
		return packge_architecture;
	}
	public void setPackge_architecture(String packge_architecture) {
		this.packge_architecture = packge_architecture;
	}
	public String getPackage_priority() {
		return package_priority;
	}
	public void setPackage_priority(String package_priority) {
		this.package_priority = package_priority;
	}
	public String getPackage_installed_size() {
		return package_installed_size;
	}
	public void setPackage_installed_size(String package_installed_size) {
		this.package_installed_size = package_installed_size;
	}
	public String getPackage_depends() {
		return package_depends;
	}
	public void setPackage_depends(String package_depends) {
		this.package_depends = package_depends;
	}
	public String getPackage_suggests() {
		return package_suggests;
	}
	public void setPackage_suggests(String package_suggests) {
		this.package_suggests = package_suggests;
	}
	public String getPackage_download_size() {
		return package_download_size;
	}
	public void setPackage_download_size(String package_download_size) {
		this.package_download_size = package_download_size;
	}
	public String getPackage_desc() {
		return package_desc;
	}
	public void setPackage_desc(String package_desc) {
		this.package_desc = package_desc;
	}
	public String getPackage_recommends() {
		return package_recommends;
	}
	public void setPackage_recommends(String package_recommends) {
		this.package_recommends = package_recommends;
	}
	public String getPackage_enhances() {
		return package_enhances;
	}
	public void setPackage_enhances(String package_enhances) {
		this.package_enhances = package_enhances;
	}
	public String getCreate_on() {
		return create_on;
	}
	public void setCreate_on(String create_on) {
		this.create_on = create_on;
	}
	public String getUpdate_on() {
		return update_on;
	}
	public void setUpdate_on(String update_on) {
		this.update_on = update_on;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((create_on == null) ? 0 : create_on.hashCode());
		result = prime * result + ((idx == null) ? 0 : idx.hashCode());
		result = prime * result + ((package_1row_desc == null) ? 0 : package_1row_desc.hashCode());
		result = prime * result + ((package_depends == null) ? 0 : package_depends.hashCode());
		result = prime * result + ((package_desc == null) ? 0 : package_desc.hashCode());
		result = prime * result + ((package_download_size == null) ? 0 : package_download_size.hashCode());
		result = prime * result + ((package_enhances == null) ? 0 : package_enhances.hashCode());
		result = prime * result + ((package_installed_size == null) ? 0 : package_installed_size.hashCode());
		result = prime * result + ((package_list == null) ? 0 : package_list.hashCode());
		result = prime * result + ((package_priority == null) ? 0 : package_priority.hashCode());
		result = prime * result + ((package_recommends == null) ? 0 : package_recommends.hashCode());
		result = prime * result + ((package_suggests == null) ? 0 : package_suggests.hashCode());
		result = prime * result + ((packge_architecture == null) ? 0 : packge_architecture.hashCode());
		result = prime * result + ((section_desc == null) ? 0 : section_desc.hashCode());
		result = prime * result + ((section_idx == null) ? 0 : section_idx.hashCode());
		result = prime * result + ((section_name == null) ? 0 : section_name.hashCode());
		result = prime * result + ((update_on == null) ? 0 : update_on.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		result = prime * result + ((version_idx == null) ? 0 : version_idx.hashCode());
		result = prime * result + ((version_name == null) ? 0 : version_name.hashCode());
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
		RepoAdminUbuntu other = (RepoAdminUbuntu) obj;
		if (create_on == null) {
			if (other.create_on != null)
				return false;
		} else if (!create_on.equals(other.create_on))
			return false;
		if (idx == null) {
			if (other.idx != null)
				return false;
		} else if (!idx.equals(other.idx))
			return false;
		if (package_1row_desc == null) {
			if (other.package_1row_desc != null)
				return false;
		} else if (!package_1row_desc.equals(other.package_1row_desc))
			return false;
		if (package_depends == null) {
			if (other.package_depends != null)
				return false;
		} else if (!package_depends.equals(other.package_depends))
			return false;
		if (package_desc == null) {
			if (other.package_desc != null)
				return false;
		} else if (!package_desc.equals(other.package_desc))
			return false;
		if (package_download_size == null) {
			if (other.package_download_size != null)
				return false;
		} else if (!package_download_size.equals(other.package_download_size))
			return false;
		if (package_enhances == null) {
			if (other.package_enhances != null)
				return false;
		} else if (!package_enhances.equals(other.package_enhances))
			return false;
		if (package_installed_size == null) {
			if (other.package_installed_size != null)
				return false;
		} else if (!package_installed_size.equals(other.package_installed_size))
			return false;
		if (package_list == null) {
			if (other.package_list != null)
				return false;
		} else if (!package_list.equals(other.package_list))
			return false;
		if (package_priority == null) {
			if (other.package_priority != null)
				return false;
		} else if (!package_priority.equals(other.package_priority))
			return false;
		if (package_recommends == null) {
			if (other.package_recommends != null)
				return false;
		} else if (!package_recommends.equals(other.package_recommends))
			return false;
		if (package_suggests == null) {
			if (other.package_suggests != null)
				return false;
		} else if (!package_suggests.equals(other.package_suggests))
			return false;
		if (packge_architecture == null) {
			if (other.packge_architecture != null)
				return false;
		} else if (!packge_architecture.equals(other.packge_architecture))
			return false;
		if (section_desc == null) {
			if (other.section_desc != null)
				return false;
		} else if (!section_desc.equals(other.section_desc))
			return false;
		if (section_idx == null) {
			if (other.section_idx != null)
				return false;
		} else if (!section_idx.equals(other.section_idx))
			return false;
		if (section_name == null) {
			if (other.section_name != null)
				return false;
		} else if (!section_name.equals(other.section_name))
			return false;
		if (update_on == null) {
			if (other.update_on != null)
				return false;
		} else if (!update_on.equals(other.update_on))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		if (version_idx == null) {
			if (other.version_idx != null)
				return false;
		} else if (!version_idx.equals(other.version_idx))
			return false;
		if (version_name == null) {
			if (other.version_name != null)
				return false;
		} else if (!version_name.equals(other.version_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RepoAdminUbuntu [package_1row_desc=" + package_1row_desc + ", package_list=" + package_list + ", idx="
				+ idx + ", version_idx=" + version_idx + ", version=" + version + ", version_name=" + version_name
				+ ", section_idx=" + section_idx + ", section_name=" + section_name + ", section_desc=" + section_desc
				+ ", packge_architecture=" + packge_architecture + ", package_priority=" + package_priority
				+ ", package_installed_size=" + package_installed_size + ", package_depends=" + package_depends
				+ ", package_suggests=" + package_suggests + ", package_download_size=" + package_download_size
				+ ", package_desc=" + package_desc + ", package_recommends=" + package_recommends
				+ ", package_enhances=" + package_enhances + ", create_on=" + create_on + ", update_on=" + update_on
				+ "]";
	}
	public RepoAdminUbuntu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RepoAdminUbuntu(String package_1row_desc, String package_list, String idx, String version_idx,
			String version, String version_name, String section_idx, String section_name, String section_desc,
			String packge_architecture, String package_priority, String package_installed_size, String package_depends,
			String package_suggests, String package_download_size, String package_desc, String package_recommends,
			String package_enhances, String create_on, String update_on) {
		super();
		this.package_1row_desc = package_1row_desc;
		this.package_list = package_list;
		this.idx = idx;
		this.version_idx = version_idx;
		this.version = version;
		this.version_name = version_name;
		this.section_idx = section_idx;
		this.section_name = section_name;
		this.section_desc = section_desc;
		this.packge_architecture = packge_architecture;
		this.package_priority = package_priority;
		this.package_installed_size = package_installed_size;
		this.package_depends = package_depends;
		this.package_suggests = package_suggests;
		this.package_download_size = package_download_size;
		this.package_desc = package_desc;
		this.package_recommends = package_recommends;
		this.package_enhances = package_enhances;
		this.create_on = create_on;
		this.update_on = update_on;
	}

	



}