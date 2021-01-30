<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1>
						PPTware :<small>ReopoMaster</small>
					</h1>
				</div>
				<!-- /.col -->
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">사용자 리파지토리 관리</li>
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
							<h3 class="card-title">사용자 리파지토리 관리</h3>
						</div>
						
						
						
						
						<!-- 리파지토리 -->
						<div class="card-body">
							<div class="tab-content">
								<div id="actions" class="row">
									<div class="col-12">
										<div class="card card-orange card-outline">
											<div class="card-header d-flex p-0">
												<h3 class="card-title p-3"><i class="fas fa-archive"><strong> Repository</strong></h3></i>
												<ul class="nav nav-pills ml-auto p-2">
													<div class="btn-group w-80">
														<button type="button" class="btn btn-warning float-right" id="addRepo" data-toggle='modal' data-target='#repo_modal' style='cursor:pointer;color: white;'>
															<i class="fas fa-plus"></i> 추가
														</button>
													</div>
												</ul>	
											</div>
											<div class="card-body">
												<div class="tab-content">											
													<div id="repoGrid"></div>
												</div>	
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						
						<!-- 패키지 -->
						<div class="card-body">
							<div class="tab-content">
								<div id="actions" class="row">
									<div class="col-12">
										<div class="card card-orange card-outline ">
											<div class="card-header d-flex p-0">
												<h3 class="card-title p-3"><i class="fas fa-folder"><strong> Package</strong></h3></i>
												<ul class="nav nav-pills ml-auto p-2">
													<div class="btn-group w-80">
														<button type="button" class="btn btn-warning float-right" id="addPack" data-toggle='modal' data-target='#file_modal' style='cursor:pointer;color: white;'>
															<i class="fas fa-plus"></i> 추가
														</button>
													</div>
												</ul>	
											</div>
											<div class="card-body">
												<div id	="packGrid"></div>										
												<div class="tab-content">
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						
						<!-- 파일 -->
						<div class="card-body">
							<div class="tab-content">
								<div id="actions" class="row">								
									<div class="col-12">
										<div class="card card-orange card-outline">
											<div class="card-header d-flex p-0">
												<h3 class="card-title p-3"><i class="fas fa-file"><strong> File</strong></h3></i>
												<ul class="nav nav-pills ml-auto p-2">
													<div class="btn-group w-80">
														<button type="button" class="btn btn-warning float-right" id="addFile" data-toggle='modal' data-target='#inner_file_modal' style='cursor:pointer;color: white;'>
															<i class="fas fa-plus"></i> 추가
														</button>
													</div>
												</ul>	
											</div>
											<div class="card-body">
												<div id="fileGrid"></div>		
												<div class="tab-content">
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						
						
						
						
<!-- 						<div id="repo_grid_main_div" style="background-color: white; width:; height: 600px; float: left;"> -->
<!-- 							<ul id="repo_grid_main_ul" class='sidebar-menu' data-widget='tree'></ul>	 -->
<!-- 						</div> -->
						<div class="modal fade" id="repo_modal">
							<div id="pw_reset_dialog" class="modal-dialog modal-sm">
								<div class="modal-content" style="width: 400px; margin-top: 200px;">
									<div class="modal-header">
										<h4 class="modal-title">사용자 리파지토리 생성</h4>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">
										<div class="form-group has-feedback">
											<input type="text" class="form-control" placeholder="리파지토리 명" id="c_repo_name" name="c_repo_name">
										</div>
									</div>
									<div class="modal-footer justify-content-between">
										<button id="repo_dia_inqr" type="button" class="btn btn-primary">생성</button>
										<button id="repo_dia_close" type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
									</div>
								</div>
							</div>
						</div>

				        <div class="modal fade" id="file_modal">
							<div id="pw_reset_dialog" class="modal-dialog modal-lm">
								<div class="modal-content"  style="width: 400px; margin-top: 200px;">
									<div class="modal-header">
										<h4 class="modal-title">사용자 패키지 추가</h4>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">
										<div class="form-group has-feedback">
											<input type="text" class="form-control" id="repo_name" name="repo_name" disabled="disabled" /> 
											<input type="hidden" id = "repo_pack_idx" name = "repo_pack_idx"/>
											<input type="text" class="form-control" placeholder="패키지 명" id="c_pack_name" name="c_pack_name" /> 
										</div>
									</div>
									<div class="modal-footer justify-content-between">
										<button id="file_dia_inqr" type="button" class="btn btn-primary">추가</button>
										<button id="file_dia_close" type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
									</div>
								</div>
							</div>
						</div>
						<div class="modal fade" id="inner_file_modal">
							<div id="pw_reset_dialog" class="modal-dialog modal-lm">
								<div class="modal-content"  style="width: 400px; margin-top: 200px;">
									<div class="modal-header">
										<h4 class="modal-title">사용자 파일 추가</h4>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">
										<div class="form-group has-feedback">
											<input type="text" class="form-control" id="inner_repo_name" name="inner_repo_name" disabled="disabled" />
											<input type="hidden" class="form-control" id="inner_pack_idx" name="inner_pack_idx" disabled="disabled" /> 
											<input type="file" class="form-control" id="inner_uploadFile" name="inner_uploadFile" multiple="multiple" />
										</div>
									</div>
									<div class="modal-footer justify-content-between">
										<button id="inner_file_dia_inqr" type="button" class="btn btn-primary">추가</button>
										<button id="inner_file_dia_close" type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
									</div>
								</div>
							</div>
						</div>				
						<button type="hidden" class="btn float-right" id="popup_file_click" data-toggle='modal' data-target='#ex_file_modal' >
						</button>		
						<div class="modal fade" id="ex_file_modal">
							<div id="pw_reset_dialog" class="modal-dialog modal-lm">
								<div class="modal-content"  style="width: 400px; margin-top: 200px;">
									<div class="modal-header">
										<h4 class="modal-title">사용자 파일</h4>
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">
										<div class="form-group has-feedback">
											파일경로 : <input type="text" class="form-control" id="ex_file_path" name="ex_file_path" disabled="disabled" /> 
											파일명 :  <input type="text" class="form-control" id="ex_file_name" name="ex_file_name" disabled="disabled" /> 
											제외사유 : <input type="text" class="form-control" id="exclude_rsn" name="exclude_rsn" /> 
											<input type="text" class="form-control" id="ex_file_idx" name="ex_file_idx" style="display: none;" /> 
											<input type="text" class="form-control" id="ex_file_key" name="ex_file_key" style="display: none;" />
											<input type="text" class="form-control" id="ex_user_repo_idx" name="ex_user_repo_idx" style="display: none;" />
										</div>
									</div>
									<div class="modal-footer justify-content-between">
										<button id="down_file_dia_inqr" type="button" class="btn btn-primary">다운로드</button>
										<button id="ex_file_dia_inqr" type="button" class="btn btn-primary">제외등록</button>
										<button id="del_file_dia_inqr" type="button" class="btn btn-primary">삭제</button>
										<button id="ex_file_dia_close" type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
									</div>
								</div>
							</div>
						</div>
						<div class="modal fade" id="modal-sm">
							<div id="rsn_dialog" class="modal-dialog modal-sm">
								<div class="modal-content"  style="width: 400px; margin-top: 200px;">
									<div class="modal-header">
										<h4 class="modal-title">파일 다운로드</h4>
										<button type="button" class="close" data-dismiss="modal" aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">
										<p>파일 다운로드를 진행 하시겠습니까?</p>
										<div class="form-group has-feedback">
											<input type="text" class="form-control" id="file_idx_modal" name="file_idx_modal" style="display: none;"> 
											<input type="text" class="form-control" id="file_idx" name="file_idx" style="display: none;" />
										</div>
									</div>
									<div class="modal-footer justify-content-between">
										<button id="rsn_dia_close" type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
										<button id="down_send" type="button" class="btn btn-primary" data-dismiss="modal">다운</button>
									</div>
								</div>
							</div>
						</div>
						
					
						<div class="modal fade" id="del_package_modal">
							<div id="pw_reset_dialog" class="modal-dialog modal-lm">
								<div class="modal-content"  style="width: 400px; margin-top: 200px;">
									<div class="modal-header">
										<h4 class="modal-title">사용자 패키지 삭제</h4>
										<button type="button" class="close" data-dismiss="modal" aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
									</div>
									<div class="modal-body">
										<div class="form-group has-feedback">
											패키지 경로 : <input type="text" class="form-control" id="del_package_path" name="ex_file_path" disabled="disabled" />
										</div>
									</div>
									<div class="modal-footer justify-content-between">
										<button id="del_package_dia_inqr" type="button" class="btn btn-primary">삭제</button>
										<button id="del_package_dia_close" type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
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
<script src="/resources/js/userRepoManage.js"></script>
</body>
</html>