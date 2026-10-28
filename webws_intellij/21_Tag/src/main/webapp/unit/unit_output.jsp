<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="css/unit_theme.css" rel="stylesheet">
</head>
<body>
<div class="flex-box ${bean.back_color}">
    <div>변환 결과</div>
    <div class="flex-row">
        <div> ${bean.value}</div>
        <div class=" ${bean.font_color}"> ${bean.start_unit}</div>
    </div>
    <div class="arrow">⬇</div>
    <div class="flex-row">
        <div>${bean.ret}</div>
        <div class=" ${bean.font_color}"> ${bean.ret_unit}</div>
    </div>

    <button class="back_btn" onclick="location.href='unit'">돌아가기</button>
</div>
</body>
<script>
    const back_btn = document.querySelector(".back_btn");
    back_btn.focus();
</script>
</html>