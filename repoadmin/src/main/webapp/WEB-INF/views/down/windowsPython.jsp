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
                    	<li class="breadcrumb-item active">CentOS7</li>
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
	                        <h3 class="card-title">Python</h3>
	                    </div>
						<div class="card-body">
							<div class="col-12">
								<div class="card">
              						<div class="card-header">
                						<h3 class="card-title">Python Release</h3>
              						</div>
              						<!-- /.card-header -->
              						<div class="card-body p-0">
                						<table class="table table-striped">
                  							<thead>
							                    <tr>
							                        <th style="width: 10px">#</th>
							                      	<th>Release version</th>
							                      	<th>Release date</th>
							                      	<th>Download</th>
							                    </tr>
							                </thead>
                  							<tbody>
                    							<tr>
                      								<td>1.</td>
                      								<td><span class="release-number">Python 3.9.0</a></span></td>
                      								<td><span class="release-date">Oct. 5, 2020</span></td>
<!--                       								<td><span class="release-download"><a href="/downloads/release/python-390/"><span aria-hidden="true" class="icon-download"></span> Download</a></span></td>				 -->
                    								<td><span class="release-download"><a id="goPython1" class="nav-link active" href="goPython1" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>2.</td>
						                            <td><span class="release-number">Python 3.8.6</a></span></td>
						                            <td><span class="release-date">Sept. 24, 2020</span></td>
                    								<td><span class="release-download" id="goPython2"><a class="nav-link active" href="goPython2" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>3.</td>
						                            <td><span class="release-number">Python 3.5.10</a></span></td>
						                            <td><span class="release-date">Sept. 5, 2020</span></td>
                    								<td><span class="release-download" id="goPython3"><a class="nav-link active" href="goPython3" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>4.</td>
						                            <td><span class="release-number">Python 3.7.9</a></span></td>
						                            <td><span class="release-date">Aug. 17, 2020</span></td>
                    								<td><span class="release-download" id="goPython4"><a class="nav-link active" href="goPython4" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>5.</td>
						                            <td><span class="release-number">Python 3.6.12</a></span></td>
						                            <td><span class="release-date">Aug. 17, 2020</span></td>
                    								<td><span class="release-download" id="goPython5"><a class="nav-link active" href="goPython5" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>6.</td>
						                            <td><span class="release-number">Python 3.8.5</a></span></td>
						                            <td><span class="release-date">July 20, 2020</span></td>
                    								<td><span class="release-download" id="goPython6"><a class="nav-link active" href="goPython6" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>7.</td>
						                            <td><span class="release-number">Python 3.8.4</a></span></td>
						                            <td><span class="release-date">July 13, 2020</span></td>
                    								<td><span class="release-download" id="goPython7"><a class="nav-link active" href="goPython7" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>8.</td>
						                            <td><span class="release-number">Python 3.7.8</a></span></td>
						                            <td><span class="release-date">June 27, 2020</span></td>
                    								<td><span class="release-download" id="goPython8"><a class="nav-link active" href="goPython8" data-toggle="tab">Download</a></td>
                    							</tr>
                    							<tr>
							                      	<td>9.</td>
						                            <td><span class="release-number">Python 3.6.11</a></span></td>
						                            <td><span class="release-date">June 27, 2020</span></td>
                    								<td><span class="release-download" id="goPython9"><a class="nav-link active" href="goPython9" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>10.</td>
						                            <td><span class="release-number">Python 3.8.3</a></span></td>
						                            <td><span class="release-date">May 13, 2020</span></td>
                    								<td><span class="release-download" id="goPython10"><a class="nav-link active" href="goPython10" data-toggle="tab">Download</a></td>
                    							</tr>
                    							<tr>
							                      	<td>11.</td>
						                            <td><span class="release-number">Python 2.7.18</a></span></td>
						                            <td><span class="release-date">April 20, 2020</span></td>
                    								<td><span class="release-download" id="goPython11"><a class="nav-link active" href="goPython11" data-toggle="tab">Download</a></td>
                    							</tr>
							                    <tr>
							                      	<td>12.</td>
						                            <td><span class="release-number">Python 3.7.7</a></span></td>
						                            <td><span class="release-date">March 10, 2020</span></td>
                    								<td><span class="release-download" id="goPython12"><a class="nav-link active" href="goPython12" data-toggle="tab">Download</a></td>
                    							</tr>						                    							                    							                    							                    							                    							                    							                    							                    
                  							</tbody>
                						</table>
              						</div>
							        <div class="card-body">
										<div class="tab-content">
			                				<div id="pythonDesc1"></div>
			                				<div id="pythonDesc2"></div>
							                <div id="pythonDesc3"></div>
							                <div id="pythonDesc4"></div>
			                				<div id="pythonDesc5"></div>
			                				<div id="pythonDesc6"></div>
							                <div id="pythonDesc7"></div>
							                <div id="pythonDesc8"></div>
			                				<div id="pythonDesc9"></div>
			                				<div id="pythonDesc10"></div>
							                <div id="pythonDesc11"></div>
							                <div id="pythonDesc12"></div>
							                <div id="pythonDesc13"></div>							                							                							                
						           			<form id="pythonDesc_form" method="post" action="goPythonDescPage" hidden="true">
							                 	<input id="python_ver_idx" name="python_ver_idx"/>
<!-- 							                 	<input id="table_type" name="table_type"/> -->
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

<!-- <script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script> -->
<!-- <script>window.jQuery || document.write('<script src="/static/js/libs/jquery-1.8.2.min.js"><\/script>')</script> -->
<!-- <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script> -->
<!-- <script>window.jQuery || document.write('<script src="/resources/static/js/libs/jquery-ui-1.12.1.min.js"><\/script>')</script> -->
<!-- <SCRIPT SRC="/RESOURCES/STATIC/JS/LIBS/MASONRY.PKGD.MIN.JS"></SCRIPT> -->
<!-- <SCRIPT SRC="/RESOURCES/STATIC/JS/LIBS/HTML-INCLUDES.JS"></SCRIPT> -->
<!-- <SCRIPT TYPE="/RESOURCESTEXT/JAVASCRIPT" SRC="/RESOURCES/STATIC/JS/MAIN-MIN.D5F95C9C5614.JS" CHARSET="UTF-8"></SCRIPT> -->

<script src="/resources/js/windowsPython.js"></script>
<script src="/resources/plugins/filterizr/jquery.filterizr.min.js"></script>
<script src="/resources/plugins/ekko-lightbox/ekko-lightbox.min.js"></script>
<script src="/resources/plugins/jquery-ui/jquery-ui.min.js"></script>
<script src="/resources/dist/js/demo.js"></script>
</body>
</html>