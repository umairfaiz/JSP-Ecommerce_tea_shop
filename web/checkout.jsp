<%-- 
    Document   : checkout
    Created on : Dec 14, 2016, 6:23:45 PM
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
        <title>Hela~Tae | Checkout Page</title>

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
    <body>  
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
                                <!-- username -->
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
                                <!-- / username -->
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
        <img src="img/pages/checkout.jpg" alt="">
        <div class="aa-catg-head-banner-area">
            <div class="container">
                <div class="aa-catg-head-banner-content">
                    <h2>Checkout Page</h2>
                </div>
            </div>
        </div>
    </section>
    <!-- / catg header banner section -->

    <!-- Cart view section -->
    <section id="checkout">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="checkout-area">
                            <div class="row">
                                <div class="col-md-8">
                                    <div class="checkout-left">
                                        <div class="panel-group" id="accordion">
                                            <!-- Coupon section -->
                                            <div class="panel panel-default aa-checkout-coupon">
                                                <div class="panel-heading">
                                                    <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
                                                            Have a Coupon? <h6>*only for premium members</h6>
                                                        </a>
                                                    </h4>
                                                </div>
                                                <div id="collapseOne" class="panel-collapse collapse in">
                                                    <form action="checkoutServlet" method="POST">
                                                    <div class="panel-body">
                                                        <input type="text" name="couponID" placeholder="Coupon Code" class="aa-coupon-code">
                                                         <input type="hidden" name="userEmail" value="${myCust.customerEmail}">
                                                        <input type="submit" value="Apply Coupon" class="aa-browse-btn">
                                                    </div>
                                                    </form>
                                                </div>
                                            </div>

                                            <!-- Shipping Address -->
                                            <div class="panel panel-default aa-checkout-billaddress">
                                                <div class="panel-heading">
                                                    <h4 class="panel-title">
                                                        <a data-toggle="collapse" data-parent="#accordion" href="#collapseFour">
                                                            Shippping Address
                                                        </a>
                                                    </h4>
                                                </div>
                                                <div id="collapseFour" class="panel-collapse collapse">
                                                    <form action="checkoutServlet" method="POST">
                                                    <div class="panel-body">
                                                        <div class="row">
                                                            <div class="col-md-6">
                                                                <div class="aa-checkout-single-bill">
                                                                    <input type="text" name="purchcustEmail"placeholder="Email Address*">
                                                                </div>                             
                                                            </div>
                                                        </div> 
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="aa-checkout-single-bill">
                                                                    <textarea cols="8" rows="3" name="purchCustAddress">Address*</textarea>
                                                                </div>                             
                                                            </div>                            
                                                        </div>   
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="aa-checkout-single-bill">
                                                                    <select name="country">
                                                                        <option selected="select" value="0">Select your country...</option>
                                                                        <option value="SriLanka">within Sri lanka</option>
                                                                        <option value="India">India</option>
                                                                        <option value="EU">Europe</option>
                                                                        <option value="USA">USA</option>
                                                                    </select>
                                                                </div>                             
                                                            </div>                            
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                                <div class="aa-checkout-single-bill">
                                                                    <textarea cols="8" rows="3" name="purchNote">Special Notes</textarea>
                                                                </div>                             
                                                            </div>                            
                                                        </div> 
                                                        <input type="hidden" name="userEmail" value="${myCust.customerEmail}">
                                                        <input type="submit" name="calcharges" value="CalculateCharges" class="aa-browse-btn">
                                                    </div>
                                                    </form>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-4">     
                                    <div class="checkout-right">
                                        <form action="orderServlet" method="POST">
                                        <h4>Order Summary</h4>
                                        <div class="aa-order-summary-area">
                                            <table class="table table-responsive">
                                                <thead>
                                                    <tr>
                                                        <th>Product</th>
                                                        <th>Total (Rs.)</th>
                                                    </tr>
                                                </thead>
                                                <sql:setDataSource var="connectdb" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/DBHaleTae" user="umair" password="1234"/>
                                                <sql:query var="cartList"  dataSource="${connectdb}">
                                                    SELECT * FROM UMAIR.CARTDETAIL where USEREMAIL='${myCust.customerEmail}'
                                                </sql:query>
                                                <c:forEach items="${cartList.rows}" var="i">
                                                    
                                                    <tbody>
                                                        <tr>
                                                            <td>${i.ITEMNAME} <strong> x ${i.QTY}</strong></td>
                                                            <td>${i.TOTAL}</td>
                                                            <input type="hidden" name="subTotal" value="${i.TOTAL}">
                                                            <input type="hidden" name="itemID" value="${i.ITEMID}">
                                                            <input type="hidden" name="totQty" value="${fQty}">
                                                            <input type="hidden" name="userEmail" value="${myCust.customerEmail}">
                                                        </tr>
                                                </c:forEach> 
                                                </tbody>
                                                <tfoot>
                                                    <tr>
                                                        <th>sub-total</th>
                                                        <td>${fTotal}</td>
                                                        <input type="hidden" name="payableTotal" value="${requestScope.fTotal}">
                                                    </tr>
                                                    <tr>
                                                        <th>Redeemable points*</th> 
                                                        <td>${mPoints}</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Delivery/Shipping charges</th> 
                                                        <td>${deliShip}</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Total</th> 
                                                        <td>${PTotal}</td>
                                                        <input type="hidden" name="finalTotal" value="${PTotal}">
                                                        <input type="hidden" name="purchNote">
                                                    </tr>
                                                </tfoot>
                                                <jsp:useBean id="nowdate" class="java.util.Date" scope="page" />
                                                <fmt:formatDate  value="${nowdate}" pattern="yyyy-MM-dd" />
                                            </table>
                                        </div>
                                        <div class="aa-payment-method">
                                            <h6>We accept the following cards...</h6>
                                            <span class="fa fa-cc-visa"></span>
                                            <span class="fa fa-cc-mastercard"></span><br>
                                            <button type="submit" value="Place Order" class="aa-browse-btn">Place Order</button>                
                                        </div>
                                    </form>
                                    </div>
                                </div>
                            </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- / Cart view section -->

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
