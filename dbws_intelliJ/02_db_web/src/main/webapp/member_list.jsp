<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="member_list.css">
</head>
<body>
<div class="member-list-wrap">
    <div class="member-row header">
        <div class="member-name">Name</div>
        <div class="member-age">Age</div>
    </div>
    <c:forEach items="${members}" var="m">
        <div class="member-row">
            <div class="member-name"><span onclick="updateMember('${m.name}', ${m.no})">${m.name}</span></div>
            <div class="member-age">${m.age}</div>
            <div>
                <button onclick="deleteMember(${m.no})">DELETE</button>
            </div>
        </div>
    </c:forEach>
</div>
</body>
<script>
    function deleteMember(no) {
        let ok = confirm("really?");
        if (ok) {
            location.href = 'del?num=' + no;
        }
    }

    function updateMember(n, no) {
        let name = prompt("edit?", n);
        if (name != null && name != "") {
            location.href = "update?name=" + name + "&num=" + no;
        }
    }
</script>
</html>
