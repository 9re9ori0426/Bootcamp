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
    <div class="page-arrow">◀</div>
    <div class="movie-container">
        <c:forEach items="${movies}" var="movie">
            <div class="movie-wrap">
                <div class="movie-img" onclick="location.href='detail?no='+${movie.no}">
                    <img src="${movie.img}" alt="">
                </div>
                <div class="movie-title">${movie.title}</div>
                <div class="movie-actor">${movie.actor}</div>
                <div>
                    <button class="movie-btn" onclick="delMovie(${movie.no})">DEL</button>
                    <button class="movie-btn" onclick="location.href='update?no=${movie.no}'">수정(jsp)</button>
                    <button class="movie-btn" onclick="location.href='edit?no=${movie.no}'">수정(img/jsp)</button>
                    <button class="movie-btn" onclick="upMovie('${movie.title}', '${movie.actor}', ${movie.no})">
                        수정(js)
                    </button>
                </div>
            </div>
        </c:forEach>
    </div>
    <div class="page-arrow">▶</div>
</div>
<div style="display: flex;justify-content: center">
    <c:choose>
        <c:when test="${currentPage != 1}">
            <button class="page-btn" onclick="location.href='movie?p=${currentPage - 1}'">prev</button>
        </c:when>
        <c:otherwise>
            <button class="page-btn">next</button>
        </c:otherwise>
    </c:choose>
    <c:choose>
        <c:when test="${currentPage != totalPage}">
            <button class="page-btn" onclick="location.href='movie?p=${currentPage + 1}'">next</button>
        </c:when>
        <c:otherwise>
            <button class="page-btn">next</button>
        </c:otherwise>
    </c:choose>
</div>
<div>
    <a href="movie?p=1">[<<]</a>
    <c:forEach begin="1" end="${totalPage}" var="i">
        <a href="movie?p=${i}">[${i}]</a>
    </c:forEach>
    <a href="movie?p=${totalPage}">[>>]</a>
</div>
</body>
<script>
    function upMovie(t, a, n) {
        let title = prompt("Edit title", t);
        let actor = prompt("Edit actor", a);
        // if (title != "" && actor != "" && title != null && actor != null) {
        location.href = "update?title=" + title + "&actor=" + actor + "&no=" + n;
        // }
    }

    function delMovie(no) {
        let ok = confirm("Delete movie?");
        if (ok) {
            location.href = "movie?no=" + no;
        }
    }
</script>
</html>
