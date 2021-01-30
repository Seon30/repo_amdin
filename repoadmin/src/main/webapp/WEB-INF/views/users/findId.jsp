<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>RepoMaster 아이디 찾기</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Font Awesome -->
  <link rel="stylesheet" href="/resources/plugins3/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="/resources/plugins3/ionicons/css/ionicons.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="/resources/plugins3/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/resources/dist3/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="/resources/plugins3/googleapis/css/googleapis.css" rel="stylesheet">
</head>
<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo">
    <a href="resources/index2.html"><b>Repo</b>Master</a>
  </div>
  <div class="card">
    <div class="card-body register-card-body">
      <p class="login-box-msg">회원가입</p>

      <form action="findId" method="post">
        <div class="input-group mb-3" style="margin-bottom: 0rem!important;">
          <input type="text" class="form-control" id="emp_nm" name="emp_nm" placeholder="이름" required/>
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
          <input type="email" class="form-control" id="emp_email" name="emp_nm" placeholder="이메일" required/>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-8">
          </div>
          <!-- /.col -->
        </div>
      </form>
      <div>
	     <div class="col-4" style="float: right;">
	       <button  onclick="registinqr()" id="registbtn" class="btn btn-primary btn-block">가입하기</button>
	     </div>
      </div>
      <a href="/findId" class="text-center">아이디 찾기</a>
    </div>
    <!-- /.form-box -->
  </div><!-- /.card -->
</div>
<!-- jQuery -->
<script src="resources/plugins3/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="resources/plugins3/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="resources/dist3/js/adminlte.min.js"></script>

<script src="resources/js/signUp.js"></script>
</body>
</html>