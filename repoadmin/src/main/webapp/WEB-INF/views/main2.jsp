<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
 
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        RepoMaster
        <small>ReopoMaster Binary Repository Service ></small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">main</li>
      </ol>
    </section>
    <!-- Main content -->
    <section class="content">
 
 	  <!-- Small boxes (Stat box) -->
      <div class="row">
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-aqua">
            <div class="inner">
              <h3>${totalCount} K</h3>

              <p>v</p>
            </div>
            <div class="icon">
              <i class="fa fa-shopping-cart"></i>
            </div>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-green">
            <div class="inner">
              <h3>${pythonCount} K</h3>

              <p>Python Packages</p>
            </div>
            <div class="icon">
              <i class="ion ion-stats-bars"></i>
            </div>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-red">
            <div class="inner">
              <h3>${rubyCount} K</h3>

              <p>centOS 7 Packages</p>
            </div>
            <div class="icon">
              <i class="ion ion-stats-bars"></i>
            </div>
          </div>
        </div>
        <!-- ./col -->
      </div>
      <!--  ./row -->

 	  <!-- Small boxes (Stat box) -->
      <div class="row">
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-aqua">
            <div class="inner">
              <h3>${totalSize} K</h3>
              <p>Total Size(GB)</p>
            </div>
            <div class="icon">
              <i class="fa fa-shopping-cart"></i>
            </div>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-green">
            <div class="inner">
              <h3>${pythonSize} K</h3>

              <p>Python Size(GB)</p>
            </div>
            <div class="icon">
              <i class="ion ion-stats-bars"></i>
            </div>
          </div>
        </div>
        <!-- ./col -->
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-red">
            <div class="inner">
              <h3>${rubySize} K</h3>

              <p>centOS 7 Size(GB)</p>
            </div>
            <div class="icon">
              <i class="ion ion-stats-bars"></i>
            </div>
          </div>
        </div>
        <!-- ./col -->
      </div>
      <!--  ./row -->
      
            <div class="row">
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box bg-aqua">
            <span class="info-box-icon"><i class="fa fa-bookmark-o"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Total Disk Space(${mountDisk})</span>
              <span class="info-box-number">${totalSpaceGB} GB</span>

              <div class="progress">
                <div class="progress-bar" style="width: 100%"></div>
              </div>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box bg-green">
            <span class="info-box-icon"><i class="fa fa-bookmark-o"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Used Disk Space(${mountDisk})</span>
              <span class="info-box-number">${usedSpaceGB} GB</span>

              <div class="progress">
                <div class="progress-bar" style="width: ${usedSpaceGB / totalSpaceGB * 100.0}%"></div>
              </div>
            </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
        <div class="col-md-3 col-sm-6 col-xs-12">
          <div class="info-box bg-yellow">
            <span class="info-box-icon"><i class="fa fa-bookmark-o"></i></span>

            <div class="info-box-content">
              <span class="info-box-text">Usable Disk Space(${mountDisk})</span>
              <span class="info-box-number">${usableSpaceGB} GB</span>

              <div class="progress">
                <div class="progress-bar" style="width: ${usableSpaceGB / totalSpaceGB * 100.0}%"></div>
              </div>
             </div>
            <!-- /.info-box-content -->
          </div>
          <!-- /.info-box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->

      <div class="row">
       <div class="col-md-6">
          <!-- Donut chart -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <i class="fa fa-bar-chart-o"></i>

              <h3 class="box-title">Repository Formats Rate</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <div class="box-body">
              <div id="donut-chart2" style="height: 300px;"></div>
              <input type="text" id="python_donut_val" hidden="true" value="${pythonUse}"/>
              <input type="text" id="ruby_donut_val" hidden="true" value="${rubyUse}"/>
            </div>
            <!-- /.box-body-->
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->

       <div class="col-md-6" style="width: 407px;">
          <!-- Donut chart -->
          <div class="box box-primary">
            <div class="box-header with-border">
              <i class="fa fa-bar-chart-o"></i>

              <h3 class="box-title">Update List(${mountDisk})</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <div class="box-body">
<!--               <div id="donut-chart-disk1" style="height: 300px;"></div> -->
				<div id="update_list" style="height: 280px;"></div>
				<div><a style="float: right;" href="updateList">+More Update List</a></div>
				<form id="update_form"  method="post" action="searchView" hidden="true">
					<input id="repo_name_f" name="repo_name" />
					<input id="repo_idx_f" name="repo_idx" />
					<input id="c_date_e_f" name="c_date_e" />
				</form>
            </div>
            <!-- /.box-body-->
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
      
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->


<%@include file="include/footerChart.jsp"%>
<script src="resources/plugins/jsgrid/jsgrid.min.js"></script>
<script src="resources/js/main.js"></script>
<script>
    $(document).ready(function(){

    	var donutData2 = [
  	      { label: 'Python', data: $('#python_donut_val').val(), color: '#3c8dbc' },
  	      { label: 'CnetOS', data: $('#ruby_donut_val').val(), color: '#0073b7' }
  	    ]
    	$.plot('#donut-chart2', donutData2, {
    	      series: {
    	        pie: {
    	          show       : true,
    	          radius     : 1,
    	          innerRadius: 0.5,
    	          label      : {
    	            show     : true,
    	            radius   : 2 / 3,
    	            formatter: labelFormatter,
    	            threshold: 0.1
    	          }

    	        }
    	      },
    	      legend: {
    	        show: false
    	      }
    	    })

//     	     	var donutData3 = [
//     	      { label: 'Used', data: "${usedSpaceGB}", color: '#c8553d' },
//     	      { label: 'Useable', data: "${usableSpaceGB}", color: '#588d8b' }
//     	    ]
//     	$.plot('#donut-chart-disk1', donutData3, {
//     	      series: {
//     	        pie: {
//     	          show       : true,
//     	          radius     : 1,
//     	          innerRadius: 0.5,
//     	          label      : {
//     	            show     : true,
//     	            radius   : 2 / 3,
//     	            formatter: labelFormatter,
//     	            threshold: 0.1
//     	          }

//     	        }
//     	      },
//     	      legend: {
//     	        show: false
//     	      }
//     	    })

    	    /*
   * Custom Label formatter
   * ----------------------
   */
  function labelFormatter(label, series) {
    return '<div style="font-size:13px; text-align:center; padding:2px; color: #fff; font-weight: 600;">'
      + label
      + '<br>'
      + Math.round(series.percent) + '%</div>'
  }
    });
</script>