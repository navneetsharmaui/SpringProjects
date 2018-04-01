<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Project</title>
</head>
<center>
<b>Enter Project Details</b><br> <br>
<body>
<form action="addprojectdata">
<table>
<tr><td>
Enter ProjectId:
</td>
<td><input type="text" name="projectid">
</td>
</tr>
<tr><td>
Enter Project Name:
</td>
<td><input type="text" name="projectname">
</td>
</tr>
<tr><td>
Enter Project Description:
</td>
<td><input type="text" name="projectdescription">
</td>
</tr>
<tr><td>
Enter Estimated hours:
</td>
<td><input type="text" name="estimatedhours">
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