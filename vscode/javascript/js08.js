// 배열 []
console.log([1, 2, 3]);

let p = document.createElement("p");
// p.innerHTML = "<span style='color : red;'>test</span>";
let root = document.getElementById("root");
root.appendChild(p);

function printInfo() {
  console.log("mz");
  console.log(20);
}

function print2Dan() {
  for (let i = 1; i < 10; i++) {
    console.log(`2 X ${i} = ${2 * i}`);
  }
}

function gugudan(num) {
  for (let i = 1; i < 10; i++) {
    console.log(`${num} X ${i} = ${num * i}`);
  }
}

function add(a, b) {
  console.log(a + b);
}

function delayAdd(num) {
  p.innerText = num;
  // return setTimeout( () => delayAdd(num+1), 1);
}

delayAdd(0);

function printGugudan() {
  const i1Input = document.getElementById("i1");
  // gugudan(i1Input.value);
  // i1Input.focus();
  // i1Input.value = "";

  const gu = document.getElementById("gugudan");
  const num = i1Input.value;

  if (num == "") {
    return;
  }

  while (gu.firstChild) {
    gu.removeChild(gu.firstChild);
  }

  for (let i = 1; i < 10; i++) {
    setTimeout(() => {
      let tmp = document.createElement("span");
      tmp.innerText = `${num} X ${i} = ${num * i}\n`;
      gu.appendChild(tmp);
    }, 100 * i);
  }
}

function gugudan2() {
  // const i2Input = document.getElementById("i2");
  // const i2Input = document.querySelector("#i2");
  // console.log(i2Input.value);

  // console.log("document.myForm.myInput.value", document.myForm.myInput.value)

  return false;
}

function delayColor() {
  const b1 = document.getElementById("b1");
  let a = Math.floor(Math.random() * 256);
  let b = Math.floor(Math.random() * 256);
  let c = Math.floor(Math.random() * 256);
  b1.style.backgroundColor = `#${a.toString(16)}${b.toString(16)}${c.toString(16)}`;
  return setTimeout(() => delayColor(), 10);
}
delayColor();
