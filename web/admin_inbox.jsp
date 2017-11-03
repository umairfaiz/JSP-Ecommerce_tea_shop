<%-- 
    Document   : check
    Created on : Dec 14, 2016, 3:32:35 PM
    Author     : Admin
--%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hela~Tae | Admin inbox </title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <link href="admincss/bootstrap.css" rel="stylesheet" type="text/css" media="all">
        <!-- Custom Theme files -->
        <link href="admincss/style.css" rel="stylesheet" type="text/css" media="all"/>
        <!--js-->
        <script src="js/jquery-2.1.1.min.js"></script> 
        <!--icons-css-->
        <link href="admincss/font-awesome.css" rel="stylesheet"> 
        <!--Google Fonts-->
        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
        <!--//skycons-icons-->
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

    </head>
    <body>
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
                                            </a>
                                            <!--<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                              <li><a href="#"><img src="img/flag/french.jpg" alt="">FRENCH</a></li>
                                              <li><a href="#"><img src="img/flag/english.jpg" alt="">ENGLISH</a></li>
                                            </ul>-->
                                        </div>
                                    </div>
                                    <!-- / language -->

                                    <!-- start currency -->
                                    <div class="aa-currency">
                                        <div class="dropdown">
                                            <a class="btn dropdown-toggle" href="#" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                                Currency: LKR
                                            </a>
                                            <!-- <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                               <li><a href="#"><i class="fa fa-euro"></i>EURO</a></li>
                                               <li><a href="#"><i class="fa fa-jpy"></i>YEN</a></li>
                                             </ul>-->
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
                </div>
            </div>
            <!-- / header bottom  -->
        </header>
        <!-- / header section -->
      	
            <div class="left-content">
            <!--inner block start here-->
            <div class="col-md-8 mailbox-content  tab-content tab-content-in">
                <div class="tab-pane active text-style" id="tab1">
                    <form action="adminInquiryServlet">
                    <div class="mailbox-border">
                        <table class="table tab-border">
                            <tbody>
                                <sql:setDataSource var="connectdb" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/DBHaleTae" user="umair" password="1234"/>
                                <sql:query var="messageList"  dataSource="${connectdb}">
                                    SELECT * FROM MESSAGEDETAILS where RECEIVER='${myCust.customerEmail}'
                                </sql:query>
                                <c:forEach items="${messageList.rows}" var="i">
                                    <tr class="unread checked">
                                <td class="hidden-xs"><button class="remove" type="submit" name="chckDelete" value="removeemail"><fa class="fa fa-close"></fa></button></td>
                                <td class="hidden-xs">${i.CUSTEMAIL}</td>
                                <td>${i.CUSTSUBJECT}</td>
                                <td>${i.CUSTMESSAGE}</td> 
                                <input type="hidden" name="message" value="${i.CUSTMESSAGE}">
                                <input type="hidden" name="user" value="${myCust.customerEmail}">
                                </tr>
                                
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>  
                    <div class="compose-block">
                        <a href="adminCompose_reply.jsp" class="fa fa-envelope-o"> Compose</a>
                    </div>
                    </form>
                </div>          
            </div>
        </div>
    
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
