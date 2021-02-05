<%@page import="com.pptware.repomaster.repoadmin.domain.RepoAdminUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.logging.Logger"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="x-ua-compatible" content="ie=edge">

  <title>RepoMaster</title>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>RepoMaster</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Font Awesome -->
  <link rel="stylesheet"  href="/resources/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="/resources/plugins/ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/resources/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="/resources/plugins/googleapis/css/googleapis.css" rel="stylesheet">
  <link rel="stylesheet" href="resources/plugins/jsgrid/jsgrid.min.css">
  <link rel="stylesheet" href="resources/plugins/jsgrid/jsgrid-theme.min.css">
</head>

<body class="hold-transition sidebar-mini layout-fixed">
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
    <%
    Logger logger = Logger.getLogger(this.getClass().getName());
    HttpSession session = request.getSession();
    RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");
    String emp_nm = loginVO.getEmp_nm();
    String emp_lvl = loginVO.getEmp_lvl();
    String user_no = loginVO.getEmp_no();
    String user_email = loginVO.getEmp_email();
    logger.info("===================================== Session[emp_nm]:{" + emp_nm + "]");
    logger.info("===================================== Session[emp_lvl]:{" + emp_lvl + "]");
    %>  
<div class="wrapper">
    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#" role="button">
                    <i class="fas fa-bars"></i>
                </a>
            </li>
        </ul>

        <!-- Right navbar links -->
        <ul class="navbar-nav ml-auto">
            <!-- Messages Dropdown Menu -->
            <li class="nav-item">
                <a href="/logoutAction" class="btn btn-default btn-flat">로그아웃</a>
            </li>
        </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="/" class="brand-link">
            <img
                src="/resources/dist/img/RLogo.png"
                alt="RepoMaster Logo" style="float:center; margin-left:40px"
                class="brand-text font-weight-light"
            >
<!--             <span class="brand-text font-weight-light">RepoMaster</span> -->
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img
                        src="/resources/dist/img/user2-160x160.jpg"
                        class="img-circle elevation-2"
                        alt="User Image">
                </div>
                <div class="info">
                    <a href="myInfo" class="d-block"><%=emp_nm %></a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul
                    class="nav nav-pills nav-sidebar flex-column"
                    data-widget="treeview"
                    role="menu"
                    data-accordion="false">
                    <!-- Add icons to the links using the .nav-icon class with font-awesome or any
                    other icon font library -->
                    <!-- 조회 -->
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
<!--                             <i class="nav-icon fas fa-tachometer-alt"></i> -->
							<i class="nav-icon fas fa-search"></i>
                            <p>조회<i class="right fas fa-angle-left"></i></p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="centOS7" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>CentOS 7</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="centOS8_stream" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>CentOS 8 Stream</p>
                                </a>
                            </li>
                             <li class="nav-item">
                                <a href="ubuntuVersion" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Ubuntu <small>(packages)</small></p>
                                </a>
                            </li>   
                            <li class="nav-item">
                                <a href="centOS7" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>R</p>
                                </a>
                            </li>                                                                                                                                                                                                         
                            <li class="nav-item">
                                <a href="pythonSearch" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Python</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="userSearch" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>User</p>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="nav-icon fas fa-download"></i>
                            <p>다운로드<i class="right fas fa-angle-left"></i></p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="windowsPython" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>Windows : Pyhton</p>
                                </a>
                            </li>                                                     
                        </ul>                      
                    </li>

                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="nav-icon fas fa-file"></i>
                            <p>파일<i class="fas fa-angle-left right"></i></p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="excludeBrowser" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>제외 등록</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="excludeList" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>제외 목록</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="updateList" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>업데이트 목록</p>
                                </a>
                            </li>
                        </ul>
                    </li>


                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="nav-icon fas fa-user"></i>
                            <p>사용자<i class="fas fa-angle-left right"></i></p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="myInfo" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>내 정보</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="conf" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>환경설정</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="downloadList" class="nav-link">
                                    <i class="far fa-circle nav-icon"></i>
                                    <p>다운로드 목록</p>
                                </a>
                            </li>                            
                        </ul>
                    </li>
                    <% if ("99".equals(emp_lvl)) { %>
                        <li class="nav-item has-treeview">
                            <a href="#" class="nav-link">
                                <i class="nav-icon fas fa-table"></i>
                                <p>시스템 관리 <i class="fas fa-angle-left right"></i></p>
                            </a>
                            <ul class="nav nav-treeview">
                                <li class="nav-item">
                                    <a href="userManage" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>사용자 관리</p>
                                    </a>
                                </li>
	                            <li class="nav-item">
									<a href="userRepoMng" class="nav-link">
	                                	<i class="far fa-circle nav-icon"></i>
	                                    <p>사용자 리파지토리 관리</p>
	                                 </a>
	                           </li>                                                               
                                <li class="nav-item">
                                    <a href="repoUpdate" class="nav-link">
                                        <i class="far fa-circle nav-icon"></i>
                                        <p>리파지토리 업데이트</p>
                                    </a>
                                </li> 
                            </ul>
                        </li>                        
                    <%}%>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>