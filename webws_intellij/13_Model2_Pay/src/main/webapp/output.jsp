<%@ page import="com.dw._3_model2_pay.Result" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Result r = (Result) request.getAttribute("rr");
    %>

번돈 : <%=r.getEarn()%><br>
쓴돈 : <%=r.getSpend()%><br>
남은돈 : <%=r.getRemain()%>
</body>
</html>
