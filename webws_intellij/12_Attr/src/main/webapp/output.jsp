<%@ page import="com.bo._2_attr.Result" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    Result r = (Result) request.getAttribute("result");
%>
<body>
<h1>계산 결과</h1>
<div>
    <div>상품 가격 : <%=r.getMoney()%>
    </div>
</div>
<div>
    <div>지불한 돈 : <%=r.getPrice()%>
    </div>
</div>
<div>
    <div><%=r.getExchangeMessage()%>
    </div>
</div>
<div>
    <div>멘트 : <%=r.getMessage()%>
    </div>
    <%
        if(r.isNotEnough() == true){
    %>
        <button onclick="handleNotEnoughMoney()">얼마 모자른데요??</button>
        <button onclick="location.href = 'output3.jsp?howmuch=<%=Math.abs( r.getExchange() )%>'">얼마 모자른데요?? 2</button>
        <div id="test" style="visibility: hidden"><%=Math.abs( r.getExchange() )%>원 모자라요</div>
    <%
        }
    %>
</div>


<hr>
<form action="ExController" method="get">
    <input type="text" name="howmuch" hidden value="<%=Math.abs( r.getExchange() )%>">
    <button>GET 확인</button>
</form>
<hr>
<form action="ExController" method="post">
    <input type="text" name="asd" hidden value="<%=Math.abs( r.getExchange() )%>">
    <button>POST 확인 (데이터 이미 완성)</button>
</form>
<hr>
<form action="ExController" method="post">
    <input type="text" name="asd" hidden value="<%=r.getExchange()%>">
    <button>POST 확인 (데이터 미완성)</button>
</form>



<script>
    function handleNotEnoughMoney(){
        document.getElementById("test").style.visibility = "visible";
    }
</script>
</body>
</html>
