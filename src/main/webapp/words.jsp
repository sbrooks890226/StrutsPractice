<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>All the words</title>
  </head>
  <body>
	<h1>All the words</h1>
	<s:debug />
	<table border="1">
	    <tr>
	        <th>Word Id</th>
	        <th>Word Value</th>
	        <th>Actions</th>
	    </tr>
        <s:iterator value="words">
        <tr>
            <td><s:property value="getWordId()" /></td>
            <td><s:property value="getWordValue()" /></td>
            <td>
            <button>
                <s:url action="getWord" var="getWordUrl">
                     <s:param name="id"><s:property value="getWordId()" /></s:param>
                  </s:url>
                <a href="<s:property value = "#getWordUrl"/>">Details</a>
            </button>
            </td>
        </tr>
        </s:iterator>
	</table>
</html>
