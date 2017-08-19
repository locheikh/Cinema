<%@taglib prefix="s" uri="/struts-tags"%>
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
<s:property value="movies" />
	<div class="container">
		<h1>Pagination in Struts 2 using jQuery datatable example</h1>
		<s:form action="pagination.action" method="post">
			<s:submit cssClass="btn btn-lg btn-primary"></s:submit>
		</s:form>

         
		<div style="margin-top: 50px; margin-right: 282px;">
			<table class="table table-hover table-bordered" id="mytbl">
				<thead>
					<tr class="success">
						<th>name</th>

					</tr>
				</thead>
				  <s:iterator value="movies">
					<tr>
						<td>
							<s:property value="title" />
							<s:property value="duration" />
							<s:property value="language" />
							lyon
						</td>
					</tr>
					<tr>
						<td>
							<s:property value="title" />
							<s:property value="duration" />
							<s:property value="language" />
							paris
						</td>
					</tr>
				</s:iterator>  
			</table>
		</div>
	</div>
</body>
</html>