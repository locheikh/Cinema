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
        
			
         <s:iterator value="movieTheatres" var="movieTheatre">
         <tr>
            <s:iterator value="#movieTheatre"> 
            
             <s:url action="Action/getAllMovie.action" var="urlTag" >
           <s:param name="refMovieTheatre"><s:property value="id" /></s:param>
           </s:url>
            <h2><a href="<s:property value="#urlTag" />" ><s:property value="name" /></a></h2>-<s:property value="adress" />
			
          <%--   <h2><s:property value="name"/>     <s:property value="id"/></h2> <br/>
            <s:property value="adress"/> <br/> --%>
            <%--  city:<s:property value="city"/> <br/>
             type:<s:property value="type"/> <br/>
             name:<s:property value="name"/> <br/> --%>
           
         <%--  <s:form action="getAllMovie" method="post">
            <s:param name="message" value="georgedddddd"/>
            <s:submit value="Submit"/>
           </s:form> --%>
        <%--    <s:form action="getAllMovie.action" method="post">
            <s:submit name="refMovieTheatre" value="%{id}"  />
        </s:form> --%>
           
          
     
          
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