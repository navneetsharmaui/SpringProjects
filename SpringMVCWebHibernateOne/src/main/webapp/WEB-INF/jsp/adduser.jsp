<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<center>
Enter User Details<br> <br>
<body>
<form action="adduserdata">
<table>
<tr><td>
Enter UserId:
</td>
<td><input type="text" name="userid">
</td>
</tr>
<tr><td>
Enter User Name:
</td>
<td><input type="text" name="username">
</td>
</tr>
<tr><td>
Enter Passwrord:
</td>
<td><input type="password" name="password">
</td>
</tr>
<tr><td>
Enter Date of joining:
</td>
<td><input type="text" name="doj">
</td>
</tr>
<tr><td>
Enter EmailId:
</td>
<td><input type="email" name="eamilid">
</td>
</tr>
<tr><td>
Enter Role:
</td>
<td><input type="text" name="role">
</td>
</tr>
<tr><td>
Enter Project:
</td>
<td><input type="text" name="project">
</td>
</tr>
<tr><td></td>
<td><input type="submit" value="Submit">
</td>
</tr>
</table>
</form>
</body>
</center>
</html>