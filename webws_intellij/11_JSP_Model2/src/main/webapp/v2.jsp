<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<jsp:include page=""></jsp:include>--%>
<body>
    <%
        String a = request.getParameter("a");
        String b = request.getParameter("b");

        Object c = request.getAttribute("ccc");
    %>

    <h1>계산 결과</h1>
    <%=a%> + <%=b%> = <%=c%>
</body>
</html>
