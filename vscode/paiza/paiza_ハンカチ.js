process.stdin.resume();
process.stdin.setEncoding("utf8");
// 自分の得意な言語で
// Let's チャレンジ！！
var lines = [];
var reader = require("readline").createInterface({
  input: process.stdin,
  output: process.stdout,
});
let N;
let m = new Map();

let getRotate = (arr) => {
  // 3, 2 => 2, 3
  let H = arr.length;
  let W = arr[0].length;

  let _ori = arr;
  let _new = Array.from({ length: W }, () =>
    Array.from({ length: H }, () => "."),
  );
  for (let i = 0; i < H; i++) {
    for (let j = 0; j < W; j++) {
      _new[W - 1 - j][i] = arr[i][j];
    }
  }

  return _new;
};

let getReverseX = (arr) => {
  let H = arr.length;
  let W = arr[0].length;

  let _ori = arr;
  let _new = Array.from({ length: H }, () =>
    Array.from({ length: W }, () => "."),
  );

  for (let i = 0; i < H; i++) {
    for (let j = 0; j < W; j++) {
      _new[i][j] = arr[i][W - 1 - j];
    }
  }

  return _new;
};

let getReverseY = (arr) => {
  let H = arr.length;
  let W = arr[0].length;

  let _ori = arr;
  let _new = Array.from({ length: H }, () =>
    Array.from({ length: W }, () => "."),
  );

  for (let i = 0; i < H; i++) {
    for (let j = 0; j < W; j++) {
      _new[i][j] = arr[H - 1 - i][j];
    }
  }

  return _new;
};

let toString = (arr) => {
  let _str = "";
  for (let i = 0; i < arr.length; i++) {
    _str += arr[i].join("");
  }

  return _str;
};

reader.on("line", (line) => {
  lines.push(line);
});
reader.on("close", () => {
  N = Number(lines[0]);

  let _l = 1;
  let size = 0;
  for (let i = 0; i < N; i++) {
    let [H, W] = lines[_l].split(" ").map((v) => Number(v));

    let serial = `${H} ${W}`;
    let serial_R = `${W} ${H}`;

    let _ori = [];
    for (let j = 0; j < H; j++) {
      _ori.push(lines[_l + j + 1].split(""));
    }

    let _tmpStr = toString(_ori);

    if (m.has(serial)) {
      let _gArr = m.get(serial);
      if (_gArr.has(_tmpStr)) {
        _l += H + 1;
        continue;
      }
    }

    let s = [];
    let s_R = [];

    s.push(_tmpStr);
    let tmp = getReverseX(_ori);
    s.push(toString(tmp));
    tmp = getReverseY(_ori);
    s.push(toString(tmp));
    tmp = getReverseX(tmp);
    s.push(toString(tmp));

    let _deg90 = getRotate(_ori);
    s_R.push(toString(_deg90));
    tmp = getReverseX(_deg90);
    s_R.push(toString(tmp));
    tmp = getReverseY(_deg90);
    s_R.push(toString(tmp));
    tmp = getReverseX(tmp);
    s_R.push(toString(tmp));

    size++;
    if (m.has(serial)) {
      let _tmpM = m.get(serial);
      for (let i = 0; i < s.length; i++) {
        _tmpM.add(s[i]);
      }
      m.set(serial, _tmpM);
    } else {
      m.set(serial, new Set(s));
    }

    if (m.has(serial_R)) {
      let _tmpM_R = m.get(serial_R);
      for (let i = 0; i < s.length; i++) {
        _tmpM_R.add(s_R[i]);
      }
      m.set(serial_R, _tmpM_R);
    } else {
      m.set(serial_R, new Set(s_R));
    }

    _l += H + 1;
  }
  console.log(size);
});
