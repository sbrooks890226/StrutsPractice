<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Index.action page</title>
  </head>
  <body>
	<p><s:property value="word.getWordId()" /> - <s:property value="word.getWordValue()" /></p>
</html>
