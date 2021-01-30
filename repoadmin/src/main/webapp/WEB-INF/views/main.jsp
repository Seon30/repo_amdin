<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp"%>

<input id="pythonUse" hidden="true" value="${pythonUse}"/>
<input id="centos7Use" hidden="true" value="${centos7Use}"/>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
        <div class="container-fluid">
            <div class="row mb-2">
                <div class="col-sm-6">
                	<h1>PPTware :<small>ReopoMaster</small></h1>
                </div>
                <!-- /.col -->
                <div class="col-sm-6">
                    <ol class="breadcrumb float-sm-right">
                        <li class="breadcrumb-item"><a href="#">Home</a></li>
                        <li class="breadcrumb-item active">Dashboard</li>
                    </ol>
                </div>
            </div>
        </div>
    </div>
    <!-- Main content -->
    <section class="content">
        <div class="container-fluid">
			<div class="row">
					<div class="col-md-12">
						<div class="card">
							<div class="card-header">
								<h5 class="card-title">Total Size / Count</h5>
								<div class="card-tools">
									<button type="button" class="btn btn-tool"
										data-card-widget="collapse">
										<i class="fas fa-minus"></i>
									</button>
									<button type="button" class="btn btn-tool"
										data-card-widget="remove">
										<i class="fas fa-times"></i>
									</button>
								</div>
							</div>
							<div class="card-body">
								<div class="row">
									<div class="col-sm-6">
										<div class="info-box mb-4 bg-yellow">
											<span class="info-box-icon"> <i class="fas fa-tag"></i>
											</span>
											<div class="info-box-content">
												<span class="info-box-text">Total Packages</span>
												<h4 class="info-box-number">${totalCountKFormat }K
													(${totalCountFormat })</h4>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="info-box mb-4 bg-warning">
											<span class="info-box-icon"> <i class="fas fa-tag"></i>
											</span>
											<div class="info-box-content">
												<span class="info-box-text">Total Size(GiB)</span>
												<h4 class="info-box-number">${totalSizeGFormat}GiB
													(${totalSizeKFormat}MB)</h4>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>		

				<div class="row">
					<div class="col-12">
						<div class="card">
							<div class="card-body">
								<div class="row">
									<div class="col-lg-3 col-6">
										<div class="card card-widget widget-user-2">
											<div class="widget-user-header bg-orange">
												<div class="widget-user-image">
													<img class="img elevation" src="/resources/dist/img/logo_R.png" style="height:75px; width: auto;" alt="R_LOGO">
												</div>
												<h4 class="info-box-number" style= "color:white; position:absolute; right: 95px; bottom: 130px;">R</h4>
												<a class="badge bg-warning	" style="color:black; position: absolute; right: 10px; bottom: 95px" href="/centOS7">
												more info 
												<i class="fas fa-arrow-circle-right"></i></a>
											</div>
											<div class="card-footer">
												<div class="row">
								                	<div class="col-sm-6 border-right">
								                    	<div class="description-block">
								                      		<h5 class="description-header">3,200 GB</h5>
								                      		<span class="description-text">SIZE</span>
								                    	</div>
								                  	</div>
								                  	<div class="col-sm-6">
								                    	<div class="description-block">
								                      		<h5 class="description-header">10 K</h5>
								                      		<span class="description-text">COUNT</span>
								                    	</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-lg-3 col-6">								
										<div class="card card-widget widget-user-2">
											<div class="widget-user-header bg-green">
												<div class="widget-user-image">
													<img class="img elevation" src="/resources/dist/img/logo_rhel.png" style="height:75px; width: auto;" alt="RHEL_LOGO">
												</div>
												<h4 class="info-box-number" style="position: absolute; right: 95px; bottom: 130px">RHEL 8</h4>
												<a class="badge bg-warning	" style="color:black; position: absolute; right: 10px; bottom: 95px" href="/centOS7">
												more info 
												<i class="fas fa-arrow-circle-right"></i></a></div>
											<div class="card-footer">
												<div class="row">
								                	<div class="col-sm-6 border-right">
								                    	<div class="description-block">
								                      		<h5 class="description-header">3,200 GB</h5>
								                      		<span class="description-text">SIZE</span>
								                    	</div>
								                  	</div>
								                  	<div class="col-sm-6">
								                    	<div class="description-block">
								                      		<h5 class="description-header">10 K</h5>
								                      		<span class="description-text">COUNT</span>
								                    	</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-lg-3 col-6">
										<div class="card card-widget widget-user-2">
											<div class="widget-user-header bg-info">
												<div class="widget-user-image">
													<img class="img elevation"
														src="/resources/dist/img/logo_rhel.png"
														style="height:75px; width: auto;" 
														alt="RHEL_LOGO">
												</div>
												<h4 class="info-box-number" style="position: absolute; right: 95px; bottom: 130px">RHEL 7</h4>
												<a class="badge bg-warning	" style="color:black; position: absolute; right: 10px; bottom: 95px" href="/centOS7">
												more info 
												<i class="fas fa-arrow-circle-right"></i></a>
											</div>
											<div class="card-footer">
												<div class="row">
								                	<div class="col-sm-6 border-right">
								                    	<div class="description-block">
								                      		<h5 class="description-header">3,200 GB</h5>
								                      		<span class="description-text">SIZE</span>
								                    	</div>
								                  	</div>
								                  	<div class="col-sm-6">
								                    	<div class="description-block">
								                      		<h5 class="description-header">10 K</h5>
								                      		<span class="description-text">COUNT</span>
								                    	</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="col-lg-3 col-6">
										<div class="card card-widget widget-user-2">
											<div class="widget-user-header bg-primary";>
												<div class="widget-user-image">
													<img class="img elevation"
														src="/resources/dist/img/logo_ubuntu.png"
														style="height:75px; width: auto;" 
														alt="Ubuntu_LOGO">
												</div>
												<div>
												<h4 class="info-box-number" style="position: absolute; text-align:center; tebottom: 130px;" the>Ubunutu</h4>
												<a class="badge bg-warning	" style="color:black; position: absolute; color:black; right: 10px; bottom: 95px" href="/centOS7">
												more info 
												<i class="fas fa-arrow-circle-right"></i></a>
												</div>
											</div>
											<div class="card-footer">
												<div class="row">
								                	<div class="col-sm-6 border-right">
								                    	<div class="description-block">
								                      		<h5 class="description-header">3,200 GB</h5>
								                      		<span class="description-text">SIZE</span>
								                    	</div>
								                  	</div>
								                  	<div class="col-sm-6">
								                    	<div class="description-block">
								                      		<h5 class="description-header">10 K</h5>
								                      		<span class="description-text">COUNT</span>
								                    	</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>	
					</div>
				</div>		

                <div class="row">
                    <div class="col-6">
						<div class="card card">
			            	<div class="card-header">
			                	<h3 class="card-title"><strong>업데이트 목록</strong></h3>
			              	</div>
                            <div class="card-body">
                                <div class="row-col-4">
                                    <div class="box box-primary">
                                        <div class="box-body"  style="height:320px">
						            		<div class="box-body"  style="height:320px">
						                		<div class="row">
						                  			<div class="col-md-8">
						                    			<div class="chart-responsive">
						                      				<canvas id="pieChart" height="200px"></canvas>
						                    			</div>
						                  			</div>
							                  		<div class="col-md-4">
								                    	<ul class="chart-legend clearfix">
								                    		<li><i>　</i></li>
								                    		<li><i>　</i></li>
								                    		<li><i>　</i></li>
								                      		<li><i class="far fa-circle text-warning"></i> CentOS7</li>
								                      		<li><i class="far fa-circle text-primary"></i> Python</li>
								                      		<li><i>　</i></li>
								                      		<li><i>　</i></li>
						                    			</ul>
							                  		</div>
                								</div>
						              			<div class="card-footer bg-white p-0" style="margin-top:40px;">
								                	<ul class="nav nav-pills flex-column">
								                  		<li class="nav-item">
									                  		<a href="#" class="nav-link">CentOS7
									                  			<span class="float-right text-warning">${centos7Use}%</span>
									                    	</a>
								                  		</li>
								                  		<li class="nav-item">
									                  		<a href="#" class="nav-link">Python
									                  			<span class="float-right text-primary">${pythonUse}%</span>
									                    	</a>
								                  		</li>			                  		
								                	</ul>
						              			</div>
              								</div>
                                          </div>
                                      </div>
                                  </div>
                              </div>
                          </div>
                      </div>
					<div class="col-6">
			            <div class="card" >
			            	<div class="card-header">
			                	<h3 class="card-title"><strong>사용량 차트</strong></h3>
			              	</div>
			              	<div class="card-body">
			            		<div class="box-body"  style="height:320px">
			                		<div class="row">
			                  			<div class="col-md-8">
			                    			<div class="chart-responsive">
			                      				<canvas id="pieChart" height="200px"></canvas>
			                    			</div>
			                  			</div>
				                  		<div class="col-md-4">
					                    	<ul class="chart-legend clearfix">
					                    		<li><i>　</i></li>
					                    		<li><i>　</i></li>
					                    		<li><i>　</i></li>
					                      		<li><i class="far fa-circle text-warning"></i> CentOS7</li>
					                      		<li><i class="far fa-circle text-primary"></i> Python</li>
					                      		<li><i>　</i></li>
					                      		<li><i>　</i></li>
			                    			</ul>
				                  		</div>
			                		</div>
			              			<div class="card-footer bg-white p-0" style="margin-top:40px;">
					                	<ul class="nav nav-pills flex-column">
					                  		<li class="nav-item">
						                  		<a href="#" class="nav-link">CentOS7
						                  			<span class="float-right text-warning">${centos7Use}%</span>
						                    	</a>
					                  		</li>
					                  		<li class="nav-item">
						                  		<a href="#" class="nav-link">Python
						                  			<span class="float-right text-primary">${pythonUse}%</span>
						                    	</a>
					                  		</li>			                  		
					                	</ul>
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

<%@include file="include/footer.jsp"%>

<script src="resources/js/main.js"></script>
<script src="resources/plugins/jsgrid/demos/db.js"></script>
<script src="resources/plugins/jsgrid/jsgrid.min.js"></script>
<script src="resources/plugins/chart.js/Chart.min.js"></script>
</body>
</html>