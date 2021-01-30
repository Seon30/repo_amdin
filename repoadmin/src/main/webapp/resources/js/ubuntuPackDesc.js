
$(document).ready(function(){
	ubuntuPackDesc.initPage();
})

var ubuntuPackDesc={
	initPage:function(){
		ubuntuPackDesc.defineEvent();	
		ubuntuPackDesc.defineGrid();
		ubuntuPackDesc.initData();
	},
	defineGrid:function(){
		
	},
	initData:function(){
		packageDesc();
	},
	defineEvent:function(){
		
	},

}

function packageDesc(){
	$.ajax({
	    url: "packageDesc",
	    type: "POST",                             
	    data: {  
					version:$("#idx").val()
			    	},
		dataType: "json",	    	
	    success: function(data){
	    	packDescGrid("showPackDesc",data);
	    	console.log("versionList >>> " + JSON.stringify(data));

	    }
	})
}

function packDescGrid(gridId,dataObj){

	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [
            { headerTemplate:"Package Name" ,align:"center" ,name: "package_priority"	,type: "text"	,align:"left",  width: 100 },
            { headerTemplate:"Description" 	,align:"center" ,name: "package_installed_size"	,type: "text"	,align:"left",  width: 100 },
            { headerTemplate:"version" 		,align:"center" ,name: "package_download_size"	,type: "text"	,align:"left",  width: 100},
            { headerTemplate:"package_idx" 	,align:"center" ,name: "package_desc",type: "text"	,align:"left",  width: 100}
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
