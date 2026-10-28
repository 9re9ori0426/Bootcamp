<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="age/index.css" rel="stylesheet">
</head>
<body>
<h1>${bean.msg}</h1>
<h2>출생년도가 ${bean.birth}인 당신의 나이는 ${bean.old}살 입니다.</h2>
<button style="max-width: 50%" type="button" onclick="location.href = '/age'">뒤로</button>
</body>
</html>
