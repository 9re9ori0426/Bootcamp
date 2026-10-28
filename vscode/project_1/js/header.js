function handleMouseOverProfile() {
  const n = document.getElementById("header-aside-profile-modal");

  // n.style.visibility = "visible";
  n.style.opacity = 1;
}

function handleMouseOutProfile() {
  const n = document.getElementById("header-aside-profile-modal");

  // n.style.visibility = "hidden";
  n.style.opacity = 0;
}

function handleClickSearch() {
  const icon = document.getElementById("toggle-search");
  const n = document.getElementById("search-modal");
  const bd = document.getElementById("search-modal-back-drop");
  const input = document.getElementById("search-modal-input");

  const isVisible = n.style.visibility == "visible";

  if (isVisible) {
    icon.src = "img/icon_search.svg";

    n.style.visibility = "hidden";
    bd.style.visibility = "hidden";
    input.blur();
  } else {
    icon.src = "img/icon_x.svg";

    n.style.visibility = "visible";
    bd.style.visibility = "visible";
    input.focus();
  }
}
