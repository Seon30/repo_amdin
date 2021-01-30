
$(document).ready(function(){
	windowsPython.initPage();
//	goPython1Click();
	$('#Progress_Loading').hide(); //첫 시작시 로딩바를 숨겨준다.
	})
	.ajaxStart(function(){
	$('#Progress_Loading').show(); //ajax실행시 로딩바를 보여준다.

});

var windowsPython={
	initPage:function(){
		windowsPython.defineEvent();	
		windowsPython.defineGrid();
		windowsPython.initData();
	},
	defineGrid:function(){
		
	},
	initData:function(){
		
	},
	defineEvent:function(){
		$('#goPython1').on('click',function(e){
			goPython1Click();
		});
		
		$('#goPython2').on('click',function(e){
			goPython2Click();
		});
		
		$('#goPython3').on('click',function(e){
			goPython3Click();
		});
		
		$('#goPython4').on('click',function(e){
			goPython4Click();
		});
		
		$('#goPython5').on('click',function(e){
			goPython5Click();
		});
		
		$('#goPython6').on('click',function(e){
			goPython6Click();
		});
		
		$('#goPython7').on('click',function(e){
			goPython7Click();
		});
		
		$('#goPython8').on('click',function(e){
			goPython8Click();
		});
		$('#goPython9').on('click',function(e){
			goPython9Click();
		});
		
		$('#goPython10').on('click',function(e){
			goPython10Click();
		});
		
		$('#goPython11').on('click',function(e){
			goPython11Click();
		});
		
		$('#goPython12').on('click',function(e){
			goPython12Click();
		});
		
		$('#goPython13').on('click',function(e){
			goPython13Click();
		});
	},

}

function goPython1Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail1",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid1("pythonDesc1",data);
	    }
	})
}
	
function goPython2Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail2",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid1("pythonDesc2",data);
	    }
	})
}

function goPython3Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail3",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid1("pythonDesc3",data);
	    }
	})
}

function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}

function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}

function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}


function goPython4Click(){
	console.log("goPython1Click????");
	$.ajax({
	    url: "getPythonDetail4",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){

	    	console.log("Go성공");
	    	makeGrid4("pythonDesc4",data);
	    }
	})
}










function makeGrid1(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [
            { headerTemplate:"Version" 				,align:"center" 	,name: "file_version"		, type: "text"		,align:"left"	,width: 70},
            { headerTemplate:"Operation System" 	,align:"center" 	,name: "operating_system"	, type: "text"		,align:"left"	,width: 50 },
//            { headerTemplate:"MD5 Sum" 				,align:"center" 	,name: "md5_sum"	        , type: "text"		,align:"left"	,width: 100 },
            { headerTemplate:"File Size" 			,align:"center" 	,name: "file_size"	        , type: "number"		,align:"left"	,width: 30 },            
            { headerTemplate:"python_ver_idx" 		,align:"center" 	,name: "python_ver_idx"		, visible: false				 	,width: 0   },
            { headerTemplate: "다운"	 ,align:"center"    , name: "file_idx"		,align:"center" 	,itemTemplate: function(item) {
        		return $("<button>").attr("type", "button").text("다운").on("click", function btnClick(){	$('#file_idx_modal').val(item);
        										$('#modalOpenButton').click();
        		})
            },width: 30}            
        ],
		rowClick: function(args) {
//		    console.log(args)
		    var getData = args.item;
		    var keys = Object.keys(getData);
		    var text = [];
        	$("#python_ver_idx").val(getData['python_ver_idx']);
//			$("#file").val("7OS");
        	$('#pythonDesc_form').submit();
		}
	});
}

