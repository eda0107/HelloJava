function LoginFormCheck() {
	if (frm.id.value == "") {
		alert("아이디를 입력하세요.");
		frm.id.focus();
		return false;
	}
	
	if (frm.pw.value == "") {
		alert("비밀번호를 입력하세요.");
		frm.pw.focus();
		return false;
	}
	
	return true;
}


function memberFormCheck() {
	if (frm.id.value == "") {
		alert("사용할 아이디를 입력하세요.");
		frm.id.focus();
		return false;
	}
	if (frm.idCk.value == "unCheck") {
		alert("아이디 중복 여부를 확인해 주세요.");
		return false;
	}
	if (frm.pw.value == "") {
		alert("사용할 패스워드를 입력하세요.");
		frm.pw.focus();
		return false;
	}
	if (frm.pwCk.value == "") {
		alert("패스워드를 다시 한 번 확인해 주세요.");
		frm.pwCk.focus();
		return false;
	}
	if (frm.pw.value != frm.pwCk.value) {
		alert("입력하신 패스워드가 일치하지 않습니다.")
		frm.pwCk.focus();
		return false;
	}
	if (frm.tel.value == "") {
		alert("연락처를 입력해 주세요.")
		frm.tel.focus();
		return false;
	}
	return true;
}




function idCheck() {
	var id = frm.id.value;
	   if(id ==""){
		      alert("아이디값을 입력 후 확인하세요");
		      frm.id.focus();
		   } else {
		      window.open("idCheck.do?id="+id,"id 중복체크","width=700, height=400, top=50, left=50");

}


function idCheckValueChange() {
	
}
}
