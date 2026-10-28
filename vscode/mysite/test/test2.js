function handleLogin() {
  const name = document.getElementById("name-input").value;
  const id = document.getElementById("id-input").value;
  const pw = document.getElementById("pw-input").value;

  console.log(name, id, pw);

  if (name == "") {
    alert("must write name");
    document.getElementById("name-input").focus();
    return;
  }
  if (id == "") {
    alert("must write id");
    document.getElementById("id-input").focus();
    return;
  }
  if (pw == "") {
    alert("must write pw");
    document.getElementById("pw-input").focus();
    return;
  }
  location.href = `test3.html?name=${name}&id=${id}&pw=${pw}`;
}
