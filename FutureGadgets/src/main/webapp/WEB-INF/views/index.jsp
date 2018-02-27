<!DOCTYPE html>

<%@include file="template/Header.jsp" %>

  <div class="container-fluid" style="padding:0px;">
<div class="container-fluid" style="padding:0px;">
 <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="2000">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox" >

       <div class="item active">
        <img src="./resources/images/Hitech.png" alt="Best Product" width="100%" height="500px" title="Best seller ">
        <div class="carousel-caption">
          <h3>Best seller</h3>
          <p>Tech-Redefined</p>
        </div>
      </div>

      <div class="item">
        <img src="./resources/images/Tablet.png" alt="Tablets from Redmi" width="100%" height="500px"  title="Ipad ">
        <div class="carousel-caption">
          <h3>Middle sized Gadgets</h3>
          <p>Tablets</p>
        </div>
      </div>
    
      <div class="item">
        <img src="./resources/images/sci-fi.png" alt="Futuristic image" width="100%" height="500px" title="Best of World">
        <div class="carousel-caption">
          <h3>Latest</h3>
          <p>Future is here!!</p>
        </div>
      </div>

    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
<br />
<br />
 </div>
  <div class= "container" >
  
  <div class="floating-box" style="margin-left:5%" title="New Trends">
  <h3 > Latest Arrivals</h3>
<figure> 
 <img class="img-responsive img-circle" src="https://cdn.pixabay.com/photo/2018/01/16/10/18/headphone-3085681__340.jpg" width="80%" style="margin-left:auto; margin-right:auto" caption="Find out whichis your favorite">
 <figcaption>Find out which 
 <br />is your favorite
 <br />All the new products
 <br />are available here. 
 </figcaption>
 </div>
  <div class="floating-box" style="margin-left:5%" title="Mobiles ">
  <h3> Mobiles</h3>
  <figure>
  <img class="img-responsive img-circle" src="https://cdn.pixabay.com/photo/2015/12/13/16/02/ios-1091302__340.jpg" width="74%" style="margin-left:auto; margin-right:auto">
 <figcaption>Find out which 
 <br />is your favorite
 <br /> Latest trends available,
 <br /> Along with cheap deals.</figcaption>
  
  </figure>
  </div>
  <div class="floating-box" style="margin-left:5%" title="Daily use important gadgets">
  <h3> Daily Use</h3>
<figure> 
 <img class="img-responsive img-circle" src="https://cdn.pixabay.com/photo/2014/07/31/23/00/wristwatch-407096__340.jpg" width="80%" style="margin-left:auto; margin-right:auto">
  <figcaption>Find out which 
 <br />is your favorite
 <br /> All the products
 <br />which you must have.</figcaption>
   </figure>
  </div>
  </div>
</div>
<br />

<%@include file="template/Footer.jsp" %>
