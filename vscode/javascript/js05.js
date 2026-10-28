let x= 10;
let y = 20;
console.log( x > y)

console.log( x > y && y < 20)

let age = 50;
let result = age > 10 ? "welcome" : "go home";
console.log(result)

let ticket = 10000;

ticket = age > 10 ? ticket - 1000 : ticket - 500;
console.log('총금액 : ', ticket, "원");

let stringNum = "10"
let numberNum = 10
console.log(stringNum == numberNum)
console.log(stringNum === numberNum)

// object
let me1 = {
    name : "mz",
    age : 20
}
let me2 = {
    name : "mz",
    age : 20
}
let me3 = me1;

console.log(me1 == me2)
console.log(me1 == me3)

console.log('-'.repeat(40))

console.log(1 == true)
console.log(1 === true)

console.log(null == undefined)
console.log(null === undefined)
console.log(typeof null)
console.log("" == false)
console.log("" === false)