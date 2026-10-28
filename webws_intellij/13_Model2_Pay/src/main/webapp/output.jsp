<%@ page import="com.bo._3_model2_pay.Result" %><%--
  Created by IntelliJ IDEA.
  User: sdedu
  Date: 2026-10-26
  Time: 오후 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    Result r = (Result) request.getAttribute("rr");
%>
<body>
번돈 : <%=r.getEarn()%> <br>
쓴돈 : <%=r.getSpend()%> <br>
남은돈 : <%=r.getRemain()%> <br>

</body>
</html>
