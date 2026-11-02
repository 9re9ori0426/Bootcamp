<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> - Movie Page - </title>
</head>
<body>
<div>
    <form action="movie" method="post" enctype="multipart/form-data">
        <div class="movie-reg">
            <div>
                <div>Title</div>
                <div>
                    <input type="text" name="title">
                </div>
            </div>
            <div>
                <div>Actor</div>
                <div>
                    <input type="text" name="actor">
                </div>
            </div>
            <div>
                <div>File</div>
                <div>
                    <input type="file" name="img">
                </div>
            </div>
            <div>
                <div>Story</div>
                <div>
                    <textarea name="story"></textarea>
                </div>
            </div>
            <button>ADD</button>
        </div>
    </form>
</div>

<div style="width: 100%; display: flex; justify-content: center">
    <div class="movie-container">
        <c:forEach items="${movies}" var="movie">
            <div class="movie-wrap">
                <div class="movie-img" onclick="location.href='detail?no='+${movie.no}">
                    <img src="movieFile/${movie.img}" alt="">
                </div>
                <div class="movie-title">${movie.title}</div>
                <div class="movie-actor">${movie.actor}</div>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
