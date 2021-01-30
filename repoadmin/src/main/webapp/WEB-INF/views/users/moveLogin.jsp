<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%> 
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>RepoMaster 로그인</title>
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Font Awesome -->
<link rel="stylesheet" href="/resources/plugins/fontawesome-free/css/all.min.css">
<!-- Ionicons -->
<link rel="stylesheet" href="/resources/plugins/ionicons/css/ionicons.min.css">
<!-- icheck bootstrap -->
<link rel="stylesheet" href="/resources/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="/resources/dist/css/adminlte.min.css">
<!-- Google Font: Source Sans Pro -->
<link href="/resources/plugins/googleapis/css/googleapis.css" rel="stylesheet">

</head>
<body class="hold-transition login-page">
	<div class="modal fade" id="alertModal">
        <div class="modal-dialog modal-sm">
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">경고</h4>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">×</span>
              </button>
            </div>
            <div class="modal-body">
              <p id="alertModalMsg"></p>
            </div>
            <div class="modal-footer justify-content-between">
              <button type="button" class="btn btn-primary" data-dismiss="modal">확인</button>
            </div>
          </div>
          <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
      </div>
	<!--    <p>다이얼로그 모달창을 띄우는 간단한 방법!!</p> -->
	<div class="modal fade" id="modal-sm">
		<div id="pw_reset_dialog" class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">비밀번호 초기화</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="form-group has-feedback">
						<input type="text" class="form-control" placeholder="아이디" id="pw_emp_no" name="pw_emp_no">
					</div>
					<div class="form-group has-feedback">
						<input type="text" class="form-control" placeholder="이메일"  id="pw_emp_email" name="pw_emp_email">
					</div>
				</div>
				<div class="modal-footer justify-content-between">
					<button id="pw_dia_close" type="button" class="btn btn-default"
						data-dismiss="modal">닫기</button>
					<button id="pw_dia_inqr" type="button" class="btn btn-primary">요청</button>
				</div>
			</div>
		</div>
	</div>

	<!-- 로그인 박스 -->
	<div class="login-box" style="margin-top: -250px;">
		<div class="login-logo">
			<a href="/"><b>RepoMaster</b></a>
		</div>
		<!-- /.login-logo -->
		<div class="card">
			<div class="card-body login-card-body">
				<form action="/loginAction" method="post">
					<div class="input-group mb-3">
						<input type="text" class="form-control" placeholder="아이디" id="id"  name="id">
						<div class="input-group-append">
							<div class="input-group-text">
								<span class="fas fa-envelope"></span>
							</div>
						</div>
					</div>
					<div class="input-group mb-3">
						<input type="password" class="form-control" placeholder="비밀번호"  id="pw" name="pw">
						<div class="input-group-append">
							<div class="input-group-text">
								<span class="fas fa-lock"></span>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-8">
							<div class="icheck-primary"></div>
						</div>
						<!-- /.col -->
						<div class="col-4">
							<button type="submit" class="btn btn-primary btn-block">로그인</button>
						</div>
						<!-- /.col -->
					</div>
				</form>
				<input type="hidden" value="${ErrorMessage }" id="errMsg">
				<p class="mb-1">
					<a href="/signUp">회원가입</a>
				</p>
				<p class="mb-0">
					<a data-toggle="modal" data-target="#modal-sm"
						style="cursor: pointer;">비밀번호 초기화</a>
				</p>
			</div>
			<!-- /.login-card-body -->
		</div>
	</div>
	<!-- /.login-box -->

	<!-- jQuery -->
	<script src="/resources/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script src="/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- AdminLTE App -->
	<script src="/resources/dist/js/adminlte.min.js"></script>
	<!-- Js -->
	<script src="/resources/js/moveLogin.js"></script>

</body>
</html>
