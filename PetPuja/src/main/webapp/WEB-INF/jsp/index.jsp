<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:400,300'" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="css/main.css">
    <script src="js/script.js"></script>
    <title>Pet Pooja</title>
</head>

<body onload="document.registration.username.focus();">
    <header>

    </header>
    <div>
        <div>

        </div>
        <form action="addorderdata" name="registration" onsubmit="return formValidation();">
            <caption class="capionclass">
                <h1>Pet Pooja</h1>
            </caption>
            <fieldset>
                <legend></legend>
                <label for="username">Name: </label>
                <input type="text" name="username" placeholder="Name" id="username">

                <label for="email">Email: </label>
                <input type="email" name="email" placeholder="example@abc.com" id="email">

                <label for="address">Address: </label>
                <input type="text" name="address" placeholder="House no 1, plot no2, xyz" id="address">

                <label for="postalcode">Pin: </label>
                <input type="text" name="postalcode" id="postalcode" placeholder="222222">

                <label for="phone">Phone: </label>
                <input type="text" id="phonenumber" placeholder="9090909090" name="phonenumber">
                <label for="ordertype">Order Type: </label>
                <select name="selectoption" id="selectoption">
                    <option value="nonveg">non-veg</option>
                    <option value="veg">veg</option>
                    <option value="veg">non-get + Veg</option>
                </select>

            </fieldset>
            <button type="submit" value="Submit">Confirm and submit</button>
        </form>
        <button type="button" id="redirectButtonId" class="redirectButtonClass"><a href="orderdetails">Go to Order Details</a></button>
    </div>
</body>

</html>