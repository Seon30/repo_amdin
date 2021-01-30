<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
                    	<li class="breadcrumb-item active">리파지토리 업데이트</li>
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
							<h3 class="card-title">리파지토리 업데이트</h3>
						</div>
						<div class="card-body">
			                <table class="table table-bordered text-center">
			                	<tr>
				                    <th>Python</th>
				                    <th>CentOS 7</th>
				                    <th>CentOS 8</th>
			                    </tr>
			                  	<tr>
				                    <td>
				                      <button id="pythonSizeCountUpBtn" type="button" class="btn btn-block btn-warning">Size/Count Update</button>
				                    </td>
				                    <td>
				                      <button id="centos7SizeCountUpBtn" type="button" class="btn btn-block btn-warning">Size/Count Update</button>
				                    </td>
				                    <td>
				                      <button id="centos8SizeCountUpBtn" type="button" class="btn btn-block btn-warning">Size/Count Update</button>
				                    </td>				                    
			                  </tr>
			                </table>
						</div>
						<div class="modal fade" id="alertModal">
					        <div class="modal-dialog modal-sm">
					        	<div class="modal-content">
					            	<div class="modal-header">
					              		<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					                		<span aria-hidden="true">×</span>
					             	 	</button>
					            	</div>
						            <div class="modal-body">
						              	<p id="alertModalMsg">업데이트가 완료되었습니다</p>
						            </div>
						            <div class="modal-footer justify-content-between">
						              <button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
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
  
<%@include file="./include/footer.jsp"%>
<script src="/resources/plugins/jsgrid/demos/db.js"></script>
<script src="/resources/plugins/jsgrid/jsgrid.min.js"></script>
<script src="/resources/js/repoUpdate.js"></script>

