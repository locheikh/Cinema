<%@ taglib prefix="s" uri="/struts-tags" %>
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

      <s:property value="refMovie"/>
 
   <!--  <center> -->
		<s:form  namespace="/Action" action="addSessions" method="post">

       	<sx:datetimepicker cssClass = "form-control" name="jour" label="Format (EEE dd-MMM-yyyy)"
displayFormat="EEE dd-MMM-yyyy" value="EEE dd-MMM-yyyy" />
	<sx:datetimepicker cssClass = "form-control" type="time" label="Ship Time" name="startingTime" displayFormat="hh:mm:ss"></sx:datetimepicker> 
       		<s:hidden name="refMovie" value="%{refMovie}"/>
       		<s:submit  label="Action/addSessions"/>
        </s:form>
 <!--  </center> -->
    

 
</body>
</html>