
$(document).ready(function(){
	centOS8desc.initPage();
})

var centOS8desc={
	initPage:function(){
		centOS8desc.defineEvent();	
		centOS8desc.defineGrid();
		centOS8desc.initData();
	},
	defineGrid:function(){
		
	},
	initData:function(){
		getCent8desc();
	},
	defineEvent:function(){
		
	},

}



function getCent8desc(){
	$.ajax({
	    url: "getCentOS8Detail",
	    type: "POST",                             
	    data: {  
					pkgkey:$("#pkgkey").val()
					,table_type : $("#table_type").val()
			    	},
		dataType: "json",	    	
	    success: function(data){
	    	console.log("description >>> " + JSON.stringify(data.onlydesc));

	    	cent8desc1Grid("cent8desc1Grid",data.desc1);
	    	cent8descGrid("cent8descGrid",data.description);
	    	cent8onlydescGrid("cent8onlydescGrid",data.onlydesc);
	    	cent8requiresGrid("cent8requiresGrid",data.requires);
	    	cent8providesGrid("cent8providesGrid",data.provides);
	    	cent8conflictsGrid("cent8conflictsGrid",data.conflicts);
	    	cent8obsoletesGrid("cent8obsoletesGrid",data.obsoletes);
	    	cent8filepathGrid("cent8filepathGrid",data.filepath);
	    	cent8changelogGrid("cent8changelogGrid",data.changelog);
	    	
	    }
	})
}

//0. desc
function cent8desc1Grid(gridId,dataObj){

	$("#"+gridId).jsGrid({
        height: "100px",
        width: "100%",
        sorting: true,
        paging: true, 
        data: dataObj,
        fields: [       	
            { headerTemplate:"" 	       	   ,name: "desc1"			, type: "text", width: 100 }
        ],
	});
}	

//1. Description
function cent8descGrid(gridId,dataObj){
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
//	console.log(JSON.stringify(tempArr));
	
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


//1-3. onlydesc
function cent8onlydescGrid(gridId,dataObj){

	$("#"+gridId).jsGrid({
        height: "122px",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [       	
            { headerTemplate:"" 	       	   ,name: "onlydesc"			, type: "text", width: 100 }
        ],
	});
}	

//2. Requires
function cent8requiresGrid(gridId,dataObj){

	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        pagingpos: 'center',  //페이징 위치
        data: dataObj,
        fields: [       	
            { headerTemplate:"Name" 	 ,align:"center"      	   ,name: "name"	,align:"left" 		, type: "text", width: 100 },
            { headerTemplate:"Value" 	 ,align:"center" 		   ,name: "value"	,align:"left" 		, type: "text", width: 100 }
        ],
	});
}	

//3. Provides
function cent8providesGrid(gridId,dataObj){
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [       	
            { headerTemplate:"Name" 	 ,align:"center"      	   ,name: "name"	,align:"left" 		, type: "text", width: 100 },
            { headerTemplate:"Value" 	 ,align:"center" 		   ,name: "value"	,align:"left" 		, type: "text", width: 100 }
        ],
	});			
}			
	
//4. Conflicts
function cent8conflictsGrid(gridId,dataObj){
	$("#"+gridId).jsGrid({
        height: "123px",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [       	
            { headerTemplate:"Name" 	 ,align:"center"      	   ,name: "name"	,align:"left" 		, type: "text", width: 100 },
            { headerTemplate:"Value" 	 ,align:"center" 		   ,name: "value"	,align:"left" 		, type: "text", width: 100 }
        ],
	});	
}	

//5. Obsoletes
function cent8obsoletesGrid(gridId,dataObj){
	$("#"+gridId).jsGrid({
		height: "123px",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [       	
            { headerTemplate:"Name" 	 ,align:"center"      	   ,name: "name"	,align:"left" 		, type: "text", width: 100 },
            { headerTemplate:"Value" 	 ,align:"center" 		   ,name: "value"	,align:"left" 		, type: "text", width: 100 }
        ],
	});
}	

//6. FilesPath
function cent8filepathGrid(gridId,dataObj){
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [       	
            { headerTemplate:"Path" 	,align:"center"        	 ,name: "path"		,align:"left"	, type: "text", width: 100 },
        ],
	});
}	
		
		
//8. Changelog
function cent8changelogGrid(gridId,dataObj){
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [       	
            { headerTemplate:"changelog" 	,align:"center"        	  ,name: "changelog"	,align:"left"		, type: "text", width: 100 },
        ],
	});

}