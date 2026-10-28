<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>First Page</h1>
<a href="second.jsp?a=10&b=20">10 + 20</a>
<h2 onclick="location.href='second.jsp?a=5&b=10'">5 + 10</h2>
<form action="second.jsp">
    <input name="a" type="text">
    <input name="b" type="text">
    <button>확인</button>
</form>
</body>
</html>