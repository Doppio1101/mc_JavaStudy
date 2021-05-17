/**
 * 
 */
function checkData(){
	var flag = false;
	//alert("welcome!");
	var userId = document.getElementById('userId').value;
	var userPw = document.getElementById('userPw').value;
	
	if(userId != '' && userPw != ''){
		alert(userId+"/"+userPw);
		flag = true;
	}
	else{
		alert("아이디또는 패스워드를 확인하세요");
		
	}
	
	return flag;
}