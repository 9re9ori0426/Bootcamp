<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<script>
    function test() {
        let a = '';
        if (a) {
            alert('참')
        } else {
            alert('거짓')
        }
    }
</script>
<body>
<button onclick="test()">test</button>

<h1>회원가입</h1>
<form action="asd" id="myForm">
    필수 입력 : <input id="i1" type="text" name="i1" autocomplete="off" placeholder="필수, 5자 이상, 한글x"/>
    <hr>
    글자 수 : <input id="i2" type="text" name="i2" maxlength="10" autocomplete="off" placeholder="3자 이상, 10글자 까지"/>
    <hr>
    비번 : <input id="i3" type="text" name="i3" autocomplete="off" placeholder="5자 이상, 대문자, 숫자 포함"/>
    <hr>
    비번확인 : <input id="i4" type="text" name="i4" autocomplete="off" placeholder="비번 재확인"/>
    <hr>
    숫자 : <input id="i5" type="text" name="i5" autocomplete="off" placeholder="숫자만, 공백x"/>
    <hr>
    파일 : <input id="i6" type="file" name="i6"/>
    <button type="button" onclick="call()">가입</button>
</form>
</body>
<script src="validate.js"></script>
<script src="siteCheck.js"></script>
</html>