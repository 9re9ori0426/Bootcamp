// const params = new URLSearchParams(location.search);
const params = new URL(location.href).searchParams;

const _id = params.get("id");
const _pw = params.get("pw");

document.getElementById("input-id").value = _id;
document.getElementById("input-pw").value = _pw;

// document.getElementById("id-div").innerHTML = `<h2>${_id}</h2>`;
// document.getElementById("pw-div").innerHTML = `<h2>${_pw}</h2>`;
