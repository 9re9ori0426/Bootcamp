<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="input.css">
</head>
<body>
<form action="hc" method="post" id="myForm" onsubmit="return check()">
    <div class="container">
        <div>단위변환</div>
        <div>변환할 값</div>
        <div><input type="text" name="num" required></div>
        <div>단위 <span id="error-zone" style="position: relative; left: 60px; color: red"> 숫자만 입력하세요</span></div>
        <div>
            <select name="unit">
                <%--                <option value="" disabled selected>단위를 선택하세요</option>--%>
                <option value="cm">cm -> inch</option>
                <option value="㎡">㎡ -> 평</option>
                <option value="℃">℃ -> ℉</option>
                <option value="km/h">km/h -> mi/h</option>
            </select>
        </div>
        <div>
            <button>변환</button>
        </div>
    </div>
</form>
<script>
    function check() {
        const numEl = document.querySelector("input[name='num']");
        // if (numEl.value == "") {
        //     alert("숫자를 입력하세요!")
        //     numEl.focus();
        //     return false;
        // }

        if (isNaN(numEl.value)) {
            // alert("숫자만 입력하세요!")
            document.querySelector("#error-zone").style.opacity = "1";
            numEl.focus();
            numEl.value = "";
            return false;
        }
    }


</script>


</body>
</html>