<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%-- <%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
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
        
        <table class="table table-bordered table-hover table-inverse" style="width: auto;" align="center">
         
			
         <s:iterator value="movies" var="movie">
         <tr>
            <s:iterator value="#movie"> 
         
          <s:url action="Action/getMovie" var="urlTag" >
           <s:param name="idMovie"><s:property value="id"/></s:param>
           </s:url>
            <h2><a href="<s:property value="#urlTag" />" ><s:property value="title" /></a> </h2>
            De <s:property value="director" />
		<%--  <h2>title:<s:property value="title" /></h2>  
        <h2>duration:<s:property value="duration" /></h2>   
        <h2><s:property value="subtitles" /></h2>   
        <h2><s:property value="director" /></h2>
         <h2><s:property value="language" /></h2> 
         <h2><s:property value="mainActors" /></h2>   
          <h2><s:property value="minAge" /></h2> 
          <h2><s:property value="startingDate" /></h2>
         <h2><s:property value="idSessions" /></h2></h2>   --%>
            <%--  city:<s:property value="city"/> <br/>
             type:<s:property value="type"/> <br/>
             name:<s:property value="name"/> <br/> --%>
           
         <%--  <s:form action="getAllMovie" method="post">
            <s:param name="message" value="georgedddddd"/>
            <s:submit value="Submit"/>
           </s:form> --%>
          <%--  <s:form action="getMovie.action" method="get">
            <s:submit name="id" value="%{id}"/>
           </s:form>
           
           <s:url action="Action/getMovie" var="urlTag" >
           <s:param name="id"><s:property value="id" /></s:param>
           </s:url>
            <h2><a href="<s:property value="#urlTag" />" ><s:property value="title" /></a> </h2>
 --%>
     
          
           	</s:iterator>
         <tr>     
         <br/><hr><br/>                     
         </s:iterator>
       </table>
         
         
   <%--  <div align="center">
        <h2>Please login</h2>
        <s:property value="getText('label.welcome')"/> 
        
       
    </div> --%>
</body>
</html>