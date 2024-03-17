<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script>
	function boardCheck(){
		if(document.frm.name.value.length==0){
			alert("작성자를 입력하세요.");
		}
		if(document.frm.pass.value.length==0){
			alert("비밀번호를 입력하세요.");
		}
		if(document.frm.title.value.length==0){
			alert("제목을 입력하세요.");
		}
		return true;
	}
	
	function passCheck(){
		if(document.frm.pass.value.length ==0){
			alert("비밀번호를 입력하세요");
			return false;
		}
		return true;
	}
	</script>
</body>
</html>