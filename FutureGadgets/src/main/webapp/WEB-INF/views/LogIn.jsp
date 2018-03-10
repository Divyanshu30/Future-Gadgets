 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib uri = "http://www.springframework.org/tags" prefix = "spring"%>
 
<%@include file="template/Header.jsp" %>
<br />
<br />
<br />
<div class="container">
  <h1>Log In</h1>>
</div>
<form name="loginForm" method="post" action="<spring:url value="/signin" />">
<div class= "container-fluid">
<table>
<tr>
<td>Username :</td>
<td><input name="userName" type="text" id ="username" placeholder="Enter your Phone no"/></td>
</tr>
<tr>
<td>Password :</td>
<td><input name="userPassword" type="password" id ="password"/></td>
</tr>
<tr><td><input type="submit" value="Sign In"/> 
<input type="hidden" name ="${_csrf.parameterName}" value="${_csrf.token}" />
</td>
</tr>
</table>
</div>
</form>
<%@include file="template/Footer.jsp" %>
