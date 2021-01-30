var repo_static_idx = "";
var conf_static_idx = "";
var checked_conf_id = "";

$(document).ready(function(){
	conf.initPage();
})

var conf={
	initPage:function(){
		conf.defineEvent();	
		conf.defineGrid();
		conf.initData();
	},
	defineGrid:function(){
		searchClick();
	},
	initData:function(){
		
	},
	defineEvent:function(){
			$('input[name="conf_name_input"]').on('click',function(e){
				var target_idx = $(this).attr("id")+"_idx";
				target_idx = $('#' + target_idx).val() ; 
				newBtn("N");
				confAll(target_idx);
			}); 
			$("#new_btn").on('click',function(e){
				newBtn("Y");
				
			});
			$(".confList").on('click',function(e){
				conf_static_idx = $(this).attr("id");
				searchConfName();
			});
			$("#changeConf").on('click',function(e){
				
				updateConf(checked_conf_id);
			});
			$('#save_btn').on('click',function(e){
				newConf();
			});
			
			
			
			$("input[name=searchConfFiles]").keydown(function(key) {
	            if (key.keyCode == 13) {
	            	nameSearch();
	            	confFileNameSearch();	        		
	            }
	        });	searchConfFile
			$('#searchConfFile').on('click',function(e){
				nameSearch();
            	confFileNameSearch();
			});
	},

}

function nameSearch(key){
	if($("#secrchConfName")){
		$("#jsGrid3").hide();
		$("#secrchConfName").show("fast");
		$("#jsGrid3").hide();
	}
}	
	

function newBtn(key){
	$("#conf_name").val("");
	$("#conf_body").val("");
	$("#conf_desc").val("");
	
	if(key=="Y"){
		$("#conf_name").removeAttr("readonly");
    	$("#conf_body").removeAttr("readonly");
    	$("#conf_desc").removeAttr("readonly");
    	
    	$("#new_btn").css("display","none");
    	$("#save_btn").css("display","block"); 	
	}else{
		$("#conf_name").attr("readonly",true); 
    	$("#conf_body").attr("readonly",true); 
    	$("#conf_desc").attr("readonly",true); 
    	
    	$("#new_btn").css("display","block");
    	$("#save_btn").css("display","none");
	}
}
function allInit(){
	repo_static_idx = "";
	conf_static_idx = "";
	checked_conf_id = "";
	$('#jsGrid1').trigger("reloadGrid");
	$('#jsGrid3').trigger("reloadGrid");
	
	newBtn("N");
}
function searchClick(){
	
	$.ajax({
	    url: "confSearch",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	makeGrid("jsGrid1",data);
	    }
	})
}
function makeGrid(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "200px",
        width: "100%",
 
        sorting: true,
        paging: true,
        data: dataObj,
 	 
        fields: [
        	
            { headerTemplate:"리포지토리 명"  ,align:"center"	,name: "repo_name"	,align:"left"	, type: "text", width: 100 }
            ],
        rowDoubleClick: function(row){
        	for(var i=1; i<6; i++){
        		$("#conf_0"+i).val("");
        		$("#conf_0"+i+"_idx").val("");
        	}
        	repo_static_idx = row.item.repo_idx;
        	 confdata(row.item.conf_01_nm,row.item.repo_conf01_idx,1);
        	 confdata(row.item.conf_02_nm,row.item.repo_conf02_idx,2);
        	 confdata(row.item.conf_03_nm,row.item.repo_conf03_idx,3);
        	 confdata(row.item.conf_04_nm,row.item.repo_conf04_idx,4);
        	 confdata(row.item.conf_05_nm,row.item.repo_conf05_idx,5);
        	 
        }
    });
	$("#"+gridId).find(".jsgrid-row").dblclick();
}

function confAll(conf_idx){

	$.ajax({

	    url: "confBody", 

	    data: { 
	    	conf_idx:conf_idx
	    //컨트롤러명칭과 동일해야함 : 
	    },             
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	$("#conf_name").val(data.conf_name);
	    	$("#conf_body").val(data.conf_body);
	    	$("#conf_desc").val(data.conf_desc);
	    }

	})
}

function makeGrid2(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "250px",
        width: "100%",
 
        sorting: true,
        paging: true,
        data: dataObj,
 	 
        fields: [
        	
            { headerTemplate:"리포지토리 명" 	,align:"center"   ,name: "conf_body"	,align:"left"	, type: "text", width: 100 }
            ],

    });
}


function makeGrid3(gridId,dataObj){
	checked_conf_id = "";
	$("#"+gridId).jsGrid({
        height: "250px",
        width: "100%",
 
        sorting: true,
        paging: true,
        data: dataObj,
 	 
        fields: [
        	
            { headerTemplate:"파일 이름" 	,align:"center"    ,name: "conf_name"	,align:"left"	, type: "text", width: 100 },
            { headerTemplate:"체크"		,align:"center"    ,name: "conf_idx"	,align:"center"	, type: "text", 
            	
            	itemTemplate: function(item) {
            		return $("<input>").attr("type", "checkbox").on("click", function check() {
            			var obj = $("input[type=checkbox]")
            		    for(var i=0; i < obj.length; i++){
            		        if(obj[i] != this){
            		            obj[i].checked = false;
            		        }

            		    }
            			checked_conf_id = item;
                    });

            }, width: 40 }
            
            ],


    });
}

function confdata(data1,data2,id) {
	if(data1==null){
		data1="";
	}
	$("#conf_0"+id).val(data1);
	$("#conf_0"+id+"_idx").val(data2);
	
}

function searchConfName(){
	$.ajax({
	    url: "confName",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	makeGrid3("jsGrid3",data);
	    }
	})
}



function newConf(){

	$.ajax({
	    url: "confInsert", 
	    data: { 
	        conf_name:$('#conf_name').val()
	       ,conf_body:$('#conf_body').val()
	       ,conf_desc:$('#conf_desc').val()
	       ,c_emp_no:$('#c_emp_no').val()
	       ,u_emp_no:$('#u_emp_no').val()
	    },             
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
//	    	console.log(JSON.stringify(data));
	     	allInit();
	    	searchClick();
	    }

	})
}



function updateConf(conf_idx){
	 
	$.ajax({
		
		url: "confUpdate",
	    data: { 
	    	repo_idx:repo_static_idx,
	    	conf_static_idx:conf_static_idx,
	    	conf_idx:checked_conf_id
	    //컨트롤러명칭과 동일해야함 : 변수명
	    },             
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
//	    	console.log("return data >>>> " + JSON.stringify(data));
//	    	console.log(JSON.stringify(data));
//	    	console.log("수정하기이이이이");
	    	$("#changeConfClose").click();
	    	allInit();
	    	searchClick();
	    }

	})
}



function confFileNameSearch(){
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
			conf_idx:$('#conf_idx').val(),
			conf_name:$('#search_view_text').val(),
		    c_date:$('#c_date').val(),
	}
	$.ajax({
	    url: "confFileSearch", 
	    
	    data: sendDate,   
	    
	    type: "POST",
	    
	    dataType: "json",
	    
	    success: function(data){
	    	makeGrid4("searchConfName",data);
//	    	console.log(JSON.stringify(data));

	    }

	})
}


function makeGrid4(gridId,dataObj){
	checked_conf_id = "";
	$("#"+gridId).jsGrid({
        height: "250px",
        width: "100%",
 
        sorting: true,
        paging: true,
        data: dataObj,
 	 
        fields: [
        	
            { headerTemplate:"파일 이름" 	,align:"center"    ,name: "conf_name"	,align:"left"	, type: "text", width: 100 },
            { headerTemplate:"체크"		,align:"center"    ,name: "conf_idx"	,align:"center"	, type: "text", 
            	
            	itemTemplate: function(item) {
            		return $("<input>").attr("type", "checkbox").on("click", function check() {
            			var obj = $("input[type=checkbox]")
            		    for(var i=0; i < obj.length; i++){
            		        if(obj[i] != this){
            		            obj[i].checked = false;
            		        }

            		    }
            			checked_conf_id = item;
                    });

            }, width: 40 }
            
            ],


    });
}