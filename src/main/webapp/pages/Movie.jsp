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
  
<%--         <s:date name="movi.duration" format="dd/MM/yyyy" /> --%>
        <h2>duration:<s:property value="movi.duration" /></h2>   
        <h2><s:property value="movi.subtitles" /></h2>    <br/> 
       

        
        <table class="table table-bordered table-hover table-inverse" style="width: auto;" align="center">
         <s:iterator value="movi.sessions" var="session">
         <tr>
            <s:iterator value="#session"> 

          <%-- <h2> <s:property value="jour"/> </h2> <br/> --%>
          <s:date name="jour" format="dd/MM/yyyy EEEE" /><br/>
          <s:date name="startingTime" format="HH:mm"/> <br/>
            <br/> 
          <%--  <s:property value="refMovie"/> <br/>  --%>
             
             
             <s:url namespace="/Action" action="deleteSession" var="urlTag" >
             <s:param name="idSession"><s:property value="id"/></s:param>
              <s:hidden name="idMovie" value="%{idMovie}"/> 
             </s:url>
           
            
            <a href="<s:property value="#urlTag" />" ><span class="glyphicon glyphicon-remove"></span></a>
                        
        
            <s:url namespace="/Action" action="sessionBeforeUpdate" var="urlTag2" >
            <s:param name="idSession"><s:property value="id"/></s:param>
            <s:hidden name="idMovie" value="%{idMovie}"/>   
            </s:url>            
            <a href="<s:property value="#urlTag2" />" ><span class="glyphicon glyphicon-edit"></span></a>
     

           	</s:iterator>
         <tr>     
         <br/><hr><br/>                     
         </s:iterator>
       </table>
       
        
        <%-- <h2><s:property value="movie.director" /></h2>
         <h2><s:property value="movie.language" /></h2> 
         <h2><s:property value="movie.mainActors" /></h2>   
          <h2><s:property value="movie.minAge" /></h2> 
          <h2><s:property value="movie.startingDate" /></h2>
         <h2><s:property value="movie.idSessions" /></h2></h2>     --%>         
    
<%--     <div align="center">
        <h2>Please login</h2>
        <s:property value="getText('label.welcome')"/> 
    </div> --%>
</body>
</html>