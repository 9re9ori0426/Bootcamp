<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/bmi_theme.css">
</head>
<body>
    <form>
        <div class="form-group">
            <label>이름
                <div>${bean.name}</div>
            </label>
        </div>
        <div class="form-group">
            <label>키
                <div>${bean.height * 100}</div>
            </label>
        </div>
        <div class="form-group">
            <label>체중
                <div>${bean.weight}</div>
            </label>
        </div>
        <h1>${bean.bmi_msg}</h1>
        <h2 class="msg">${bean.result_msg}</h2>
        <button type="button" onclick="location.href='/bmi'">다시 검사하기</button>
    </form>
</body>
</html>