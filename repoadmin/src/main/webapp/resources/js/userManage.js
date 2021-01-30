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
		searchClick();
	},
	initData:function(){
		
	},
	defineEvent:function(){
		$("#search_view_text").keydown(function(key) {
            if (event.keyCode == 13) {
            	searchClick();
            }
        });
		$("#updateLvl").change(function(){
			updateData($('#inputText').val(),"lvl",$("#updateLvl").val());
		});
	},

}
function searchClick(){
	$.ajax({

	    url: "userManageSearch", 

	    data: { searchType: $('#searchVal').val()
	    		,searchText: '%'+$('#inputText').val()+'%'
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
        	
            { headerTemplate:"아이디" 	,align:"center"		,name: "emp_no"		,align:"center"		,type: "text", width: 70 },
            { headerTemplate:"이름"		,align:"center"		,name: "emp_nm"		,align:"center"		,type: "text", width: 70 },
            { headerTemplate:"권한등급"	,align:"center"		,name: "emp_lvl"	,align:"center"		,type: "text", itemTemplate: function(item) {
            	if(item == "0"){
            		return $("<button>").attr("type", "button").text("요청승인").on("click", function btnClick() {
            			var con_test = confirm("가입을 승인 하시겠습니까?");
            			if(con_test==true){
            				updateData($(this),"lvl","01");
            				
            				alert("가입이 승인되었습니다.");
            			}
            			else{
            				alret("승인취소");
            			}
                    });
            	}else{
            		var returnValue = "승낙전";
            		if(item == 01){
            			returnValue = "일반회원";
            		}else if(item ==99){
            			returnValue = "관리자";
            		}
            		return returnValue;
            	}
            }, width: 70},
           

            { headerTemplate:"비밀번호초기화"   ,align:"center"		,name: "pw_req_yn"	, type: "text", itemTemplate: function(item) {
            	if(item == "R"){
            		return $("<button>").attr("type", "button").text("요청승인").on("click", function pwbtnClick() {
            			var con_test = confirm("비밀번호 초기화 요청을 승인 하시겠습니까?");
            			if(con_test == true){
                				updateData($(this),"pw","PWTEXT");
                				
                				alert("비밀번호 초기값은 'Tlsgks2020!'입니다.");
            			}
                       
                    });
            	}else{
            		return item;
            	}
            }, width: 100}     
//            ,{ headerTemplate:"최종수정자"	 ,align:"center"	,name: "u_emp_no"	, type: "text", width: 70}
        ]
    });
}

function pwcon_test(){
	
}

function updateData(obj,type,value){
	var empNo = obj.parent().parent().children().eq(0).text();
	$.ajax({

	    url: "userManageUpdate", 

	    data: { emp_no:empNo,
	    		type:type,
	    		val:value},             

	    type: "POST",                                                  
	    success: function(data){
	    	searchClick();
	    }
	})
}
function updatePw(){
	updateData($('#inputText').val(),"pw","dumi");
}