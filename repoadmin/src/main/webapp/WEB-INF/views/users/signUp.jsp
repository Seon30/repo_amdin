<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>RepoMaster 회원가입</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/plugins/fontawesome-free/css/all.min.css">
<link rel="stylesheet" href="/resources/plugins/ionicons/css/ionicons.min.css">
<link rel="stylesheet" href="/resources/dist/css/adminlte.min.css">
<link href="/resources/plugins/googleapis/css/googleapis.css" rel="stylesheet">
</head>
<!-- 중복확인 모달 -->
<body class="hold-transition register-page">
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
	<div class="register-box">
		<div class="register-logo">
			<a href="/"><b>Repo</b>Master</a>
		</div>

		<div class="card">
			<div class="card-body register-card-body">
				<p class="login-box-msg">회원가입</p>
				<div class="input-group mb-3"
					style="margin-bottom: 0rem !important;">
					<input type="text" class="form-control" id="emp_no" name="emp_no"
						placeholder="사번" required />
					<div class="input-group-append">
						<div class="input-group-text">
							<span class="fas fa-user"></span>
						</div>
					</div>
				</div>
				<div style="width: 100%; margin-top: 5px; margin-bottom: 10px;">
					<span> 
						<small style="display: none; color: blue;" id="id_validate_text">ID중복검사가 완료되었습니다.</small> 
						<small>6~14자 영문과 숫자를 사용하세요.</small>
					</span>
					<div style="float: right;">
						<button style="display: block; float: right; height: 25px; font-size: 5px;" class="btn-primary btn" id="id_validate_btn">중복확인</button>
					</div>
				</div>
				<input type="hidden" value="text" id="errMsg">
				<div class="input-group mb-3">
					<input type="text" class="form-control" id="emp_nm" name="emp_nm"
						placeholder="이름" required />
					<div class="input-group-append">
						<div class="input-group-text">
							<span class="fas fa-user"></span>
						</div>
					</div>
					<span> <small>최소 2자리 이상 영문 대 소문자, 한글을 사용하세요.</small>
					</span>
				</div>
				<div class="input-group mb-3">
					<input type="password" class="form-control" id="emp_pw" name="emp_pw" placeholder="비밀번호" required />
					<div class="input-group-append">
						<div class="input-group-text">
							<span class="fas fa-lock"></span>
						</div>
					</div>
					<span> <small>8~20자리 영문 대 소문자,숫자,특수문자를 사용하세요</small></span>
				</div>
				<div class="input-group mb-3" style="margin-bottom: 0rem !important;">
					<input type="password" class="form-control" id="emp_pw_re" name="emp_pw_re" placeholder="비밀번호 재확인" required />
					<div class="input-group-append">
						<div class="input-group-text">
							<span class="fas fa-lock"></span>
						</div>
					</div>
				</div>
				<div class="input-group mb-3">
					<span id="passvalid" style="font-size: 10px; color: red; font-weight: bold; float: right;"></span>
				</div>
				<div class="input-group mb-3">
					<input type="email" class="form-control" id="emp_email"
						name="emp_email" placeholder="이메일" />
					<div class="input-group-append">
						<div class="input-group-text">
							<span class="fas fa-envelope"></span>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-8"></div>
				</div>
				<div>
					<div class="col-4" style="float: right;">
						<button onclick="registinqr()" id="registbtn" class="btn btn-primary btn-block">가입하기</button>
					</div>
				</div>
				<a href="/" class="text-center" style="text-decoration:underline;">이미 회원입니다.</a>
			</div>
		</div>
	</div>

<script src="/resources/plugins/jquery/jquery.min.js"></script>
<script src="/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="/resources/dist/js/adminlte.min.js"></script>
<script src="/resources/js/signUp.js"></script>
</body>
</html>
