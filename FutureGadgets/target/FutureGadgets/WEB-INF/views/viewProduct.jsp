<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ include file="template/Header.jsp" %>
<br />
<br />
<br />
    
<div class="container">          
<ul>

<spring:url value="/resources/images" var="images" />
<li>${product.productName}</li>
<li>${product.productPrice}</li>
<li>${product.categoryId}</li>
<li>${product.productDescription}</li>
</ul>
</div>
<%@ include file="template/Footer.jsp" %>
