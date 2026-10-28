/* =======================================
   1. HTML 요소를 JavaScript로 가져오기
======================================= */
const app = document.querySelector('.app');
const searchButton = document.querySelector('#search-toggle');
const searchInput = document.querySelector('#search-input');
const profileMenu = document.querySelector('.profile-menu');
const profileButton = document.querySelector('.profile-button');

/* =======================================
   2. 검색 화면 열기 / 닫기
======================================= */
function setSearchOpen(isOpen) {
  // true이면 app에 'is-search-open' 추가, false이면 제거
  // CSS는 이 클래스가 있는지 보고 메인/검색 화면을 교체합니다.
  app.classList.toggle('is-search-open', isOpen);

  // 스크린리더가 검색 화면의 열림 상태를 알 수 있게 변경
  searchButton.setAttribute('aria-expanded', String(isOpen));
  searchButton.setAttribute('aria-label', isOpen ? '검색 화면 닫기' : '검색 화면 열기');

  if (isOpen) {
    // 검색 화면을 열면 바로 검색어를 입력할 수 있게 커서를 이동
    searchInput.focus();
    // 검색 중에는 프로필 드롭다운이 열려 있지 않도록 처리
    setProfileOpen(false);
  } else {
    // 검색 화면을 닫으면 검색 버튼으로 키보드 포커스 이동
    searchButton.focus();
  }
}

// 돋보기 / X 버튼을 클릭할 때마다 현재 상태를 반대로 바꿈
searchButton.addEventListener('click', () => {
  const isOpen = app.classList.contains('is-search-open');
  setSearchOpen(!isOpen);
});

/* =======================================
   3. 프로필 드롭다운 열기 / 닫기
======================================= */
function setProfileOpen(isOpen) {
  profileMenu.classList.toggle('is-open', isOpen);
  profileButton.setAttribute('aria-expanded', String(isOpen));
}

// 프로필 영역에 마우스를 올리면 아래쪽 드롭다운 표시
profileMenu.addEventListener('mouseenter', () => {
  setProfileOpen(true);
});

// 프로필과 드롭다운을 모두 벗어나면 메뉴 숨기기
profileMenu.addEventListener('mouseleave', () => {
  setProfileOpen(false);
});

// 모바일이나 터치 환경에서는 사용자 아이콘 클릭으로 열고 닫기
profileButton.addEventListener('click', () => {
  const isOpen = profileMenu.classList.contains('is-open');
  setProfileOpen(!isOpen);
});

// 드롭다운 안쪽 링크로 Tab 이동 시에도 메뉴가 유지되도록 처리
// (버튼 자체의 focusin에서 열면 모바일 클릭 시 바로 닫힐 수 있어 제외)
profileMenu.addEventListener('focusin', (event) => {
  if (event.target !== profileButton) {
    setProfileOpen(true);
  }
});

profileMenu.addEventListener('focusout', (event) => {
  // 포커스가 프로필 영역 완전히 밖으로 나갔을 때만 닫기
  if (!profileMenu.contains(event.relatedTarget)) {
    setProfileOpen(false);
  }
});

// 프로필 메뉴 바깥쪽을 클릭하면 드롭다운 닫기
document.addEventListener('click', (event) => {
  if (!profileMenu.contains(event.target)) {
    setProfileOpen(false);
  }
});

/* =======================================
   4. ESC 키로 열려 있는 화면/메뉴 닫기
======================================= */
document.addEventListener('keydown', (event) => {
  if (event.key !== 'Escape') return;

  if (app.classList.contains('is-search-open')) {
    setSearchOpen(false);
  }
  if (profileMenu.classList.contains('is-open')) {
    setProfileOpen(false);
    profileButton.focus();
  }
});

/*
  참고: 입력창에 검색어를 넣어 실제 콘텐츠 결과를 불러오려면
  검색 API 또는 별도의 검색 결과 페이지 연결이 필요합니다.
  지금 예제는 화면 전환과 메뉴 동작을 연습하기 위한 코드입니다.
*/
