$(document).ready(function(){
	excludeList.initPage();
//	headerJs.rightSidebar();
})
var excludeList={
	initPage:function(){	
		excludeList.defineEvent();
		excludeList.initData();			
		excludeList.defineGrid();			
	},
	defineGrid:function(){
		//2. 그리드 함수 추가 
//		fileSearch();
	},
	initData:function(){
		fileSearch();
	},
	defineEvent:function(){
		//이벤트 정의
		$("#inputText").keydown(function(key) {
            if (key.keyCode == 13) {
            	fileSearch();
            }
        });	
		
		$('#rsn_send').on('click',function(){
			rsn();
		})

	},
}
//1. 테이블 그리드 0생성 함수 작성
//2. 테이블 데이터 조회용 ajax 작성
//3. initData 에 2번 함수 default - 어떤 리파지토리 조회 인지만 컨트롤러로 데이터 넘기기 ex) url : searchRepo   sendData : {repo : centOS7}
//4. 3에서 ajax 데이터 정상 수신시 1 에서 작성한 그리드 테이블에 데이터 넣기 usermanage.js 참고

function fileSearch(){
	$.ajax({
	    url: "ecxludeFileSearch",  	    
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
	$("#"+gridId).jsGrid({
        height: "600px",
        width: "100%",
 
        sorting: true,
        paging: true,
        data: dataObj,
        writeAllFields: true,
        fields: [

        	{ headerTemplate:"파일 이름"   ,align:"center"   ,name: "filename"		,align:"left"     ,type:"text"   ,width: 30},
        	{ headerTemplate:"제외 사유"   ,align:"center"   ,name: "exclude_rsn"	,align:"left" 	  ,type:"text"   ,width: 50},
        	{ headerTemplate:"제외 등록 "	    ,align:"center"   ,name: "file_idx"	    ,type:"text"   ,itemTemplate: function(item) {
        		return $("<button>").attr("type", "button").text("삭제").on("click", function btnClick() {
        			$('#file_idx_modal').val(item);
        			$('#modalOpenButton').click();
        		})
            }, width: 20},

        ],

    });
}


function rsn(){
	
	var sendDate = {
			file_idx:$('#file_idx_modal').val(),
			exclude_rsn:$('#rsn').val(),
	}

	$.ajax({
	    url: "deleteExclude", 
	    data: sendDate,
	    type: "POST",                                                  
	    success: function(data){
	     $('#rsn_dia_close').click();
	     makeGrid("jsGrid1",data);
	    
	    }

	 });
}

