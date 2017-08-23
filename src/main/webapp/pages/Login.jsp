<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <!-- Bootstrap -->
	   <!--  <link href="../assets/css/bootstrap.min.css" rel="stylesheet">  -->
    
    
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2 Login</title>
</head>
<body>
<jsp:include page="/pages/header.jsp"></jsp:include>
    <center>
        <h3>Login</h3>
        <s:form action="login" method="post">
            <s:textfield name="userName" label="Enter User Name" />
            <s:password name="password" label="Enter Password" />
            <s:submit label="Login"/>
            <span class="glyphicon glyphicon-remove"></span>
        </s:form>
    </center>
</body>
</html>