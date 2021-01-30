$(document).ready(function(){
	main.initPage();
})

var main={
	initPage:function(){
		main.defineGrid();
		main.defineEvent();	
		main.initData();
	},
	defineGrid:function(){
		searchClick();
		donut();
	},
	initData:function(){
		
	},
	defineEvent:function(){
	},

}
function searchClick(){
	$.ajax({

	    url: "dashUpdateList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	makeGrid("update_list",data);
	    }

	})
}
function makeGrid(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "250px",
			width: "100%",
        sorting: true,
        data: dataObj,
 	 
        fields: [
            { headerTemplate:"시작일" 		,name: "c_date_s"	        , type: "date"				, align: "center"		, width: 50 },
            { headerTemplate:"종료일" 		,name: "c_date_e"	        , type: "date"				, align: "center"		, width: 50 },
            { headerTemplate:"리파지토리 이름"	,align: "center"  			,name: "repo_name"			, type: "text"			, align: "center"	, width: 50 },
            { headerTemplate:"파일 크기" 		,name: "upld_file_size"		, type: "number"	, width: 50 },
            { headerTemplate:"개수"	    	,name: "upld_file_cnt"		, type: "number"	, width: 50 }
        ]
	,
        rowDoubleClick: function(row) {
        	$("#repo_name_f").val(row.item.repo_name);
        	$("#c_date_s_f").val(row.item.c_date_s);
        	$("#c_date_e_f").val(row.item.c_date_s);
        	$("#upld_file_size_f").val(row.item.upld_file_size);
			$("#c_date_e_f").val(row.item.c_date_e);
			$("#repo_idx_f").val(row.item.repo_idx);
			$('#update_form').submit();
			
        }
    });
}

function donut(){
	

	    var pieChartCanvas = $('#pieChart');
	    var pieData        = {
	      labels: [
	          'Python', 
	          'CentOS7'

	      ],
	      datasets: [
	        {
	          data: [$('#pythonUse').val(),$('#centos7Use').val()],
	          backgroundColor : ['#00C0EF', '#f56954'],
	        }
	      ]
	    }
	    var pieOptions     = {
	      legend: {
	        display: false
	      }
	    }
	    //Create pie or douhnut chart
	    // You can switch between pie and douhnut using the method below.
	    var pieChart = new Chart(pieChartCanvas, {
	      type: 'doughnut',
	      data: pieData,
	      options: pieOptions      
	    })
}