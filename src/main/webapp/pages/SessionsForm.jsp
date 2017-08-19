<%@ taglib prefix="s" uri="/struts-tags" %>
<%-- <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %> --%>
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

</head>
<body>
  <jsp:include page="/pages/header.jsp"></jsp:include>

     
 
   <!--  <center> -->
		<s:form  namespace="/Action" action="addSessions" method="post">
       		<s:textfield  placeholder="jour" cssClass = "form-control"  name="jour" label="jour"/>
       		<s:textfield  placeholder="autreJour"  name="jour" label="jour"/>
       		<s:date name="startingTime" format="yyyy-MM-dd" />
       		<s:hidden name="refMovie" value="%{refMovie}"/>
       		<s:submit label="Action/addSessions"/>
        </s:form>
 <!--  </center> -->
    

 
</body>
</html>