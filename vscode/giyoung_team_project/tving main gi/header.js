function handleMouseOverProfile() {
  const n = document.getElementById("dropDown");

  n.style.visibility = "visible";
}

function handleMouseOutProfile() {
  const n = document.getElementById("dropDown");

  n.style.visibility = "hidden";
}
const app = document.querySelector(".app");
const searchButton = document.querySelector("#search-toggle");
const searchInput = document.querySelector("#search-input");

function preventScroll(e) {
  e.preventDefault();
}

function setSearchOpen(isOpen) {
  app.classList.toggle("is-search-open", isOpen);

  searchButton.setAttribute("aria-expanded", String(isOpen));
  searchButton.setAttribute(
    "aria-label",
    isOpen ? "검색 화면 닫기" : "검색 화면 열기",
  );

  if (isOpen) {
    window.addEventListener("wheel", preventScroll, { passive: false });
    searchInput.focus();
  } else {
    searchButton.focus();
    window.removeEventListener("wheel", preventScroll, { passive: false });
  }
}
searchButton.addEventListener("click", () => {
  const isOpen = app.classList.contains("is-search-open");
  setSearchOpen(!isOpen);
});
document.addEventListener("keydown", (Event) => {
  if (Event.key !== "Escape") return;

  if (app.classList.contains("is-search-open")) {
    setSearchOpen(false);
  }
});

const insta = document.querySelector(".insta");
insta.addEventListener("mouseover", (e) => {
  e.target.src = "../tving main gi/티빙 사진/oo.svg";
});
insta.addEventListener("mouseleave", (e) => {
  e.target.src = "../tving main gi/티빙 사진/tvingInsta.svg";
});
