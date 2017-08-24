<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>

<nav class="navbar navbar-default">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand"><s:property value="getText('label.app')"/> </a>
		</div>

		<div class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
			
			 <%--  <s:url namespace="/Action" action=" datatable.action" var="urll" >

           </s:url>
            <h2><a href="<s:property value="urll" />" >datatable</a>    
             --%>
            
            
					<li><a href="datatable"><s:property value="getText('label.movie')"/></a></li>
					<%-- <li><a href="CinemaGetMovie"><s:property value="getText('label.movie')"/></a></li> --%>
					<li><a href="getAllMovieTheatres"><s:property value="getText('label.movieTheatre')"/></a></li>
					
					<s:if test="%{#session.userName!=null}">
			  	       
			  	        <li><a href="logout">                                                  
			  	       &emsp; &emsp; &emsp; &emsp; <span class="glyphicon glyphicon-log-out">Deconnexion</span></a></li> 
			  	       <li><a>&emsp; &emsp; &emsp; &emsp; <s:property value="#session.userName"/>&nbsp;<s:property value="#session.Name"/></a>  </li>
                 	</s:if>   
                    <s:else>
    					<li><a href="login"><span class="glyphicon glyphicon-user">Connexion</span></a></li>
					</s:else>
					
					
					
					
			</ul>
		</div>
	</div>
</nav>
<br />