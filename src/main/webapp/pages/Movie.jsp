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
        <h2>title:<s:property value="movie.title" /></h2>  
        <h2>duration:<s:property value="movie.duration" /></h2>   
        <h2><s:property value="movie.subtitles" /></h2>   
        <h2><s:property value="movie.director" /></h2>
         <h2><s:property value="movie.language" /></h2> 
         <h2><s:property value="movie.mainActors" /></h2>   
          <h2><s:property value="movie.minAge" /></h2> 
          <h2><s:property value="movie.startingDate" /></h2>
         <h2><s:property value="movie.idSessions" /></h2></h2>             
    
<%--     <div align="center">
        <h2>Please login</h2>
        <s:property value="getText('label.welcome')"/> 
    </div> --%>
</body>
</html>