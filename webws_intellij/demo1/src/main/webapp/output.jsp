<%@ page import="com.dw.demo1.AAA" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<%
    AAA a = (AAA) request.getAttribute("a");
%>
출생년도 : <%=a.getBirth()%><br>
나이 : <%=a.getAge()%><br>
인사말 : <%=a.getMsg()%><br>
</body>
</html>
