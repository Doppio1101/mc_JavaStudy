<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<title>Company</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>  
<script>
  $(function() {
      $("#login_btn").click(function() {
    	  var userid = document.getElementById("id").value;//$("id").val();
    	  var userpw = document.getElementById("pw").value;//$("pw").val();
      	var member = { id: userid, 
  		  			    pwd: userpw
  		  			    
  			     };
  	$.ajax({
        type:"post",
        url:"${contextPath}/test/login",
        //보낼 곳
        contentType: "application/json",
        //json방식으로 보내겠다
        data :JSON.stringify(member),
      	//json을 string방식으로 보내겠다
     success:function (data,textStatus){
    	 
    	 var username = data.name;
         alert("성공적으로 로그인 했습니다.\n"+"id:"+data.id+"\tname:"+data.name+"\npwd:"+data.pwd);

    	 alert("Data: "+data.id+"님 login ok\n Status: success");
     },
     error:function(data,textStatus){
        alert("아이디 또는 비밀번호를 확인하세요.\n"+member.id+"혹은"+member.pwd+"가 잘못됐습니다.");
     },
     complete:function(data,textStatus){
     }
  });  //end ajax	

   });
});
</script>
    <link rel="stylesheet" href="/homework/resources/css/test1_2.css" media="(max-width:600px)">
 
    
    <link rel="stylesheet" href="/homework/resources/css/test1_1.css" media="(min-width:600px)">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="/homework/resources/js/test.js" type="text/javascript"></script>

</head>
<body>
    
    <div id="page">
 
        <header>
            <div id="logo">
                <img src="/homework/resources/imgs/logo.png" alt="Logo">
            </div>
 
            <div id="top_menu">
                <a href="#">HOME</a> | 
                <a href="#">NOTICE</a> |
<!--                 <a href="#">LOGIN</a> | -->
                <a href="#">JOIN</a> | 
                ID <input class="login" id="id"> PW <input type="password" class="login" id="pw"> <input type="button" id="login_btn" value="LOGIN">
            </div>
 
            <nav>
                <ul>
                    <li><a href="#">COMPANY</a></li>
                    <li><a href="#">PRODUCT</a></li>
                    <li><a href="#">CUSTOMER</a></li>
                    <li><a href="#">SERVICE</a></li>
                    <li><a href="#">RECRUIT</a></li>
                </ul>
            </nav>
 
        </header>
 
        <article id="content">
            <section id="main">
                <img id="main_img" src="/homework/resources/imgs/main_img.png" alt="main img" >
            </section>
            <section>
                <ul id="banner">
                    <li><a href="#"><img src="/homework/resources/imgs/banner1.png" alt="banner1"></a></li>
                    <li><a href="#"><img src="/homework/resources/imgs/banner2.png" alt="banner2"></a></li>
                </ul>
 
            </section>
            <section>
            	<div th:text="${message}"></div>
            </section>
 
        </article>
 
        <footer>
            <img id="address_img" src="/homework/resources/imgs/address.png" alt="address">
        </footer>
 
    </div>
</body>
</html>