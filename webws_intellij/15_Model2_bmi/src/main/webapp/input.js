function isValidate(){
    const name = document.querySelector('input[name="name"]');
    const height = document.querySelector('input[name="height"]');
    const weight = document.querySelector('input[name="weight"]');
    const form = document.querySelector("form");

    if(name.value === "") {
        name.focus();
        document.querySelector('#warn_name').style.visibility = 'visible';
        return false;
    }
    else if(height.value === "" || isNaN(height.value) ) {
        height.focus();
        document.querySelector('#warn_height').style.visibility = 'visible';

        let msg = "키를 입력하세요";
        if( isNaN(height.value ) ){
            msg = "숫자를 입력해주세요";
        }
        document.querySelector('#warn_height').innerText = msg;
        return false;
    }
    else if(weight.value === "" || isNaN(weight.value)) {
        weight.focus();
        document.querySelector('#warn_weight').style.visibility = 'visible';

        let msg = "체중을 입력하세요";
        if( isNaN(weight.value ) ){
            msg = "숫자를 입력해주세요";
        }
        document.querySelector('#warn_weight').innerText = msg;
        return false;
    }

    form.submit();
    return true;
}

function isChangeInput(){
    document.querySelector('#warn_name').style.visibility = 'hidden';
    document.querySelector('#warn_height').style.visibility = 'hidden';
    document.querySelector('#warn_weight').style.visibility = 'hidden';
}