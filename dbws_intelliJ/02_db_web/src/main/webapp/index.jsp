<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <button onclick="location.href='all'">get all member</button><br>
    <form action="all" method="POST">
        Name : <input type="text" name="name"><br>
        Age : <input type="text" name="age"><br>
        <button>ADD</button>
    </form>
</body>
</html>