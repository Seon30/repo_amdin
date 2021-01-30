

$(document).ready(function(){
	userManage.initPage();
})

var userManage={
	initPage:function(){
		userManage.defineGrid();
		userManage.initData();
		userManage.defineEvent();	
		
	},
	defineGrid:function(){
		inqury();
	},
	initData:function(){
		
	},
	defineEvent:function(){
	},

}
function inqury(){
	$.ajax({

	    url: "updateListSearch", 

	    data: { },             

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
           	{ headerTemplate:"업데이트시작"		 , name: "c_date_s"		     ,type: "number"	 , align: "left"      , width: 100 	},
        	{ headerTemplate:"업데이트종료"		 , name: "c_date_e"		 	 ,type: "number"	 , align: "left"  	  , width: 100 	},
            { headerTemplate:"리포지토리 명" 	 , name: "repo_name"		 ,type: "number"     , align: "center"    , width: 100 	},
            { headerTemplate:"업데이트 파일 개수"	 , name: "upld_file_cnt"	 ,type: "number" 	 , width: 100 },
            { headerTemplate:"업데이트 파일 크기"	 , name: "upld_file_size"    ,type: "number" 	 , width: 100 }
        ]
	
	
    });
}
