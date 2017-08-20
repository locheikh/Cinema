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
         <s:iterator value="sessions" var="session">
         <tr>
            <s:iterator value="#session"> 
            
          <h2> <s:property value="jour"/> <s:property value="id"/></h2> <br/>
            <s:property value="startingTime"/> <br/> 
            <s:property value="refMovie"/> <br/> 
            <sx:datetimepicker cssClass = "form-control" name="sess.startingTime" label="Format (EEE dd-MMM-yyyy)"
displayFormat="EEE dd-MMM-yyyy" value="sess.startingTime" />

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