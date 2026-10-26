<%@ page import="com.dw._2_attr.Result" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>계산결과</h1>

p: <%=request.getParameter("p")%>
m: <%=request.getParameter("m")%>
<hr>
<%=request.getParameter("howmuch")%>원 모자랍니다
<br>
<%=request.getParameter("asdf")%>원 모자랍니다
<br>
<%=request.getAttribute("asdfasdf")%>
</body>
</html>
