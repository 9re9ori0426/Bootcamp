<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>index</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>

<form action="home" method="post" enctype="multipart/form-data">
    <input type="text" name="name" placeholder="name"><br>
    <input type="text" name="place" placeholder="place"><br>
    <input type="file" name="img"><br>
    <button>ADD</button>
    <span style="color: red">${msg} // ${param.status}</span>
</form>

<hr>
<div class="res-wrap">
    <c:forEach items="${restaurants}" var="res">
        <div class="res-card">
            <div style="position: relative">
                <img src="upload/${res.img}">
                <button onclick="delRes(${res.no})" style="position: absolute; top: 0; right: 0;">X</button>
            </div>
            <div>
                    ${res.name}
                <button onclick="upRes(${res.no}, '${res.name}')">EDIT</button>
            </div>
            <div>
                    ${res.place}
            </div>
        </div>
    </c:forEach>
</div>
<script>
    function delRes(num) {
        let ok = confirm("Delete this Restaurant?");
        if (ok) {
            location.href = "del?no=" + num;
        }
    }

    function upRes(num, title) {
        let name = prompt("Restaurant name?", title);
        if (name != null && name != "") {
            location.href = "up?name=" + name + "&no=" + num;
        }
    }
</script>
</body>
</html>