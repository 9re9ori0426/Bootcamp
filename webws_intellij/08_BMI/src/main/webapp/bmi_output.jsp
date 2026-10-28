<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="theme.css">
</head>
<%
    // 1. 필요한 값 키, 체중, 이름
    String name = request.getParameter("name");
    double height = Double.parseDouble(request.getParameter("height") );
    double weight = Double.parseDouble(request.getParameter("weight") );
    // 2. 계산식
    // 체중 / 키 x 키 (m)
    if (height > 3) {
        height /= 100;
    }
    double bmi = weight / (height * height);

    // 저 체 중 18.5미만
    // 정 상 18.5이상 ~ 22.9이하
    // 비만전단계 23이상 ~ 24.9이하
    // 1단계 비만 25이상 ~ 29.9이하
    // 2단계 비만 30이상 ~ 34.9이하
    // 3단계 비만 35이상
    String result = "3단계 비만";
    if (bmi < 18.5) {
        result = "저체중";
    } else if (bmi <= 22.9) {
        result = "정상";
    } else if (bmi <= 24.9) {
        result = "비만전단계";
    } else if (bmi <= 29.9) {
        result = "1단계 비만";
    } else if (bmi <= 34.9) {
        result = "2단계 비만";
    }
    // 4. 결과출력 (소수점 1~2자리까지만)

    // BMI 지수 : ㅇㅇ
    // oo님, 당신은 oo 입니다.
    String bmi_msg = String.format("BMI지수 : %.2f\n", bmi);
    String result_msg = String.format(name + "님, 당신은 " + result + " 입니다.");
%>
<body>
    <form>
        <div class="form-group">
            <label>이름
                <div><%=name%></div>
            </label>
        </div>
        <div class="form-group">
            <label>키
                <div><%=height*100%></div>
            </label>
        </div>
        <div class="form-group">
            <label>체중
                <div><%=weight%></div>
            </label>
        </div>
        <h1><%=bmi_msg%></h1>
        <h2 class="msg"><%=result_msg%></h2>
        <button type="button" onclick="location.href='index.html'">다시 검사하기</button>
    </form>
</body>
</html>