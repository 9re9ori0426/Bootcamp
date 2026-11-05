<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/review-detail.css">
</head>
<body>
<div>
    <div class="review-detail">
        <div>
            <div class="col-1">No.</div>
            <div class="col-2">${review.no}</div>
        </div>
        <div>
            <div class="col-1">Title.</div>
            <div class="col-2">${review.title}</div>
        </div>
        <div>
            <div class="col-1">Text.</div>
            <div class="col-2">${review.txt}</div>
        </div>
        <div>
            <div class="col-1">Date.</div>
            <div class="col-2">${review.date}</div>
        </div>
        <div>
            <button onclick="location.href='review-update?no=${review.no}'">update</button>
            <button onclick="delReview(${review.no})">delete</button>
            <button onclick="location.href='review'">list</button>
<%--            <button onclick="history.back()">list</button>--%>
        </div>
    </div>
</div>

</body>
<script>
    function delReview(no){
        let ok = confirm('really?')
        if(ok){
            location.href='review-delete?no=' + no;
        }
    }
</script>
</html>
