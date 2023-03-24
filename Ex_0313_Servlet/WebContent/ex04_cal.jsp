<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function c(f) {
		let n1 = f.num1.value;
		let n2 = f.num2.value;
		let number_check = /^[0-9]+$/;
		let zero_check = /^[0]+$/;
		if (!number_check.test(n1) || !number_check.test(n2)) {
			alert("숫자를 입력하세요.")
			return;
		}
		if (zero_check.test(n2)) {
			alert("0으로 나눌 수 없음.")
			return;
		}
		f.submit();
	}
</script>
</head>
<body>
	<form action="cal.do">
		<div>
			<span>수1</span> <input type="text" name="num1" /> <br>
		</div>
		<div>
			<span>수2</span> <input type="text" name="num2" /> <br>
		</div>
		<div>
			<input type="button" value="확인" onclick="c(this.form);" />
		</div>
	</form>
</body>
</html>