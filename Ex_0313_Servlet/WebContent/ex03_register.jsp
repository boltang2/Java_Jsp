<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
	function register_func(f) {
		// 유효성 체크는 클라이언트 쪽에서 진행하여
		// 서버에서 실행되는 부하를 최대한 줄여주자
		let id = f.id.value;
		if (id == '') {
			alert("아이디는 필수 입력사항 입니다.");
			return;
		}
		let pwd = f.pwd.value;
		if (pwd == '') {
			alert("비밀번호는 필수 입력사항 입니다.");
			return;
		}
		let age = f.age.value;
		let number_format = /^[0-9]+$/;
		if(!number_format.test(age)){
			alert("나이는 정수로 입력하세요.");
			return;
		}
		f.submit();
	}
</script>
</head>
<body>
	<form action="join.do">
		<table border="1">
			<tr>
				<td>ID</td>
				<td><input name="id"></td>

			</tr>
			<tr>
				<td>PW</td>
				<td><input name="pwd" type="password"></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input name="age"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<!-- this.form : 내 사진을 포장하고 있는 가장 가까운 form태그 this.form키워드는 input, textarea외에는 사용 불가 -->
					<input type="button" value="가입하기" onclick="register_func(this.form);"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>