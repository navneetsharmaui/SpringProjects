<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="title"  /></title>
</head>
<body>
   <table>
      <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Birth Date</th>
          <th>Age</th>
          <th>Salary</th>
          <th>Position</th>
          <th>Department No</th>
          <th>Department Name</th>
      </tr>
      <tbody id="tableBody">
	      <c:if test="${not empty empList}">
		      <c:forEach var="e" items="${ empList }">
		         <tr>
		             <td><c:out value="${ e.firstName }"/></td>
		             <td><c:out value="${ e.lastName }"/></td>
		             <td><c:out value="${ e.birthDate }"/></td>
		             <td><c:out value="${ e.age }"/></td>
		             <td><c:out value="${ e.salary }"/></td>
		             <td><c:out value="${ e.position }"/></td>
		             <td><c:out value="${ e.department.deptNo }"/></td>
		             <td><c:out value="${ e.department.deptName }"/></td>
		         </tr>
		      </c:forEach>
	      </c:if>
      </tbody>
	</table> 
    <iframe src='https://codealike.com/Profile/FactsWidget/navneetzz' frameborder='0' scrolling='no' marginheight='0' marginwidth='0' width='600px' height='370px'></iframe>
</body>
</html>