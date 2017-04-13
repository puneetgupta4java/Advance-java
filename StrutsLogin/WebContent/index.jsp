<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<s:form action="login" method="post">
   <s:textfield name="userid" key="enter userid"></s:textfield>
   <s:password name="pwd" key="enter password"></s:password>
   <s:submit></s:submit>
</s:form>   
</body>
</html>