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

document.querySelector(".coupon-btn").addEventListener("click", function () {
  openModal(".coupon-modal");
});
