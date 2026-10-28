function getIdPw() {
  const idEl = document.querySelector("#input-id");
  const pwEl = document.querySelector("#input-pw");

  if (idEl.value == "") {
    alert("id를 입력해주세요");
    idEl.focus();
    return;
  }
  if (pwEl.value == "") {
    alert("pw를 입력해주세요");
    pwEl.focus();
    return;
  }

  return [idEl.value, pwEl.value];
}

function handleLoginWithParams() {
  let [id, pw] = getIdPw();

  location.href = `output.html?id=${id}&pw=${pw}`;
}
function handleLogin() {
  let [id, pw] = getIdPw();

  //   const mainEl = document.querySelector("main");

  document.getElementById("input-id").disabled = true;
  document.getElementById("input-pw").disabled = true;
  document.getElementsByClassName("button-wrap")[0].remove();

  //   mainEl.innerHTML = `<div class="join-wrap" id="login-result">
  //         <div class="join-row">
  //             <div>ID</div>
  //             <div id="id-div">
  //                <input type="text" placeholder="" id="input-id" value=${id} disabled>
  //             </div>
  //         </div>
  //         <div class="join-row">
  //             <div>PW</div>
  //             <div id="pw-div">
  //                <input type="text" placeholder="" id="input-pw" value=${pw} disabled>
  //             </div>
  //         </div>
  //     </div>`;
}

function handleLoginWithNoParams(btn) {
  let [id, pw] = getIdPw();

  //   document.getElementById("input-id").parentElement.innerHTML =
  //     `<h2>${id}</h2>`;
  //   document.getElementById("input-pw").parentElement.innerHTML =
  // `<h2>${pw}</h2>`;
  document.getElementById("input-id").disabled = true;
  document.getElementById("input-pw").disabled = true;

  //   btn.parentElement.remove();
  //   document.getElementsByClassName("button-wrap")[0].remove();
  btn.parentNode.remove();
}
