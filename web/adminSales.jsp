<%-- 
    Document   : adminSales
    Created on : Jan 1, 2017, 10:56:55 AM
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
        <title>Hela~Tae | Sales Page</title>

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
                                            <li><a href="adminCompose_reply.jsp">Contact</a></li>
                                            <li><a href="" data-toggle="modal" data-target="#login-modal">Login</a></li>
                                            </c:if>
                                            <c:set var="loginstate" scope="request" value="${param.loginstate}"/>
                                            <c:if test="${loginstate !=null}" >
                                            <li><a href="adminIndex.jsp?loginstate=1">Home</a></li>
                                            <li class="hidden-xs"><a href="admin_inbox.jsp?loginstate=1">Inbox</a></li>
                                            <li><a href="adminCompose_reply.jsp?loginstate=1">Compose</a></li>
                                            <li><a href="">Logout</a></li>
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
                                    <a href="adminIndex.jsp?loginstate=1">
                                        <span class="fa fa-coffee"></span>
                                        <p>Hela~<strong>Tae</strong> <span>Leading Purveyor for Tea</span></p>
                                    </a>
                                    <!-- img based logo -->
                                    <!-- <a href="index.jsp"><img src="img/logo.jpg" alt="logo img"></a> -->
                                </div>
                                <!-- / logo  -->
                                <!-- user name -->
              <div class="aa-cartbox">
                <span class="fa fa-user"></span>
                <span class="aa-cart-title"><c:out value="${myCust.customerEmail}" default="Guest"/></span>
              </div>
              <!-- / user name -->            
                            </div>
                        </div>
                    </div>
              <a href="adminUploadItem.jsp"></a>
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
                                <li><a href="adminIndex.jsp?loginstate=1">Home</a></li>
                                <li><a href="adminCompose_reply.jsp?loginstate=1">Reply</a></li>
                                <li><a href="admin_inbox.jsp?loginstate=1">Inbox</a></li>
                                <li><a href="adminSales.jsp?loginstate=1">View sales</a> </li>
                                <li><a href="adminUploadItem.jsp?loginstate=1">Upload</a></li>
                            </ul>
                        </div><!--/.nav-collapse -->
                    </div>
                </div> 
            </div>
    </section>
    <!-- / menu -->  

    <!-- catg header banner section -->
    <section id="aa-catg-head-banner">
        <img src="img/pages/contact.jpg" alt="fashion img">
        <div class="aa-catg-head-banner-area">
            <div class="container">
                <div class="aa-catg-head-banner-content">
                    <h2>Sales Summary Page</h2> 
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
                                <div class="col-md-12">     
                                    <div class="checkout-right">
                                        <form action="orderServlet" method="POST">
                                        <h4>Sales Summary</h4>
                                        <div class="aa-order-summary-area">
                                            <table class="table table-responsive">
                                               
                                                <sql:setDataSource var="connectdb" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/DBHaleTae" user="umair" password="1234"/>
                                                <sql:query var="cartList"  dataSource="${connectdb}">
                                                    SELECT * FROM UMAIR.CARTDETAIL where USEREMAIL='${myCust.customerEmail}'
                                                </sql:query>
                                                
                                                <tfoot>
                                                    <tr>
                                                        <th>First quarter</th>
                                                        <td>Rs. ${fQuart}</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Second quarter</th> 
                                                        <td>Rs. ${sQuart}</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Third quarter</th> 
                                                        <td>Rs. ${tQuart}</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Total Sales</th> 
                                                        <td>Rs. ${totalSales}</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Total units sold</th> 
                                                        <td>${totalUnits}</td>
                                                    </tr>
                                                </tfoot>
                                            </table>
                                        </div>       
                                    </form>
                                     <a href="adminIndex.jsp?loginstate=1"><button class="aa-browse-btn">Go back</button></a>
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
                                            <li><a href="#">Home</a></li>
                                            <li><a href="#">Our Services</a></li>
                                            <li><a href="#">Our Products</a></li>
                                            <li><a href="#">About Us</a></li>
                                            <li><a href="#">Contact Us</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-md-3 col-sm-6">
                                    <div class="aa-footer-widget">
                                        <div class="aa-footer-widget">
                                            <h3>Knowledge Base</h3>
                                            <ul class="aa-footer-nav">
                                                <li><a href="#">Delivery</a></li>
                                                <li><a href="#">Returns</a></li>
                                                <li><a href="#">Services</a></li>
                                                <li><a href="#">Discount</a></li>
                                                <li><a href="#">Special Offer</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-3 col-sm-6">
                                    <div class="aa-footer-widget">
                                        <div class="aa-footer-widget">
                                            <h3>Useful Links</h3>
                                            <ul class="aa-footer-nav">
                                                <li><a href="#">Site Map</a></li>
                                                <li><a href="#">Search</a></li>
                                                <li><a href="#">Advanced Search</a></li>
                                                <li><a href="#">Suppliers</a></li>
                                                <li><a href="#">FAQ</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-3 col-sm-6">
                                    <div class="aa-footer-widget">
                                        <div class="aa-footer-widget">
                                            <h3>Contact Us</h3>
                                            <address>
                                                <p> 25 Astor Pl, NY 10003, USA</p>
                                                <p><span class="fa fa-phone"></span>+1 212-982-4589</p>
                                                <p><span class="fa fa-envelope"></span>dailyshop@gmail.com</p>
                                            </address>
                                            <div class="aa-footer-social">
                                                <a href="#"><span class="fa fa-facebook"></span></a>
                                                <a href="#"><span class="fa fa-twitter"></span></a>
                                                <a href="#"><span class="fa fa-google-plus"></span></a>
                                                <a href="#"><span class="fa fa-youtube"></span></a>
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
                            <p>Designed by <a href="http://www.markups.io/">MarkUps.io</a></p>
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

