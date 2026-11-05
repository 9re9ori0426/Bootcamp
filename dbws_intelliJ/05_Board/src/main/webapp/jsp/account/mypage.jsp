<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>- My Page -</h1>
<div class="info-wrap">
    <div class="info-row">
        <div>ID.</div>
        <div>${sessionScope.user.id}</div>
    </div>
    <div class="info-row">
        <div>PW.</div>
        <div>${sessionScope.user.pw}</div>
    </div>
    <div class="info-row">
        <div>NAME.</div>
        <div>${sessionScope.user.name}</div>
    </div>
    <div>
        <button class="info-btn" onclick="location.href='user-edit'">edit</button>
        <button class="into-btn">delete</button>
    </div>
</div>
</body>
</html>
