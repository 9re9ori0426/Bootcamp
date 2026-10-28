// 큰 배너
const slides = document.querySelector(".slides");
const prevBtn = document.querySelector("#prev-btn");
const nextBtn = document.querySelector("#next-btn");

// 처음에는 오른쪽 화살표만 표시
prevBtn.style.display = "none";
nextBtn.style.display = "flex";

// 오른쪽 화살표: 두 번째 배너로 이동
nextBtn.onclick = function () {
  slides.style.transform = "translateX(calc(-100% - 12px))";

  nextBtn.style.display = "none";
  prevBtn.style.display = "flex";
};

// 왼쪽 화살표: 첫 번째 배너로 이동
prevBtn.onclick = function () {
  slides.style.transform = "translateX(0)";

  prevBtn.style.display = "none";
  nextBtn.style.display = "flex";
};

// 2. 아래 카테고리
const categoryTrack = document.querySelector(".category-track");
const categoryPrev = document.querySelector("#category-prev");
const categoryNext = document.querySelector("#category-next");

// 처음에는 오른쪽 화살표만 표시
categoryPrev.style.display = "none";
categoryNext.style.display = "flex";

// 오른쪽 화살표: 토크쇼부터 코미디까지 표시
categoryNext.onclick = function () {
  categoryTrack.style.transform = "translateX(-100%)";

  categoryNext.style.display = "none";
  categoryPrev.style.display = "flex";
};

// 왼쪽 화살표: 버라이어티부터 관찰리얼리티까지 표시
categoryPrev.onclick = function () {
  categoryTrack.style.transform = "translateX(0)";

  categoryPrev.style.display = "none";
  categoryNext.style.display = "flex";
}; // 3. 최신회차 모음
const latestList = document.querySelector(".latest-list");
const latestPrev = document.querySelector("#latest-prev");
const latestNext = document.querySelector("#latest-next");

// 현재 위치에 따라 화살표를 표시하는 함수
function latestArrowCheck() {
  // 전체 카드 너비에서 현재 보이는 영역의 너비를 뺍니다.
  const lastPosition = latestList.scrollWidth - latestList.clientWidth;

  // 처음 위치라면 왼쪽 화살표 숨김
  if (latestList.scrollLeft <= 1) {
    latestPrev.style.display = "none";
  } else {
    latestPrev.style.display = "flex";
  }

  // 마지막 위치라면 오른쪽 화살표 숨김
  if (latestList.scrollLeft >= lastPosition - 1) {
    latestNext.style.display = "none";
  } else {
    latestNext.style.display = "flex";
  }
}

// 오른쪽 화살표: 보이는 영역의 너비만큼 이동
latestNext.onclick = function () {
  latestList.scrollLeft += latestList.clientWidth;
};

// 왼쪽 화살표: 보이는 영역의 너비만큼 되돌아가기
latestPrev.onclick = function () {
  latestList.scrollLeft -= latestList.clientWidth;
};

// 목록이 움직일 때 화살표 상태 확인
latestList.onscroll = function () {
  latestArrowCheck();
};

// 창 크기를 바꿨을 때 화살표 상태 확인
window.addEventListener("resize", function () {
  latestArrowCheck();
});

// 처음 페이지를 열었을 때 화살표 상태 확인
latestArrowCheck();
// 4. 실시간 인기 예능

// 카드 목록과 카드 11개 선택
const liveList = document.querySelector(".under-category");
const liveCards = document.querySelectorAll(".under-category .live-card");

// 화살표 선택
const livePrev = document.querySelector("#live-prev");
const liveNext = document.querySelector("#live-next");

// 0: 1~6위 화면
// 1: 6~11위 화면
let livePage = 0;

// 현재 화면에 맞게 목록 위치와 화살표를 바꾸는 함수
function updateLiveSlider() {
  if (livePage === 0) {
    // 첫 화면: 1~6위
    liveList.scrollLeft = 0;

    livePrev.style.display = "none";
    liveNext.style.display = "flex";
  } else {
    // 두 번째 화면: 6~11위
    // 첫 번째 카드에서 여섯 번째 카드까지의 거리 계산
    const moveDistance = liveCards[5].offsetLeft - liveCards[0].offsetLeft;

    liveList.scrollLeft = moveDistance;

    livePrev.style.display = "flex";
    liveNext.style.display = "none";
  }
}

// 오른쪽 버튼을 누르면 두 번째 화면
liveNext.onclick = function () {
  livePage = 1;
  updateLiveSlider();
};

// 왼쪽 버튼을 누르면 첫 번째 화면
livePrev.onclick = function () {
  livePage = 0;
  updateLiveSlider();
};

// 창 크기가 바뀌면 이동 거리도 다시 계산
window.addEventListener("resize", function () {
  updateLiveSlider();
});

// 처음 페이지를 열었을 때 첫 화면 표시
updateLiveSlider();
