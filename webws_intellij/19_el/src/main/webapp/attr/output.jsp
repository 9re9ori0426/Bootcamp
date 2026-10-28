<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/attr/index.css" rel="stylesheet">
</head>
<body>
<h1>계산 결과</h1>
<div>
    <div>상품 가격 : ${result.money}
    </div>
</div>
<div>
    <div>지불한 돈 : ${result.price}
    </div>
</div>


<hr>
<form action="attr/ExController" method="get">
    <input type="text" name="howmuch" hidden value="${Math.abs(result.exchange)}">
    <button>GET 확인</button>
</form>
<form action="attr/ExController" method="post">
    <input type="text" name="asd" hidden value="${Math.abs(result.exchange)}">
    <button>POST 확인 (데이터 이미 완성)</button>
</form>
<form action="attr/ExController" method="post">
    <input type="text" name="asd" hidden value="${Math.abs(result.exchange)}">
    <button>POST 확인 (데이터 미완성)</button>
</form>
<button type="button" style="margin-top : 20px; filter : grayscale(1)" onclick="location.href='/attr'">뒤로</button>

</body>
</html>
