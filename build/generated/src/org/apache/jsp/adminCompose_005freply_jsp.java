package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminCompose_005freply_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_default_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_default_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_default_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("    <title>Hela~Tae | Reply page</title>\n");
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
      out.write("    \n");
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
      out.write("  <body> \n");
      out.write("    <!-- wpf loader Two -->\n");
      out.write("    <div id=\"wpf-loader-two\">          \n");
      out.write("      <div class=\"wpf-loader-two-inner\">\n");
      out.write("        <span>Loading</span>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("    <!-- / wpf loader Two -->       \n");
      out.write("    <!-- SCROLL TOP BUTTON -->\n");
      out.write("    <a class=\"scrollToTop\" href=\"#\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("    <!-- END SCROLL TOP BUTTON -->\n");
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
      out.write("                 ");
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
      out.write("                <a href=\"adminIndex.jsp?loginstate=1\">\n");
      out.write("                  <span class=\"fa fa-coffee\"></span>\n");
      out.write("                  <p>Hela~<strong>Tae</strong> <span>Leading Purveyor for Tea</span></p>\n");
      out.write("                </a>\n");
      out.write("                <!-- img based logo -->\n");
      out.write("                <!-- <a href=\"index.jsp\"><img src=\"img/logo.jpg\" alt=\"logo img\"></a> -->\n");
      out.write("              </div>\n");
      out.write("              <!-- / logo  -->\n");
      out.write("              <!-- user name -->\n");
      out.write("              <div class=\"aa-cartbox\">\n");
      out.write("                <span class=\"fa fa-user\"></span>\n");
      out.write("                <span class=\"aa-cart-title\">");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("              </div>\n");
      out.write("              <!-- / user name -->        \n");
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
      out.write("              <li><a href=\"customer_inbox.jsp\">MailBox</a></li>\n");
      out.write("              <li><a href=\"#\">Women <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">  \n");
      out.write("                  <li><a href=\"#\">Kurta & Kurti</a></li>                                                                \n");
      out.write("                  <li><a href=\"#\">Trousers</a></li>              \n");
      out.write("                  <li><a href=\"#\">Casual</a></li>\n");
      out.write("                  <li><a href=\"#\">Sports</a></li>\n");
      out.write("                  <li><a href=\"#\">Formal</a></li>                \n");
      out.write("                  <li><a href=\"#\">Sarees</a></li>\n");
      out.write("                  <li><a href=\"#\">Shoes</a></li>\n");
      out.write("                  <li><a href=\"#\">And more.. <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"#\">Sleep Wear</a></li>\n");
      out.write("                      <li><a href=\"#\">Sandals</a></li>\n");
      out.write("                      <li><a href=\"#\">Loafers</a></li>\n");
      out.write("                      <li><a href=\"#\">And more.. <span class=\"caret\"></span></a>\n");
      out.write("                        <ul class=\"dropdown-menu\">\n");
      out.write("                          <li><a href=\"#\">Rings</a></li>\n");
      out.write("                          <li><a href=\"#\">Earrings</a></li>\n");
      out.write("                          <li><a href=\"#\">Jewellery Sets</a></li>\n");
      out.write("                          <li><a href=\"#\">Lockets</a></li>\n");
      out.write("                          <li class=\"disabled\"><a class=\"disabled\" href=\"#\">Disabled item</a></li>                       \n");
      out.write("                          <li><a href=\"#\">Jeans</a></li>\n");
      out.write("                          <li><a href=\"#\">Polo T-Shirts</a></li>\n");
      out.write("                          <li><a href=\"#\">SKirts</a></li>\n");
      out.write("                          <li><a href=\"#\">Jackets</a></li>\n");
      out.write("                          <li><a href=\"#\">Tops</a></li>\n");
      out.write("                          <li><a href=\"#\">Make Up</a></li>\n");
      out.write("                          <li><a href=\"#\">Hair Care</a></li>\n");
      out.write("                          <li><a href=\"#\">Perfumes</a></li>\n");
      out.write("                          <li><a href=\"#\">Skin Care</a></li>\n");
      out.write("                          <li><a href=\"#\">Hand Bags</a></li>\n");
      out.write("                          <li><a href=\"#\">Single Bags</a></li>\n");
      out.write("                          <li><a href=\"#\">Travel Bags</a></li>\n");
      out.write("                          <li><a href=\"#\">Wallets & Belts</a></li>                        \n");
      out.write("                          <li><a href=\"#\">Sunglases</a></li>\n");
      out.write("                          <li><a href=\"#\">Nail</a></li>                       \n");
      out.write("                        </ul>\n");
      out.write("                      </li>                   \n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\">Kids <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">                \n");
      out.write("                  <li><a href=\"#\">Casual</a></li>\n");
      out.write("                  <li><a href=\"#\">Sports</a></li>\n");
      out.write("                  <li><a href=\"#\">Formal</a></li>\n");
      out.write("                  <li><a href=\"#\">Standard</a></li>                                                \n");
      out.write("                  <li><a href=\"#\">T-Shirts</a></li>\n");
      out.write("                  <li><a href=\"#\">Shirts</a></li>\n");
      out.write("                  <li><a href=\"#\">Jeans</a></li>\n");
      out.write("                  <li><a href=\"#\">Trousers</a></li>\n");
      out.write("                  <li><a href=\"#\">And more.. <span class=\"caret\"></span></a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("                      <li><a href=\"#\">Sleep Wear</a></li>\n");
      out.write("                      <li><a href=\"#\">Sandals</a></li>\n");
      out.write("                      <li><a href=\"#\">Loafers</a></li>                                      \n");
      out.write("                    </ul>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\">Sports</a></li>\n");
      out.write("             <li><a href=\"#\">Digital <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">                \n");
      out.write("                  <li><a href=\"#\">Camera</a></li>\n");
      out.write("                  <li><a href=\"#\">Mobile</a></li>\n");
      out.write("                  <li><a href=\"#\">Tablet</a></li>\n");
      out.write("                  <li><a href=\"#\">Laptop</a></li>                                                \n");
      out.write("                  <li><a href=\"#\">Accesories</a></li>                \n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\">Furniture</a></li>            \n");
      out.write("              <li><a href=\"blog-archive.html\">Blog <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">                \n");
      out.write("                  <li><a href=\"blog-archive.html\">Blog Style 1</a></li>\n");
      out.write("                  <li><a href=\"blog-archive-2.html\">Blog Style 2</a></li>\n");
      out.write("                  <li><a href=\"blog-single.html\">Blog Single</a></li>                \n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("              <li><a href=\"#\">Pages <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\">                \n");
      out.write("                  <li><a href=\"product.jsp\">Shop Page</a></li>\n");
      out.write("                  <li><a href=\"product-detail.jsp\">Shop Single</a></li>                \n");
      out.write("                  <li><a href=\"404.jsp\">404 Page</a></li>                \n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / menu -->  \n");
      out.write("\n");
      out.write("<!-- start contact section -->\n");
      out.write(" <section id=\"aa-contact\">\n");
      out.write("   <div class=\"container\">\n");
      out.write("     <div class=\"row\">\n");
      out.write("       <div class=\"col-md-12\">\n");
      out.write("         <div class=\"aa-contact-area\">\n");
      out.write("           <div class=\"aa-contact-address\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("               <div class=\"col-md-8\">\n");
      out.write("                 <div class=\"aa-contact-address-left\">\n");
      out.write("                     ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                     ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                     ");
      if (_jspx_meth_c_set_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                     ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                     <form class=\"comments-form contact-form\" action=\"adminInquiryServlet\" method=\"POST\">\n");
      out.write("                         \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">                        \n");
      out.write("                            <input type=\"text\" name=\"adminname\"placeholder=\"Your Name\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">                        \n");
      out.write("                            <input type=\"email\" name=\"adminemail\"placeholder=\"Your Email\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group\">                        \n");
      out.write("                            <input type=\"text\" name=\"subject\" placeholder=\"Subject\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                         <div class=\"col-md-6\">\n");
      out.write("                             <div class=\"form-group\">                        \n");
      out.write("                                 <input type=\"text\" name=\"receivEmail\" placeholder=\"Customer Email\" class=\"form-control\">\n");
      out.write("                             </div>\n");
      out.write("                         </div>\n");
      out.write("                    </div>                  \n");
      out.write("                     \n");
      out.write("                    <div class=\"form-group\">                        \n");
      out.write("                      <textarea class=\"form-control\" rows=\"3\" name=\"replyMsg\" placeholder=\"Message\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                         <button class=\"aa-secondary-btn\" type=\"submit\">Send</button>\n");
      out.write("                  </form>\n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write(" </section>\n");
      out.write("\n");
      out.write("  <!-- footer -->  \n");
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
      out.write("                    <li><a href=\"#\">Home</a></li>\n");
      out.write("                    <li><a href=\"#\">Our Services</a></li>\n");
      out.write("                    <li><a href=\"#\">Our Products</a></li>\n");
      out.write("                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                    <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <div class=\"aa-footer-widget\">\n");
      out.write("                  <div class=\"aa-footer-widget\">\n");
      out.write("                    <h3>Knowledge Base</h3>\n");
      out.write("                    <ul class=\"aa-footer-nav\">\n");
      out.write("                      <li><a href=\"#\">Delivery</a></li>\n");
      out.write("                      <li><a href=\"#\">Returns</a></li>\n");
      out.write("                      <li><a href=\"#\">Services</a></li>\n");
      out.write("                      <li><a href=\"#\">Discount</a></li>\n");
      out.write("                      <li><a href=\"#\">Special Offer</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <div class=\"aa-footer-widget\">\n");
      out.write("                  <div class=\"aa-footer-widget\">\n");
      out.write("                    <h3>Useful Links</h3>\n");
      out.write("                    <ul class=\"aa-footer-nav\">\n");
      out.write("                      <li><a href=\"#\">Site Map</a></li>\n");
      out.write("                      <li><a href=\"#\">Search</a></li>\n");
      out.write("                      <li><a href=\"#\">Advanced Search</a></li>\n");
      out.write("                      <li><a href=\"#\">Suppliers</a></li>\n");
      out.write("                      <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                <div class=\"aa-footer-widget\">\n");
      out.write("                  <div class=\"aa-footer-widget\">\n");
      out.write("                    <h3>Contact Us</h3>\n");
      out.write("                    <address>\n");
      out.write("                      <p> 25 Astor Pl, NY 10003, USA</p>\n");
      out.write("                      <p><span class=\"fa fa-phone\"></span>+1 212-982-4589</p>\n");
      out.write("                      <p><span class=\"fa fa-envelope\"></span>dailyshop@gmail.com</p>\n");
      out.write("                    </address>\n");
      out.write("                    <div class=\"aa-footer-social\">\n");
      out.write("                      <a href=\"#\"><span class=\"fa fa-facebook\"></span></a>\n");
      out.write("                      <a href=\"#\"><span class=\"fa fa-twitter\"></span></a>\n");
      out.write("                      <a href=\"#\"><span class=\"fa fa-google-plus\"></span></a>\n");
      out.write("                      <a href=\"#\"><span class=\"fa fa-youtube\"></span></a>\n");
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
      out.write("            <p>Designed by <a href=\"http://www.markups.io/\">MarkUps.io</a></p>\n");
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
      out.write("          <form class=\"aa-login-form\" action=\"loginServlet\" method=\"POST\">\n");
      out.write("            <label for=\"\">Email address<span>*</span></label>\n");
      out.write("            <input type=\"email\" name=\"useremail\" placeholder=\"Email\">\n");
      out.write("            <label for=\"\">Password<span>*</span></label>\n");
      out.write("            <input type=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("            <button class=\"aa-browse-btn\" type=\"submit\">Login</button>\n");
      out.write("            <div class=\"aa-register-now\">No account? <a href=\"account.jsp\">Register now!</a></div>\n");
      out.write("          </form>\n");
      out.write("        </div>                        \n");
      out.write("      </div><!-- /.modal-content -->\n");
      out.write("    </div><!-- /.modal-dialog -->\n");
      out.write("  </div>    \n");
      out.write("\n");
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
      out.write("  \n");
      out.write("\n");
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
        out.write("                  <li><a href=\"adminCompose_reply.jsp\">Contact</a></li>\n");
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
        out.write("                  <li><a href=\"adminIndex.jsp?loginstate=1\">Home</a></li>\n");
        out.write("                  <li class=\"hidden-xs\"><a href=\"admin_inbox.jsp?loginstate=1\">Inbox</a></li>\n");
        out.write("                  <li><a href=\"adminCompose_reply.jsp?loginstate=1\">Compose</a></li>\n");
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

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("feedbackstate");
    _jspx_th_c_set_2.setScope("request");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.feedbackstate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedbackstate!= null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                         <p>The Message was sent successfully. We will reply you soon!</p>\n");
        out.write("                     ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_set_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent(null);
    _jspx_th_c_set_3.setVar("feedbackstate");
    _jspx_th_c_set_3.setScope("request");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.feedbackstate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${feedbackstate != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                         <p>There was an unfortunate error in sending your inquiry! Try again.</p>\n");
        out.write("                     ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
