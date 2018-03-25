<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Index.action page</title>
  </head>
  <body>
    <h1>Index.action Page</h1>
    <select onchange="location = this.value;"> 
    	<option value="<s:url action='index'/>">Index Page</option>
    	<option value="<s:url action='testButton'/>">Test Button Page</option>
    	<option value="<s:url action='message'/>">Message Page</option>
	</select>
	<br><br>
	<h2><s:property value="messageStore.message" /></h2>
</html>
