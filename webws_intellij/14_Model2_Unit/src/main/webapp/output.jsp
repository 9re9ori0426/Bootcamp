<%@ page import="com.dw._4_model2_unit.Bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="input.css">
</head>
<body>
<%
    Bean bb = (Bean) request.getAttribute("bean");
%>
<form action="index.jsp">
    <div class="container bg-<%=bb.getCc()%>">
        <div>변환결과</div>
        <div><%=String.format("%.1f", bb.getNum())%> <span class="<%=bb.getCc()%>"> <%=bb.getUnit()%></span>
        </div>
        <div> ↓</div>
        <div><%=String.format("%.1f", bb.getResult())%>   <span class="<%=bb.getCc()%>">  <%=bb.getConvertedUnit()%></span>
        </div>
        <div>
            <button>돌아가기</button>
        </div>
    </div>
</form>
</body>
</html>