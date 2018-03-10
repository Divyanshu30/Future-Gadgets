<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@include file="template/Header.jsp" %>
<div class="container">
  <h1>Log In</h1>>
</div>
<form:form method="post" action="newuser/signIn" commandName="user">
<div class= "container-fluid">
<table>
<tr>
<td>Username :</td>
<td><form:input path="userPhNo" placeholder="Enter your Phone no"/></td>
</tr>
<tr>
<td>Password :</td>
<td><form:input path="userPassword"/></td>
</tr>
<tr><td><input type="submit" value="Sign In"/></td></tr>
</table>
</div>
</form:form>
<%@include file="template/Footer.jsp" %>
