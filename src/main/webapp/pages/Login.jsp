<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <!-- Bootstrap -->
	    <link href="../assets/css/bootstrap.min.css" rel="stylesheet"> 
    
    
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Struts2 Login</title>
<%-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script> --%>

</head>
<body>
<jsp:include page="/pages/header.jsp"></jsp:include>
    <center>
        <h3>Login</h3>  <%-- <s:property value="test"/> --%>
        <s:form  namespace="/Action" action="login" method="post"  >
        
         <s:if test="%{#session.lastlogin!='null'}">  
            <s:textfield value="%{#session.lastlogin}" placeholder="Login" cssClass = "form-control" name="userName" label="Enter User Name" />
          </s:if>    
          <s:else>
           <s:textfield placeholder="Login" cssClass = "form-control" name="userName" label="Enter User Name" />
           </s:else>  
            <s:password placeholder="password"  cssClass = "form-control" name="password" label="Enter Password" />
            <s:hidden name="test" value="1"/> 
            <s:submit label="Login"/>
        </s:form>
    </center>
</body>
</html>


