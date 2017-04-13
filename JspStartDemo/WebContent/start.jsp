<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action='SearchTry' method='post'>
<table>
<tr>
<td><label>Userid</label></td>
<td><input type='text' name='userid' placeholder='Type Userid Here'/></td>
</tr>
<c:if test="${userid.length() eq 0 }">
<h2>invalid user</h2>
</c:if>
<tr>
<td><label>Password</label></td>
<td><input type='password' name='pwd' placeholder='Type Password Here'/></td>
</tr>
<tr>
<td><button type='submit'>Login</button></td>
<td><button type='reset'>Reset</button></td>
</tr>
</table>
</form>
</body>
</html>