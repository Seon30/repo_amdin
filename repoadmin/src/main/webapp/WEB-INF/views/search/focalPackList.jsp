<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepository"%>
<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUserRepositoryConf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<div id = "Progress_Loading" style="text-align: center; margin: 0 auto; position: absolute; left: 50%; top:50%; background: #F4F4F4"  ><!-- 로딩바 -->
		<img src="/resources/dist/img/loading.gif"/>
	</div>
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
                    	<li class="breadcrumb-item active">Focal 20.04</li>
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
	                        <h3 class="card-title">Focal 20.04</h3>
	                    </div>
						<div class="card-body">
							<p>찾고자하는 파일 이름을 입력해주세요.</p>
							<div class="col-sm-10" style="float: none; margin: 0 auto;">
                                <div class="col-sm-10" style="float: none; margin: 0 auto;">
                                	<div class="input-group input-group-lg mb-3">
 										<div class="input-group-prepend">              
											<select type="button" id="searchVal" class="form-control custom-select-lg" hidden="true">
			                                	<option value="focal" selected="selected" selected="selected"  hidden="true" >focal</option>		 	
											</select>		
		                           		</div>
		                                <input id="search_view_text" name="searchfiles" placeholder="파일 이름을 입력해 주세요." class="form-control">
	                                    <span class="input-group-append">
	                                        <button id="searchFile" type="button" class="btn btn-warning btn-flat" onclick="fileSearch3()" >조회</button>
	                                    </span>			            
                                   	</div>
                                </div>
							<div id="jsGrid1"></div>
							<!-- 다운로드 모달  -->
							<div class="modal fade" id="modal-sm">
								<div id="rsn_dialog" class="modal-dialog modal-sm">
									<div class="modal-content">
										<div class="modal-header">
											<h4 class="modal-title">파일 다운로드</h4>
											<button type="button" class="close" data-dismiss="modal"
												aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
										</div>
										<div class="modal-body">
										<p>파일 다운로드를 진행 하시겠습니까?</p>
											<div class="form-group has-feedback">
												<input type="text" class="form-control" id="file_idx_modal"
													name="file_idx_modal" style="display: none;">
												<input type="text" class="form-control" id="file_idx" name="file_idx" style="display: none;"/>	
											</div>
										</div>
										<div class="modal-footer justify-content-between">
											<button id="rsn_dia_close" type="button"
												class="btn btn-default" data-dismiss="modal">닫기</button>
											<button id="down_send" type="button" class="btn btn-primary"
												data-dismiss="modal">다운</button>
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
    	</div>		
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-10" style="float: none; margin: 0 auto;">					
					<div class="card card-primary">	
						<div class="card-body">
							<div class="col-12">
								<div class="card">
									<div class="card-header d-flex p-0">
<!-- 										<h3 class="card-title p-3"><strong>Focal 20.04</strong></h3> -->
										<ul class="nav nav-pills ml-auto p-1" hidden="true">
											<li class="nav-item" id="focal"><a class="nav-link active" href="#OS" data-toggle="tab">Focal 20.04</a></li>
					                	</ul>
									</div>
							        <div class="card-body">
										<div class="tab-content">
			                				<div id="focalSum"></div>
						           			<form id="packageSum_form" method="post" action="goFocalPackDescPage" hidden="true">
							                 	<input id="idx" name="idx"/>
							                 	<input id="table_type" name="table_type"/>
						               		</form>
							            </div>
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
<script src="/resources/js/focalPackList.js"></script>
<script src="/resources/plugins/filterizr/jquery.filterizr.min.js"></script>
<script src="/resources/plugins/ekko-lightbox/ekko-lightbox.min.js"></script>
<script src="/resources/plugins/jquery-ui/jquery-ui.min.js"></script>
<script src="/resources/dist/js/demo.js"></script>
</body>
</html>