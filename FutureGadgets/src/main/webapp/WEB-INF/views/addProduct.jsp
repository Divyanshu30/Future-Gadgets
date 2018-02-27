<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@include file="template/Header.jsp" %>
<div class="container">
  <h1>New Product</h1>>
</div>

<div class= "container-fluid">
<form:form method="post" action="submit" commandName="product">
<table>
<tr>
<td>Product Name :</td>
<td><form:input path="productName" /></td>
</tr>
<tr>
<td>Product Price :</td>
<td><form:input path="productPrice" /></td>
</tr>

<tr><td>Product Quantity :</td>
<td><form:input path="productQuantity" /></td>
</tr>
<tr>
<td>Product Description :</td>
<td><form:input path="productDescription" /></td>
</tr>
<tr>
<td><input type="submit" value="submit" class="btn btn-default"></td></tr>
</table>
</form:form>
</div>

<%@include file="template/Footer.jsp" %>
