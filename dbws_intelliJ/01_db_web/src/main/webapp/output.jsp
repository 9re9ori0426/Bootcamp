<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Age</td>
    </tr>
<c:forEach items="${humans}" var="h">
    <tr>
        <td>${h.name}</td>
        <td>${h.age}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
