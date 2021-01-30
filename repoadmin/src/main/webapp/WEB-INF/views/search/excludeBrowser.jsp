<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>

<%
	String repo_name = (String) request.getAttribute("repo_name");
	String repo_idx = (String) request.getAttribute("repo_idx");
	String c_date = (String) request.getAttribute("c_date");
	String search_header_text = (String) request.getAttribute("search_header_text");
	String file_idx = (String) request.getAttribute("file_idx");
	if (repo_idx == null) {
		repo_idx = "";
	}
	if (file_idx == null) {
		file_idx = "";
	}
	if (c_date == null) {
		c_date = "";
	}
	if (search_header_text == null) {
		search_header_text = "";
	}
%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<div id = "Progress_Loading" style="text-align: center; margin: 0 auto; position: absolute; left: 50%; top:50%; background: #F4F4F4"  ><!-- 로딩바 -->
		<img src="/resources/dist/img/loading.gif"/>
	</div>
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
                    	<li class="breadcrumb-item active">제외 등록</li>
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
							<h3 class="card-title">CentOS 7</h3>
						</div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <p>제외 등록을 하고자 하는 파일 이름을 입력해주세요.</p>
                                <div class="col-sm-10" style="float: none; margin: 0 auto;">
                                	<div class="input-group input-group-lg mb-3">
 										<div class="input-group-prepend">              
											<select type="button" id="searchVal" class="form-control custom-select-lg">
			                                	<option value="1" selected="selected" >Python</option>
			                               	 	<option value="2">CentOS 7</option>	 	
											</select>	
		                           		</div>
		                                <input id="search_view_text" name="searchfiles" placeholder="파일 이름을 입력해 주세요." class="form-control">
	                                    <span class="input-group-append">
	                                        <button id="searchFile" type="button" class="btn btn-warning btn-flat" onclick="fileSearch()" >조회</button>
	                                    </span>		                                
                                   	</div>
                                </div>
                            <div id="jsGrid1"></div>

                            <div class="modal fade" id="modal-sm">
								<div id="rsn_dialog" class="modal-dialog modal-sm">
                                	<div class="modal-content">
                                    	<div class="modal-header">
                                            <h4 class="modal-title">파일제외 등록</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body">
                                        	<div class="form-group has-feedback">
                                                <p>파일 제외 등록 사유를 입력해주세요.</p>
                                            </div>
                                            <div class="form-group has-feedback">
                                                <input type="text" class="form-control" id="rsn" name="rsn"/>
                                                <input type="text" class="form-control" id="file_idx_modal" name="file_idx_modal" style="display: none;">
                                            </div>
                                        </div>
                                        <div class="modal-footer justify-content-between">
                                            <button id="rsn_dia_close"  type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
                                            <button  id="rsn_send"  type="button" class="btn btn-primary" data-dismiss="modal">등록</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
							<!-- 공백 모달 -->
							<div class="modal fade" id="alertModal">
								<div class="modal-dialog modal-sm">
									<div class="modal-content">
										<div class="modal-header">
											<!--<h4 class="modal-title">경고</h4> -->
											<button type="button" class="close" data-dismiss="modal" aria-label="Close">
												<span aria-hidden="true"></span>
											</button>
										</div>
										<div class="modal-body">
											<p id="alertModalMsg"></p>
										</div>
										<div class="modal-footer justify-content-between">
											<button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
										</div>
									</div>
								</div>
							</div>	
							<div class="card-body" style="float: right;">
							    <input type="hidden" value="${ErrorMessage }" id="errMsg">
							    <button id="modalOpenButton" type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal-sm" style="display: none;">제외 등록</button>
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
<script src="/resources/js/excludeBrowser.js"></script>
</body>
</html>