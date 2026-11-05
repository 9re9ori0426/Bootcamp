<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/review.css">
</head>
<body>
<section class="review-page">
    <div class="review-heading">
        <div>
            <span class="review-badge">🩵 REVIEW</span>
            <h2>차곡차곡 영화 감상록</h2>
            <p>영화를 보고 느낀 이야기를 나눠 주세요.</p>
        </div>


        <a class="review-write"
           href="review-add">
            ✏️ 리뷰 쓰기
        </a>
    </div>

    <div class="review-list">
        <c:forEach items="${reviews}" var="review">
            <article class="review-card">
                <h3 class="review-title">
                    <span onclick="location.href='review-detail?no=${review.no}'" style="cursor: pointer">
                        <c:out value="${review.title}" />
                    </span>
                </h3>

                <div class="review-date">
                    <span aria-hidden="true">🗓️</span>
                    <c:out value="${review.date}" />
                </div>



            </article>
        </c:forEach>

        <c:if test="${empty reviews}">
            <div class="review-empty">
                <span aria-hidden="true">☁️</span>
                <p>아직 등록된 리뷰가 없어요.</p>
                <small>첫 번째 영화 이야기를 남겨 주세요 ♡</small>
            </div>
        </c:if>
    </div>
</section>
<div class="review-page-numbers">
    <a href="review?p=1">처음</a>

    <c:forEach begin="1" end="${totalPage}" var="i">
        <a href="review?p=${i}"
           class="${currentPage == i ? 'is-active' : ''}">
                ${i}
        </a>
    </c:forEach>

    <c:if test="${totalPage > 0}">
        <a href="review?p=${totalPage}">마지막</a>
    </c:if>
</div>



</body>
</html>
