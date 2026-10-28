<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>당신은 ${age}살 입니다.</h1>

<%--
1. jsp 표준 액션태그 : include

2. jstl (사제) : jstl.jar

    20살 이상 존댓 / 반말
--%>

<c:if test="${age >= 20}">
    <h1>안녕하세요!</h1>
</c:if>
<c:if test="${age < 20}">
    <h1>안녕!</h1>
</c:if>

<%--<c:otherwise>asdf</c:otherwise>--%>
<c:choose>
    <c:when test="${age > 20}">
        어서오세요!
    </c:when>
    <c:when test="${age > 10}">
        어서오렴~
    </c:when>
    <c:otherwise>
        ?? 안녕??????
    </c:otherwise>
</c:choose>
<hr>

<c:forEach begin="1" end="3" step="2">
    <h1>ㅎㅅㅎ</h1>
</c:forEach>

<%-- 역순이 안 됨. step에 음수 x -> 다른 방법을 써야됨--%>
<c:forEach begin="1" end="${age}" var="aa">
    ${aa}
</c:forEach>
<br>

<c:forEach var="aa" items="${ar}">
    ${aa}
</c:forEach>
<br>

<c:forEach var="menu" items="${menus}" varStatus="st">
    ${st.count}. ${menu.name} : ${menu.price}
    <br>
</c:forEach>
<br>

<c:forEach var="i" begin="1" end="10" varStatus="st">
    ${st.end + 1 - i}
</c:forEach>
<br>

<c:forEach var="i" begin="1" end="10">
    <c:set var="v" value="${11-i}"></c:set>
    <c:out value="${v}"></c:out>
</c:forEach>
</body>
</html>
