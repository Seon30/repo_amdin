$(document).ready(function(){
	userRepoManage.initPage();
	fileTreeListSearch();
})
var data_idx = {};
var userRepoManage={
	initPage:function(){	
//		fileTreeListSearch();
		userRepoManage.defineEvent();
	},
	defineGrid:function(){
	},
	initData:function(){
	},
	defineEvent:function(){
		$('#repo_dia_inqr').on('click',function(e){
			createUserDirectoryRepo();
		}); 
		$('#file_dia_inqr').on('click',function(e){
			updateUserRepoPackFiles();
		})
		$('#inner_file_dia_inqr').on('click',function(e){
			updateUserRepoFiles();
		})
		$('#down_file_dia_inqr').on('click',function(e){
			downloadFiles();
		})
		$('#ex_file_dia_inqr').on('click',function(e){
			excludeUserRepoFiles();
		})
		$('#del_file_dia_inqr').on('click',function(e){
			delUserRepoFiles();
		})
	},

}

function downloadFiles(){
	$.ajax({
	    url: "fileDownChecker",      
	    type: "POST",                             
	    data: {
	    	repo_idx:0,
	    	file_idx:$('#ex_file_idx').val()},
	    dataType: "json",    
	    async : false,
	    success: function(data){
	    	if(data.key=="Y"){
	    		location.href="/fileDownLoad?repo_idx=0&file_idx=" + $('#ex_file_idx').val() +"&down_prog_id=M";
	    	}else{
	    		alert("파일이 존재하지 않습니다.");
	    	}
	    }
	})
}

function fileTreeListSearch(){
	$.ajax({
	    url: "userRepoMngSearch",      
	    type: "POST",
	    dataType: "json",    
	    async : false,
	    success: function(data){
    		makerepoGrid("repoGrid",data);
    		
	    }
	})
}
function makerepoGrid(gridId,dataObj){
	$("#"+gridId).jsGrid({
        height: "200px",
        width: "100%",
        sorting: false,
        paging: true,
        data: dataObj,
        fields: [
            {headerTemplate:"",align:"center" ,name: "user_repo_name"	, type: "text"		,  width: 100 }
        ],
		rowClick: function(args) {
			$('#repo_pack_idx').val(args.item.user_repo_idx);
			$('#repo_name').val(args.item.user_repo_name);
			
			retrievePackGrid($('#repo_pack_idx').val());
		}
	});
}
function retrievePackGrid(repo_idx){
	$.ajax({
	    url: "userPackMngSearch",      
	    type: "POST",
	    data:{user_repo_idx:repo_idx},
	    dataType: "json",    
	    async : false,
	    success: function(data){
    		makePackGrid("packGrid",data);
	    }
	});
}

function makePackGrid(gridId,dataObj){
	$("#"+gridId).jsGrid({
        height: "200px",
        width: "100%",
        sorting: false,
        paging: true,
        data: dataObj,
        fields: [
            {headerTemplate:"",align:"center" ,name: "user_pack_name"	, type: "text"		,  width: 100 }
        ],
		rowClick: function(args) {
			$('#inner_pack_idx').val(args.item.user_pack_idx);
			$('#inner_repo_name').val(args.item.pack_full_path);
			
			retrieveFileGrid($('#inner_pack_idx').val());
		}
	});
}
function retrieveFileGrid(pack_idx){
	$.ajax({
	    url: "userFileMngSearch",      
	    type: "POST",
	    data:{user_pack_idx:pack_idx},
	    dataType: "json",    
	    async : false,
	    success: function(data){
	    	makeFileGrid("fileGrid",data);
	    }
	});
}
function makeFileGrid(gridId,dataObj){
	$("#"+gridId).jsGrid({
        height: "200px",
        width: "100%",
        sorting: false,
        paging: true,
        data: dataObj,
        fields: [
            {headerTemplate:"",align:"center" ,name: "file_name"	, type: "text"		,  width: 100 }
        ],
		rowClick: function(args) {
			console.log("check data >> " + JSON.stringify(args.item));
			$('#ex_file_path').val(args.item.file_full_name);
			$('#ex_file_name').val(args.item.file_name);
			
			$('#ex_file_idx').val(args.item.user_file_idx);
			$('#ex_file_key').val(args.item.is_exclude);
			$('#ex_user_repo_idx').val(args.item.user_repo_idx);
			
			var exclud_text = "";
			if(args.item.is_exclude=="N"){
				$('#exclude_rsn').removeAttr("disabled");
				$('#ex_file_dia_inqr').html("제외등록");
			}else{
				exclud_text = args.item.exclude_rsn
				$('#exclude_rsn').attr("disabled",true);
				$('#ex_file_dia_inqr').html("제외등록삭제");
			}
			$('#exclude_rsn').val(exclud_text);
			$('#popup_file_click').click();
		}
	});
}

function createUserDirectoryRepo(){
	var c_repo_name = $('#c_repo_name').val().replace(/ /gi,"_");
	$('#c_repo_name').val(c_repo_name);
	
	$.ajax({
	    url: "createUserRepo", 
	    data: {c_repo_name:$('#c_repo_name').val()},
	    type: "POST",                                                  
	    success: function(data){
	    	alert(data.MSG);
	    	if(data.KEY=="Y"){
	    		$('#repo_dia_close').click();
	    		$('.modal-backdrop').detach();
	    		fileTreeListSearch();
	    	}
	    }
	})
}
function addPackageFunction(obj){
	$('#repo_name').val(obj.id);
	$('#c_pack_name').val("");
	
	var agent = navigator.userAgent.toLowerCase();
	if ( (navigator.appName == 'Netscape' && navigator.userAgent.search('Trident') != -1) || (agent.indexOf("msie") != -1) ){
	    $("#uploadFile").replaceWith( $("#uploadFile").clone(true) );
	} else {
	    $("#uploadFile").val("");
	}
}
function addFileFunction(obj){
	$('#inner_repo_name').val(obj.name);
	$('#inner_pack_name').val(obj.id);
	
	var agent = navigator.userAgent.toLowerCase();
	if ( (navigator.appName == 'Netscape' && navigator.userAgent.search('Trident') != -1) || (agent.indexOf("msie") != -1) ){
	    $("#inner_uploadFile").replaceWith( $("#inner_uploadFile").clone(true) );
	} else {
	    $("#inner_uploadFile").val("");
	}
	
}

function updateUserRepoPackFiles(){
	if($('#c_pack_name').val()==""){
		alert("패키지명을 입력해 주세요.");
		return;
	}
	
	var pack_name = $('#c_pack_name').val().replace(/ /gi,"_");
	$('#c_pack_name').val(pack_name);
	
	var formData = new FormData();
	formData.append("repo_idx",$('#repo_pack_idx').val());
	formData.append("c_pack_name",pack_name);

	$.ajax({
		url : "createPackages",
		processData : false,
		contentType : false,
		async : false,
		data : formData,
		type : "POST",
		success : function(data){
			alert(data.MSG);
	    	if(data.KEY=="Y"){
	    		$('#file_dia_close').click();
	    		$('.modal-backdrop').detach();
	    		retrievePackGrid($('#repo_pack_idx').val());
	    	}
		}
	})
}
function updateUserRepoFiles(){
	var fileformData = new FormData();
	var inputFile = $("#inner_uploadFile");
	var files = inputFile[0].files;
	
	fileformData.append("package_idx",$('#inner_pack_idx').val()); // 선택한 user_pack_idx
	
	if(files.length ==0){
		alert("파일을 등록하여 주세요.");
		return;
	}
	for(var i =0; i < files.length; i++){
		fileformData.append("uploadFile",files[i]);
	}
	
	$.ajax({
		url : "uploadUserPackages",
		processData : false,
		contentType : false,
		async : false,
		data : fileformData,
		type : "POST",
		success : function(data){
			alert(data.MSG);
	    	if(data.KEY=="Y"){
	    		$('#inner_file_dia_close').click();
	    		$('.modal-backdrop').detach();
	    		retrieveFileGrid($('#inner_pack_idx').val());
	    		
	    	}
		}
	})
}
function excludeUserRepoFiles(){
	if($('#exclude_rsn').val()==""){
		if($('#ex_file_key').val()=="N"){
			alert("제외등록 사유를 입력하여 주세요.");
			return ;
		}
	}
	
	$.ajax({
		url : "excludeUserFile",
		dataType: "json",
		data : {
				fild_idx:$('#ex_file_idx').val(),
				exclude_rsn:$('#exclude_rsn').val(),
				exclude_key:$('#ex_file_key').val()},
		type : "POST",
		success : function(data){
			alert(data.MSG);
	    	if(data.KEY=="Y"){
	    		$('#ex_file_dia_close').click();
	    		$('.modal-backdrop').detach();
	    		retrieveFileGrid($('#inner_pack_idx').val());
	    	}
		}
	})
} 
function delUserRepoFiles(){
	$.ajax({
		url : "delUserFile",
		dataType: "json",
		data : {fild_idx:$('#ex_file_idx').val()},
		type : "POST",
		success : function(data){
			alert(data.MSG);
	    	if(data.KEY=="Y"){
	    		$('#ex_file_dia_close').click();
	    		$('.modal-backdrop').detach();
	    		retrieveFileGrid($('#inner_pack_idx').val());
	    	}
		}
	});
}