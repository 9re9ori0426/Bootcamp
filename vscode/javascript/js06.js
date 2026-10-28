// 조건문

let score = 80;
if( score >= 80 ){
    console.log("상")
}
else if( score >= 60){
    console.log("중")
}
else {
    console.log("하")
}

let a = 6;
let b = "헤헤"

console.log(`a는 ${a}이고 b는 ${b}다`)

for(let i = 2; i < 10; i++){
    console.log(`${i}단 -------`)
    for(let j = 1; j < 10; j++ ){
        console.log(`${i} X ${j} = ${i*j}`);
    }
}

let i = 0;
while(true){
    i++;
    if(i == 10){
        break;
    }
}
console.log(i)