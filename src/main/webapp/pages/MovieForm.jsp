<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%-- <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--  <!-- Bootstrap -->
	    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">  
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2 MovieForm</title>

</head>
<body>
  <jsp:include page="/pages/header.jsp"></jsp:include>

     

    <center>
		<s:form  namespace="/Action" action="addMovie" method="post">
       		<s:textfield placeholder="Title" cssClass = "form-control"  name="title" label="title" />
       		<s:textfield placeholder="Language" cssClass = "form-control" name="language" label="Language" />
       		<s:textfield placeholder="Subtitles" cssClass = "form-control" name="subtitles" label="Subtitles" />
       		<s:textfield placeholder="Main actors"  cssClass = "form-control" name="mainActors" label="main Actors" />
       		<s:textfield placeholder="Director" cssClass = "form-control" name="director" label="Director" />  
       		<s:textfield placeholder="10" cssClass = "form-control" name="director" label="min Age" /> 
       		<sx:datetimepicker cssClass = "form-control" name="startingDate" label="startingDate"
                     displayFormat="EEE dd-MMM-yyyy" value="EEE dd-MMM-yyyy" />
            <sx:datetimepicker cssClass = "form-control" name="endDate" label="endDate"
                     displayFormat="EEE dd-MMM-yyyy" value="EEE dd-MMM-yyyy" />
	        <sx:datetimepicker cssClass = "form-control" type="time" label="duration" name="duration" displayFormat="hh:mm:ss"></sx:datetimepicker> 
       		<s:hidden name="idMovie" value="%{refMovie}"/> 
       		
       		
       		 <s:hidden name="refMovieTheatre" value="%{refMovieTheatre}"/> 
       		<s:submit label="Action/addMovie"/>
    </s:form>
  </center>
    
    
<!-- <form class="form-horizontal">
<fieldset>

Form Name
<legend>Form Movie</legend>
	
 	





Text input
<div class="form-group">
  <label class="col-md-4 control-label" for="textinput">Title</label>  
  <div class="col-md-4">
  <input id="textinput" name="textinput" placeholder="Title" class="form-control input-md" type="text">
    
  </div>
</div>

Text input
<div class="form-group">
  <label class="col-md-4 control-label" for="duration">Duration</label>  
  <div class="col-md-4">
  <input id="duration" name="duration" placeholder="Duration" class="form-control input-md" type="text">
    
  </div>
</div>

Text input
<div class="form-group">
  <label class="col-md-4 control-label" for="language">Language</label>  
  <div class="col-md-4">
  <input id="language" name="language" placeholder="fr" class="form-control input-md" type="text">
    
  </div>
</div>

Text input
<div class="form-group">
  <label class="col-md-4 control-label" for="subtitles">Subtitles</label>  
  <div class="col-md-4">
  <input id="subtitles" name="subtitles" placeholder="fr,en..." class="form-control input-md" type="text">
    
  </div>
</div>

Text input
<div class="form-group">
  <label class="col-md-4 control-label" for="mainActors">Main Actors</label>  
  <div class="col-md-4">
  <input id="mainActors" name="mainActors" placeholder="main Actors" class="form-control input-md" type="text">
    
  </div>
</div>

Multiple Radios (inline)
<div class="form-group">
  <label class="col-md-4 control-label" for="minAge">Min Age</label>
  <div class="col-md-4"> 
    <label class="radio-inline" for="minAge-0">
      <input name="minAge" id="minAge-0" value="10" checked="checked" type="radio">
      10
    </label> 
    <label class="radio-inline" for="minAge-1">
      <input name="minAge" id="minAge-1" value="12" type="radio">
      12
    </label>
  </div>
</div>






Button
<div class="form-group">
  <label class="col-md-4 control-label" for="singlebutton"></label>
  <div class="col-md-4">
    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Submit</button>
  </div>
</div>




</fieldset>
</form> -->
    
    
    
    
    
    
</body>
</html>