var alertText = "" ;
var passChecker = false;
var idCheckValue = false;

$(document).ready(function(){
	$("#emp_no").focus();
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
//		$('#emp_pw').on('change keyup paste',function(e){
//			passValid();
//		});
		$('#emp_pw_re').on('change keyup paste',function(e){
			passValid();
		});
		$('#id_validate_btn').on('click',function(e){
			idValidation();
		});
		$('#emp_no').on('change keyup paste',function(e){
    		$('#id_validate_btn').css('display','block');
    		$('#id_validate_text').css('display','none');
    		idCheckValue = false;
		})
		$('input').on('keyup',function(e){
			if(e.keyCode == 13){
				registinqr();
			 }
		})
	},

}
function registinqr(){
	if(!validatejoinUser()){
		$('#alertModalMsg').text($('#alertText').val());
		$('#alertModal').modal();
//		alert(alertText);
	}else{
		var sendData = { 
		    	emp_no:$('#emp_no').val()
		    	,emp_nm:$('#emp_nm').val()
		    	,emp_pw:$('#emp_pw').val()
		    	,emp_pw_re:$('#emp_pw_re').val()
				,emp_email:$('#emp_email').val()
		    };
		$.ajax({
		    url: "signUpValidation", 
		    data:sendData,
		    type: "POST",    
		    async: false,
		    success: function(data){
		    	if(data.MSG!="OK"){
		    		$('#'+data.ID).focus();
		    		alert(data.MSG);
		    	}else{
		    		alert("회원가입이 성공했습니다.");
		    		location.href="login";
		    	}
		    }
		})
	}
}

function validatejoinUser() {
	var returnValueB = true;
	
	var reg_no = /^[a-zA-Z0-9]{6,14}\s[a-zA-Z0-9]{6,14}$/;
	var reg_nm = /^[가-힣]{2,4}|[a-zA-Z]{2,10}|\s[a-zA-Z]{2,10}$/;
	var reg_pw = /^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,20}$/;
	var reg_email = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;
   


	if (!idCheckValue) {
		$('#alertModalMsg').text("아이디 중복체크를 해주시기 바랍니다");
		$('#alertModal').modal();
//		alertText = "아이디 중복체크를 해주시기 바랍니다."
		return false;
	}
	
	//이름
	else if ($('#emp_nm').val().length==0) { 
		$('#alertModalMsg').text("이름을 입력해주세요.");
		$('#alertModal').modal();
//		alertText = "이름을 입력해주세요.";
		return false;
	}
	
	else if (!reg_nm.test($('#emp_nm').val())) { 
		$('#alertModalMsg').text("이름은 2~4자리 이상 한글, 영문 대소문자만 가능합니다.");
		$('#alertModal').modal();
//		alertText = "이름은 2~4자리 이상 한글, 영문 대소문자만 가능합니다.";
		return false;	
	}
	
	//비번
	else if ($('#emp_pw').val().length==0) {
		$('#alertModalMsg').text("비밀번호를 입력해주세요.");
		$('#alertModal').modal();
//		alertText = "비밀번호를 입력해주세요.";
		return false;
	}	

	else if ($('#emp_pw').val().search($('#emp_no').val())> -1) { 
		$('#alertModalMsg').text("비밀번호에 아이디가 포함되어 있습니다.");
		$('#alertModal').modal();
//		alertText = "비밀번호에 아이디가 포함되어 있습니다.";
		return false;	
	}
	
	else if (!reg_pw.test($('#emp_pw').val())) { 
		$('#alertModalMsg').text("비밀번호는 8~20자리이며 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.");
		$('#alertModal').modal();
		
//		alertText = "비밀번호는 8~20자리이며 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.";
		return false;	
	}
		
	else if ($('#emp_pw_re').val().length==0) {
		$('#alertModalMsg').text("새로운 비밀번호 재확인을 입력해주세요.");
		$('#alertModal').modal();
//		alertText = "새로운 비밀번호 재확인을 입력해주세요.";
		return false;	
	}
		
	else if(!passValid()){
		$('#alertModalMsg').text("패스워드가 일치하지 않습니다.");
		$('#alertModal').modal();
//		alertText = "패스워드가 일치하지 않습니다."
		return false;
	}
	
	//이메일
	else if ($('#emp_email').val().length==0) {
		$('#alertModalMsg').text("이메일을 입력해주세요");
		$('#alertModal').modal();
//		alertText = "이메일을 입력해주세요.";
		return false;
	}	
	
	else if(!reg_email.test($('#emp_email').val())) {
		$('#alertModalMsg').text("올바르지 않은 이메일 형식 입니다.");
		$('#alertModal').modal();
//		alertText ="올바르지 않은 이메일 형식 입니다.";
		return false;
	}
	
	return returnValueB;
}

function passValid(){
	var checkValid = false;
	if($('#emp_pw').val() != $('#emp_pw_re').val()){
		$('#passvalid').css("color","red");
		$('#passvalid').html("비밀번호가 일치하지 않습니다.");
		checkValid = false;
	}else{
		$('#passvalid').css("color","blue");
		$('#passvalid').html("비밀번호가 일치합니다.");
		checkValid = true;
	}
	return checkValid;
}
function idValidation(){
	var reg_id = /^[A-za-z0-9]{6,14}/g;
	if($('#emp_no').val().length==0 || !reg_id.test($('#emp_no').val()) ||
			$('#emp_no').val().length <6 || $('#emp_no').val().length >14 )
	{
		$('#alertModalMsg').text("6~14자의 영문 대소문자, 숫자만 사용 가능합니다..");
		$('#alertModal').modal();
//		alert("6~14자의 영문 대소문자, 숫자만 사용 가능합니다..");
		return;
	}
	$.ajax({
	    url: "idValidation", 
	    data: {emp_no:$('#emp_no').val()},
	    type: "POST",                                                  
	    success: function(data){
	    	if(data>0){
	    		$('#alertModalMsg').text("이미 가입되어있는 아이디 입니다.");
	    		$('#alertModal').modal();
//	    		alert("이미 가입되어있는 아이디 입니다.");
//	    		return;
	    	}else{
	    		$('#id_validate_btn').css('display','none');
	    		$('#id_validate_text').css('display','block');
	    		idCheckValue = true;
	    	}
	    }
	})
}