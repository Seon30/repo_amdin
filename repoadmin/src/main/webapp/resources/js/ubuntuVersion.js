
$(document).ready(function(){
	ubuntuVersion.initPage();
	
})

var ubuntuVersion={
	initPage:function(){
		ubuntuVersion.defineEvent();	
		ubuntuVersion.defineGrid();
		ubuntuVersion.initData();
	},
	defineGrid:function(){
		getVersion();
	},
	initData:function(){
		
	},
	defineEvent:function(){

	},

}

function getVersion(){
	console.log("version가져오기????");
	$.ajax({
	    url: "versionList",
	    type: "POST",                             
	    dataType: "json",                       
	    success: function(data){
	    	makeGridVersion("showVersion",data);
	    	
	    	console.log("versionList");
	    	
	    	console.log("versionList===="+JSON.stringify(data));
	    }
	})
}


function makeGridVersion(gridId,dataObj){
	
	$("#"+gridId).jsGrid({
        height: "100%",
        width: "100%",
        sorting: true,
        paging: true,
        data: dataObj,
        fields: [
            { headerTemplate:"Version" 	,align:"center" ,name: "version_name"	,type: "text"	,align:"left",  width: 100 },
            { headerTemplate:"version" 	,align:"center" ,name: "version"	,visible: false	,  width: 100 }
        ],
		rowClick: function(args) {
		    console.log(args)
		    var getData = args.item;
		    var keys = Object.keys(getData);
        	$("#version").val(getData['version']);
        	$('#packList_form').submit();
		}
	});
}
