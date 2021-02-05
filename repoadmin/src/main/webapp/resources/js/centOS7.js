
$(document).ready(function(){
	centOS7.initPage();
	oSClick();
	centOS7.initPage();
	$("#search_view_text").focus();
	$('#Progress_Loading').hide(); //첫 시작시 로딩바를 숨겨준다.
})

.ajaxStart(function(){
$('#Progress_Loading').show(); //ajax실행시 로딩바를 보여준다.
	})

.ajaxStop(function(){
$('#Progress_Loading').hide(); //ajax종료시 로딩바를 숨겨준다.
	});

var centOS7={
	initPage:function(){	
		centOS7.defineEvent();
		if($('#search_header_text').val()!=""||$('#c_date').val()!=""){
			centOS7.initData();			
		}else{
			centOS7.defineGrid();			
		}
	},
	defineGrid:function(){
		//2. 그리드 함수 추가 ;
	},
	initData:function(){
//		fileSearch();
	},
	defineEvent:function(){
		$('#7OS').on('click',function(e){
//			$("#table_type").val("7OS");
			oSClick();
		});
		$('#7Extras').on('click',function(e){
//			$("#table_type").val("7OS");
			extrasClick();
		});
		$('#7Plus').on('click',function(e){
//			$("#table_type").val("7Plus");
			plusClick();
		});
		$('#7Updates').on('click',function(e){
//			$("#table_type").val("7Updates");
			updatesClick();
		});
	},

}

function showOS(key){
	if($("#7OS")){
		$("#osSum").show("fast");
		$("#extrasSum").hide();
		$("#plusSum").hide();
		$("#updatesSum").hide();
	}	
}
function showExtras(key){
	if($("#7Extras")){
		$("#extrasSum").show("fast");
		$("#osSum").hide();
		$("#plusSum").hide();
		$("#updatesSum").hide();
	}	
}
function showPlus(key){
	if($("#7Plus")){
		$("#plusSum").show("fast");
		$("#osSum").hide();
		$("#extrasSum").hide();
		$("#updatesSum").hide();
	}	
}
function showUpdates(key){
	if($("#7Updates")){
		$("#updatesSum").show("fast");
		$("#osSum").hide();
		$("#extrasSum").hide();
		$("#plusSum").hide();
	}	
}


function oSClick(){
	console.log("os이상한데????");
	$.ajax({
	    url: "centOS7osList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showOS();
	    	makeGridOS("osSum",data);
	    	console.log("os성공");
//	    	console.log("OOOOSSS===="+JSON.stringify(data));
	    }
	})
}
	
function extrasClick(){
	console.log("extras이상한데????");
	$.ajax({
	    url: "centOS7extrasList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showExtras();
	    	makeGridExtras("extrasSum",data);
//	    	console.log("extrasClick===="+JSON.stringify(data));
	    	console.log("extras성공");
	    }
	})
}


function plusClick(){
	console.log("plus이상한데????");
	$.ajax({
	    url: "centOS7plusList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showPlus();
	    	makeGridPlus("plusSum",data);
	    	console.log("plus성공");
	    }
	})
}

function updatesClick(){
	console.log("updates이상한데????");
	$.ajax({
	    url: "centOS7updatesList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showUpdates();
	    	makeGridUpdates("updatesSum",data);
//	    	console.log("updates성공");
	    	
	    }
	})
}

function makeGridOS(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [
            { headerTemplate:"Package" 	,align:"center" ,name: "package_name"	, type: "text"		,align:"left",  width: 100 },
            { headerTemplate:"Summary" 	,align:"center" ,name: "summary"		, type: "text"		,align:"left", 	width: 100 },
            { headerTemplate:"PkgKey" 	,align:"center" ,name: "pkgkey"			, visible: false				 ,  width: 0   },
        ],
		rowClick: function(args) {
//		    console.log(args)
		    var getData = args.item;
		    var keys = Object.keys(getData);
		    var text = [];
        	$("#pkgkey").val(getData['pkgkey']);
			$("#table_type").val("7OS");
        	$('#packageSum_form').submit();
		}
	});
}

function makeGridExtras(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [
            { headerTemplate:"Package" 	,align:"center" ,name: "package_name"	, type: "text"		,align:"left",  width: 100 },
            { headerTemplate:"Summary" 	,align:"center" ,name: "summary"		, type: "text"		,align:"left", 	width: 100 },
            { headerTemplate:"PkgKey" 	,align:"center" ,name: "pkgkey"			, visible: false				 ,  width: 0   },
        ],
		rowClick: function(args) {
//		    console.log(args)
		    var getData = args.item;
		    var keys = Object.keys(getData);
		    var text = [];
        	$("#pkgkey").val(getData['pkgkey']);
        	$("#table_type").val("7Extras");
//        	$("#table_type").val(getData['table_type']);
        	$('#packageSum_form').submit();
		}
	});
}


function makeGridPlus(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [
            { headerTemplate:"Package" 	,align:"center" ,name: "package_name"	, type: "text"		,align:"left",  width: 100 },
            { headerTemplate:"Summary" 	,align:"center" ,name: "summary"		, type: "text"		,align:"left", 	width: 100 },
            { headerTemplate:"PkgKey" 	,align:"center" ,name: "pkgkey"			, visible: false				 ,  width: 0   },
        ],
		rowClick: function(args) {
//		    console.log(args)
		    var getData = args.item;
		    var keys = Object.keys(getData);
		    var text = [];
        	$("#pkgkey").val(getData['pkgkey']);
        	$("#table_type").val("7Plus");
//        	$("#table_type").val(getData['type']);
        	$('#packageSum_form').submit();
		}
	});
}


function makeGridUpdates(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [
            { headerTemplate:"Package" 	,align:"center" ,name: "package_name"	, type: "text"		,align:"left",  width: 100 },
            { headerTemplate:"Summary" 	,align:"center" ,name: "summary"		, type: "text"		,align:"left", 	width: 100 },
            { headerTemplate:"PkgKey" 	,align:"center" ,name: "pkgkey"			, visible: false				 ,  width: 0   },
        ],
		rowClick: function(args) {
//		    console.log(args)
		    var getData = args.item;
		    var keys = Object.keys(getData);
		    var text = [];
        	$("#pkgkey").val(getData['pkgkey']);
        	$("#table_type").val("7Updates");
//        	$("#table_type").val(getData['type']);
        	$('#packageSum_form').submit();
		}
	});
}

function fileSearch3(){
	var filename = $('#search_view_text').val();

	if($('#search_view_text').val().length==0){
		$('#alertModalMsg').text("파일 이름을 입력해주세요.");
		$('#alertModal').modal();
		return false;
	}
	else if(filename==""){
		filename = $('#search_view_text').val();
	}
	var sendDate = {
			file_idx:$('#pack_idx').val(),
			select_name:$('#searchVal').val(),
			filename:$('#search_view_text').val(),
		    c_date:$('#c_date').val(),
		    repo_idx:$('#searchVal').val()
	}
	console.log("filename >> " + $('#search_view_text').val());
	console.log("select_name >> " + $('#search_view_text').val());
	$.ajax({
	    url: "fileSearch3", 
	    
	    data: sendDate,   
	    
	    type: "POST",
	    
	    dataType: "json",
	    
	    success: function(data){
	    	makeGrid("jsGrid1",data);
	    	console.log(JSON.stringify(data));

	    }

	})
}
function makeGrid(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "300px",
        width: "100%",
// 
        sorting: true,
        paging: true,
        data: dataObj,
 	 
        fields: [
            { headerTemplate:"Package" 	,align:"center" ,name: "package_name"	, type: "text"		,align:"left",  width: 100 },
            { headerTemplate:"Summary" 	,align:"center" ,name: "summary"		, type: "text"		,align:"left", 	width: 100 },
            { headerTemplate:"PkgKey" 	,align:"center" ,name: "pkgkey"			, visible: false				 ,  width: 0   },
        ],
		rowClick: function(args) {
//			console.log("low_click >>> "+ $('#searchVal').val + " , " + $('#searchVal').html );
		    var getData = args.item;
		    var keys = Object.keys(getData);
		    var text = [];
        	$("#pkgkey").val(getData['pkgkey']); // >> 26 으로 넘기고 있음
			$("#table_type").val($('#searchVal').val());
        	$('#packageSum_form').submit(); //1. 화면 submit  >> 컨트롤러 goCentOS8DescPage 로이동
		}
	});
}
function downloadFiles(){
	$.ajax({
	    url: "fileDownChecker",      
	    type: "POST",                             
	    data: {file_idx:$('#file_idx_modal').val(), 
	    		repo_idx:$('#repo_idx').val()},
	    dataType: "json",    
	    async : false,
	    success: function(data){
	    	console.log(JSON.stringify(data));
	    	if(data.key=="Y"){
	    		location.href="/fileDownLoad?repo_idx="+$('#repo_idx').val()+"file_idx=" + $('#file_idx_modal').val() +"&down_prog_id=M";
	    	}else{
	    		alert("파일이 존재하지 않습니다.");
	    	}
	    }
	})
//	location.href="/fileDownLoad?file_idx=" + $('#file_idx_modal').val(); 

}