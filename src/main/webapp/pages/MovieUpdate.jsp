<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%-- <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %> --%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--  <!-- Bootstrap -->
	    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">  
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2 MovieForm</title>
<sx:head />
</head>
<body>
  <jsp:include page="/pages/header.jsp"></jsp:include>

<%-- <s:property value="%{movi.refMovieTheatre}"/>  --%>

		<center>
		<s:form  namespace="/Action" action="updateMovie" method="post">
       		<s:textfield value="%{movi.title}" cssClass = "form-control"  name="title" label="title" />
       		<s:textfield value="%{movi.language}" cssClass = "form-control" name="language" label="Language" />
       		<s:textfield value="%{movi.subtitles}" cssClass = "form-control" name="subtitles" label="Subtitles" />
       		<s:textfield value="%{movi.mainActors}" cssClass = "form-control" name="mainActors" label="main Actors" />
       		<s:textfield value="%{movi.director}" cssClass = "form-control" name="director" label="Director" />  
       		<s:textfield value="%{movi.minAge}" cssClass = "form-control" name="director" label="min Age" /> 
       		<sx:datetimepicker cssClass = "form-control" name="startingDate" label="startingDate"
                     displayFormat="EEE dd-MMM-yyyy" value="startingDate" />
            <sx:datetimepicker cssClass = "form-control" name="endDate" label="endDate"
                     displayFormat="EEE dd-MMM-yyyy" value="EEE dd-MMM-yyyy" />
	        <sx:datetimepicker cssClass = "form-control" type="time" label="duration" name="duration" displayFormat="hh:mm:ss"></sx:datetimepicker> 
       		
       		
       		
       		
       		<s:hidden name="refMovieTheatre" value="%{movi.refMovieTheatre}"/> 
       		   <s:hidden name="idMovie" value="%{idMovie}"/> 
       		<s:submit label="Action/updateMovie"/>
    </s:form>
  </center>
    
    

    
    
</body>
</html>