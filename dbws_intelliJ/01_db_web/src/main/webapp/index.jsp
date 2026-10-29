<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="show-all" method="post">
    이름 : <input name="name"><br>
    나이 : <input name="age"><br>
    <button>add</button>
</form>
<button onclick="location.href='show-all'">show all people</button>
</body>
</html>