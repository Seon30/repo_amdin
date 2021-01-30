<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="./include/header.jsp" %>


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
                    	<li class="breadcrumb-item active">업데이트 목록</li>
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
							<h3 class="card-title">업데이트 목록</h3>
						</div>
						<div class="card-body">
							<div id="jsGrid1"></div>
						</div>
					</div>	
				</div>
			</div>
    	</div>	
	</section>
</div>
<!-- /.content-wrapper -->
  
<%@include file="./include/footer.jsp"%>
<script src="/resources/plugins/jsgrid/demos/db.js"></script>
<script src="/resources/plugins/jsgrid/jsgrid.min.js"></script>
<script src="/resources/js/updateList.js"></script>
</body>
</html>