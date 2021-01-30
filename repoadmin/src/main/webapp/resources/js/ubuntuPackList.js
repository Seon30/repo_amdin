
$(document).ready(function(){
	ubuntuPackList.initPage();
})

var ubuntuPackList={
	initPage:function(){
		ubuntuPackList.defineEvent();	
		ubuntuPackList.defineGrid();
		ubuntuPackList.initData();
	},
	defineGrid:function(){
		
	},
	initData:function(){
		allPackageList();
	},
	defineEvent:function(){
		
	},

}

function allPackageList(){
	$.ajax({
	    url: "allPackageList",
	    type: "POST",                             
	    data: {  
					version:$("#version").val()
			    	},
		dataType: "json",	    	
	    success: function(data){
	    	packListGrid("showPackList",data);
	    	console.log("versionList >>> " + JSON.stringify(data));

	    }
	})
}

function packListGrid(gridId,dataObj){

	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [
            { headerTemplate:"Package Name" ,align:"center" ,name: "package_list"	,type: "text"	,align:"left",  width: 100 },
            { headerTemplate:"Description" 	,align:"center" ,name: "package_1row_desc"	,type: "text"	,align:"left",  width: 100 },
            { headerTemplate:"version" 		,align:"center" ,name: "version"	,visible: false	,  width: 100 },
            { headerTemplate:"package_idx" 	,align:"center" ,name: "package_idx"	,visible: false	,  width: 100 }
        ],
		rowClick: function(args) {
		    console.log(args)
		    var getData = args.item;
		    var keys = Object.keys(getData);
        	$("#idx").val(getData['idx']);
        	$('#packDesc_form').submit();
		}
	});
}
