<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%-- <%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
 --%>
 <!-- Bootstrap -->
	    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
  <jsp:include page="/pages/header.jsp"></jsp:include>
        <h2><s:property value="title" /></h2>        
    <div align="center">
        <h2>Please login</h2>
        <s:property value="getText('label.welcome')"/> 
        
      <%--  <s:form action="movie" method="post">
            <s:textfield name="movieBean.title" label="title" />
            <s:password name="movieBean.duration" label="duration" />
            <s:submit value="Login"/>
        </s:form> --%>
    </div>
</body>
</html>