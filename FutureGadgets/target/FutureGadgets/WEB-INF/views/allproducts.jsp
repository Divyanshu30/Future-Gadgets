<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="template/Header.jsp" %>
<br />
<br />
<br />

<div class="container">
<div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>Product Id</th>
        <th>Product Name</th>
        <th>Product price</th>
        <th>Product image</th>
        <th>More</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${product}" var="product" >
<spring:url value="/resources/images" var="images" />
<tr>
<td>${product.productId}</td>
<td>${product.productName}</td>
<td>${product.productPrice}</td>
<td><img src="${images}/<c:url value="${product.productImageUrl}" />"  width="10%"/></td>
<td><a href="viewProduct/${product.productId}"> Details  <span class="glyphicon glyphicon-info-sign"></span></a></td>
</tr>
</c:forEach>

    </tbody>
  </table>
  </div>
</div>
<%@ include file="template/Footer.jsp" %>
