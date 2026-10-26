<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 값 받아서 쓰기 계산 x -> model 이미 다 함
    Object ppp = request.getAttribute("price");
    request.getAttribute("money");
%>

<h1>계산결과</h1>
<div>
    <div>상품 가격 : <%=request.getAttribute("price")%></div>
    <div>지불한 돈 : <%=request.getAttribute("money")%></div>
    <div>잔돈 : <%=request.getAttribute("exchange")%></div>
    <div>멘트 : <%=request.getAttribute("say")%></div>
</div>
<%=request.getParameter("p")%>
<%=request.getParameter("m")%>
</body>
</html>
