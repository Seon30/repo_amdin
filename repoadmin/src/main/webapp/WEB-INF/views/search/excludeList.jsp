<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>

<% 
	String repo_name = (String)request.getAttribute("repo_name"); 
	String repo_idx = (String)request.getAttribute("repo_idx"); 
	String c_date = (String)request.getAttribute("c_date");
	String search_header_text = (String)request.getAttribute("search_header_text");
	String file_idx = (String)request.getAttribute("file_idx");
	if(repo_idx== null){
		repo_idx = "";
	}
	if(file_idx== null){
		file_idx = "";
	}
	if(c_date== null){
		c_date = "";
	}
	if(search_header_text == null){
		search_header_text = "";
	}
%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<input id="search_header_text" value="<%=search_header_text%>" hidden="true">
	<input id="repo_idx" value="<%=repo_idx%>" hidden="true">
    <input id="c_date" value="<%=c_date%>" hidden="true">
    
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
                    	<li class="breadcrumb-item active">제외 목록</li>
                	</ol>
            	</div>
        	</div>
    	</div>
	</div>
	
	<div class="modal fade" id="modal-sm">
		<div id="rsn_dialog" class="modal-dialog modal-sm">
			<div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">파일 제외 삭제 </h4>
                    	<button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        	<span aria-hidden="true">&times;</span>
                    	</button>
                </div>
                <div class="modal-body">
                    <div class="form-group has-feedback">
                        <p>해당 파일을 제외 등록에서 삭제 처리 하시겠습니까?</p>
                    </div>
                    <div class="form-group has-feedback">
                        <!-- <input type="text" class="form-control" id="rsn" name="rsn"/> -->
                        <input type="text" class="form-control" id="file_idx_modal" name="file_idx_modal" style="display: none;">
                    </div>
                </div>
                <div class="modal-footer justify-content-between">
                	<button id="rsn_dia_close" type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
					<button id="rsn_send" type="button" class="btn btn-primary" data-dismiss="modal">삭제</button>
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
							<h3 class="card-title">제외 목록</h3>
						</div>
						<div class="card-body">
                       		<div id="jsGrid1"></div>
							<input type="hidden" value="${ErrorMessage }" id="errMsg">
                       		<button id="modalOpenButton" type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal-sm" style="display: none;">
                                	제외등록 삭제
                       		</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>

<%@include file="../include/footer.jsp"%>
<script src="/resources/js/excludeList.js"></script>
</body>
</html>