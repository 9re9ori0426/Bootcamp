let age
age = 20

/*
    number, string, boolean, null
    object, undefinde, func, ...
*/

// var 문제점.

// 1. hoisting (위로 끌어 올려짐)
whyDontUse = 1
var whyDontUse
console.log(whyDontUse)

// 2. ignore block 영역 무시.

{
    var whyDontUse2
    whyDontUse2 = 222

    let whyUse
    whyUse = 10
}
var whyDontUse2
whyDontUse2 = 20

console.log(whyDontUse2)
console.log(whyUse)