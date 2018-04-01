function formValidation() {
    var uname = document.registration.username;
    var uadd = document.registration.address;
    var uzip = document.registration.postalcode;
    var uphonenumber = document.registration.phonenumber;
    var uemail = document.registration.email;
    console.log(uname.value+" "+uadd.value+" "+uzip.value+" "+uphonenumber.value+" "+uemail.value);
    if (allLetter(uname)) {
            if (allnumeric(uzip)) {
                if (validatePhone(uphonenumber)) {
                    if (validateEmail(uemail)) {
                    	return true;
                    }
                }
            }
    }
    return false;
}

function allLetter(uname) {
    var letters = /^[a-zA-Z ]{2,30}$/;
    if (uname.value.match(letters)) {
        return true;
    } else {
        alert('Username must have alphabet characters only');
        uname.focus();
        return false;
    }
}

function alphanumeric(uadd) {
    var letters = /^[0-9a-zA-Z]+$/;
    if (uadd.value.match(letters)) {
        return true;
    } else {
        alert('User address must have alphanumeric characters only');
        uadd.focus();
        return false;
    }
}

function allnumeric(uzip) {
    var numbers = /^[0-9]{6}$/;
    if (uzip.value.match(numbers)) {
        return true;
    } else {
        alert('ZIP code must have numeric characters only and it should be of 6 digits');
        uzip.focus();
        return false;
    }
}
function validatePhone(uphonenumber) {
    var numbers = /^(\+91[\-\s]?)?[0]?(91)?[789]\d{9}$/;
    if (uphonenumber.value.match(numbers)) {
        return true;
    } else {
        alert('type indian mobile number');
        uphonenumber.focus();
        return false;
    }
}

function validateEmail(uemail) {
    var mailformat = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    if (uemail.value.match(mailformat)) {
        return true;
    } else {
        alert("You have entered an invalid email address!");
        uemail.focus();
        return false;
    }
}
