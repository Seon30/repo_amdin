$(document).ready(function(){
	$("#search_view_text").focus();
	excludeBrowser.initPage();
	$('#Progress_Loading').hide(); //첫 시작시 로딩바를 숨겨준다.
})

.ajaxStart(function(){
$('#Progress_Loading').show(); //ajax실행시 로딩바를 보여준다.

})

.ajaxStop(function(){
$('#Progress_Loading').hide(); //ajax종료시 로딩바를 숨겨준다.

});

var excludeBrowser={
	initPage:function(){	
		excludeBrowser.defineEvent();
		if($('#searchFile').val()!=""||$('#c_date').val()!=""){
			excludeBrowser.initData();			
		}else{
			excludeBrowser.defineGrid();			
		}
	},
	defineGrid:function(){
		//2. 그리드 함수 추가 
	},
	initData:function(){
		fileSearch();
	},
	defineEvent:function(){
		//이벤트 정의
		$("input[name=searchfiles]").keydown(function(key) {
            if (key.keyCode == 13) {
            	fileSearch();
            }
        });	

		$('#rsn_send').on('click',function(){
			rsn();
		})
	},
}

function fileSearch(){
	var file_name = $('#search_view_text').val();

	if($('#search_view_text').val().length==0){
		$('#alertModalMsg').text("파일 이름을 입력해주세요.");
		$('#alertModal').modal();
		return false;
	}
	else if(file_name==""){
		file_name = $('#search_view_text').val();
	}
	
	var sendDate = {
			file_idx:$('#file_idx').val(),
			filename:$('#search_view_text').val(),
		    c_date:$('#c_date').val(),
		    repo_idx:$('#searchVal').val()
	}
	$.ajax({
	    url: "fileSearch",     
	    data: sendDate,   	    
	    type: "POST",    
	    dataType: "json",	    
	    success: function(data){
	    	makeGrid("jsGrid1",data);
	    	//★☆★☆★☆★☆defineGrid 연결 부터 진행화면됨★☆★☆★☆
	    	//1. excludeBrowser.defineGrid();
	    }
	})
}
function makeGrid(gridId,dataObj){	
	console.log(JSON.stringify(dataObj));
	$("#"+gridId).jsGrid({
        width: "100%",

        sorting: true,
        paging: true,
        data: dataObj,
        writeAllFields: true,
        fields: [

            { headerTemplate: "파일이름" 	 ,align:"center"	, name: "filename"		,align:"left" 	, type: "text"		, width: 30 },
            { headerTemplate: "파일경로" 	 ,align:"center"	, name: "file_path"	 	,align:"left" 	, type: "text"		, width: 70 },
            { headerTemplate: "파일사이즈"  ,align:"center"	, name: "file_size"						,type: "number"		, width: 20 },
        	{ headerTemplate:"제외"	    ,align:"center"	,name: "file_idx"	,align:"center"		,type:"text"   ,itemTemplate: function(item) {
        		return $("<button>").attr("type", "button").text("제외등록").on("click", function btnClick() {
        			$('#file_idx_modal').val(item);
        			console.log(item);
        			$('#modalOpenButton').click();
        		})
            }, width: 20},

        ],
    });
}

function rsn(){

	var sendDate = {
			exclude_idx:$('#file_idx_modal').val(),
			exclude_rsn:$('#rsn').val(),
			file_name:$('#search_view_text').val(),
		    c_date:$('#c_date').val(),
		    repo_idx:$('#searchVal').val()
	}

	$.ajax({
	    url: "insertExcludeFile", 
	    data: sendDate,
	    type: "POST",                                                  
	    success: function(data){
	    	$('#rsn_dia_close').click();
	    	makeGrid("jsGrid1",data);
	    }

	});
}
