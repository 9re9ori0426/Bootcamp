<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="input.css">
</head>
<body>
<form action="hc" class="bmi-form" method="post">
    <div class="bmi-container">
        <div class="bmi-header">
            <div class="bmi-icon">BMI</div>
            <div class="bmi-title">BMI 검사</div>
            <div class="bmi-subtitle">
                키와 체중을 입력하고 건강 지수를 확인하세요.
            </div>
        </div>

        <div class="bmi-row">
            <label class="bmi-label" for="name">이름</label>
            <div class="bmi-input-wrap">
                <input
                        class="bmi-input"
                        type="text"
                        id="name"
                        name="name"
                        placeholder="이름을 입력하세요"
                        required
                >
            </div>
        </div>

        <div class="bmi-row">
            <label class="bmi-label" for="height">키</label>
            <div class="bmi-input-wrap bmi-unit-wrap">
                <input
                        class="bmi-input"
                        type="number"
                        id="height"
                        name="height"
                        placeholder="예: 175"
                        min="1"
                        step="any"
                        required
                >
                <span class="bmi-unit">cm</span>
            </div>
        </div>

        <div class="bmi-row">
            <label class="bmi-label" for="weight">체중</label>
            <div class="bmi-input-wrap bmi-unit-wrap">
                <input
                        class="bmi-input"
                        type="number"
                        id="weight"
                        name="weight"
                        placeholder="예: 70"
                        min="0.1"
                        step="any"
                        required
                >
                <span class="bmi-unit">kg</span>
            </div>
        </div>

        <div class="bmi-action">
            <button type="submit" class="bmi-button">
                BMI 계산하기
                <span class="bmi-button-arrow">→</span>
            </button>
        </div>

        <div class="bmi-footer">
            건강 관리를 위한 BMI 지수 확인
        </div>
    </div>
</form>
</body>
</html>