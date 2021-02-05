
$(document).ready(function(){
	focalPackDesc.initPage();
})

var focalPackDesc={
	initPage:function(){
		focalPackDesc.defineEvent();	
		focalPackDesc.defineGrid();
		focalPackDesc.initData();
	},
	defineGrid:function(){
		
	},
	initData:function(){
		getPackdesc();
	},
	defineEvent:function(){
		
	},

}



function getPackdesc(){
	$.ajax({
	    url: "getUbuntuDetail",
	    type: "POST",                             
	    data: {  
					idx:$("#pkgkey").val()
					,table_type : $("#table_type").val()
					
			    	},
		dataType: "json",	    	
	    success: function(data){

	    	ubuntudescGrid("ubuntudescGrid",data.focal);

	    }
	})
}

////1. Description
//function ubuntudescGrid(gridId,dataObj){
//
//	$("#"+gridId).jsGrid({
//        height: "500px",
//        width: "100%",
//        sorting: true,
//        paging: true,
//        data: dataObj,
//        fields: [
//        	
//            { headerTemplate:"" 	,align:"center"        ,name:  "version" 	,align:"left"	, type: "text", width: 100 },
//
//           
//           
//
//        ],
//	});
//}	

//1. Description
function ubuntudescGrid(gridId,dataObj){
	var dataObjTemp = dataObj[0];
	var obj = Object.keys(dataObjTemp);
	var tempArr = [];
	var tempMap 
	for(var i = 0 ; i < obj.length; i++){
		if(dataObjTemp[obj[i]]!=null){
			tempMap ={
					"Property":obj[i],
					"Value":dataObjTemp[obj[i]]
			}
			console.log(i +" >>>>>>>"+obj[i] + " , " + dataObjTemp[obj[i]]);
			tempArr.push(tempMap);			
		}else{
			continue;
		}
	}
	//console.log(JSON.stringify(tempArr));
	
	$("#"+gridId).jsGrid({
	    height: "100%",
	    width: "100%",
	    sorting: true,
	    paging: true,
	    data: tempArr,
	    fields: [
	    	
	        { headerTemplate:"Property" 	,align:"center"        ,name: "Property" 	,align:"left"	, type: "text", width: 100 },
	        { headerTemplate:"Value" 		,align:"center"		   ,name: "Value"		,align:"left"	, type: "text", width: 100 }
	       
	       
	
	    ],
	});
	}	

