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
                    	<li class="breadcrumb-item active">환경설정</li>
                	</ol>
            	</div>
        	</div>
    	</div>
	</div>

	<!--    <p>다이얼로그 모달창을 띄우는 간단한 방법!!</p> -->
	<div class="modal fade" id="modal-sm">
		<div id="pw_reset_dialog" class="modal-dialog modal-sm" >
			<div class="modal-content" style="width: 400px;float: none; margin: 0 auto;">
				<div class="modal-header">
					<h4 class="modal-title">환경 설정</h4>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
							<p>설정 파일 이름을 입력해주세요.</p>
							<div class="col-sm-12" style="float: none; margin: 0 auto;">
                               	<div class="input-group input-group-sm mb-3">
	                        		<input id="search_view_text" name="searchConfFiles" placeholder="파일 이름을 입력해 주세요." class="form-control">
										<div class="input-group-prepend">
                                    	<span class="input-group-append">											  
                               				<button id="searchConfFile" type="button" class="btn-sm btn-warning btn-flat" onclick="confFileNameSearch()" >조회</button>
                               			</span>
                           			</div>
                       			</div>			
							</div>				
				
					<div id="jsGrid3"></div>
					<div id="searchConfName"></div>
				</div>
				<div class="modal-footer justify-content-between">
					<button id="changeConfClose" type="button" class="btn btn-default"
						data-dismiss="modal">닫기</button>
					<button id="changeConf" type="button" class="btn btn-primary">등록</button>
				</div>
			</div>
		</div>
	</div>

    <!-- Main content -->
	<section class="content">
		<div class="container-fluid">
			<div class="row">
                <!-- left column -->
                <div class="col-md-4">
                    <div class="card card-primary">
                        <div class="card-header">
                            <h3 class="card-title">Repository</h3>
                        </div>
                        <div class="card-body">
                            <form role="form">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div id="jsGrid1"></div>
                                    </div>
                                </div>
                            </form>
                        </div>
                	</div>
                
                    <div class="card card-primary">
                        <div id="jsGrid2"></div>
                        <div class="card-header">
                            <h3 class="card-title">Conf</h3>
                        </div>
                        <div class="card-body" style="height: 360px;">
                            <div class="row" style="margin-bottom: 10px;">
                            	<div class="col-md-2">
									<label>Conf 1 :</label>
                                </div>
                                <div class="col-md-8">
                                    <div class="form-group" >                         
                                        <div class="confBody1">
                                            <input id="conf_01" name="conf_name_input" readonly="true" class="form-control" style="cursor: pointer;"/>
                                    	</div>
                                    </div>
                                </div>
                                <div class="col-md-2">
									<button type="button" id="repo_conf01_idx" class="btn btn confList" data-toggle="modal" data-target="#modal-sm">
                      					<i class="fas fa-wrench"></i>
                    				</button>
                                </div>
                             </div>
                            <div class="row" style="margin-bottom: 10px;">
                            	<div class="col-md-2">
									<label>Conf 2 :</label>
                                </div>
                                <div class="col-md-8">
                                    <div class="form-group" >                       
                                        <div class="confBody2">
                                            <input id="conf_02" name="conf_name_input" readonly="true" class="form-control" style="cursor: pointer;"/>
                                    	</div>
                                    </div>
                                </div>
                                <div class="col-md-2">
									<button type="button" id="repo_conf02_idx" class="btn btn confList" data-toggle="modal" data-target="#modal-sm">
                      					<i class="fas fa-wrench"></i>
                    				</button>
                                </div>
							</div>
                            <div class="row" style="margin-bottom: 10px;">
                            	<div class="col-md-2">
									<label>Conf 3 :</label>
                                </div>
                                <div class="col-md-8">
                                    <!-- text input -->
                                    <div class="form-group" >                       
                                        <div class="confBody3">
                                            <input id="conf_03" name="conf_name_input" readonly="true" class="form-control" style="cursor: pointer;"/>
                                    	</div>
                                    </div>
                                </div>
                                <div class="col-md-2">
									<button type="button" id="repo_conf03_idx" class="btn btn confList" data-toggle="modal" data-target="#modal-sm">
                      					<i class="fas fa-wrench"></i>
                    				</button>
                                </div>
                             </div>
                            <div class="row" style="margin-bottom: 10px;">
                            	<div class="col-md-2">
									<label>Conf 4 :</label>
                                </div>
                                <div class="col-md-8">
                                    <div class="form-group" >                     
                                        <div class="confBody4">
                                            <input id="conf_04" name="conf_name_input" readonly="true" class="form-control" style="cursor: pointer;"/>
                                    	</div>
                                    </div>
                                </div>
                                <div class="col-md-2">
									<button type="button" id="repo_conf04_idx" class="btn btn confList" data-toggle="modal" data-target="#modal-sm">
                      					<i class="fas fa-wrench"></i>
                    				</button>
                                </div>
                             </div>                                                                     
                             <div class="row" style="margin-bottom: 10px;">
                             	<div class="col-md-2">
									<label>Conf 5 :</label>
                                </div>
                                <div class="col-md-8">
                                    <div class="form-group" >                        
                                        <div class="confBody5">
                                            <input id="conf_05" name="conf_name_input" readonly="true" class="form-control" style="cursor: pointer;"/>
                                    	</div>
                                    </div>
                                </div>
                                <div class="col-md-2">
									<button type="button" id="repo_conf05_idx" class="btn btn confList" data-toggle="modal" data-target="#modal-sm">
                      					<i class="fas fa-wrench"></i>
                    				</button>
                                </div>
                             </div>
							 <input id="conf_01_idx" hidden="true"/>
                             <input id="conf_02_idx" hidden="true"/>
                             <input id="conf_03_idx" hidden="true"/>
                             <input id="conf_04_idx" hidden="true"/>
                             <input id="conf_05_idx" hidden="true"/>
                          </div>
					</div>                
        		</div>

        		<div class="col-md-8">
            		<div class="row">
                		<div class="col-md-12">
                    		<div class="card card-warning">
                        		<div id="jsGrid2"></div>
                        		<div class="card-header">
                            		<h3 class="card-title">Configuration</h3>
                        		</div>
                        		<div class="card-body" style="height: 600px;">
                            		<div class="row">
                                		<div class="col-sm-12">
		                                    <div class="form-group" hidden="true">
		                                        <label>conf_idx</label>
		                                        <input type="text" name="conf_01_idx" id="conf_idx" readonly="readonly" class="form-control">
		                                    </div>
                                    	</div>
                                	</div>
                                	<div class="row">
                                    	<div class="col-sm-12">
	                                        <div class="form-group">
	                                            <label>Name</label>
	                                            <input type="text" name="conf_name" readonly="true" id="conf_name" class="form-control">
	                                        </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label>Body</label>
                                                <textarea class="form-control" name="conf_body" id="conf_body" rows="3" readonly="true" style="height: 230px;">
                                                </textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div class="form-group">
                                                <label>Description</label>
                                                <textarea class="form-control" name="conf_desc" id="conf_desc" rows="3" readonly="true" style="height: 150px;"></textarea>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="card-footer" align="right">
                                    <button class="btn btn-primary" id="new_btn" style="float: right;">신규등록</button>
                                    <button class="btn btn-primary" id="save_btn" style="display: none; float: right;" >저장</button>
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
<script src="/resources/plugins/jsgrid/jsgrid.min.js"></script>
<script src="/resources/js/conf.js"></script>
</body>
</html>