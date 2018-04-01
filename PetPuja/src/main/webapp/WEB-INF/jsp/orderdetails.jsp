<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Pet Pooja</title>
    <link rel="stylesheet" type="text/css" media="screen" href="css/main.css" />
    <script src="js/script.js"></script>
</head>

<body>
    <header>
        <div>
        </div>
    </header>
    <div>
        <form name="contact-form" action="cancelorder">
            <caption class="capionclass">
                <h1>Pet Pooja</h1>
            </caption>
            <p>${loid}</p>   

            <label for="userorderid">Enter Your OrderID:</label>
            
            <input type="number" id="oid" name="oid">
            <button type="submit" value="Submit">Cancel your order</button>
            <button type="submit" id="updateId" value="Submit">Update the order</button>
        </form>
        <form name="list-form" action="getorderlist">
            <caption class="capionclass">
                <h1>Pet Pooja</h1>
            </caption>
		    <c:if test="${not empty lists}">
		
		        <ul>
		            <c:forEach var="listValue" items="${lists}">
		                <li>${listValue.oid}</li>
		            </c:forEach>
		        </ul>
		
		    </c:if>
            <label for="userorderid">Enter Your emailID:</label>
            
            <input type="text" id="email" name="email">
            <button type="submit" value="Submit">Submit to get Details</button>
        </form>
        <button type="button" id="redirectButtonId" class="redirectButtonClass"><a href="/PetPuja">Go Back to Order Page</a></button>
    </div>
</body>

</html>