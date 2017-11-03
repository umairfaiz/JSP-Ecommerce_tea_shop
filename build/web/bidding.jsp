<%-- 
    Document   : bidding
    Created on : Jan 6, 2017, 11:55:17 AM
    Author     : Admin
--%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>Daily Shop | Reseller Bidding Page</title>
    
    <!-- Font awesome -->
    <link href="css/font-awesome.css" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="css/bootstrap.css" rel="stylesheet">   
    <!-- SmartMenus jQuery Bootstrap Addon CSS -->
    <link href="css/jquery.smartmenus.bootstrap.css" rel="stylesheet">
    <!-- Product view slider -->
    <link rel="stylesheet" type="text/css" href="css/jquery.simpleLens.css">    
    <!-- slick slider -->
    <link rel="stylesheet" type="text/css" href="css/slick.css">
    <!-- price picker slider -->
    <link rel="stylesheet" type="text/css" href="css/nouislider.css">
    <!-- Theme color -->
    <link id="switcher" href="css/theme-color/green-theme.css" rel="stylesheet">
 

    <!-- Main style sheet -->
    <link href="css/style.css" rel="stylesheet">    

    <!-- Google Font -->
    <link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

  </head>
  <!-- !Important notice -->
  <!-- Only for product page body tag have to added .productPage class -->
  <body class="productPage">  
   <!-- wpf loader Two -->
    <div id="wpf-loader-two">          
      <div class="wpf-loader-two-inner">
        <span>Loading</span>
      </div>
    </div> 
    <!-- / wpf loader Two -->       
 <!-- SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#"><i class="fa fa-chevron-up"></i></a>
  <!-- END SCROLL TOP BUTTON -->


  <!-- Start header section -->
  <header id="aa-header">
    <!-- start header top  -->
    <div class="aa-header-top">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="aa-header-top-area">
              <!-- start header top left -->
              <div class="aa-header-top-left">
                <!-- start language -->
                <div class="aa-language">
                  <div class="dropdown">
                    <a class="btn dropdown-toggle" href="#" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                      <img src="img/flag/english.jpg" alt="english flag">ENGLISH
                      <span class="caret"></span>
                    </a>
                  </div>
                </div>
                <!-- / language -->

                <!-- start currency -->
                <div class="aa-currency">
                  <div class="dropdown">
                    <a class="btn dropdown-toggle" href="#" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                     Currency: LKR
                    </a>
                  </div>
                </div>
                <!-- / currency -->
                <!-- start cellphone -->
                <div class="cellphone hidden-xs">
                  <p><span class="fa fa-phone"></span>+94-2841986</p>
                </div>
                <!-- / cellphone -->
              </div>
              <!-- / header top left -->
              <div class="aa-header-top-right">
                <ul class="aa-head-top-nav-right">
                  <c:set var="loginstate" scope="request" value="${param.loginstate}"/>
                  <c:if test="${loginstate ==null}">
                  <li><a href="contact.jsp">Contact</a></li>
                  <li><a href="" data-toggle="modal" data-target="#login-modal">Login</a></li>
                  </c:if>
                  <c:set var="loginstate" scope="request" value="${param.loginstate}"/>
                  <c:if test="${loginstate !=null}" >
                   <li><a href="account.jsp?loginstate=1" >Account</a></li>
                   <li><a href="updateUser.jsp?loginstate=1" >Update Account</a></li>
                  <li class="hidden-xs"><a href="whishlist.jsp?loginstate=1" >Wishlist</a></li>
                  <li class="hidden-xs"><a href="cart.jsp?loginstate=1">Cart</a></li>
                  <li class="hidden-xs"><a href="customer_inbox.jsp?loginstate=1">Inbox</a></li>
                  <li><a href="contact.jsp?loginstate=1">Contact</a></li>
                  <li><a href="index.jsp">Logout</a></li>
                      <!--<input type="submit" value="Logout">-->
                  </c:if>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- / header top  -->

    <!-- start header bottom  -->
    <div class="aa-header-bottom">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="aa-header-bottom-area">
              <!-- logo  -->
              <div class="aa-logo">
                <!-- Text based logo -->
                <a href="index.jsp?loginstate=1">
                 <span class="fa fa-coffee"></span>
                  <p>Hela~<strong>Tae</strong> <span>Leading Purveyor for Tea</span></p>
                </a>
                <!-- img based logo -->
                <!-- <a href="index.jsp"><img src="img/logo.jpg" alt="logo img"></a> -->
              </div>
              <!-- / logo  -->
               <!-- user name -->
              <div class="aa-cartbox">
                  <c:set var="loginstate" scope="request" value="${param.loginstate}"/>
                  <c:if test="${loginstate ==null}">
                  <span class="fa fa-user"></span>
                  <span class="aa-cart-title"><c:out value="Guest"/></span>
                  </c:if>
                  <c:set var="loginstate" scope="request" value="${param.loginstate}"/>
                  <c:if test="${loginstate !=null}">
                  <span class="fa fa-user"></span>
                  <span class="aa-cart-title"><c:out value="${myCust.customerEmail}"/></span>
                  </c:if>
              </div>
              <!-- / user name -->
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- / header bottom  -->
  </header>
  <!-- / header section -->
  <!-- menu -->
  <section id="menu">
    <div class="container">
      <div class="menu-area">
        <!-- Navbar -->
        <div class="navbar navbar-default" role="navigation">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>          
          </div>
          <div class="navbar-collapse collapse">
            <!-- Left nav -->
            <ul class="nav navbar-nav">
              <li><a href="index.jsp">Home</a></li>
              <li><a href="product.jsp">Premium Tea</a></li>
              <li><a href="icedTea.jsp">Iced Tea</a> </li>
              <li><a href="giftHampers.jsp">Accessories</a></li>
              <li><a href="giftHampers.jsp">Gifts</a></li>
              <li><a href="contact.jsp">Contact</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div> 
      </div>
    </div>
  </section>
  <!-- / menu -->  
 
  <!-- catg header banner section -->
  <section id="aa-catg-head-banner">
   <img src="img/pages/resellerprod.jpg" alt="fashion img">
   <div class="aa-catg-head-banner-area">
     <div class="container">
      <div class="aa-catg-head-banner-content">
        <h2>Reseller Bidding</h2>
      </div>
     </div>
   </div>
  </section>
  <!-- / catg header banner section -->

  <!-- product category -->
  <section id="aa-product-category">
    <div class="container">
      <div class="row">
        <div class="col-lg-9 col-md-9 col-sm-8 col-md-push-3">
            <div class="aa-product-catg-content">
                <div class="aa-product-catg-head">
                    <div class="aa-product-catg-head-right">
                        <a id="grid-catg" href="#"><span class="fa fa-th"></span></a>
                        <a id="list-catg" href="#"><span class="fa fa-list"></span></a>
                    </div>
                </div>
            <div class="aa-product-catg-body" id="list-catg">
                <jsp:useBean id="itembean" class="lk.HelaTae2.bean.itemBean" scope="page"/>
                <jsp:setProperty name="itembean" property="itemid" value="${param.itemid}"/>
          
                <ul class="aa-product-catg">
                    <sql:setDataSource var="db"
                                       driver="org.apache.derby.jdbc.ClientDriver" 
                                       url="jdbc:derby://localhost:1527/DBHaleTae" 
                                       user="umair" password="1234"/>
                    <sql:query var="itemsList"  dataSource="${db}">
                        SELECT * FROM UMAIR.BIDDINGITEMS
                    </sql:query>
                    <c:forEach items="${itemsList.rows}" var="i">
                        <li>
                            <form action="biddingServlet" method ="POST">
                            <figure>  
                                <a class="aa-product-img" href="#"><img src="img/bids/${i.itemid}.png" alt=""></a>
                                <input type="hidden" name="id" value="${i.itemid}" >
                                <input type="hidden" name="userEmail" value="${myCust.customerEmail}">
                                
                                <figcaption>
                                    <h5 class="aa-product-title"><input type="text" name="itemname" value="${i.itemname}" readonly style="border:none; width:300px"/></h5>
                                
                                    Rs.<input type="text" name="bidValue" value="Enter bid" ><button type="submit">BID</button><br>
                                Current bid (Rs.)<input type="text" readonly="" name="currentValue" style="color: red" value="${i.currentbid}"> 
                                </figcaption>
                         
                            </figure> 
                                </form>
                            <!-- product badge -->
                        </li>      
                    </c:forEach>
                </ul>
            </div>
          </div>
        </div>
        <div class="col-lg-3 col-md-3 col-sm-4 col-md-pull-9">
          <aside class="aa-sidebar">
           <div class="aa-sidebar-widget">
              <h3>Categories</h3>
              <div class="aa-recently-views">
                <ul>
                  <li>
                    <a href="product.jsp?loginstate=1" class="aa-cartbox-img"><img alt="img" src="img/premium.jpg"></a>
                    <div class="aa-cartbox-info">
                      <p>Premium Tea</p>
                    </div>                    
                  </li>
                  <li>
                    <a href="icedTea.jsp?loginstate=1" class="aa-cartbox-img"><img alt="img" src="img/iced.jpg"></a>
                    <div class="aa-cartbox-info">
                      <p>Iced Tea</p>
                    </div>                    
                  </li>
                   <li>
                    <a href="giftHampers.jsp?loginstate=1" class="aa-cartbox-img"><img alt="img" src="img/gift.jpg"></a>
                    <div class="aa-cartbox-info">
                      <p>Gift hampers</p>
                    </div>                    
                  </li>                                      
                </ul>
              </div>                            
            </div>
            <!-- single sidebar -->
          </aside>
        </div>
       
      </div>
    </div>
  </section>
  <!-- / product category -->


    <!-- footer -->  
  <footer id="aa-footer">
    <!-- footer bottom -->
    <div class="aa-footer-top">
     <div class="container">
        <div class="row">
        <div class="col-md-12">
          <div class="aa-footer-top-area">
            <div class="row">
              <div class="col-md-3 col-sm-6">
                <div class="aa-footer-widget">
                  <h3>Main Menu</h3>
                  <ul class="aa-footer-nav">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="product.jsp">Our Products</a></li>
                    <li><a href="contact.jsp">Contact Us</a></li>
                  </ul>
                </div>
              </div>
              <div class="col-md-3 col-sm-6">
                <div class="aa-footer-widget">
                  <div class="aa-footer-widget">
                    <h3>Contact Us</h3>
                    <address>
                      <p> 388, Dr Colvin R de Silva Mawatha, Colombo, Sri Lanka</p>
                      <p><span class="fa fa-phone"></span>+94-2841986</p>
                      <p><span class="fa fa-envelope"></span>haletae@gmail.com</p>
                    </address>
                    <div class="aa-footer-social">
                      <a href="www.fb.com"><span class="fa fa-facebook"></span></a>
                      <a href="www.twitter.com"><span class="fa fa-twitter"></span></a>
                      <a href="www.google.com"><span class="fa fa-google-plus"></span></a>
                      <a href="www.youtube.com"><span class="fa fa-youtube"></span></a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
     </div>
    </div>
    <!-- footer-bottom -->
    <div class="aa-footer-bottom">
      <div class="container">
        <div class="row">
        <div class="col-md-12">
          <div class="aa-footer-bottom-area">
            <p>Designed by <a href="">umair</a></p>
            <div class="aa-footer-payment">
              <span class="fa fa-cc-mastercard"></span>
              <span class="fa fa-cc-visa"></span>
              <span class="fa fa-paypal"></span>
              <span class="fa fa-cc-discover"></span>
            </div>
          </div>
        </div>
      </div>
      </div>
    </div>
  </footer>
  <!-- / footer -->
  <!-- Login Modal -->  
  <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">                      
        <div class="modal-body">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4>Login or Register</h4>
          <form class="aa-login-form" action="loginServlet" method="POST">
            <label for="">Email address<span>*</span></label>
            <input type="email" name="useremail" placeholder="Email">
            <label for="">Password<span>*</span></label>
            <input type="password" name="password" placeholder="Password">
            <button class="aa-browse-btn" type="submit">Login</button>
            <div class="aa-register-now">No account? <a href="account.jsp">Register now!</a></div>
          </form>
        </div>                        
      </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
  </div>    

  <!-- jQuery library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="js/bootstrap.js"></script>  
  <!-- SmartMenus jQuery plugin -->
  <script type="text/javascript" src="js/jquery.smartmenus.js"></script>
  <!-- SmartMenus jQuery Bootstrap Addon -->
  <script type="text/javascript" src="js/jquery.smartmenus.bootstrap.js"></script>  
  <!-- Product view slider -->
  <script type="text/javascript" src="js/jquery.simpleGallery.js"></script>
  <script type="text/javascript" src="js/jquery.simpleLens.js"></script>
  <!-- slick slider -->
  <script type="text/javascript" src="js/slick.js"></script>
  <!-- Price picker slider -->
  <script type="text/javascript" src="js/nouislider.js"></script>
  
  <!-- Custom js -->
  <script src="js/custom.js"></script> 
  </body>
</html>


