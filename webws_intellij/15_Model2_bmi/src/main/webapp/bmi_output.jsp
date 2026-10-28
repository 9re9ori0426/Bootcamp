<%@ page import="com.bo._5_model2_bmi.Bean" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="theme.css">
</head>
<%
    Bean b = (Bean) request.getAttribute("bean");
%>
<body>
    <form>
        <div class="form-group">
            <label>이름
                <div><%=b.getName()%></div>
            </label>
        </div>
        <div class="form-group">
            <label>키
                <div><%=b.getHeight()*100%></div>
            </label>
        </div>
        <div class="form-group">
            <label>체중
                <div><%=b.getWeight()%></div>
            </label>
        </div>
        <h1><%=b.getBmi_msg()%></h1>
        <h2 class="msg"><%=b.getResult_msg()%></h2>
        <button type="button" onclick="location.href='index.jsp'">다시 검사하기</button>
    </form>
</body>
</html>