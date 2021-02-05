<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository"%>
<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
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
                    	<li class="breadcrumb-item active">Ubuntu</li>
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
							<h3 class="card-title">Ubuntu<strong>    Version</strong></h3>
						</div>
						<div class="card-body">
							<div class="col-12">
								<div class="card-body">
                  					<div class="table-responsive">
                    					<table class="table">
                     	 					<tr>
	                   							<th style="width:50%">
	                    							<a href="focalPackList" class="nav-link">
	                    							focal
	                    							</a>
	                   							</th>
	                   							<td>
	                    							<a href="focalPackList" class="nav-link">
	                    							20.04 LTS
	                    							</a>                        							
	                   							</td>
                      						</tr>
                     	 					<tr>
	                   							<th style="width:50%">
	                    							<a href="" class="nav-link">
	                    							groovy
	                    							</a>
	                   							</th>
	                   							<td>
	                    							<a href="" class="nav-link">
	                    							20.10
	                    							</a>                        							
	                   							</td>
                      						</tr>
                     	 					<tr>
	                   							<th style="width:50%">
	                    							<a href="" class="nav-link">
	                    							hirsute
	                    							</a>
	                   							</th>
	                   							<td>
	                    							<a href="" class="nav-link">
	                    							20.04 LTS
	                    							</a>                        							
	                   							</td>
                      						</tr>
						                </table>
						             </div>
							    </div>
							</div>
						</div>							
					</div>
				</div>
			</div>
    	</div>		
	</section>
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>


<script src="/resources/js/ubuntuVersion.js"></script>
<script src="/resources/plugins/filterizr/jquery.filterizr.min.js"></script>
<script src="/resources/plugins/ekko-lightbox/ekko-lightbox.min.js"></script>
<script src="/resources/plugins/jquery-ui/jquery-ui.min.js"></script>
<script src="/resources/dist/js/demo.js"></script>
</body>
</html>