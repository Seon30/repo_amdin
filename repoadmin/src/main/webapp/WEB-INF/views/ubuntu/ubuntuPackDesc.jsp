<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository"%>
<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>
<% 
	String version = (String)request.getAttribute("version"); 
	String version_name = (String)request.getAttribute("version_name"); 
	String idx = (String)request.getAttribute("idx");

	if(version== null){
		version = "";
	}
	if(version_name== null){
		version_name = "";
	}
	if(idx == null){
		idx = "";
	}
%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">

	<div class="content-header">
    	<div class="container-fluid" style="display: inline-block; margin-left: 0px;">
        	<div class="row mb-2">
            	<div class="col-sm-6">
                	<h1>PPTware :<small>ReopoMaster</small></h1>
                	  	<input id="version" value="<%=version%>">
                	  	<input id="idx" value="<%=idx%>">
            	</div>
            	<div class="col-sm-6">
                	<ol class="breadcrumb float-sm-right">
                    	<li class="breadcrumb-item">
                        	<a href="/">Home</a>
                    	</li>
                    	<li class="breadcrumb-item active">CentOS 7</li>
                	</ol>
            	</div>
        	</div>
    	</div>
	</div>

  	<!-- Main content -->
	<section class="content">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-10" style="float: none; margin: 0 auto;">					
					<div class="card card-primary">
						<div class="card-header">
							<h3 class="card-title">Ubuntu<strong></strong></h3>
						</div>
						<div class="card-body">
							<div class="col-12">
								<div class="card-body	">
	                				<div id="showPackDesc"></div>
				           			<form id="section_form" method="post" action="goPackList" hidden="true">
					                 	<input id="idx" name="idx"/>
					                 	<input id="version_idx" name="version_idx"/>
				               		</form>
							    </div>
							</div>
						</div>							
					</div>
				</div>
			</div>
    	</div>		
	</section>
</div>
</div>
<%@include file="../include/footer.jsp"%>
<script src="/resources/js/ubuntuPackDesc.js"></script>
</body>
</html>
