const modalEl = document.getElementById("modal");
const modalAgeEl = document.getElementById("modal-age");
const modalOpenBtnEL = document.getElementById("open-modal-btn");
// const modalCloseBtnEL = document.getElementById("close-modal-btn");

modalOpenBtnEL.addEventListener("click", () => {
  const birth = document.getElementById("input-birth").value;

  const age = new Date().getFullYear() - birth + 1;

  modalAgeEl.innerText = age;
  modalEl.showModal();
});
