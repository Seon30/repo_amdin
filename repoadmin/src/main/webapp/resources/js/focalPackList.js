$(document).ready(function(){
	focalPackList.initPage();
	focalClick();
	$("#search_view_text").focus();
	$('#Progress_Loading').hide(); //첫 시작시 로딩바를 숨겨준다.

})
.ajaxStart(function(){
	$('#Progress_Loading').show(); //ajax실행시 로딩바를 보여준다.
	})

.ajaxStop(function(){
	$('#Progress_Loading').hide(); //ajax종료시 로딩바를 숨겨준다.
	});

var focalPackList = {
	initPage:function(){	
		focalPackList.defineEvent();
		if($('#search_header_text').val()!=""||$('#c_date').val()!=""){
			focalPackList.initData();			
		}else{
			focalPackList.defineGrid();			
		}
	},
	defineGrid:function(){
		
	},
	
	initData:function(){
//		packSearch()
	},
	
	defineEvent:function(){
		$('#focal').on('click',function(e){
//			$("#table_type").val("8OS");
			focalClick();
		});
		
		$("input[name=searchfile]").keydown(function(key) {
            if (key.keyCode == 13) {
            	fileSearch4();
            }
        });	
		
		$('#down_send').on('click',function(){
			downloadFiles();
		});		

	},

}

function showFocal(key){
	if($("#focal")){
		$("#focalSum").show("fast");
	}	
}

function focalClick(){
	console.log("focalClick????");
	$.ajax({
	    url: "getFocalPackList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	showFocal();
	    	makeGridFocal("focalSum",data);
	    	console.log("focalSum성공");
	    	console.log("focal===="+JSON.stringify(data));	
	    }
	});
}
	
function makeGridFocal(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,											
        fields: [
            { headerTemplate:"Package" 		,align:"center" ,name: "package"		, type: "text"		,align:"left", 	width: 30 },
            { headerTemplate:"Section" 		,align:"center" ,name: "section"		, type: "text"		,align:"left",  width: 30 },
            { headerTemplate:"Architecture" ,align:"center" ,name: "architecture"	, type: "text"		,align:"left",  width: 30 },
            { headerTemplate:"idx" 			,align:"center" ,name: "idx"			, visible: false				 ,  width: 0   },
        ],
		rowClick: function(args) {
//		    console.log(args)
		    var getData = args.item;
		    var keys = Object.keys(getData);
		    var text = [];
        	$("#idx").val(getData['idx']);
        	$("#table_type").val("focal");
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
	console.log("secect_name >> " + $('#searchVal').val());
	console.log("filename >> " + $('#search_view_text').val());
	$.ajax({
	    url: "fileSearch4", 
	    
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
            { headerTemplate:"Package" 		,align:"center" ,name: "package"		, type: "text"		,align:"left", 	width: 30 },
            { headerTemplate:"Section" 		,align:"center" ,name: "section"		, type: "text"		,align:"left",  width: 30 },
            { headerTemplate:"Architecture" ,align:"center" ,name: "architecture"	, type: "text"		,align:"left",  width: 30 },
            { headerTemplate:"idx" 			,align:"center" ,name: "idx"			, visible: false				 ,  width: 0   },
        ],
    		rowClick: function(args) {
//    			console.log("low_click >>> "+ $('#searchVal').val + " , " + $('#searchVal').html );
    		    var getData = args.item;
    		    var keys = Object.keys(getData);
    		    var text = [];
            	$("#idx").val(getData['idx']); // >> 26 으로 넘기고 있음
            	$("#table_type").val("focal"); // >> 
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