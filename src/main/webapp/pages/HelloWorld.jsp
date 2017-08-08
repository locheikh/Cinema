<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
 
 <!-- Bootstrap -->
	    <link href="./assets/css/bootstrap.min.css" rel="stylesheet">
	    
<html>
    <head>
        <title>Hello World!</title>
    </head>
    <body>
   <jsp:include page="/pages/header.jsp"></jsp:include>
        <h2><s:property value="message" /></h2>        
        <h2><s:property value="movieBean" /></h2>   
        <s:property value="getText('label.welcome')"/> 
    </body>
</html>