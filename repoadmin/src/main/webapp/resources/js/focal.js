
$(document).ready(function(){
	focal.initPage();
})

var focal={
	initPage:function(){
		focal.defineEvent();	
		focal.defineGrid();
		focal.initData();
	},
	defineGrid:function(){
		
	},
	initData:function(){
		getCent7desc();
	},
	defineEvent:function(){
		
	},

}



function getCent7desc(){
	$.ajax({
	    url: "getCentOS7Detail",
	    type: "POST",                             
	    data: {  
					pkgkey:$("#pkgkey").val()
					,table_type : $("#table_type").val()
			    	},
		dataType: "json",	    	
	    success: function(data){
	    	console.log("description >>> " + JSON.stringify(data.onlydesc));

	    	cent7desc1Grid("cent7desc1Grid",data.desc1);
	    	cent7descGrid("cent7descGrid",data.description);
	    	cent7onlydescGrid("cent7onlydescGrid",data.onlydesc);
	    	cent7requiresGrid("cent7requiresGrid",data.requires);
	    	cent7providesGrid("cent7providesGrid",data.provides);
	    	cent7conflictsGrid("cent7conflictsGrid",data.conflicts);
	    	cent7obsoletesGrid("cent7obsoletesGrid",data.obsoletes);
	    	cent7filepathGrid("cent7filepathGrid",data.filepath);
	    	cent7changelogGrid("cent7changelogGrid",data.changelog);
	    	
	    }
	})
}

//0. desc
function cent7desc1Grid(gridId,dataObj){

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
function cent7descGrid(gridId,dataObj){
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
function cent7onlydescGrid(gridId,dataObj){

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
function cent7requiresGrid(gridId,dataObj){

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
function cent7providesGrid(gridId,dataObj){
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
function cent7conflictsGrid(gridId,dataObj){
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
function cent7obsoletesGrid(gridId,dataObj){
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
function cent7filepathGrid(gridId,dataObj){
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
		
		
//7. Changelog
function cent7changelogGrid(gridId,dataObj){
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