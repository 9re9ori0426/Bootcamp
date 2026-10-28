let age;
age = 20;

console.log(typeof 1);
console.log(typeof '1')
console.log(typeof true)
console.log(typeof {})
console.log(typeof (() => {}));

whyDontUse = 1;
var whyDontUse;
console.log(whyDontUse);

{
    var whyDontUse2 = 222;
    let whyUse = 10;

}

console.log(whyDontUse2)
// console.log(whyUse)

const arr = Array.from( {length : 100}, (_, i) => i );

let root =document.getElementById("root");
let ol = root.appendChild( document.createElement("ul") )
arr.map( (v) => {
    let dd = document.createElement("li");
    dd.innerHTML = v+1;
    ol.appendChild(dd);
})