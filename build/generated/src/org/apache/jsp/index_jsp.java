package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">    \n");
      out.write("    <title>Hela~Tae | Home</title>\n");
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
      out.write("\n");
      out.write("  </head>\n");
      out.write("  <body> \n");
      out.write("   <!-- wpf loader Two -->\n");
      out.write("    <div id=\"wpf-loader-two\">          \n");
      out.write("      <div class=\"wpf-loader-two-inner\">\n");
      out.write("        <span>Loading</span>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("    <!-- / wpf loader Two -->       \n");
      out.write("  <!-- SCROLL TOP BUTTON -->\n");
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
      out.write("                    </a>\n");
      out.write("                    <!--<ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                      <li><a href=\"#\"><img src=\"img/flag/french.jpg\" alt=\"\">FRENCH</a></li>\n");
      out.write("                      <li><a href=\"#\"><img src=\"img/flag/english.jpg\" alt=\"\">ENGLISH</a></li>\n");
      out.write("                    </ul>-->\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- / language -->\n");
      out.write("\n");
      out.write("                <!-- start currency -->\n");
      out.write("                <div class=\"aa-currency\">\n");
      out.write("                  <div class=\"dropdown\">\n");
      out.write("                    <a class=\"btn dropdown-toggle\" href=\"#\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("                      Currency: LKR\n");
      out.write("                    </a>\n");
      out.write("                   <!-- <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("                      <li><a href=\"#\"><i class=\"fa fa-euro\"></i>EURO</a></li>\n");
      out.write("                      <li><a href=\"#\"><i class=\"fa fa-jpy\"></i>YEN</a></li>\n");
      out.write("                    </ul>-->\n");
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
      out.write("                  \n");
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
      out.write("                  <span class=\"fa fa-coffee\"></span>\n");
      out.write("                  <p>Hela~<strong>Tae</strong> <span>Leading Purveyor for Tea</span></p>\n");
      out.write("                </a>\n");
      out.write("                <!-- img based logo -->\n");
      out.write("                <!-- <a href=\"index.jsp\"><img src=\"img/logo.jpg\" alt=\"logo img\"></a> -->\n");
      out.write("              </div>\n");
      out.write("              <!-- / logo  -->\n");
      out.write("               <!-- cart box -->\n");
      out.write("              <div class=\"aa-cartbox\">\n");
      out.write("                  <span class=\"fa fa-user\"></span>\n");
      out.write("                  <span class=\"aa-cart-title\">");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("              </div>\n");
      out.write("              <!-- / cart box -->\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("   </div>\n");
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
      out.write("      </div>       \n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / menu -->\n");
      out.write("  \n");
      out.write("  <!-- Start slider -->\n");
      out.write("  <section id=\"aa-slider\">\n");
      out.write("      <form action=\"loginServlet\" method=\"POST\">\n");
      out.write("    <div class=\"aa-slider-area\">\n");
      out.write("      <div id=\"sequence\" class=\"seq\">\n");
      out.write("         <ul class=\"seq-canvas\">\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"img/slider/1.jpg\" alt=\"\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"seq-title\">\n");
      out.write("               <span data-seq>Save Up to 75% Off</span>                \n");
      out.write("                <h2 data-seq>Premium Tea</h2>               \n");
      out.write("                <p data-seq>“A cup of tea would restore my normality.\"</p>\n");
      out.write("                <p data-seq>― Douglas Adams</p>\n");
      out.write("                <button data-seq type=\"submit\" class=\"aa-shop-now-btn aa-secondary-btn\">SHOP NOW</button>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"img/slider/2.jpg\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"seq-title\">\n");
      out.write("                <span data-seq>Save Up to 40% Off</span>                \n");
      out.write("                <h2 data-seq>Iced Tea</h2>                \n");
      out.write("                <button data-seq type=\"submit\" class=\"aa-shop-now-btn aa-secondary-btn\">SHOP NOW</button>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("            <!-- single slide item -->\n");
      out.write("            <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"img/slider/3.jpg\" />\n");
      out.write("              </div>\n");
      out.write("              <div class=\"seq-title\">\n");
      out.write("                <span data-seq>Save Up to 75% Off</span>                \n");
      out.write("                <h2 data-seq>Accessories</h2>                \n");
      out.write("                <button data-seq type=\"submit\" class=\"aa-shop-now-btn aa-secondary-btn\">SHOP NOW</button>\n");
      out.write("              </div>\n");
      out.write("            </li> \n");
      out.write("             <li>\n");
      out.write("              <div class=\"seq-model\">\n");
      out.write("                <img data-seq src=\"img/slider/4.jpg\"/>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"seq-title\">\n");
      out.write("                <span data-seq>Save Up to 35% Off</span>                \n");
      out.write("                <h2 data-seq>Gift Hampers</h2>                \n");
      out.write("                <button data-seq type=\"submit\" class=\"aa-shop-now-btn aa-secondary-btn\">SHOP NOW</button>\n");
      out.write("              </div>\n");
      out.write("            </li>                   \n");
      out.write("          </ul>\n");
      out.write("        <!-- slider navigation btn -->\n");
      out.write("<!--\n");
      out.write("        <fieldset class=\"seq-nav\" aria-controls=\"sequence\" aria-label=\"Slider buttons\">\n");
      out.write("          <a type=\"button\" class=\"seq-prev\" aria-label=\"Previous\"><span class=\"fa fa-angle-left\"></span></a>\n");
      out.write("          <a type=\"button\" class=\"seq-next\" aria-label=\"Next\"><span class=\"fa fa-angle-right\"></span></a>\n");
      out.write("        </fieldset>\n");
      out.write("-->\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("          </form>\n");
      out.write("  </section>\n");
      out.write("  <!-- / slider -->\n");
      out.write("  <!-- Start Promo section -->\n");
      out.write("  <section id=\"aa-promo\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-promo-area\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <!-- promo left -->\n");
      out.write("              <div class=\"col-md-5 no-padding\">                \n");
      out.write("                <div class=\"aa-promo-left\">\n");
      out.write("                  <div class=\"aa-promo-banner\">                    \n");
      out.write("                    <img src=\"img/promo-banner-1.jpg\" alt=\"img\">                    \n");
      out.write("                    <div class=\"aa-prom-content\">\n");
      out.write("                      <span>Upto 25% Off</span>\n");
      out.write("                      <h4><a href=\"#\">Ceylon Tea</a></h4>                      \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <!-- promo right -->\n");
      out.write("              <div class=\"col-md-7 no-padding\">\n");
      out.write("                <div class=\"aa-promo-right\">\n");
      out.write("                  <div class=\"aa-single-promo-right\">\n");
      out.write("                    <div class=\"aa-promo-banner\">                      \n");
      out.write("                      <img src=\"img/promo-banner-3.jpg\" alt=\"img\">                      \n");
      out.write("                      <div class=\"aa-prom-content\">\n");
      out.write("                        <span>10% Off</span>\n");
      out.write("                        <h4><a href=\"#\">Coffee</a></h4>                        \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-single-promo-right\">\n");
      out.write("                    <div class=\"aa-promo-banner\">                      \n");
      out.write("                      <img src=\"img/promo-banner-2.jpg\" alt=\"img\">                      \n");
      out.write("                      <div class=\"aa-prom-content\">\n");
      out.write("                        <span>Sale Off</span>\n");
      out.write("                        <h4><a href=\"#\">Gifts & Accessories</a></h4>                        \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-single-promo-right\">\n");
      out.write("                    <div class=\"aa-promo-banner\">                      \n");
      out.write("                      <img src=\"img/promo-banner-4.jpg\" alt=\"img\">                      \n");
      out.write("                      <div class=\"aa-prom-content\">\n");
      out.write("                        <span>New Arrivals</span>\n");
      out.write("                        <h4><a href=\"#\">Flavored Tea</a></h4>                        \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"aa-single-promo-right\">\n");
      out.write("                    <div class=\"aa-promo-banner\">                      \n");
      out.write("                      <img src=\"img/promo-banner-5.jpg\" alt=\"img\">                      \n");
      out.write("                      <div class=\"aa-prom-content\">\n");
      out.write("                        <span>upto 5% Off</span>\n");
      out.write("                        <h4><a href=\"#\">Bulk Orders</a></h4>                        \n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / Promo section -->\n");
      out.write("  <!-- banner section \n");
      out.write("  <section id=\"aa-banner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">        \n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"aa-banner-area\">\n");
      out.write("            <a href=\"#\"><img src=\"img/long-image.jpg\" ></a>\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>-->\n");
      out.write("  <!-- Support section -->\n");
      out.write("  <section id=\"aa-support\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-support-area\">\n");
      out.write("            <!-- single support -->\n");
      out.write("            <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("              <div class=\"aa-support-single\">\n");
      out.write("                <span class=\"fa fa-truck\"></span>\n");
      out.write("                <h4>FREE SHIPPING</h4>\n");
      out.write("                <P>For Premium members</P>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- single support -->\n");
      out.write("            <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("              <div class=\"aa-support-single\">\n");
      out.write("                <span class=\"fa fa-clock-o\"></span>\n");
      out.write("                <h4>FRESHNESS GUARANTEED</h4>\n");
      out.write("                <P>We walk the extra mile to make sure our customers get the BEST tea</P>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- single support -->\n");
      out.write("            <div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("              <div class=\"aa-support-single\">\n");
      out.write("                <span class=\"fa fa-phone\"></span>\n");
      out.write("                <h4>24/7 CUSTOMER SERVICE</h4>\n");
      out.write("                <P>Talk to us about suggestions or complains on our services.</P>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / Support section -->\n");
      out.write("    <!-- Testimonial -->\n");
      out.write("  <section id=\"aa-testimonial\">  \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-testimonial-area\">\n");
      out.write("            <ul class=\"aa-testimonial-slider\">\n");
      out.write("              <!-- single slide -->\n");
      out.write("              <li>\n");
      out.write("                <div class=\"aa-testimonial-single\">\n");
      out.write("                    <h4><p>About us</p></h4>\n");
      out.write("                  <div class=\"aa-testimonial-info\">\n");
      out.write("                    \n");
      out.write("                    <span>Hela Tae is unique; a brand that is founded on a passionate commitment to quality and authenticity in tea, which goes beyond commerce in seeing business as a matter of human service.</span><br>\n");
      out.write("\n");
      out.write("                    <span>Tea is Nature’s gift to mankind. A beverage that heals, protects and refreshes, it is also infinite in variety, changing subtlety with the natural alchemy of sunshine, soils, wind, rain and temperature. That beautiful variety in tea is as much a challenge as a deliciously indulgent reward for whilst nature gives us a tea to suit every mood, and desire, she demands expertise in understanding and selecting the finest. That expertise can only come from passionate commitment to tea.</span>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <!-- single slide -->\n");
      out.write("              <li>\n");
      out.write("                <div class=\"aa-testimonial-single\">\n");
      out.write("                  <h4><p>Ceylon Tea</p></h4>\n");
      out.write("                  <div class=\"aa-testimonial-info\">\n");
      out.write("                    \n");
      out.write("                   <span>The alchemy of land, sun and rain in the Paradise Island of Ceylon, as it was known 40 years ago, presents the ideal climatic conditions for cultivation of tea. Ceylon now known as Sri Lanka brings a new dimension to tea by producing variations in taste, quality, character and appearance, largely based on terroir of the region. Ceylon tea with its distinct taste and character has now become every consumer’s favorite cuppa.</span>\n");
      out.write("                    \n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / Testimonial -->\n");
      out.write("  <!-- Client Brand -->\n");
      out.write("  <section id=\"aa-client-brand\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <div class=\"aa-client-brand-area\">\n");
      out.write("            <ul class=\"aa-client-brand-slider\">\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo1.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo2.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo3.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo4.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo5.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo6.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo7.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo2.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo5.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo1.gif\" alt=\"\"></a></li>\n");
      out.write("              <li><a href=\"#\"><img src=\"img/teaLogo3.gif\" alt=\"\"></a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("  <!-- / Client Brand -->\n");
      out.write("  \n");
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
      out.write("\n");
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
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
        out.write("                   <li><a href=\"account.jsp?loginstate=1\" >Account</a></li>\n");
        out.write("                  <li class=\"hidden-xs\"><a href=\"whishlist.jsp?loginstate=1\" >Wishlist</a></li>\n");
        out.write("                  <li class=\"hidden-xs\"><a href=\"cart.jsp?loginstate=1\">Cart</a></li>\n");
        out.write("                  <li class=\"hidden-xs\"><a href=\"customer_inbox.jsp?loginstate=1\">Inbox</a></li>\n");
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
}
