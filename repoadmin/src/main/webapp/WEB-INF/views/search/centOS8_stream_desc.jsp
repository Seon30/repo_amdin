<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository"%>
<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>
<% 
	String pkgkey = (String)request.getAttribute("pkgkey");
	String table_type = (String)request.getAttribute("table_type");
	if(pkgkey== null){
		pkgkey = "";
	}
	if(table_type ==null){
		table_type = "";
	}
%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
  	<input id="pkgkey" value="<%=pkgkey%>" hidden="true">
	<input id="table_type" value="<%=table_type%>" hidden="true">
	
	<!-- Content Header (Page header) -->
	<div class="content-header">
    	<div class="container-fluid" style="display: inline-block; margin-left: 0px;">
        	<div class="row mb-2">
            	<div class="col-sm-6">
                	<h1>PPTware :<small>ReopoMaster</small></h1>
            	</div>
            	<div class="col-sm-6">
                	<ol class="breadcrumb float-sm-right">
                    	<li class="breadcrumb-item">
                        	<a href="/">Home</a>
                    	</li>
                    	<li class="breadcrumb-item active">CentOS 8</li>
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
					<div class="card card-primary" style="background-color:#FFFFFF;">
						<div class="card-header">
							<h3 class="card-title">Description</h3>
						</div>
						<div class="card-body">
							<ul class="products-list product-list-in-card pl-2 pr-2">
								<li class="item">
									<label style="color: #008BFF; font-size: 40px">Description</label>
									<div id="cent8desc1Grid"></div>
			                      	<div id="cent8descGrid"></div>
			                        <div id="cent8onlydescGrid"></div>
								</li>
			                </ul>
			            </div>
			            <div class="card-body">    
							<ul class="products-list product-list-in-card pl-2 pr-2">			                				                  							
			                	<li class="item">
									<label style="color: #008BFF; font-size: 40px">Requires</label>
									<div id="cent8requiresGrid"></div>
			                  	</li>	
			                </ul>
			            </div>			            
			            <div class="card-body"> 
							<ul class="products-list product-list-in-card pl-2 pr-2">
			                  	<li class="item">
									<label style="color: #008BFF; font-size: 40px">Provides</label>
									<div id="cent8providesGrid"></div>
			                  	</li>	
							</ul>
			            </div>
			            <div class="card-body"> 
							<ul class="products-list product-list-in-card pl-2 pr-2">
			                  	<li class="item">
									<label style="color: #008BFF; font-size: 40px">Conflicts</label>
									<div id="cent8conflictsGrid"></div>
			                  	</li>	
							</ul>			            
			            </div>			            			            
			            <div class="card-body"> 
							<ul class="products-list product-list-in-card pl-2 pr-2">
			                  	<li class="item">
									<label style="color: #008BFF; font-size: 40px">Obsoletes</label>
									<div id="cent8obsoletesGrid"></div>
			                  	</li>	
							</ul>				            
			            </div>			            			            
			            <div class="card-body"> 
							<ul class="products-list product-list-in-card pl-2 pr-2">
			                  	<li class="item">
									<label style="color: #008BFF; font-size: 40px">Files</label>
									<div id="cent8filepathGrid"></div>
			                  	</li>	
							</ul>			            
			            </div>			            			   
			            <div class="card-body"> 
							<ul class="products-list product-list-in-card pl-2 pr-2">
			                  	<li class="item">
									<label style="color: #008BFF; font-size: 40px">Changelog</label>
									<div id="cent8changelogGrid"></div>
			                 	</li>
							</ul>			            
			            </div>			               																									
                 	</div>
				</div>
			</div>
		</div>
	</section>
</div>
<%@include file="../include/footer.jsp"%>
<script src="/resources/js/centOS8_stream_desc.js"></script>
</body>
</html>
