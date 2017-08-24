<%@taglib prefix="s" uri="/struts-tags"%>
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
	<div class="container">
		<%-- <h1>Pagination in Struts 2 using jQuery datatable example</h1>
		<s:form action="pagination.action" method="post">
			<s:submit cssClass="btn btn-lg btn-primary"></s:submit>
		</s:form> --%>

         
		<div style="margin-top: 50px; margin-right: 282px;">
			<table class="table table-hover table-bordered" id="mytbl">
				<thead>
					<tr class="success">
						<th>MovieTheatre</th>

					</tr>
				</thead>
				  <s:iterator value="moviesAll">
					<tr>
						<td>
						<%-- <s:property value="id" /> --%>
						
						     <s:url action="Action/getMovie" var="urlTag" >
           			<s:param name="idMovie"><s:property value="id"/></s:param>
           		</s:url>
            	
            	<h2><a href="<s:property value="#urlTag" />" ><s:property value="title" /></a> </h2> 

 							language:&nbsp;<s:property value="language" /> <br/> 
							adress:&nbsp;<s:property value="adress" /> <br/> 
							city:&nbsp;<s:property value="city" /> <br/> 
							movieTheatre:&nbsp;<s:property value="name" /> <br/> 
							type:&nbsp;<s:property value="type" /> <br/> 
							<%-- <s:property value="refProprio" />  <br/>  --%>
							<s:if test="%{refProprio==#session.id}">
          
				           		<s:url namespace="/Action" action="sessionsForm" var="urlTag2" >
				            		<s:param name="refMovie"><s:property value="id"/></s:param>
				           		</s:url>
				           
				            	<a href="<s:property value="#urlTag2" />" ><span class="glyphicon glyphicon-plus"></span></a>
				            
				           	<s:url namespace="/Action" action="deleteMovie" var="urlTag3" >
				            		<s:param name="idMovie"><s:property value="id"/></s:param>
				            		<s:param name="refMovieTheatre" value="refMovieTheatre"/>
				           		</s:url>
				          
				
				            	<a href="<s:property value="#urlTag3" />" ><span class="glyphicon glyphicon-remove"></span></a>
				                        
				                       
				           	 	<s:url namespace="/Action" action="MovieBeforeUpdate" var="urlTag4" >
				            		<s:param name="idMovie"><s:property value="id"/></s:param>
				            		<s:hidden name="refMovieTheatre" value="refMovieTheatre"/>
				           		</s:url>            
				                               
				          		<a href="<s:property value="#urlTag4" />" ><span class="glyphicon glyphicon-edit"></span></a>
				          		 
          					</s:if>  
							
							
							
						</td>
					</tr>

				</s:iterator>  
			</table>
		</div>
	</div>
</body>
</html>