<%--
  Created by IntelliJ IDEA.
  User: thrma
  Date: 2026-11-04
  Time: 오전 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/review-update.css">
</head>
<body>
<section class="review-update">
    <div class="review-update-heading">
        <span>🩵 WRITE A REVIEW</span>
        <h2>나의 영화 이야기</h2>
        <p>기억에 남는 순간과 감상을 남겨 주세요 ♡</p>
    </div>

    <form class="review-update-form"
          action="review-update"
          method="post">

        <label class="review-update-field">
            <span>☁️ 리뷰 제목</span>
            <input type="text"
                   name="title"
                   value="${review.title}"
                   placeholder="리뷰 제목을 수정해 주세요"
                   required>
        </label>

        <div class="review-update-field">
            <label for="myText">📝 감상 이야기</label>

            <textarea name="text"
                      id="myText"
                      maxlength="200"
                      rows="8">${review.txt}</textarea>

            <div class="review-update-count">
                <span id="count">0</span> / 200
            </div>
        </div>

        <div class="review-update-actions">
            <button class="review-post-button" type="submit" name="no" value="${review.no}">
                💛 리뷰 수정하기
            </button>
        </div>
    </form>
</section>
</body>
<script>
    let mytext = document.getElementById('myText');
    let count = mytext.value.length;
    let countText = document.getElementById('count');
    mytext.addEventListener('input', (e) => {
        countText.innerText = e.target.value.length;
    })
</script>
</html>
