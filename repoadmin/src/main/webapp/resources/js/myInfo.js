var alertText = "" ;
var passChecker = false;


$(document).ready(function(){
	$("#emp_pw_old").focus();
	myInfo.initPage();
})

var myInfo={
	initPage:function(){
		myInfo.defineEvent();
	},
	defineGrid:function(){
	
	},
	initData:function(){
		
	},
	defineEvent:function(){

		$('#emp_pw_new_valid').on('change keyup paste',function(e){
			newPassValid();
		});
		$('input').on('keyup',function(e){
			if(e.keyCode == 13){
				changePw();
			 }
		})
	},

}
function changePw(){
	if(!validateChangePw()){
		$('#alertModalMsg').text($('#alertText').val());
		$('#alertModal').modal();
	}else{
		var sendData = {
				emp_no:$('#emp_no').val()
				,emp_pw_old:$('#emp_pw_old').val()
		    	,emp_pw_new:$('#emp_pw_new').val()
				,emp_pw_new_valid:$('#emp_pw_new_valid').val()
		    };
		$.ajax({
		    url: "changePw", 
		    data:sendData,
		    type: "POST",    
		    async: false,
		    success: function(data){
		    	if(data.MSG!="OK"){
		    		$('#'+data.ID).focus();
		    		alert(data.MSG);
		    	}else{
		    		alert("바뀐 비밀번호로 로그인 하여 주세요.");
		    		location.href="logoutAction";
		    	}
		    }
		})
	}
}

function validateChangePw(){
	var returnValueB = true;
	var no = $("#emp_no").val();
	var oldPw = $("#emp_pw_old").val();
	var newPw = $("#emp_pw_new").val();
	var newPwValid = $("#emp_pw_new_valid").val();
	var reg = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,20}$/;

	if ("" == oldPw) { 
		$('#alertModalMsg').text( "기존 비밀번호를 입력해주세요.");
		$('#alertModal').modal();
//		alertText = "기존 비밀번호를 입력해주세요.";
		return false;
	} 
	
	else if ("" == newPw) {
		$('#alertModalMsg').text("새로운 비밀번호를 입력해주세요.");
		$('#alertModal').modal();
//		alertText = "새로운 비밀번호를 입력해주세요.";
		return false;
	}
	
	else if (newPw.search(no)> -1) { 
		$('#alertModalMsg').text("비밀번호에 아이디가 포함되어 있습니다.");
		$('#alertModal').modal();
//		alertText = "비밀번호에 아이디가 포함되어 있습니다.";
		return false;	
	}
	
	else if (newPw == oldPw) { 
		$('#alertModalMsg').text("새로운 비밀번호가 기존 비밀번호와 일치합니다.");
		$('#alertModal').modal();
//		alertText = "새로운 비밀번호가 기존 비밀번호와 일치합니다.";
		return false;	
	}
	
	else if (false === reg.test(newPw)){ 
		$('#alertModalMsg').text( "비밀번호는 8~20자리이며 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.");
		$('#alertModal').modal();
//		alertText = "비밀번호는 8~20자리이며 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.";
		return false;	
	}
		
	else if ("" == newPwValid) {
		$('#alertModalMsg').text("새로운 비밀번호 재확인을 입력해주세요.");
		$('#alertModal').modal();
//		alertText = "새로운 비밀번호 재확인을 입력해주세요.";
		return false;	
	}
		
	else if(!newPassValid()){
		$('#alertModalMsg').text("패스워드가 일치하지 않습니다.");
		$('#alertModal').modal();
//		alertText = "패스워드가 일치하지 않습니다."
		return false;
	}	
	
		return returnValueB;
}	

function newPassValid(){
	var checkValid = false;
	if($('#emp_pw_new').val() != $('#emp_pw_new_valid').val()){
		$('#newPassValid').css("color","red");
		$('#newPassValid').html("비밀번호가 일치하지 않습니다.");
		alertText = "비밀번호가 일치하지 않습니다.";
		checkValid = false;
	}else{
		$('#newPassValid').css("color","blue");
		$('#newPassValid').html("비밀번호가 일치합니다.");
		alertText = "비밀번호가 일치합니다.";
		checkValid = true;
	}
	return checkValid;
}