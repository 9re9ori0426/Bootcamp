function handleClickDropDown(num) {
  let ns = document.getElementsByClassName("footer-dropDown-box");

  for (let i = 0; i < ns.length; i++) {
    if (i == num) {
      ns[i].style.visibility =
        ns[i].style.visibility == "hidden" ? "visible" : "hidden";
    } else {
      ns[i].style.visibility = "hidden";
    }
  }
}

const insta = document.querySelector(".insta");
insta.addEventListener("mouseover", (e) => {
  e.target.src = "../tving main gi/티빙 사진/oo.svg";
});
insta.addEventListener("mouseleave", (e) => {
  e.target.src = "../tving main gi/티빙 사진/tvingInsta.svg";
});
