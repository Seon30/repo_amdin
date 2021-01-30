$(document).ready(function(){
	repoUpdate.initPage();
})

var repoUpdate={
	initPage:function(){
		repoUpdate.defineGrid();
		repoUpdate.initData();
		repoUpdate.defineEvent();	
		
	},
	defineGrid:function(){
		
	},
	initData:function(){
		
	},
	defineEvent:function(){
		$("#pythonSizeCountUpBtn").on('click',function(){
			pythonSizeUp();
		})
	}
	

}

function pythonSizeUp(){
	$.ajax({
	    url: "updatePythonRepo",      
	    type: "POST",                             
	    dataType: "json",    
	    success: function(data){
	    	if(data==true){
	    		
	    		$('#alertModalMsg').text("업데이트가 완료되었습니다.");
	    		$('#alertModal').modal();	    	
	    	}
	    }
	    
	})
	}
	

