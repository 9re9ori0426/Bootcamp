<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    int a = Integer.parseInt(request.getParameter("a"));
    int b = Integer.parseInt(request.getParameter("b"));

    int cc = (Integer) request.getAttribute("cc");
%>
<body>
<h1>Third Page</h1>
<%=a%> + <%=b%> = <%=cc%>
<a href="index.jsp">뒤로</a>
</body>
</html>
