<%@ page import="com.bo._9_el.pay.Result" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="pay/index.css" rel="stylesheet">
</head>
<body>
<form>
    <div>번돈 : ${rr.earn} </div>
    <div>쓴돈 : ${rr.spend} </div>
    <div>남은돈 : ${rr.remain}</div>
    <button style="margin-top : 20px" type="button" onclick="location.href = '/pay'">뒤로</button>
</form>
</body>
</html>
