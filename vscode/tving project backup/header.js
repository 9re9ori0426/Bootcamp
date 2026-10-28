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

function setSearchOpen(isOpen) {
  app.classList.toggle("is-search-open", isOpen);

  searchButton.setAttribute("aria-expanded", String(isOpen));
  searchButton.setAttribute(
    "aria-label",
    isOpen ? "검색 화면 닫기" : "검색 화면 열기",
  );

  if (isOpen) {
    searchInput.focus();
  } else {
    searchButton.focus();
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
  e.target.src = "./티빙 사진/oo.svg";
});
insta.addEventListener("mouseleave", (e) => {
  e.target.src = "./티빙 사진/tvingInsta.svg";
});

function openModal(selector) {
  document.querySelector(selector).classList.add("open");
}
function closeModal(selector) {
  document.querySelector(selector).classList.remove("open");
}

document.querySelectorAll("[data-close]").forEach(function (btn) {
  btn.addEventListener("click", function () {
    closeModal(btn.dataset.close);
  });
});

document.querySelector(".coupon-btn").addEventListener("click", function (e) {
  openModal(".coupon-modal");
});
