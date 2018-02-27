<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@include file="template/Header.jsp" %>
<div class="container">
  <h1>Log In</h1>>
</div>
<form:form method="post" action="save">
<div class= "container-fluid">
<table>
<tr>
<td>Username :</td>
<td><form: input path="userName" /></td>
</tr>
<tr>
<td>Password :</td>
<td><form: input path="userPassword" /></td>
</tr>
<tr><td><input type="submit" value="login/save"/></td></tr>
</table>
</div>
</form:form>
<%@include file="template/Footer.jsp" %>
