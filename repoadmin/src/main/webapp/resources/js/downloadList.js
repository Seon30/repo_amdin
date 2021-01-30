$(document).ready(function(){
	downloadList.initPage();
})

var downloadList={
	initPage:function(){
		downloadList.defineGrid();
		downloadList.initData();
		downloadList.defineEvent();	
		
	},
	defineGrid:function(){
		downList();
	},
	initData:function(){
		
	},
	defineEvent:function(){
	},

}
function downList(){
	$.ajax({

	    url: "downloadListSearch", 

	    data: {
	    	
	    },             

	    type: "POST",                             

	    dataType: "json",                       
	    success: function(data){
	    	makeGrid("jsGrid1",data);
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
 	 
        fields: [
        	
//        	{ headerTemplate:"다운로드 idx"		,name: "down_idx"		, type: "text", width: 100 },
        	{ headerTemplate:"파일 이름" 		,align:"center"	,name: "filename"		,align:"left"	, type: "text", width: 100 },
//        	{ headerTemplate:"다운로드 IP"		,align:"center"	,name: "down_prog_id"	,align:"left"	, type: "text", itemTemplate: function(item){
//        		var returnvalue = "down_prog_id";
//        		item = "S";
//        		item = "M";
//        		if(item == "S"){
//        			returnvalue = "Repo Server";
//        		}else if(item =="M"){
//        			returnvalue = "Repo Master";
//        		}
//        		return returnvalue;
//        	}
//        		
//        	
//        		,width: 100 },
//        	{ headerTemplate:"다운로드 경로"	,align:"center"		,name: "down_ip"	,align:"left"	, type: "text", width: 100 },
        	{ headerTemplate:"다운로드 날짜"	,align:"center"		,name: "c_date"		,align:"left"	, type: "date", width: 100 },
        	{ headerTemplate:"리파지토리 명"	,align:"center"		,name: "reponame"	,align:"left"	, type: "text", width: 50 },
            { headerTemplate:"아이디"			,align:"center"		,name: "c_emp_no"	,align:"left"	, type: "text", width: 50 }
        ]
    });
}
