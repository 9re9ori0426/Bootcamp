const params = new URL(location.href).searchParams;
// const params = new URLSearchParams(location.search);

const _name = params.get("name");
const _id = params.get("id");
const _pw = params.get("pw");

const q = document.querySelector("q");

q.innerHTML = `<h1>name : " ${_name} "</h1><h1>id : ${_id}</h1><h1>pw : ${_pw}</h1>`;

// document.getElementById("name-input").value = params.get("name");
// document.getElementById("id-input").value = params.get("id");
// document.getElementById("pw-input").value = params.get("pw");
