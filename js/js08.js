// 배열 []
console.log([1,2,3])

function printInfo() {
    console.log("dw")
}

function print2Dan() {
    for (let i = 1; i < 10; i++) {
        console.log(`2 x ${i} = ${i*2}`)
    }
}

function add(a, b) {
    console.log(a + b)
}

function gugudan(a) {
    for (let i = 1; i < 10; i++) {
        console.log(`${a} x ${i} = ${a * i}`)
    }
}

function printGugudan() {
    const i1Input = document.getElementById('i1')
    console.log(i1Input)
    console.log(i1Input.value)
    let i1Val = i1Input.value
    
    for (let i = 1; i < 10; i++) {
        console.log(`${i1Val} x ${i} = ${i1Val * i}`)
    }

    i1Input.focus()
    i1Input.value = "";
}

function gugudan2() {
    // const i2Input = document.getElementById("i2")
    // const i2Input = document.querySelector("#i2")
    // console.log(i2Input)
    let i2Input = document.myForm.myInput
    console.log(i2Input.value)

    return false
}