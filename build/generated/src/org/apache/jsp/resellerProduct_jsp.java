package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resellerProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_default_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_default_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_default_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("    <title>Daily Shop | Reseller Product Page</title>\n");
      out.write("    \n");
      out.write("    <!-- Font awesome -->\n");
      out.write("    <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">   \n");
      out.write("    <!-- SmartMenus jQuery Bootstrap Addon CSS -->\n");
      out.write("    <link href=\"css/jquery.smartmenus.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Product view slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.simpleLens.css\">    \n");
      out.write("    <!-- slick slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/slick.css\">\n");
      out.write("    <!-- price picker slider -->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/nouislider.css\">\n");
      out.write("    <!-- Theme color -->\n");
      out.write("    <link id=\"switcher\" href=\"css/theme-color/green-theme.css\" rel=\"stylesheet\">\n");
      out.write(" \n");
      out.write("\n");
      out.write("    <!-- Main style sheet -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">    \n");
      out.write("\n");
      out.write("    <!-- Google Font -->\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <!-- !Important notice -->\n");
      out.write("  <!-- Only for product page body tag have to added .productPage class -->\n");
      out.write("  <body class=\"productPage\">  \n");
      out.write("   <!-- wpf loader Two -->\n");
      out.write("    <div id=\"wpf-loader-two\">          \n");
      out.write("      <div class=\"wpf-loader-two-inner\">\n");
      out.write("        <span>Loading</span>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("    <!-- / wpf loader Two -->       \n");
      out.write(" <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("  <!-- END SCROLL TOP BUTTON -->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Start header section -->\n");
      out.write("  <header id=\"aa-header\">\n");
      out.write("    <!-- start header top  -->\n");
      out.write("    <div class=\"aa-header-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"aa-header-top-area\">\n");
      out.write("              <!-- start header top left -->\n");
      out.write("              <div class=\"aa-header-top-left\">\n");
      out.write("                <!-- start language -->\n");
      out.write("                <div class=\"aa-language\">\n");
      out.write("                  <div class=\"dropdown\">\n");
      out.write("                    <a class=\"btn dropdown-toggle\" href=\"#\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("                      <img src=\"img/flag/english.jpg\" alt=\"english flag\">ENGLISH\n");
      out.write("                      <span class=\"caret\"></span>\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- / language -->\n");
      out.write("\n");
      out.write("                <!-- start currency -->\n");
      out.write("                <div class=\"aa-currency\">\n");
      out.write("                  <div class=\"dropdown\">\n");
      out.write("                    <a class=\"btn dropdown-toggle\" href=\"#\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("                     Currency: LKR\n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- / currency -->\n");
      out.write("                <!-- start cellphone -->\n");
      out.write("                <div class=\"cellphone hidden-xs\">\n");
      out.write("                  <p><span class=\"fa fa-phone\"></span>+94-2841986</p>\n");
      out.write("                </div>\n");
      out.write("                <!-- / cellphone -->\n");
      out.write("              </div>\n");
      out.write("              <!-- / header top left -->\n");
      out.write("              <div class=\"aa-header-top-right\">\n");
      out.write("                <ul class=\"aa-head-top-nav-right\">\n");
      out.write("                  <li><a href=\"account.jsp\" >Account</a></li>\n");
      out.write("                  <li class=\"hidden-xs\"><a href=\"whishlist.jsp\" >Wishlist</a></li>\n");
      out.write("                  <li class=\"hidden-xs\"><a href=\"cart.jsp\">Cart</a></li>\n");
      out.write("                  <li class=\"hidden-xs\"><a href=\"customer_inbox.jsp\">Inbox</a></li>\n");
      out.write("                  ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                  ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- / header top  -->\n");
      out.write("\n");
      out.write("    <!-- start header bottom  -->\n");
      out.write("    <div class=\"aa-header-bottom\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("            <div class=\"aa-header-bottom-area\">\n");
      out.write("              <!-- logo  -->\n");
      out.write("              <div class=\"aa-logo\">\n");
      out.write("                <!-- Text based logo -->\n");
      out.write("                <a href=\"index.jsp\">\n");
      out.write("                 <span class=\"fa fa-coffee\"></span>\n");
      out.write("                  <p>Hela~<strong>Tae</strong> <span>Leading Purveyor for Tea</span></p>\n");
      out.write("                </a>\n");
      out.write("                <!-- img based logo -->\n");
      out.write("                <!-- <a href=\"index.jsp\"><img src=\"img/logo.jpg\" alt=\"logo img\"></a> -->\n");
      out.write("              </div>\n");
      out.write("              <!-- / logo  -->\n");
      out.write("               <!-- user name -->\n");
      out.write("              <div class=\"aa-cartbox\">\n");
      out.write("                  <span class=\"fa fa-user\"></span>\n");
      out.write("                  <span class=\"aa-cart-title\">");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("              </div>\n");
      out.write("              <!-- / user name -->\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- / header bottom  -->\n");
      out.write("  </header>\n");
      out.write("  <!-- / header section -->\n");
      out.write("  <!-- menu -->\n");
      out.write("  <section id=\"menu\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"menu-area\">\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <div class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("            </button>          \n");
      out.write("          </div>\n");
      out.write("          <div class=\"navbar-collapse collapse\">\n");
      out.write("            <!-- Left nav -->\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("              <li><a href=\"product.jsp\">Premium Tea</a></li>\n");
      out.write("              <li><a href=\"icedTea.jsp\">Iced Tea</a> </li>\n");
      out.write("              <li><a href=\"giftHampers.jsp\">Accessories</a></li>\n");
      out.write("              <li><a href=\"giftHampers.jsp\">Gifts</a></li>\n");
      out.write("              <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / menu -->  \n");
      out.write(" \n");
      out.write("  <!-- catg header banner section -->\n");
      out.write("  <section id=\"aa-catg-head-banner\">\n");
      out.write("   <img src=\"img/fashion/fashion-header-bg-8.jpg\" alt=\"fashion img\">\n");
      out.write("   <div class=\"aa-catg-head-banner-area\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("      <div class=\"aa-catg-head-banner-content\">\n");
      out.write("        <h2>Fashion</h2>\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("          <li><a href=\"index.jsp\">Home</a></li>         \n");
      out.write("          <li class=\"active\">Women</li>\n");
      out.write("        </ol>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / catg header banner section -->\n");
      out.write("\n");
      out.write("  <!-- product category -->\n");
      out.write("  <section id=\"aa-product-category\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-9 col-md-9 col-sm-8 col-md-push-3\">\n");
      out.write("            <div class=\"aa-product-catg-content\">\n");
      out.write("                <div class=\"aa-product-catg-head\">\n");
      out.write("                    <div class=\"aa-product-catg-head-right\">\n");
      out.write("                        <a id=\"grid-catg\" href=\"#\"><span class=\"fa fa-th\"></span></a>\n");
      out.write("                        <a id=\"list-catg\" href=\"#\"><span class=\"fa fa-list\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"aa-product-catg-body\" id=\"list-catg\">\n");
      out.write("                ");
      lk.HelaTae2.bean.itemBean itembean = null;
      synchronized (_jspx_page_context) {
        itembean = (lk.HelaTae2.bean.itemBean) _jspx_page_context.getAttribute("itembean", PageContext.PAGE_SCOPE);
        if (itembean == null){
          itembean = new lk.HelaTae2.bean.itemBean();
          _jspx_page_context.setAttribute("itembean", itembean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.handleSetPropertyExpression(_jspx_page_context.findAttribute("itembean"), "itemid", "${param.itemid}", _jspx_page_context, null);
      out.write("\n");
      out.write("          \n");
      out.write("                <ul class=\"aa-product-catg\">\n");
      out.write("                    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"aa-product-catg-pagination\">\n");
      out.write("              <nav>\n");
      out.write("                <ul class=\"pagination\">\n");
      out.write("                  <li><a href=\"resellerProduct.jsp\">1</a></li>\n");
      out.write("                  <li><a href=\"resellerIcedTea.jsp\">2</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </nav>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3 col-md-3 col-sm-4 col-md-pull-9\">\n");
      out.write("          <aside class=\"aa-sidebar\">\n");
      out.write("           <div class=\"aa-sidebar-widget\">\n");
      out.write("              <h3>Categories</h3>\n");
      out.write("              <div class=\"aa-recently-views\">\n");
      out.write("                <ul>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"product.jsp\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"img/premium.jpg\"></a>\n");
      out.write("                    <div class=\"aa-cartbox-info\">\n");
      out.write("                      <p>Premium Tea</p>\n");
      out.write("                    </div>                    \n");
      out.write("                  </li>\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"icedTea.jsp\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"img/iced.jpg\"></a>\n");
      out.write("                    <div class=\"aa-cartbox-info\">\n");
      out.write("                      <p>Iced Tea</p>\n");
      out.write("                    </div>                    \n");
      out.write("                  </li>\n");
      out.write("                   <li>\n");
      out.write("                    <a href=\"giftHampers.jsp\" class=\"aa-cartbox-img\"><img alt=\"img\" src=\"img/gift.jpg\"></a>\n");
      out.write("                    <div class=\"aa-cartbox-info\">\n");
      out.write("                      <p>Gift hampers</p>\n");
      out.write("                    </div>                    \n");
      out.write("                  </li>                                      \n");
      out.write("                </ul>\n");
      out.write("              </div>                            \n");
      out.write("            </div>\n");
      out.write("            <!-- single sidebar -->\n");
      out.write("          </aside>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / product category -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- footer -->  \n");
      out.write("  <footer id=\"aa-footer\">\n");
      out.write("    <!-- footer bottom -->\n");
      out.write("    <div class=\"aa-footer-top\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-footer-top-area\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <div class=\"aa-footer-widget\">\n");
      out.write("                  <h3>Main Menu</h3>\n");
      out.write("                  <ul class=\"aa-footer-nav\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"product.jsp\">Our Products</a></li>\n");
      out.write("                    <li><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <div class=\"aa-footer-widget\">\n");
      out.write("                  <div class=\"aa-footer-widget\">\n");
      out.write("                    <h3>Contact Us</h3>\n");
      out.write("                    <address>\n");
      out.write("                      <p> 388, Dr Colvin R de Silva Mawatha, Colombo, Sri Lanka</p>\n");
      out.write("                      <p><span class=\"fa fa-phone\"></span>+94-2841986</p>\n");
      out.write("                      <p><span class=\"fa fa-envelope\"></span>haletae@gmail.com</p>\n");
      out.write("                    </address>\n");
      out.write("                    <div class=\"aa-footer-social\">\n");
      out.write("                      <a href=\"www.fb.com\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                      <a href=\"www.twitter.com\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                      <a href=\"www.google.com\"><span class=\"fa fa-google-plus\"></span></a>\n");
      out.write("                      <a href=\"www.youtube.com\"><span class=\"fa fa-youtube\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- footer-bottom -->\n");
      out.write("    <div class=\"aa-footer-bottom\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-footer-bottom-area\">\n");
      out.write("            <p>Designed by <a href=\"\">umair</a></p>\n");
      out.write("            <div class=\"aa-footer-payment\">\n");
      out.write("              <span class=\"fa fa-cc-mastercard\"></span>\n");
      out.write("              <span class=\"fa fa-cc-visa\"></span>\n");
      out.write("              <span class=\"fa fa-paypal\"></span>\n");
      out.write("              <span class=\"fa fa-cc-discover\"></span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("  <!-- / footer -->\n");
      out.write("  <!-- Login Modal -->  \n");
      out.write("  <div class=\"modal fade\" id=\"login-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\">\n");
      out.write("      <div class=\"modal-content\">                      \n");
      out.write("        <div class=\"modal-body\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("          <h4>Login or Register</h4>\n");
      out.write("          <form class=\"aa-login-form\" action=\"\">\n");
      out.write("            <label for=\"\">Username or Email address<span>*</span></label>\n");
      out.write("            <input type=\"text\" placeholder=\"Username or email\">\n");
      out.write("            <label for=\"\">Password<span>*</span></label>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\">\n");
      out.write("            <button class=\"aa-browse-btn\" type=\"submit\">Login</button>\n");
      out.write("            <label for=\"rememberme\" class=\"rememberme\"><input type=\"checkbox\" id=\"rememberme\"> Remember me </label>\n");
      out.write("            <p class=\"aa-lost-password\"><a href=\"#\">Lost your password?</a></p>\n");
      out.write("            <div class=\"aa-register-now\">Don't have an account?<a href=\"account.jsp\">Register!</a></div>\n");
      out.write("          </form>\n");
      out.write("        </div>                        \n");
      out.write("      </div><!-- /.modal-content -->\n");
      out.write("    </div><!-- /.modal-dialog -->\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- jQuery library -->\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("  <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("  <script src=\"js/bootstrap.js\"></script>  \n");
      out.write("  <!-- SmartMenus jQuery plugin -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.smartmenus.js\"></script>\n");
      out.write("  <!-- SmartMenus jQuery Bootstrap Addon -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.smartmenus.bootstrap.js\"></script>  \n");
      out.write("  <!-- Product view slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.simpleGallery.js\"></script>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/jquery.simpleLens.js\"></script>\n");
      out.write("  <!-- slick slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/slick.js\"></script>\n");
      out.write("  <!-- Price picker slider -->\n");
      out.write("  <script type=\"text/javascript\" src=\"js/nouislider.js\"></script>\n");
      out.write("  \n");
      out.write("  <!-- Custom js -->\n");
      out.write("  <script src=\"js/custom.js\"></script> \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("loginstate");
    _jspx_th_c_set_0.setScope("request");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.loginstate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginstate ==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                  <li><a href=\"\" data-toggle=\"modal\" data-target=\"#login-modal\">Login</a></li>\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("loginstate");
    _jspx_th_c_set_1.setScope("request");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.loginstate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginstate !=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                  <li><a href=\"\">Logout</a></li>\n");
        out.write("                      <!--<input type=\"submit\" value=\"Logout\">-->\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_default_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myCust.customerEmail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_out_0.setDefault("Guest");
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_default_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_default_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("db");
    _jspx_th_sql_setDataSource_0.setDriver("org.apache.derby.jdbc.ClientDriver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:derby://localhost:1527/DBHaleTae");
    _jspx_th_sql_setDataSource_0.setUser("umair");
    _jspx_th_sql_setDataSource_0.setPassword("1234");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("itemsList");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${db}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                        SELECT * FROM ITEM where ITEMCATE='Repremium'\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${itemsList.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <li>\n");
          out.write("                            <form action=\"cartServlet\" method =\"POST\">\n");
          out.write("                            <figure>  \n");
          out.write("                                <a class=\"aa-product-img\" href=\"#\"><img src=\"img/products/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.itemid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".png\" alt=\"\"></a>\n");
          out.write("                                <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.itemid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\n");
          out.write("                                <input type=\"hidden\" name=\"discount\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.discount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >\n");
          out.write("                                <input type=\"hidden\" name=\"userEmail\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myCust.customerEmail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                <a class=\"aa-add-card-btn\"><span class=\"fa fa-shopping-cart\"></span><input type=\"hidden\" name=\"addtocart\" value=\"add\"/><button type=\"submit\" style=\"background: black; border: none\">Add To Cart</button></a>\n");
          out.write("                                <div class=\"aa-product-hvr-content\">\n");
          out.write("                                  <button data-toggle=\"tooltip\" data-placement=\"top\" title=\"Add to Wishlist\" type=\"hidden\" name=\"wishlistReseller\" value=\"Relist\"><span class=\"fa fa-heart-o\"></span></button>\n");
          out.write("                                </div>\n");
          out.write("                                <figcaption>\n");
          out.write("                                    <h5 class=\"aa-product-title\"><input type=\"text\" name=\"itemname\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.itemname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly style=\"border:none; width:300px\"/></h5>\n");
          out.write("                                    <span class=\"aa-product-price\"><input type=\"text\" name=\"price\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" readonly style=\"border:none; width:300px\"/></span>\n");
          out.write("                                    <p class=\"aa-product-descrip\" ><input type=\"hidden\" name=\"description\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.itemdescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.itemdescription}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <select name=\"quantity\" >\n");
          out.write("                                        <option value=\"10\" selected=\"1\">10</option>\n");
          out.write("                                        <option value=\"20\">20</option>\n");
          out.write("                                        <option value=\"30\">30</option>\n");
          out.write("                                        <option value=\"40\">40</option>\n");
          out.write("                                        <option value=\"50\">50</option>\n");
          out.write("                                    </select>\n");
          out.write("                                </figcaption>\n");
          out.write("                                <input type=\"hidden\" name=\"quantity\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${qty}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            </figure> \n");
          out.write("                                </form>\n");
          out.write("                            <!-- product badge -->\n");
          out.write("                        </li>      \n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
