console.log('siteCheck.js');

function call() {
    const i1EL = document.querySelector("#i1");
    const i2EL = document.querySelector("#i2");
    const i3EL = document.querySelector("#i3");
    const i4EL = document.querySelector("#i4");
    const i5EL = document.querySelector("#i5");
    const i6EL = document.querySelector("#i6");

    if( isEmpty(i1EL) || isLessThan(i1EL, 5) || containsKorean(i1EL) ){
        alert("[error i1EL] 다시 확인 바랍니다.")
        i1EL.focus();
        return;
    }

    if( isLessThan(i2EL, 3) || isMoreThan(i2EL, 10) ){
        alert("[error i2EL] 다시 확인 바랍니다.")
        i2EL.focus();
        return;
    }

    if( isLessThan(i3EL, 5) ||
        notContains(i3EL, "QWERTYUIOPASDFGHJKLZXCVBNM") ||
        notContains(i3EL, "1234567890")
    ){
        alert("[error i3EL] 다시 확인 바랍니다.")
        i3EL.focus();
        return;
    }

    if( isNotEqual(i4EL, i3EL) ){
        alert("[error i4EL] 다시 확인 바랍니다.")
        i3EL.value = "";
        i4EL.value = "";
        i3EL.focus();
        return;
    }

    if( isNotNumber(i5EL) ||
        isEmpty(i5EL) ||
        hasBlank(i5EL)
    ){
        alert("[error i5EL] 다시 확인 바랍니다.")
        i5EL.focus();
        return;
    }

    if( isNotType(i6EL,"jpg") && isNotType(i6EL,"png") ){
        alert("[error i6EL] 다시 확인 바랍니다.")
        return;
    }

    document.querySelector("#myForm").submit();
}