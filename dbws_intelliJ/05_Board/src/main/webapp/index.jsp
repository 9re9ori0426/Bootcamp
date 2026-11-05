<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>dw's world</title>
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/movie.css">
    <link rel="stylesheet" href="css/movie_detail.css">
</head>
<body>
<div class="login-area">
    <span style="color: red">${msg}</span>
    <jsp:include page="${loginPage}"></jsp:include>
</div>
<div class="container">
    <header onclick="location.href='main'">dw's place</header>
    <nav class="menu">
        <div>
            <a href="menu1">[Menu1]</a>
        </div>
        <div>
            <a href="movie">[Movie]</a>
        </div>
        <div>
            [Menu1]
        </div>
        <div>
            [Menu1]
        </div>
    </nav>
    <main>
        <jsp:include page='${content}'></jsp:include>
    </main>
</div>
</body>
</html>