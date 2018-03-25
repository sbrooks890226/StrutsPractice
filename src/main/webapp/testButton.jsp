<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>testButton.action page</title>
  </head>
  <body>
    <h1>testButton.action page</h1>
    <a href="<s:url action='testButtonClicked'/>">
    	<button>Click here to test button</button>
    </a>
  </body>
</html>
