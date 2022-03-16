<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>탈퇴 화면</title>
    
<style>
	 * {
	  margin: 0px;
	  padding: 0px;
	  text-decoration: none;
	  font-family:sans-serif;
	
	}
	
	body {
	  background-image:#34495e;
	}
	
	.form4 {
	  position:absolute;
	  width:400px;
	  height:400px;
	  padding: 30px, 20px;
	  background-color:#FFFFFF;
	  text-align:center;
	  top:50%;
	  left:50%;
	  transform: translate(-50%,-50%);
	  border-radius: 15px;
	}
	
	.form4 h2 {
	  text-align: center;
	  margin: 30px;
	}
	
	.textForm {
	  border-bottom: 2px solid #adadad;
	  margin: 30px;
	  padding: 10px 10px;
	}
	
	
	.password {
	  width: 100%;
	  border:none;
	  outline:none;
	  color: #636e72;
	  font-size:16px;
	  height:25px;
	  background: none;
	}

	
	
	
	#submit {
		  position:relative;
		  left:21%;
		  transform: translateX(-50%);
		  margin-bottom: 40px;
		  width:165px;
		  height:30px;
		  border: none;
		  font-weight: bold;
		  transition: 0.4s;
		  display:inline;
		  background-color: #59ab6e; 
		  border-radius: .25rem;
		  color: white;
		  
	}
	

		
	.post li {
		float: left;
		margin: 10px;
		list-style: none;
	}
	.post {
		position: absolute;
		left: 25%;
		width: 1000px;
		margin-top: 51px;
		justify-content: space-between;
	}
	ul li a {
		text-decoration-line: none;
		color: black;
	}
	</style>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script type="text/javascript">
    // 비밀번호 미입력시 경고창
	    function checkValue(){
	        if(!document.deleteform.password.value){
	            alert("비밀번호를 입력하지 않았습니다.");
	            return false;
	        }
	    }

    </script>
    
</head>
<body>
	<header>
			<%@include file ="header.jsp" %>
		</header>
			<div class="post">
				<ul>
					<li><a href="mypage">회원 수정</a></li>
					<li><a href="changepw">비밀번호 변경</a></li>
					<li><a href="todaylist">내가 쓴 글</a></li>
					<li><a href="delete"><b>회원 탈퇴</b></a></li>
				</ul>
			</div>
    	<form name="deleteform" method="post" class="form4" action="delete" onsubmit="return checkValue()">
                <h2>회원 탈퇴</h2>
                <div class="textForm">
               		 <input type="password" id="password" class="password" name="password">
                </div>
		        <input type="submit" id="submit" value="탈퇴" /> 
		        <input type="button" id="submit" value="취소" onclick="location.href='mypage'" />
    	</form>

</body>
</html>