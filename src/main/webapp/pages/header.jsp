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
					<li><a href="MovieAction"><s:property value="getText('label.movie')"/></a></li>
					<li><a href="MovieTheatreAction"><s:property value="getText('label.movieTheatre')"/></a></li>
					<li><a href="MovieAction"><span class="glyphicon glyphicon-log-in"></span></a></li>
					<li><a href="MovieAction"><span class="glyphicon glyphicon-user"></span></a></li>
					
			</ul>
		</div>
	</div>
</nav>
<br />