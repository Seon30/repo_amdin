<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>
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
                    	<li class="breadcrumb-item active">내 정보</li>
                	</ol>
            	</div>
        	</div>
    	</div>
	</div>
 
             <!-- <p>다이얼로그 모달창을 띄우는 간단한 방법!!</p> -->

	<div class="modal fade" id="modal-sm">
    	<div id="rsn_dialog" class="modal-dialog modal-sm">
        	<div class="modal-content">
            	<div class="modal-header">
                	<h4 class="modal-title">파일제외 등록 삭제</h4>
                	<button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    	<span aria-hidden="true">&times;</span>
                	</button>
            	</div>
            	<div class="modal-body">
                	<div class="form-group has-feedback">
                    	<p>파일 제외 등록 삭제를 하시겠습니까?</p>
                	</div>
                	<div class="form-group has-feedback">
                    	<input type="text" class="form-control" id="file_idx_modal" name="file_idx_modal" style="display: none;">
                    </div>
            	</div>
	            <div class="modal-footer justify-content-between">
	                <button id="rsn_dia_close" type="button" class="btn btn-default" data-dismiss="modal">닫기</button>
	                <button id="rsn_send" type="button" class="btn btn-primary" data-dismiss="modal">등록</button>
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
							<h3 class="card-title">회원정보</h3>
              			</div>
		             	<form>
		                	<div class="card-body">
		                  		<div class="form-group">
		                    		<label for="exampleInputEmail1">아이디</label>
		                    		<input  name="emp_no" value="<%=user_no %>" class="form-control" id="emp_no" readonly>
		                  		</div>
			                    <div class="form-group">
			                    	<label for="exampleInputPassword1">이름</label>
			                    	<input name="emp_nm" value="<%=emp_nm %>" class="form-control" id="emp_nm"  readonly >
			                  	</div>
		                  		<div class="form-group">
		                    		<label for="exampleInputPassword1">기존 비밀번호</label>
		                    		<input type="password" name="emp_pw_old" class="form-control" id="emp_pw_old" required>
		                  		</div>
		                  		<div class="form-group">
		                    		<label for="exampleInputPassword1">새로운 비밀번호</label>
		                    		<input type="password" name="emp_pw_new" class="form-control" id="emp_pw_new" required>
		                  		</div>
			                  	<div>
			            			<small>8~20자리 영문 대 소문자,숫자,특수문자를 사용하세요</small>
			            	  	</div><br>
		                  		<div class="form-group">
		                    		<label for="exampleInputPassword1">비밀번호 재확인</label>
		                    		<input type="password" name="emp_pw_new_valid" class="form-control" id="emp_pw_new_valid" required>
		                  		</div>
		                  		<div class="input-group mb-3">
		        					<span id="newPassValid" style="font-size: 10px; color: red; font-weight: bold; float: right;"></span>
		        		  		</div>
		                  		<div class="form-group">
		                    		<label for="exampleInputPassword1">이메일</label>
		                    		<input name="emp_email" value="<%=user_email %>" class="form-control" id="emp_email" readonly>
		                  		</div>
		                	</div>
		              	</form>
		              	<div class="card-footer"  align="right">
		                	<button onclick="changePw()" id ="changebtn" class="btn btn-primary">수정하기</button>
	               		</div>		
					</div>
				</div>
			</div>
    	</div>	
	</section>
</div>
<!-- /.content-wrapper -->

  
<%@include file="../include/footer.jsp"%>
<script src="resources/js/myInfo.js"></script>
</body>
</html>
