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
        <button class="into-btn" onclick="deleteUser()">delete</button>
        <div class="confirm" style="display: none">
            <form action="user-delete" method="POST">
                <input type="text" placeholder="pw" name="pw">
                <button>confirm</button>
            </form>
        </div>
    </div>
</div>
<script>
    function deleteUser() {
        document.querySelector(".confirm").style.display = "block";
    }
</script>
</body>
</html>
