<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>

 <!-- Bootstrap -->
	    <link href="../assets/css/bootstrap.min.css" rel="stylesheet"> 

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script>
	$(document).ready(function() {
		$('#mytbl').dataTable();
		 //$(row).even { background-color: #aabbcc }
	});
	
	
</script>
</head>
<body>
<jsp:include page="/pages/header.jsp"></jsp:include>
 <s:property value="%{session.id}" />

	<div class="container">
		<%-- <h1>Pagination in Struts 2 using jQuery datatable example</h1>
		<s:form action="pagination.action" method="post">
			<s:submit cssClass="btn btn-lg btn-primary"></s:submit>
		</s:form> --%>

         
		<div style="margin-top: 50px; margin-right: 282px;">
			<table class="table table-hover table-bordered" id="mytbl">
				<thead>
					<tr class="success">
						<h1><th>movieTheatres</th></h1> 

					</tr>
				</thead>
				  <s:iterator value="movieTheatres">
					<tr>
						<td>
						          
					           <s:url namespace="/Action" action="getAllMovie.action" var="urlTag" >
					           	<s:param name="refMovieTheatre"><s:property value="id" /></s:param>
					        
					           </s:url>
							    <h2>	<a href="<s:property value="#urlTag" />" ><s:property value="name" /></a>
									   
									   <s:url namespace="/Action" action="movieForm" var="urlTag2" >
							           <s:param name="refMovieTheatre"><s:property value="id" /></s:param>
							           </s:url>
										  &nbsp;&nbsp;&nbsp;
									 	<s:if test="%{refProprio==#session.id}">
									 	
										  <a href="<s:property value="#urlTag2" />" ><button type="button" class="btn btn-primary"> <span class="glyphicon glyphicon-plus">Movie</span></button></a>
							          	</s:if>
					          	</h2>   
					         
					            -<s:property value="city" />  </br>
					             <s:property value="adress" />  
							
						</td>
					</tr>

				</s:iterator>  
			</table>
		</div>
	</div>
</body>
</html>