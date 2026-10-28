<%@ page import="com.bo._4_model2_unit.Bean" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="index.css" rel="stylesheet">
</head>
<%--<jsp:useBean id="b" class="com.bo._4_model2_unit.Bean"></jsp:useBean>--%>
<%
    Bean b = (Bean) request.getAttribute("bean");
%>
<body>
<div class="flex-box <%=b.getBack_color()%>">
    <div>변환 결과</div>
    <div class="flex-row">
        <div><%=b.getValue()%></div>
        <div class="<%=b.getFont_color()%>"><%=b.getStart_unit()%></div>
    </div>
    <div class="arrow">⬇</div>
    <div class="flex-row">
        <div><%b.getRet()%></div>
        <div class="<%=b.getFont_color()%>"><%=b.getRet_unit()%></div>
    </div>

    <button class="back_btn" onclick="location.href='input.html'">돌아가기</button>
</div>
</body>
<script>
    const back_btn = document.querySelector(".back_btn");
    back_btn.focus();
</script>
</html>