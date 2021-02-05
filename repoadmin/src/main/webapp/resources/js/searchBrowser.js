$(document).ready(function(){
	$("#search_view_text").focus();
	searchBrowser.initPage();
	
	$('#Progress_Loading').hide(); //첫 시작시 로딩바를 숨겨준다.
})

.ajaxStart(function(){
$('#Progress_Loading').show(); //ajax실행시 로딩바를 보여준다.

})

.ajaxStop(function(){
$('#Progress_Loading').hide(); //ajax종료시 로딩바를 숨겨준다.

});

var searchBrowser={
	initPage:function(){	
		searchBrowser.defineEvent();
		if($('#search_header_text').val()!=""||$('#c_date').val()!=""){
			searchBrowser.initData();			
		}else{
			searchBrowser.defineGrid();			
		}
	},
	defineGrid:function(){
		//2. 그리드 함수 추가 ;
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
		
		$('#down_send').on('click',function(){
			downloadFiles();
		});
		
	},

}

//1. 테이블 그리드 생성 함수 작성
//2. 테이블 데이터 조회용 ajax 작성
//3. initData 에 2번 함수 default - 어떤 리파지토리 조회 인지만 컨트롤러로 데이터 넘기기 ex) url : searchRepo   sendData : {repo : centOS}
//4. 3에서 ajax 데이터 정상 수신시 1 에서 작성한 그리드 테이블에 데이터 넣기 usermanage.js 참고

function fileSearch(){
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
			file_idx:$('#file_idx').val(),
			filename:$('#search_view_text').val(),
		    c_date:$('#c_date').val(),
		    repo_idx:$('#repo_idx').val()
	}
	$.ajax({
	    url: "fileSearch", 
	    
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
        height: "600px",
        width: "100%",
// 
        sorting: true,
        paging: true,
        data: dataObj,
 	 
        fields: [
        	
            { headerTemplate: "파일이름" 	 ,align:"center"	, name: "filename"		,align:"left" 	, type: "text"		, width: 30 },
            { headerTemplate: "파일경로" 	 ,align:"center"	, name: "file_path"	 	,align:"left" 	, type: "text"		, width: 70 },
            { headerTemplate: "파일사이즈"  ,align:"center"	, name: "file_size"						,type: "number"		, width: 20 },
            { headerTemplate: "다운로드"	 ,align:"center"    , name: "file_idx"		,align:"center" 	,itemTemplate: function(item) {
        		return $("<button>").attr("type", "button").text("다운").on("click", function btnClick(){	$('#file_idx_modal').val(item);
        										$('#modalOpenButton').click();
        		})
            },width: 20}
        ],
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