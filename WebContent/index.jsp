<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Calculator</title>
	</head>
	<body>
		<form action="calculate" method="post">
			<table>
				<tr>
					<td>Number 1</td>
					<td><input type="number" name="num1"></td>
				</tr>
				<tr>
					<td>Number 2</td>
					<td><input type="number" name="num2"></td>
				</tr>
				<tr>
					<td>Result</td>
					<td><input type="number" value="<%=request.getAttribute("result")%>" disabled></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" name="command" value="+">
						<input type="submit" name="command" value="-">
						<input type="submit" name="command" value="*">
						<input type="submit" name="command" value="/">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>