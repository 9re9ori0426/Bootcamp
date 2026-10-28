function getAge() {
  const inputEl = document.getElementById("input-birth");
  const _birth = Number(inputEl.value);

  const crit_year = new Date().getFullYear();

  if (isNaN(_birth) == true || _birth == "") {
    alert("숫자를 입력해주세요");
    inputEl.focus();
    return;
  }
  if (_birth > crit_year) {
    alert(`${crit_year}이하의 숫자를 입력해주세요`);
    inputEl.focus();
    return;
  }

  let _age = crit_year - _birth + 1;

  let h1 = document.createElement("h1");
  h1.innerText = `당신은 ${_age}살 입니다.`;
  h1.style.textAlign = "center";

  document.querySelector("main").lastChild.remove();
  document.querySelector("main").append(h1);
}

function getAge2() {
  const inputEl = document.getElementById("input-birth");
  const _birth = Number(inputEl.value);

  const crit_year = new Date().getFullYear();

  if (isNaN(_birth) == true || _birth == "") {
    alert("숫자를 입력해주세요");
    inputEl.focus();
    return;
  }
  if (_birth > crit_year) {
    alert(`${crit_year}이하의 숫자를 입력해주세요`);
    inputEl.focus();
    return;
  }

  let _age = crit_year - _birth + 1;

  window.open(
    `agePopup.html?age=${_age}`,
    "",
    "top=300, left=100, width=800, height=300",
  );
}
