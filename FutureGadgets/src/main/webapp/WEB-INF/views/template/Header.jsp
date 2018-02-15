<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Future Gadgets</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<style>
a#myid
{
color:white;
font-size:18px;
font-family:century gothic;
}
a#myid:hover
{
background-color:black;
}
.floating-box {
    display: inline-block;
    width: 290px;
    height: auto;
    margin-left:20px;
    border: none;
	text-align:center;	
}
</style>

</head>
<body  style="background-color:Darkorange">
<header >
<nav class="navbar navbar-inverse navbar-fixed-top" style="background-color:LightSeaGreen; border-color:LightSeaGreen;">
  <div class="container-fluid" >
    <div class="navbar-header" >
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="index" id="myid"> <img src="./resources/images/logoDG.jpg" height="120%" width="auto" alt="Future Gadgets"> </a>
	  <a class="navbar-brand" href="<c:url value="/index" />" id="myid" title="Home"> Future Gadgets</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar" style="margin-bottom:0px">
      <ul class="nav navbar-nav">
        <li><a href="#" id="myid" title="Delivery address">Deliver To <span class="glyphicon glyphicon-map-marker"></span> </a></li>
        <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="myid" title="Products">Products <span class="caret"></span></a>
          <ul class="dropdown-menu" style="background-color:firebrick;">
            <li><a href="#" id="myid" title="Basic Appliances">Home Appliances</a></li>
            <li><a href="#" id="myid" title="Personal Appliances">Personal Gadgets</a></li>
            <li><a href="allproducts"id="myid" title="Trends">Latest</a></li>
          </ul>
        </li>
      <form class="navbar-form navbar-left" action="/action_page.php">
  <div class="input-group">
    <input type="text" class="form-control" placeholder="Search">
    <div class="input-group-btn">
      <button class="btn btn-info" type="submit">
        <span class="glyphicon glyphicon-search"></span>
      </button>
    </div>
  </div>
</form>
	  </ul>
      <ul class="nav navbar-nav navbar-right">
        
		<li><a href="/SignUp" id="myid"><span class="glyphicon glyphicon-user" title="New User"></span> Sign Up</a></li>
        <li><a href="LogIn" id="myid"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
		<li><a href="#" id="myid"><span class="glyphicon glyphicon-shopping-cart" title="your orders" ></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
  </header>
