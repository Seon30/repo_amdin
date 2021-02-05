package com.pptware.repomaster.repoadmin.domain;

public class RepoAdminUbuntu {
	private String idx = null;
	private String Package = null;
	private String package_name;
	private String ubuntuVersion; 
	private String ubuntuVersionName; 
	private String packageFrom; 
	private String architecture = null;
	private String version = null; 
	private String priority; 
	private String section = null; 
	private String origin; 
	private String maintainer;
	private String originalMaintainer;
	private String bugs;
	private String installedSize;
	private String depends;
	private String suggests;
	private String filename = null;
	private String size;
	private String downloadSize;
	private String mD5sum;
	private String sHA1;
	private String sHA256;
	private String homepage;
	private String description;
	private String task;
	private String descriptionmd5;
	private String multiArch;
	private String recommends;
	private String conflicts;
	private String preDepends;
	private String buildEssential;
	private String breaks;
	private String replaces;
	private String builtUsing;
	private String provides;
	private String source;
	private String enhances;
	private String createAt;
	private String updateAt;
	private String descriptionEn;
	private String descriptionKo;
	private String select_name;


	private String essential;
	private String buildIds;
	private String tag;
	private String cnfExtraCommands;
	private String important;
	private String xulAppid;
	private String eulAppid;
	private String gstreamerElements;
	private String gstreamerVersion;
	private String gstreamerDecoders;
	private String gstreamerEncoders;
	private String gstreamerUriSinks;
	private String gstreamerUriSources;
	private String modaliases;
	private String ubuntuOemKernelFlavour;
	private String postgresqlCatversion;
	private String cnfIgnoreCommands;
	private String pythonVersion;
	private String cnfVisiblePkgname;
	private String rubyVersions;
	private String cnfCommands;
	private String component;
	private String xCargoBuiltUsing;
	private String goImportPath;
	private String ghcPackage;
	private String luaVersions;
	private String pythonEggName;
	private String python3Version;
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getUbuntuVersion() {
		return ubuntuVersion;
	}
	public void setUbuntuVersion(String ubuntuVersion) {
		this.ubuntuVersion = ubuntuVersion;
	}
	public String getUbuntuVersionName() {
		return ubuntuVersionName;
	}
	public void setUbuntuVersionName(String ubuntuVersionName) {
		this.ubuntuVersionName = ubuntuVersionName;
	}
	public String getPackageFrom() {
		return packageFrom;
	}
	public void setPackageFrom(String packageFrom) {
		this.packageFrom = packageFrom;
	}
	public String getPackage() {
		return Package;
	}
	public void setPackage(String package1) {
		Package = package1;
	}
	public String getArchitecture() {
		return architecture;
	}
	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getMaintainer() {
		return maintainer;
	}
	public void setMaintainer(String maintainer) {
		this.maintainer = maintainer;
	}
	public String getOriginalMaintainer() {
		return originalMaintainer;
	}
	public void setOriginalMaintainer(String originalMaintainer) {
		this.originalMaintainer = originalMaintainer;
	}
	public String getBugs() {
		return bugs;
	}
	public void setBugs(String bugs) {
		this.bugs = bugs;
	}
	public String getInstalledSize() {
		return installedSize;
	}
	public void setInstalledSize(String installedSize) {
		this.installedSize = installedSize;
	}
	public String getDepends() {
		return depends;
	}
	public void setDepends(String depends) {
		this.depends = depends;
	}
	public String getSuggests() {
		return suggests;
	}
	public void setSuggests(String suggests) {
		this.suggests = suggests;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDownloadSize() {
		return downloadSize;
	}
	public void setDownloadSize(String downloadSize) {
		this.downloadSize = downloadSize;
	}
	public String getmD5sum() {
		return mD5sum;
	}
	public void setmD5sum(String mD5sum) {
		this.mD5sum = mD5sum;
	}
	public String getsHA1() {
		return sHA1;
	}
	public void setsHA1(String sHA1) {
		this.sHA1 = sHA1;
	}
	public String getsHA256() {
		return sHA256;
	}
	public void setsHA256(String sHA256) {
		this.sHA256 = sHA256;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getDescriptionmd5() {
		return descriptionmd5;
	}
	public void setDescriptionmd5(String descriptionmd5) {
		this.descriptionmd5 = descriptionmd5;
	}
	public String getMultiArch() {
		return multiArch;
	}
	public void setMultiArch(String multiArch) {
		this.multiArch = multiArch;
	}
	public String getRecommends() {
		return recommends;
	}
	public void setRecommends(String recommends) {
		this.recommends = recommends;
	}
	public String getConflicts() {
		return conflicts;
	}
	public void setConflicts(String conflicts) {
		this.conflicts = conflicts;
	}
	public String getPreDepends() {
		return preDepends;
	}
	public void setPreDepends(String preDepends) {
		this.preDepends = preDepends;
	}
	public String getBuildEssential() {
		return buildEssential;
	}
	public void setBuildEssential(String buildEssential) {
		this.buildEssential = buildEssential;
	}
	public String getBreaks() {
		return breaks;
	}
	public void setBreaks(String breaks) {
		this.breaks = breaks;
	}
	public String getReplaces() {
		return replaces;
	}
	public void setReplaces(String replaces) {
		this.replaces = replaces;
	}
	public String getBuiltUsing() {
		return builtUsing;
	}
	public void setBuiltUsing(String builtUsing) {
		this.builtUsing = builtUsing;
	}
	public String getProvides() {
		return provides;
	}
	public void setProvides(String provides) {
		this.provides = provides;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getEnhances() {
		return enhances;
	}
	public void setEnhances(String enhances) {
		this.enhances = enhances;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public String getDescriptionEn() {
		return descriptionEn;
	}
	public void setDescriptionEn(String descriptionEn) {
		this.descriptionEn = descriptionEn;
	}
	public String getDescriptionKo() {
		return descriptionKo;
	}
	public void setDescriptionKo(String descriptionKo) {
		this.descriptionKo = descriptionKo;
	}
	public String getSelect_name() {
		return select_name;
	}
	public void setSelect_name(String select_name) {
		this.select_name = select_name;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public String getEssential() {
		return essential;
	}
	public void setEssential(String essential) {
		this.essential = essential;
	}
	public String getBuildIds() {
		return buildIds;
	}
	public void setBuildIds(String buildIds) {
		this.buildIds = buildIds;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getCnfExtraCommands() {
		return cnfExtraCommands;
	}
	public void setCnfExtraCommands(String cnfExtraCommands) {
		this.cnfExtraCommands = cnfExtraCommands;
	}
	public String getImportant() {
		return important;
	}
	public void setImportant(String important) {
		this.important = important;
	}
	public String getXulAppid() {
		return xulAppid;
	}
	public void setXulAppid(String xulAppid) {
		this.xulAppid = xulAppid;
	}
	public String getEulAppid() {
		return eulAppid;
	}
	public void setEulAppid(String eulAppid) {
		this.eulAppid = eulAppid;
	}
	public String getGstreamerElements() {
		return gstreamerElements;
	}
	public void setGstreamerElements(String gstreamerElements) {
		this.gstreamerElements = gstreamerElements;
	}
	public String getGstreamerVersion() {
		return gstreamerVersion;
	}
	public void setGstreamerVersion(String gstreamerVersion) {
		this.gstreamerVersion = gstreamerVersion;
	}
	public String getGstreamerDecoders() {
		return gstreamerDecoders;
	}
	public void setGstreamerDecoders(String gstreamerDecoders) {
		this.gstreamerDecoders = gstreamerDecoders;
	}
	public String getGstreamerEncoders() {
		return gstreamerEncoders;
	}
	public void setGstreamerEncoders(String gstreamerEncoders) {
		this.gstreamerEncoders = gstreamerEncoders;
	}
	public String getGstreamerUriSinks() {
		return gstreamerUriSinks;
	}
	public void setGstreamerUriSinks(String gstreamerUriSinks) {
		this.gstreamerUriSinks = gstreamerUriSinks;
	}
	public String getGstreamerUriSources() {
		return gstreamerUriSources;
	}
	public void setGstreamerUriSources(String gstreamerUriSources) {
		this.gstreamerUriSources = gstreamerUriSources;
	}
	public String getModaliases() {
		return modaliases;
	}
	public void setModaliases(String modaliases) {
		this.modaliases = modaliases;
	}
	public String getUbuntuOemKernelFlavour() {
		return ubuntuOemKernelFlavour;
	}
	public void setUbuntuOemKernelFlavour(String ubuntuOemKernelFlavour) {
		this.ubuntuOemKernelFlavour = ubuntuOemKernelFlavour;
	}
	public String getPostgresqlCatversion() {
		return postgresqlCatversion;
	}
	public void setPostgresqlCatversion(String postgresqlCatversion) {
		this.postgresqlCatversion = postgresqlCatversion;
	}
	public String getCnfIgnoreCommands() {
		return cnfIgnoreCommands;
	}
	public void setCnfIgnoreCommands(String cnfIgnoreCommands) {
		this.cnfIgnoreCommands = cnfIgnoreCommands;
	}
	public String getPythonVersion() {
		return pythonVersion;
	}
	public void setPythonVersion(String pythonVersion) {
		this.pythonVersion = pythonVersion;
	}
	public String getCnfVisiblePkgname() {
		return cnfVisiblePkgname;
	}
	public void setCnfVisiblePkgname(String cnfVisiblePkgname) {
		this.cnfVisiblePkgname = cnfVisiblePkgname;
	}
	public String getRubyVersions() {
		return rubyVersions;
	}
	public void setRubyVersions(String rubyVersions) {
		this.rubyVersions = rubyVersions;
	}
	public String getCnfCommands() {
		return cnfCommands;
	}
	public void setCnfCommands(String cnfCommands) {
		this.cnfCommands = cnfCommands;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getxCargoBuiltUsing() {
		return xCargoBuiltUsing;
	}
	public void setxCargoBuiltUsing(String xCargoBuiltUsing) {
		this.xCargoBuiltUsing = xCargoBuiltUsing;
	}
	public String getGoImportPath() {
		return goImportPath;
	}
	public void setGoImportPath(String goImportPath) {
		this.goImportPath = goImportPath;
	}
	public String getGhcPackage() {
		return ghcPackage;
	}
	public void setGhcPackage(String ghcPackage) {
		this.ghcPackage = ghcPackage;
	}
	public String getLuaVersions() {
		return luaVersions;
	}
	public void setLuaVersions(String luaVersions) {
		this.luaVersions = luaVersions;
	}
	public String getPythonEggName() {
		return pythonEggName;
	}
	public void setPythonEggName(String pythonEggName) {
		this.pythonEggName = pythonEggName;
	}
	public String getPython3Version() {
		return python3Version;
	}
	public void setPython3Version(String python3Version) {
		this.python3Version = python3Version;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Package == null) ? 0 : Package.hashCode());
		result = prime * result + ((architecture == null) ? 0 : architecture.hashCode());
		result = prime * result + ((breaks == null) ? 0 : breaks.hashCode());
		result = prime * result + ((bugs == null) ? 0 : bugs.hashCode());
		result = prime * result + ((buildEssential == null) ? 0 : buildEssential.hashCode());
		result = prime * result + ((buildIds == null) ? 0 : buildIds.hashCode());
		result = prime * result + ((builtUsing == null) ? 0 : builtUsing.hashCode());
		result = prime * result + ((cnfCommands == null) ? 0 : cnfCommands.hashCode());
		result = prime * result + ((cnfExtraCommands == null) ? 0 : cnfExtraCommands.hashCode());
		result = prime * result + ((cnfIgnoreCommands == null) ? 0 : cnfIgnoreCommands.hashCode());
		result = prime * result + ((cnfVisiblePkgname == null) ? 0 : cnfVisiblePkgname.hashCode());
		result = prime * result + ((component == null) ? 0 : component.hashCode());
		result = prime * result + ((conflicts == null) ? 0 : conflicts.hashCode());
		result = prime * result + ((createAt == null) ? 0 : createAt.hashCode());
		result = prime * result + ((depends == null) ? 0 : depends.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((descriptionEn == null) ? 0 : descriptionEn.hashCode());
		result = prime * result + ((descriptionKo == null) ? 0 : descriptionKo.hashCode());
		result = prime * result + ((descriptionmd5 == null) ? 0 : descriptionmd5.hashCode());
		result = prime * result + ((downloadSize == null) ? 0 : downloadSize.hashCode());
		result = prime * result + ((enhances == null) ? 0 : enhances.hashCode());
		result = prime * result + ((essential == null) ? 0 : essential.hashCode());
		result = prime * result + ((eulAppid == null) ? 0 : eulAppid.hashCode());
		result = prime * result + ((filename == null) ? 0 : filename.hashCode());
		result = prime * result + ((ghcPackage == null) ? 0 : ghcPackage.hashCode());
		result = prime * result + ((goImportPath == null) ? 0 : goImportPath.hashCode());
		result = prime * result + ((gstreamerDecoders == null) ? 0 : gstreamerDecoders.hashCode());
		result = prime * result + ((gstreamerElements == null) ? 0 : gstreamerElements.hashCode());
		result = prime * result + ((gstreamerEncoders == null) ? 0 : gstreamerEncoders.hashCode());
		result = prime * result + ((gstreamerUriSinks == null) ? 0 : gstreamerUriSinks.hashCode());
		result = prime * result + ((gstreamerUriSources == null) ? 0 : gstreamerUriSources.hashCode());
		result = prime * result + ((gstreamerVersion == null) ? 0 : gstreamerVersion.hashCode());
		result = prime * result + ((homepage == null) ? 0 : homepage.hashCode());
		result = prime * result + ((idx == null) ? 0 : idx.hashCode());
		result = prime * result + ((important == null) ? 0 : important.hashCode());
		result = prime * result + ((installedSize == null) ? 0 : installedSize.hashCode());
		result = prime * result + ((luaVersions == null) ? 0 : luaVersions.hashCode());
		result = prime * result + ((mD5sum == null) ? 0 : mD5sum.hashCode());
		result = prime * result + ((maintainer == null) ? 0 : maintainer.hashCode());
		result = prime * result + ((modaliases == null) ? 0 : modaliases.hashCode());
		result = prime * result + ((multiArch == null) ? 0 : multiArch.hashCode());
		result = prime * result + ((origin == null) ? 0 : origin.hashCode());
		result = prime * result + ((originalMaintainer == null) ? 0 : originalMaintainer.hashCode());
		result = prime * result + ((packageFrom == null) ? 0 : packageFrom.hashCode());
		result = prime * result + ((package_name == null) ? 0 : package_name.hashCode());
		result = prime * result + ((postgresqlCatversion == null) ? 0 : postgresqlCatversion.hashCode());
		result = prime * result + ((preDepends == null) ? 0 : preDepends.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((provides == null) ? 0 : provides.hashCode());
		result = prime * result + ((python3Version == null) ? 0 : python3Version.hashCode());
		result = prime * result + ((pythonEggName == null) ? 0 : pythonEggName.hashCode());
		result = prime * result + ((pythonVersion == null) ? 0 : pythonVersion.hashCode());
		result = prime * result + ((recommends == null) ? 0 : recommends.hashCode());
		result = prime * result + ((replaces == null) ? 0 : replaces.hashCode());
		result = prime * result + ((rubyVersions == null) ? 0 : rubyVersions.hashCode());
		result = prime * result + ((sHA1 == null) ? 0 : sHA1.hashCode());
		result = prime * result + ((sHA256 == null) ? 0 : sHA256.hashCode());
		result = prime * result + ((section == null) ? 0 : section.hashCode());
		result = prime * result + ((select_name == null) ? 0 : select_name.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((suggests == null) ? 0 : suggests.hashCode());
		result = prime * result + ((tag == null) ? 0 : tag.hashCode());
		result = prime * result + ((task == null) ? 0 : task.hashCode());
		result = prime * result + ((ubuntuOemKernelFlavour == null) ? 0 : ubuntuOemKernelFlavour.hashCode());
		result = prime * result + ((ubuntuVersion == null) ? 0 : ubuntuVersion.hashCode());
		result = prime * result + ((ubuntuVersionName == null) ? 0 : ubuntuVersionName.hashCode());
		result = prime * result + ((updateAt == null) ? 0 : updateAt.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		result = prime * result + ((xCargoBuiltUsing == null) ? 0 : xCargoBuiltUsing.hashCode());
		result = prime * result + ((xulAppid == null) ? 0 : xulAppid.hashCode());
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
		if (Package == null) {
			if (other.Package != null)
				return false;
		} else if (!Package.equals(other.Package))
			return false;
		if (architecture == null) {
			if (other.architecture != null)
				return false;
		} else if (!architecture.equals(other.architecture))
			return false;
		if (breaks == null) {
			if (other.breaks != null)
				return false;
		} else if (!breaks.equals(other.breaks))
			return false;
		if (bugs == null) {
			if (other.bugs != null)
				return false;
		} else if (!bugs.equals(other.bugs))
			return false;
		if (buildEssential == null) {
			if (other.buildEssential != null)
				return false;
		} else if (!buildEssential.equals(other.buildEssential))
			return false;
		if (buildIds == null) {
			if (other.buildIds != null)
				return false;
		} else if (!buildIds.equals(other.buildIds))
			return false;
		if (builtUsing == null) {
			if (other.builtUsing != null)
				return false;
		} else if (!builtUsing.equals(other.builtUsing))
			return false;
		if (cnfCommands == null) {
			if (other.cnfCommands != null)
				return false;
		} else if (!cnfCommands.equals(other.cnfCommands))
			return false;
		if (cnfExtraCommands == null) {
			if (other.cnfExtraCommands != null)
				return false;
		} else if (!cnfExtraCommands.equals(other.cnfExtraCommands))
			return false;
		if (cnfIgnoreCommands == null) {
			if (other.cnfIgnoreCommands != null)
				return false;
		} else if (!cnfIgnoreCommands.equals(other.cnfIgnoreCommands))
			return false;
		if (cnfVisiblePkgname == null) {
			if (other.cnfVisiblePkgname != null)
				return false;
		} else if (!cnfVisiblePkgname.equals(other.cnfVisiblePkgname))
			return false;
		if (component == null) {
			if (other.component != null)
				return false;
		} else if (!component.equals(other.component))
			return false;
		if (conflicts == null) {
			if (other.conflicts != null)
				return false;
		} else if (!conflicts.equals(other.conflicts))
			return false;
		if (createAt == null) {
			if (other.createAt != null)
				return false;
		} else if (!createAt.equals(other.createAt))
			return false;
		if (depends == null) {
			if (other.depends != null)
				return false;
		} else if (!depends.equals(other.depends))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (descriptionEn == null) {
			if (other.descriptionEn != null)
				return false;
		} else if (!descriptionEn.equals(other.descriptionEn))
			return false;
		if (descriptionKo == null) {
			if (other.descriptionKo != null)
				return false;
		} else if (!descriptionKo.equals(other.descriptionKo))
			return false;
		if (descriptionmd5 == null) {
			if (other.descriptionmd5 != null)
				return false;
		} else if (!descriptionmd5.equals(other.descriptionmd5))
			return false;
		if (downloadSize == null) {
			if (other.downloadSize != null)
				return false;
		} else if (!downloadSize.equals(other.downloadSize))
			return false;
		if (enhances == null) {
			if (other.enhances != null)
				return false;
		} else if (!enhances.equals(other.enhances))
			return false;
		if (essential == null) {
			if (other.essential != null)
				return false;
		} else if (!essential.equals(other.essential))
			return false;
		if (eulAppid == null) {
			if (other.eulAppid != null)
				return false;
		} else if (!eulAppid.equals(other.eulAppid))
			return false;
		if (filename == null) {
			if (other.filename != null)
				return false;
		} else if (!filename.equals(other.filename))
			return false;
		if (ghcPackage == null) {
			if (other.ghcPackage != null)
				return false;
		} else if (!ghcPackage.equals(other.ghcPackage))
			return false;
		if (goImportPath == null) {
			if (other.goImportPath != null)
				return false;
		} else if (!goImportPath.equals(other.goImportPath))
			return false;
		if (gstreamerDecoders == null) {
			if (other.gstreamerDecoders != null)
				return false;
		} else if (!gstreamerDecoders.equals(other.gstreamerDecoders))
			return false;
		if (gstreamerElements == null) {
			if (other.gstreamerElements != null)
				return false;
		} else if (!gstreamerElements.equals(other.gstreamerElements))
			return false;
		if (gstreamerEncoders == null) {
			if (other.gstreamerEncoders != null)
				return false;
		} else if (!gstreamerEncoders.equals(other.gstreamerEncoders))
			return false;
		if (gstreamerUriSinks == null) {
			if (other.gstreamerUriSinks != null)
				return false;
		} else if (!gstreamerUriSinks.equals(other.gstreamerUriSinks))
			return false;
		if (gstreamerUriSources == null) {
			if (other.gstreamerUriSources != null)
				return false;
		} else if (!gstreamerUriSources.equals(other.gstreamerUriSources))
			return false;
		if (gstreamerVersion == null) {
			if (other.gstreamerVersion != null)
				return false;
		} else if (!gstreamerVersion.equals(other.gstreamerVersion))
			return false;
		if (homepage == null) {
			if (other.homepage != null)
				return false;
		} else if (!homepage.equals(other.homepage))
			return false;
		if (idx == null) {
			if (other.idx != null)
				return false;
		} else if (!idx.equals(other.idx))
			return false;
		if (important == null) {
			if (other.important != null)
				return false;
		} else if (!important.equals(other.important))
			return false;
		if (installedSize == null) {
			if (other.installedSize != null)
				return false;
		} else if (!installedSize.equals(other.installedSize))
			return false;
		if (luaVersions == null) {
			if (other.luaVersions != null)
				return false;
		} else if (!luaVersions.equals(other.luaVersions))
			return false;
		if (mD5sum == null) {
			if (other.mD5sum != null)
				return false;
		} else if (!mD5sum.equals(other.mD5sum))
			return false;
		if (maintainer == null) {
			if (other.maintainer != null)
				return false;
		} else if (!maintainer.equals(other.maintainer))
			return false;
		if (modaliases == null) {
			if (other.modaliases != null)
				return false;
		} else if (!modaliases.equals(other.modaliases))
			return false;
		if (multiArch == null) {
			if (other.multiArch != null)
				return false;
		} else if (!multiArch.equals(other.multiArch))
			return false;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (originalMaintainer == null) {
			if (other.originalMaintainer != null)
				return false;
		} else if (!originalMaintainer.equals(other.originalMaintainer))
			return false;
		if (packageFrom == null) {
			if (other.packageFrom != null)
				return false;
		} else if (!packageFrom.equals(other.packageFrom))
			return false;
		if (package_name == null) {
			if (other.package_name != null)
				return false;
		} else if (!package_name.equals(other.package_name))
			return false;
		if (postgresqlCatversion == null) {
			if (other.postgresqlCatversion != null)
				return false;
		} else if (!postgresqlCatversion.equals(other.postgresqlCatversion))
			return false;
		if (preDepends == null) {
			if (other.preDepends != null)
				return false;
		} else if (!preDepends.equals(other.preDepends))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (provides == null) {
			if (other.provides != null)
				return false;
		} else if (!provides.equals(other.provides))
			return false;
		if (python3Version == null) {
			if (other.python3Version != null)
				return false;
		} else if (!python3Version.equals(other.python3Version))
			return false;
		if (pythonEggName == null) {
			if (other.pythonEggName != null)
				return false;
		} else if (!pythonEggName.equals(other.pythonEggName))
			return false;
		if (pythonVersion == null) {
			if (other.pythonVersion != null)
				return false;
		} else if (!pythonVersion.equals(other.pythonVersion))
			return false;
		if (recommends == null) {
			if (other.recommends != null)
				return false;
		} else if (!recommends.equals(other.recommends))
			return false;
		if (replaces == null) {
			if (other.replaces != null)
				return false;
		} else if (!replaces.equals(other.replaces))
			return false;
		if (rubyVersions == null) {
			if (other.rubyVersions != null)
				return false;
		} else if (!rubyVersions.equals(other.rubyVersions))
			return false;
		if (sHA1 == null) {
			if (other.sHA1 != null)
				return false;
		} else if (!sHA1.equals(other.sHA1))
			return false;
		if (sHA256 == null) {
			if (other.sHA256 != null)
				return false;
		} else if (!sHA256.equals(other.sHA256))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (select_name == null) {
			if (other.select_name != null)
				return false;
		} else if (!select_name.equals(other.select_name))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (suggests == null) {
			if (other.suggests != null)
				return false;
		} else if (!suggests.equals(other.suggests))
			return false;
		if (tag == null) {
			if (other.tag != null)
				return false;
		} else if (!tag.equals(other.tag))
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		if (ubuntuOemKernelFlavour == null) {
			if (other.ubuntuOemKernelFlavour != null)
				return false;
		} else if (!ubuntuOemKernelFlavour.equals(other.ubuntuOemKernelFlavour))
			return false;
		if (ubuntuVersion == null) {
			if (other.ubuntuVersion != null)
				return false;
		} else if (!ubuntuVersion.equals(other.ubuntuVersion))
			return false;
		if (ubuntuVersionName == null) {
			if (other.ubuntuVersionName != null)
				return false;
		} else if (!ubuntuVersionName.equals(other.ubuntuVersionName))
			return false;
		if (updateAt == null) {
			if (other.updateAt != null)
				return false;
		} else if (!updateAt.equals(other.updateAt))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		if (xCargoBuiltUsing == null) {
			if (other.xCargoBuiltUsing != null)
				return false;
		} else if (!xCargoBuiltUsing.equals(other.xCargoBuiltUsing))
			return false;
		if (xulAppid == null) {
			if (other.xulAppid != null)
				return false;
		} else if (!xulAppid.equals(other.xulAppid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "RepoAdminUbuntu [idx=" + idx + ", ubuntuVersion=" + ubuntuVersion + ", ubuntuVersionName="
				+ ubuntuVersionName + ", packageFrom=" + packageFrom + ", Package=" + Package + ", architecture="
				+ architecture + ", version=" + version + ", priority=" + priority + ", section=" + section
				+ ", origin=" + origin + ", maintainer=" + maintainer + ", originalMaintainer=" + originalMaintainer
				+ ", bugs=" + bugs + ", installedSize=" + installedSize + ", depends=" + depends + ", suggests="
				+ suggests + ", filename=" + filename + ", size=" + size + ", downloadSize=" + downloadSize
				+ ", mD5sum=" + mD5sum + ", sHA1=" + sHA1 + ", sHA256=" + sHA256 + ", homepage=" + homepage
				+ ", description=" + description + ", task=" + task + ", descriptionmd5=" + descriptionmd5
				+ ", multiArch=" + multiArch + ", recommends=" + recommends + ", conflicts=" + conflicts
				+ ", preDepends=" + preDepends + ", buildEssential=" + buildEssential + ", breaks=" + breaks
				+ ", replaces=" + replaces + ", builtUsing=" + builtUsing + ", provides=" + provides + ", source="
				+ source + ", enhances=" + enhances + ", createAt=" + createAt + ", updateAt=" + updateAt
				+ ", descriptionEn=" + descriptionEn + ", descriptionKo=" + descriptionKo + ", select_name="
				+ select_name + ", package_name=" + package_name + ", essential=" + essential + ", buildIds=" + buildIds
				+ ", tag=" + tag + ", cnfExtraCommands=" + cnfExtraCommands + ", important=" + important + ", xulAppid="
				+ xulAppid + ", eulAppid=" + eulAppid + ", gstreamerElements=" + gstreamerElements
				+ ", gstreamerVersion=" + gstreamerVersion + ", gstreamerDecoders=" + gstreamerDecoders
				+ ", gstreamerEncoders=" + gstreamerEncoders + ", gstreamerUriSinks=" + gstreamerUriSinks
				+ ", gstreamerUriSources=" + gstreamerUriSources + ", modaliases=" + modaliases
				+ ", ubuntuOemKernelFlavour=" + ubuntuOemKernelFlavour + ", postgresqlCatversion="
				+ postgresqlCatversion + ", cnfIgnoreCommands=" + cnfIgnoreCommands + ", pythonVersion=" + pythonVersion
				+ ", cnfVisiblePkgname=" + cnfVisiblePkgname + ", rubyVersions=" + rubyVersions + ", cnfCommands="
				+ cnfCommands + ", component=" + component + ", xCargoBuiltUsing=" + xCargoBuiltUsing
				+ ", goImportPath=" + goImportPath + ", ghcPackage=" + ghcPackage + ", luaVersions=" + luaVersions
				+ ", pythonEggName=" + pythonEggName + ", python3Version=" + python3Version + "]";
	}
	public RepoAdminUbuntu(String idx, String ubuntuVersion, String ubuntuVersionName, String packageFrom,
			String package1, String architecture, String version, String priority, String section, String origin,
			String maintainer, String originalMaintainer, String bugs, String installedSize, String depends,
			String suggests, String filename, String size, String downloadSize, String mD5sum, String sHA1,
			String sHA256, String homepage, String description, String task, String descriptionmd5, String multiArch,
			String recommends, String conflicts, String preDepends, String buildEssential, String breaks,
			String replaces, String builtUsing, String provides, String source, String enhances, String createAt,
			String updateAt, String descriptionEn, String descriptionKo, String select_name, String package_name,
			String essential, String buildIds, String tag, String cnfExtraCommands, String important, String xulAppid,
			String eulAppid, String gstreamerElements, String gstreamerVersion, String gstreamerDecoders,
			String gstreamerEncoders, String gstreamerUriSinks, String gstreamerUriSources, String modaliases,
			String ubuntuOemKernelFlavour, String postgresqlCatversion, String cnfIgnoreCommands, String pythonVersion,
			String cnfVisiblePkgname, String rubyVersions, String cnfCommands, String component,
			String xCargoBuiltUsing, String goImportPath, String ghcPackage, String luaVersions, String pythonEggName,
			String python3Version) {
		super();
		this.idx = idx;
		this.ubuntuVersion = ubuntuVersion;
		this.ubuntuVersionName = ubuntuVersionName;
		this.packageFrom = packageFrom;
		Package = package1;
		this.architecture = architecture;
		this.version = version;
		this.priority = priority;
		this.section = section;
		this.origin = origin;
		this.maintainer = maintainer;
		this.originalMaintainer = originalMaintainer;
		this.bugs = bugs;
		this.installedSize = installedSize;
		this.depends = depends;
		this.suggests = suggests;
		this.filename = filename;
		this.size = size;
		this.downloadSize = downloadSize;
		this.mD5sum = mD5sum;
		this.sHA1 = sHA1;
		this.sHA256 = sHA256;
		this.homepage = homepage;
		this.description = description;
		this.task = task;
		this.descriptionmd5 = descriptionmd5;
		this.multiArch = multiArch;
		this.recommends = recommends;
		this.conflicts = conflicts;
		this.preDepends = preDepends;
		this.buildEssential = buildEssential;
		this.breaks = breaks;
		this.replaces = replaces;
		this.builtUsing = builtUsing;
		this.provides = provides;
		this.source = source;
		this.enhances = enhances;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.descriptionEn = descriptionEn;
		this.descriptionKo = descriptionKo;
		this.select_name = select_name;
		this.package_name = package_name;
		this.essential = essential;
		this.buildIds = buildIds;
		this.tag = tag;
		this.cnfExtraCommands = cnfExtraCommands;
		this.important = important;
		this.xulAppid = xulAppid;
		this.eulAppid = eulAppid;
		this.gstreamerElements = gstreamerElements;
		this.gstreamerVersion = gstreamerVersion;
		this.gstreamerDecoders = gstreamerDecoders;
		this.gstreamerEncoders = gstreamerEncoders;
		this.gstreamerUriSinks = gstreamerUriSinks;
		this.gstreamerUriSources = gstreamerUriSources;
		this.modaliases = modaliases;
		this.ubuntuOemKernelFlavour = ubuntuOemKernelFlavour;
		this.postgresqlCatversion = postgresqlCatversion;
		this.cnfIgnoreCommands = cnfIgnoreCommands;
		this.pythonVersion = pythonVersion;
		this.cnfVisiblePkgname = cnfVisiblePkgname;
		this.rubyVersions = rubyVersions;
		this.cnfCommands = cnfCommands;
		this.component = component;
		this.xCargoBuiltUsing = xCargoBuiltUsing;
		this.goImportPath = goImportPath;
		this.ghcPackage = ghcPackage;
		this.luaVersions = luaVersions;
		this.pythonEggName = pythonEggName;
		this.python3Version = python3Version;
	}
	public RepoAdminUbuntu() {
		super();
		// TODO Auto-generated constructor stub
	}


}



