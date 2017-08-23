<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%-- <%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>--%>
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
         

           <s:if test="%{#parameters.refMovieTheatre[0]==#session.id}">
          
           		<s:url namespace="/Action" action="sessionsForm" var="urlTag2" >
            		<s:param name="refMovie"><s:property value="id"/></s:param>
           		</s:url>
           
            	<a href="<s:property value="#urlTag2" />" ><span class="glyphicon glyphicon-plus"></span></a>
            
            	<s:url namespace="/Action" action="deleteMovie" var="urlTag3" >
            		<s:param name="idMovie"><s:property value="id"/></s:param>
            		<s:param name="refMovieTheatre" value="{#parameters['refMovieTheatre']}"/>
           		</s:url>
          

            	<a href="<s:property value="#urlTag3" />" ><span class="glyphicon glyphicon-remove"></span></a>
                        
                       
           	 	<s:url namespace="/Action" action="MovieBeforeUpdate" var="urlTag4" >
            		<s:param name="idMovie"><s:property value="id"/></s:param>
            		<s:hidden name="refMovieTheatre" value="%{refMovieTheatre}"/>
           		</s:url>            
                               
          <a href="<s:property value="#urlTag4" />" ><span class="glyphicon glyphicon-edit"></span></a>
          
          
         
			  	
          	</s:if>   
          
           
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