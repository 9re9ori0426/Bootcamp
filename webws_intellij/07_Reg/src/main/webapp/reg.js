function validateForm(){
    const name = document.querySelector('input[name="name"]')
    const id = document.querySelector('input[name="id"]')
    const pw = document.querySelector('input[name="pw"]')

    const form = document.querySelector("form")

    if( name.value === ""){
        name.focus();
        document.getElementById("warn_name").style.visibility = 'visible';
        return false;
    }
    else if( id.value === ""){
        id.focus();
        document.getElementById("warn_id").style.visibility = 'visible';
        return false;
    }
    else if( pw.value === ""){
        pw.focus();
        document.getElementById("warn_pw").style.visibility = 'visible';
        return false;
    }

    form.submit();
    return true;
}

function changeValidate(){
    document.getElementById("warn_name").style.visibility = 'hidden';
    document.getElementById("warn_id").style.visibility = 'hidden';
    document.getElementById("warn_pw").style.visibility = 'hidden';
}