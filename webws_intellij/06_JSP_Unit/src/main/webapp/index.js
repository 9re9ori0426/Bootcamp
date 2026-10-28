function isValidate() {
    const input = document.querySelector('#input');
    const warn = document.querySelector('.warn_text');

    if( input.value.trim() === "" || isNaN(input.value) ){
        input.focus();
        warn.style.visibility = 'visible';
        if(input.value === "" ){
            warn.innerText = "값을 입력하세요.";
        }
        else{
            warn.innerText = "숫자만 입력하세요.";
        }
        return false;
    }

    return true;
}

function handleConvert() {
    const form = document.querySelector('#form');

    if(isValidate() === false) { return false; }

    form.submit();
}

function handleOnChangeInput() {
    const warn = document.querySelector('.warn_text');
    warn.style.visibility = 'hidden';

    if(isValidate() === false) { return false; }
}