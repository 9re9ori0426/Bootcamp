<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Second Page</h1>
파라미터 : ${param.a}
<br>
어트리뷰트 : ${b}

<hr>
세션 : ${c}<br>
세션 : ${sessionScope.c}
쿠키 : ${cookie.d.value}

<form action="third-c">
    <input name="a" value="${param.a}">
    <button>secondC로 (get/post)요청</button>
</form>
<hr>
<h2 onclick="location.href='third-c?b=${b}'">(js) thirdC로 get방식 요청</h2>
</body>
</html>
