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

         <h2><s:property value="movi.title" />
          <s:if test="%{movi.refMovieTheatre==#session.id}">
	          
	           		<s:url namespace="/Action" action="sessionsForm" var="urlTag2" >
	            		<s:param name="refMovie"><s:property value="movi.id"/></s:param>
	           		</s:url>
	         
	            	<a href="<s:property value="#urlTag2" />" ><button type="button" class="btn btn-info"><span class="glyphicon glyphicon-plus">Session</span></button></a>
	            
	            	<s:url namespace="/Action" action="deleteMovie" var="urlTag3" >
	            		<s:param name="idMovie"><s:property value="movi.id"/></s:param>
	            		<s:param name="refMovieTheatre" value="refMovieTheatre"/>
	           		</s:url>
	                                
	
	            	<a href="<s:property value="#urlTag3" />" ><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove">Movie</button></span></a>
	                        
	                       
	           	 	<s:url namespace="/Action" action="MovieBeforeUpdate" var="urlTag4" >
	            		<s:param name="idMovie"><s:property value="movi.id"/></s:param>
	            		<s:hidden name="refMovieTheatre" value="%{refMovieTheatre}"/>
	           		</s:url>            
	                               
	               <a href="<s:property value="#urlTag4" />" ><button type="button" class="btn btn-warning"><span class="glyphicon glyphicon-edit">Movie</button></span></a>
      
        
          
         
			  	
          	</s:if>   
         
         
         
         </h2>   
        <h5>duration:&nbsp;<s:date name="movi.duration" format="HH:mm"/></h5>  
        <h5>language:&nbsp;<s:property value="movi.language" /></h5> 
        <h5>subtitles:&nbsp;<s:property value="movi.subtitles" /></h5>  
        <h5>min Age:&nbsp;<s:property value="movi.minAge" /></h5>    
        <h5>director:&nbsp;<s:property value="movi.director" /></h5>    
        <h5>main Actors:&nbsp;<s:property value="movi.mainActors" /></h5>    
        <h5> startingDate:&nbsp;  <s:date name="movi.startingDate" format="dd/MM/yyyy EEEE" /><br/></h5>  
        <h5>endDate:&nbsp; <s:date name="movi.endDate" format="dd/MM/yyyy EEEE" /><br/></h2> 
        <br/> 
        
    <hr> 
        
        
        <table class="table table-bordered table-hover table-inverse" style="width: auto;" align="center">
         <s:iterator value="movi.sessions" var="session">
         <tr>
         
            <s:iterator value="#session"> 

          <%-- <h2> <s:property value="jour"/> </h2> <br/> --%>
          <s:date name="jour" format="dd/MM/yyyy EEEE" /><!-- <br/> -->
          
         <!--    <br/>  -->
         

            <%--  <s:property value="idMovie"/> --%>
             
           <s:if test="%{movi.refMovieTheatre==#refmovieTheatre}">  
            
             <s:url namespace="/Action" action="deleteSession" var="urlTag" >
             <s:param name="idSession"><s:property value="id"/></s:param>
             <s:param name="idMovie"><s:property value="movi.id"/></s:param>
             </s:url>
           
            &nbsp;<a href="<s:property value="#urlTag" />" ><button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-remove">Session</button></span></a>

        <%-- <s:property value="idMovie" /> --%>
            <s:url namespace="/Action" action="sessionBeforeUpdate" var="urlTag2" >
            <s:param name="idSession"><s:property value="id"/></s:param>
            <%-- <s:hidden name="idMovie" value="%{refMovie}"/>    --%>
            </s:url>            
            
             &nbsp; <a href="<s:property value="#urlTag2" />" ><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-edit">Session</button></span></a>
        
             </s:if>  
              <br/> 
              <s:date name="startingTime" format="HH:mm"/> 
           	</s:iterator>
         <tr>     
         <br/><hr><br/>                     
         </s:iterator>
       </table>
       
        

</body>
</html>