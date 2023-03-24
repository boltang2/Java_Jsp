<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function j(f){
		let jumin = f.jn.value;
		let jumin_check = /^\d{2}[0-1]\d[0-3]\d-[1-4]\d{6}$/;
		if(!jumin_check.test(jumin)){
			alert("올바른 주민번호를 입력하세요.")
			return;
		}
		f.submit();
	}
</script>
</head>
<body>
	<form action="jumin.do">
		<span>주민번호</span> <input type="text" name="jn" /> 
		<input type="button" value="확인" onclick="j(this.form);" />
	</form>
</body>
</html>