<%@ page import="com.dw._5_model2_bmi.Bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="output.css">
</head>
<body>
<%
    Bean b = (Bean) request.getAttribute("bean");
%>
<form action="index.jsp" class="bmi-form">
    <div class="bmi-container">

        <div class="bmi-header">
            <div class="bmi-icon">BMI</div>
            <div class="bmi-title">검사 결과</div>
            <div class="bmi-subtitle">
                입력하신 정보를 바탕으로 계산한 결과입니다.
            </div>
        </div>

        <div class="bmi-result-profile">
            <div class="bmi-result-label">BMI 지수</div>
            <div class="bmi-result-value"><%=String.format("%.1f", b.getBmi())%></div>
            <div class="bmi-result-status"><%=b.getResult()%></div>
        </div>

        <div class="bmi-result-list">
            <div class="bmi-result-row">
                <div class="bmi-label">이름</div>
                <div class="bmi-result-data"><%=b.getName()%></div>
            </div>

            <div class="bmi-result-row">
                <div class="bmi-label">키</div>
                <div class="bmi-result-data"><%=b.getHeight() * 100%> cm</div>
            </div>

            <div class="bmi-result-row">
                <div class="bmi-label">체중</div>
                <div class="bmi-result-data"><%=b.getWeight()%> kg</div>
            </div>
        </div>

        <div class="bmi-action">
            <button type="submit" class="bmi-button">
                다시 검사하기
                <span class="bmi-button-arrow">→</span>
            </button>
        </div>

        <div class="bmi-footer">
            본 결과는 BMI 지수를 바탕으로 한 참고 정보입니다.
        </div>

    </div>
</form>
</body>
<script src="output.js"></script>
</html>