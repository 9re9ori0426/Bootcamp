<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update" method="post">
    <div style="display: flex; justify-content: center;">
        <div class="movie-detail">
            <div>
                <div class="col-1">No.</div>
                <div class="col-2">
                    <input name="no" type="text" value="${movie.no}" readonly>
<%--                    <input type="text" name="no" value="${movie.no}" hidden>--%>
                </div>
            </div>
            <div>
                <div><img src="${movie.img}" alt=""></div>
            </div>
            <div>
                <div class="col-1">Title.</div>
                <div class="col-2"><input name="title" type="text" value="${movie.title}"></div>
            </div>
            <div>
                <div class="col-1">Actor.</div>
                <div class="col-2"><input name="actor" type="text" value="${movie.actor}"></div>
            </div>
            <div>
                <div class="col-1">Story.</div>
                <div class="col-2"><textarea name="story" id="" cols="30" rows="10">${movie.story}</textarea></div>
            </div>
            <div>
                <button class="movie-btn" name="no" value="${movie.no}">Done</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
