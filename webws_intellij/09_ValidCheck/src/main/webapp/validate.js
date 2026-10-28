console.log('validate.js');

function isEmpty(input){
    return !input.value;
}

function isLessThan(input, len){
    return input.value.length < len;
}

function isMoreThan(input, len){
    return input.value.length > len;
}

function containsKorean(input){
    let ok = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@._1234567890"

    for( let i = 0; i < input.value.length; i++){
        if( ok.indexOf(input.value[i]) === -1 ){
            return true;
        }
    }
    return false;
}

// <input> 문자열 세트를 넣으면..
// 그 세트가 포함이 안되어 있으면 true
function notContains(input, set){
    for(let i = 0; i < set.length; i++){
        if(input.value.indexOf(set[i]) !== -1 ){
            return false;
        }
    }
    return true;
}

function isNotEqual(input1, input2){
    return input1.value !== input2.value;
}

function isNotNumber(input){
    return isNaN(input.value);
}

function isNotType(input, type){
    return input.value.indexOf(`.${type}`) === -1;
}

function hasBlank(input){
   return input.value.trim().length !== input.value.length
}

function regexContainsKorean(input){
    console.log( /[ㄱ-힇]+/.test(input.value) );
}

function regexContainsUpperCase(input){
    return !/[A-Z]+/.test(input.value);
}
function regexContainsNumber(input){
    return !/[0-9]+/.test(input.value);
}

function regexOnlyNumber(input){
    return !/^[0-9]+$/.test(input.value);
}