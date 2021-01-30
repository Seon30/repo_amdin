

$(document).ready(function(){
	$("#id").focus();
	if($('#errMsg').val()!=""){
		$('#alertModalMsg').text($('#errMsg').val());
		$('#alertModal').modal();
	}
	moveLogin.initPage();
})

var moveLogin={
	initPage:function(){
		moveLogin.defineEvent();
	},
	defineEvent:function(){
		$('#pw_dia_inqr').on('click',function(e){
			$.ajax({
			    url: "pwResetReq", 
			    data: {emp_no:$('#pw_emp_no').val(),emp_email:$('#pw_emp_email').val()},
			    type: "POST",                                                  
			    success: function(data){
			    	alert(data.MSG);
			    	if(data.key=="OK"){
			    		$('#pw_dia_close').click();
			    	}
			    }
			})
		}); 
	}
}
