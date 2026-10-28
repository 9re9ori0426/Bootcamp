<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/main.css">

</head>
<body>

<header>
    <a href="home">bo's place</a>
</header>
<nav>
    <div><a href="a">A</a></div>
    <div><a href="b">B</a></div>
    <div><a href="c">C</a></div>
    <div><a href="unit">unit</a></div>
    <div><a href="bmi">bmi</a></div>
</nav>
<main>
    <jsp:include page="${contentPage}"></jsp:include>
</main>
<footer>
    information...
</footer>

</body>
</html>
