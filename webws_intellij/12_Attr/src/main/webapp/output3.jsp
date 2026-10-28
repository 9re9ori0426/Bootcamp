<%--<%@ page import="com.bo._2_attr.Result" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<h1>계산 결과</h1>--%>
<%--<div>--%>
<%--    <div>상품 가격 : <%=r.getMoney()%>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<div>--%>
<%--    <div>지불한 돈 : <%=r.getPrice()%>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<div>--%>
<%--    <div><%=r.getExchangeMessage()%>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<div>--%>
<%--    <div>멘트 : <%=r.getMessage()%>--%>
<%--    </div>--%>
<%--</div>--%>
<h1><%=request.getParameter("howmuch")%>원 모자라요</h1>
<h1><%=request.getParameter("asd")%>원 모자라요</h1>
<h1><%=request.getAttribute("asdasd")%>원 모자라요</h1>
</body>
</html>
