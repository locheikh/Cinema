<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%-- <%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %> --%>

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
  

        　        <s:set name="refmovieTheatre" value="#session.id"/>

         <h2><s:property value="movi.title" /></h2>   
        <h5>duration:<s:property value="movi.duration" /></h5> 
        <h5>subtitles<s:property value="movi.subtitles" /></h5>  
        <h5>min Age:<s:property value="movi.minAge" /></h5>    
        <h5>director:<s:property value="movi.director" /></h5>    
        <h5>main Actors:<s:property value="movi.mainActors" /></h5>    
        <h5> startingDate   <s:date name="movi.startingDate" format="dd/MM/yyyy EEEE" /><br/></h5>  
        <h5>endDate   <s:date name="movi.endDate" format="dd/MM/yyyy EEEE" /><br/></h2> 
        <br/> 
        
    <hr> 
        
        
        <table class="table table-bordered table-hover table-inverse" style="width: auto;" align="center">
         <s:iterator value="movi.sessions" var="session">
         <tr>
         
            <s:iterator value="#session"> 

          <%-- <h2> <s:property value="jour"/> </h2> <br/> --%>
          <s:date name="jour" format="dd/MM/yyyy EEEE" /><br/>
          <s:date name="startingTime" format="HH:mm"/> <br/>
            <br/> 
         

            <%--  <s:property value="idMovie"/> --%>
             
           <s:if test="%{movi.refMovieTheatre==#refmovieTheatre}">  
            
             <s:url namespace="/Action" action="deleteSession" var="urlTag" >
             <s:param name="idSession"><s:property value="id"/></s:param>
             <s:param name="idMovie"><s:property value="movi.id"/></s:param>
             </s:url>
           
            <a href="<s:property value="#urlTag" />" ><span class="glyphicon glyphicon-remove"></span></a>

        <%-- <s:property value="idMovie" /> --%>
            <s:url namespace="/Action" action="sessionBeforeUpdate" var="urlTag2" >
            <s:param name="idSession"><s:property value="id"/></s:param>
            <%-- <s:hidden name="idMovie" value="%{refMovie}"/>    --%>
            </s:url>            
            
            
            <a href="<s:property value="#urlTag2" />" ><span class="glyphicon glyphicon-edit"></span></a>
     
             </s:if>  
           	</s:iterator>
         <tr>     
         <br/><hr><br/>                     
         </s:iterator>
       </table>
       
        

</body>
</html>