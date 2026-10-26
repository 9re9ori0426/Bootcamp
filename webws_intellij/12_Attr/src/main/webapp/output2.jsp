<%@ page import="com.dw._2_attr.Result" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 값 받아서 쓰기 계산 x -> model 이미 다 함
    Result rr = (Result) request.getAttribute("result");
%>

<h1>계산결과</h1>
<div>
    <div>상품 가격 : <%=rr.getPrice()%>
    </div>
    <div>지불한 돈 : <%=rr.getMoney()%>
    </div>
    <div>잔돈 : <%=rr.getExchange()%>
    </div>
    <div>멘트 : <%=rr.getSay()%>
    </div>
</div>
<hr>
<%=request.getParameter("p")%>
<%=request.getParameter("m")%>
<hr>
<%--<%--%>
<%--    if (rr.getPrice() > rr.getMoney()) {--%>
<%--        int howmuch = rr.getPrice() - rr.getMoney();--%>
<%--%>--%>
<%--<a href="output3.jsp?howmuch=<%=howmuch%>"><button>얼마 모자른데요?</button></a>--%>
<%--<a href="output3.jsp?howmuch=<%=-rr.getExchange()%>"><button>얼마 모자른데요?</button></a>--%>
<%--<a href="output3.jsp?howmuch=<%=-rr.getPrice() - rr.getMoney()%>"><button>얼마 모자른데요?</button></a>--%>
<%--<button onclick="location.href='output3.jsp?howmuch=<%=-rr.getExchange()%>'">얼마 모자른데요?</button>--%>
<%--<form action="output3.jsp">--%>
<%--    <input type="text" name="howmuch" value="<%=-rr.getExchange()%>" hidden>--%>
<%--    <button>얼마 모자른데요?</button>--%>
<%--</form>--%>
<%--<% }--%>
<%--%>--%>
<hr>
<hr>
<form action="ExController">
    <input type="text" name="howmuch" value="<%=-rr.getExchange()%>" hidden>
    <button>얼마요??</button>
</form>
<form action="ExController" method="post">
    <input type="text" name="asdf" value="<%=-rr.getExchange()%>" hidden>
    <button>얼마요??</button>
</form>
<form action="ExController" method="post">
    <input type="text" name="asdf" value="<%=rr.getExchange()%>" hidden>
    <button>얼마요??(미완성)</button>
</form>
</body>
</html>
