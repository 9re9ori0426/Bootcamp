<%@ page import="com.bo._5_2_remind.Bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    Bean b = (Bean) request.getAttribute("bean");
%>
<body>
<h1><%=b.getMsg()%></h1>
<h2>출생년도가 <%=b.getBirth()%>인 당신의 나이는 <%=b.getOld()%>살 입니다.</h2>
<hr>
    출생년도 : <%=b.getBirth()%> <br>
    나이 : <%=b.getOld()%> <br>
    인사말 : <%=b.getMsg()%> <br>
</body>
</html>
