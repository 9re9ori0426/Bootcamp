<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>index</title>
</head>
<body>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Place</td>
        <td>Img</td>
    </tr>
    <c:forEach items="${restaurants}" var="r">
        <tr>
            <td>${r.name}</td>
            <td>${r.place}</td>
            <td>${r.img}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>