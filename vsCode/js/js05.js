
/*
    논리(비교) 연산자 : bool인거
    <, > >=, ...
*/

let x = 10
let y = 20
console.log(x > y)

/*
    결합 연산자 : 논리 연산자
    &&, ||
    !(not)
*/

console.log(x > y && y < 20)

// 삼항연산자
// 조건 ? true : false

// 나이 10살 넘으면 welcome 아니면 go home
let age = 5
let result = age > 10 ? "welcome" : "home"
console.log(result)

// 입장료 10000원
let ticket = 10000

// 나이 10살 넘으면 1000원 아니면 500원 할인
let dc = age > 10 ? 1000 : 500
// 총금액
let total = ticket - dc
// 결과 출력
// 총금액 : ㅇㅇ원
console.log("총금액 : " + total + "원")

// 같다 ==, ===
let stringNum = "10"
let numberNum = 10

// == : 타입을 안 따짐
console.log(stringNum == numberNum)
console.log(stringNum != numberNum)

// === : 타입까지 따짐
console.log(stringNum === numberNum)
console.log(stringNum !== numberNum)

// object
let me1 = {name : "dw", age : 20}   // 객체
let me2 = {name : "dw", age : 20}
let me3 = me1

console.log(me1)

console.log(me1 == me2)
console.log(me1 === me2)

console.log(me1 == me3)
console.log(me1 === me3)

console.log("---------------------------")

console.log(0 == false)
console.log(0 === false)

console.log(null == undefined)
console.log(null === undefined)

console.log("" == false)
console.log("" === false)

console.log(1 == true)
console.log(1 === true)
