
$(document).ready(function(){
	centOS8_steram.initPage();
	appstreamClick();
	$("#search_view_text").focus();
	$('#Progress_Loading').hide(); //첫 시작시 로딩바를 숨겨준다.

})
.ajaxStart(function(){
	$('#Progress_Loading').show(); //ajax실행시 로딩바를 보여준다.
	})

.ajaxStop(function(){
	$('#Progress_Loading').hide(); //ajax종료시 로딩바를 숨겨준다.
	});

var centOS8_steram = {
	initPage:function(){	
		centOS8_steram.defineEvent();
		if($('#search_header_text').val()!=""||$('#c_date').val()!=""){
			centOS8_steram.initData();			
		}else{
			centOS8_steram.defineGrid();			
		}
	},
	defineGrid:function(){
		
	},
	initData:function(){
//		fileSearch2();
	},
	defineEvent:function(){
		$('#8appstream').on('click',function(e){
//			$("#table_type").val("8OS");
			appstreamClick();
		});
		$('#8baseos').on('click',function(e){
//			$("#table_type").val("8OS");
			baseosClick();
		});
		$('#8plus').on('click',function(e){
//			$("#table_type").val("8Plus");
			plusClick();
		});
		$('#8extras').on('click',function(e){
//			$("#table_type").val("8Updates");
			extrasClick();
		});
		$('#8powertools').on('click',function(e){
//			$("#table_type").val("8Updates");
			powertoolsClick();
		});
		
		$("input[name=searchfile]").keydown(function(key) {
            if (key.keyCode == 13) {
            	fileSearch2();
            }
        });	
		
		$('#down_send').on('click',function(){
			downloadFiles();
		});		
//		$('#searchVal').change(function(e){
//			console.log("searchVal val >> " + $("#searchVal").val());
//		})
		
	},

}

function showAppstream(key){
	if($("#8appstream")){
		$("#appstreamSum").show("fast");
		$("#baseosSum").hide();
		$("#plusSum").hide();
		$("#extrasSum").hide();
		$("#powertoolsSum").hide();
	}	
}
function showBaseos(key){
	if($("#8baseos")){
		$("#baseosSum").show("fast");
		$("#appstreamSum").hide();
		$("#plusSum").hide();
		$("#extrasSum").hide();
		$("#powertoolsSum").hide();
	}	
}
function showPlus(key){
	if($("#8plus")){
		$("#plusSum").show("fast");
		$("#baseosSum").hide();
		$("#appstreamSum").hide();
		$("#extrasSum").hide();
		$("#powertoolsSum").hide();
	}	
}
function showExtras(key){
	if($("#8extras")){
		$("#extrasSum").show("fast");
		$("#baseosSum").hide();
		$("#plusSum").hide();
		$("#appstreamSum").hide();
		$("#powertoolsSum").hide();
	}	
}
function showPowertools(key){
	if($("#8powertools")){
		$("#powertoolsSum").show("fast");
		$("#baseosSum").hide();
		$("#plusSum").hide();
		$("#extrasSum").hide();
		$("#appstreamSum").hide();
	}	
}

function appstreamClick(){
	console.log("appstreamClick????");
	$.ajax({
	    url: "centOS8appstreamList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showAppstream();
	    	makeGridappstream("appstreamSum",data);
	    	console.log("appstreamClick성공");
//	    	console.log("OOOOSSS===="+JSON.stringify(data));
	    }
	});
}
	
function extrasClick(){
	console.log("extras이상한데????");
	$.ajax({
	    url: "centOS8extrasList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showExtras();
	    	makeGridextras("extrasSum",data);
//	    	console.log("extrasClick===="+JSON.stringify(data));
	    	console.log("extras성공");
	    }
	});
}


function plusClick(){
	console.log("plus이상한데????");
	$.ajax({
	    url: "centOS8plusList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showPlus();
	    	makeGridplus("plusSum",data);
	    	console.log("plus성공");
	    }
	});
}

function baseosClick(){
	console.log("baseos이상한데????");
	$.ajax({
	    url: "centOS8baseosList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showBaseos();
	    	makeGridbaseos("baseosSum",data);
//	    	console.log("updates성공");
	    }
	});
}
function powertoolsClick(){
	console.log("powertools이상한데????");
	$.ajax({
	    url: "centOS8powertoolsList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showPowertools();
	    	makeGridpowertools("powertoolsSum",data);
//		    	console.log("updates성공");
	    	
	    }	
	});
}

function makeGridappstream(gridId,dataObj){
	
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
			$("#table_type").val("8appstream");
        	$('#packageSum_form').submit();
		}
	});
}

function makeGridextras(gridId,dataObj){
	
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
        	$("#table_type").val("8extras");
//        	$("#table_type").val(getData['table_type']);
        	$('#packageSum_form').submit();
		}
	});
}


function makeGridplus(gridId,dataObj){
	
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
        	$("#table_type").val("8plus");
//        	$("#table_type").val(getData['type']);
        	$('#packageSum_form').submit();
		}
	});
}

function makeGridbaseos(gridId,dataObj){
	
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
        	$("#table_type").val("8baseos");
//        	$("#table_type").val(getData['type']);
        	$('#packageSum_form').submit();
		}
	});
}

function makeGridpowertools(gridId,dataObj){
	
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
        	$("#table_type").val("8powertools");
//        	$("#table_type").val(getData['type']);
        	$('#packageSum_form').submit();
		}
	});
}

function fileSearch2(){
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
	    url: "fileSearch2", 
	    
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
//    			console.log("low_click >>> "+ $('#searchVal').val + " , " + $('#searchVal').html );
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