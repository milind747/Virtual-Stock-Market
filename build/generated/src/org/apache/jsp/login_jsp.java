package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--\n");
      out.write("author: W3layouts\n");
      out.write("author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Trade Market a Corporate Business Category Flat Bootstrap Responsive Website Template | Login :: w3layouts</title>\n");
      out.write("<!-- for-mobile-apps -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Trade Market Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- font-awesome icons -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" />\n");
      out.write("<!-- //font-awesome icons -->\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.marquee.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Muli:300,300i,400,400i\" rel=\"stylesheet\">\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("</head>\n");
      out.write("\t\n");
      out.write("<body>\n");
      out.write("<!-- header -->\n");
      out.write("<div class=\"header\">\n");
      out.write("\t\t<div class=\"w3ls_header_top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"w3l_header_left\">\n");
      out.write("\t\t\t\t\t<ul class=\"w3layouts_header\">\n");
      out.write("\t\t\t\t\t\t<li class=\"w3layouts_header_list\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Language<span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"mega-dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu w3_dropdown\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">English</a></li> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Hindi</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>              \n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i>|</i>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t<li class=\"w3layouts_header_list\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"login.jsp\">Login To Trade</a><i>|</i>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"w3layouts_header_list\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"faq.jsp\">FAQ</a><i>|</i>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"w3layouts_header_list\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"contact.jsp\">Contact Us</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"w3l_header_right\">\n");
      out.write("\t\t\t\t\t<h2><i class=\"glyphicon glyphicon-earphone\" aria-hidden=\"true\"></i>+(000) 123 456 678</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3ls_header_middle\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"agileits_logo\">\n");
      out.write("\t\t\t\t\t<h1><a href=\"index.jsp\"><span>Virtual Stock Market</span><i>Trade anytime anywhere</i></a></h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"agileits_search\">\n");
      out.write("\t\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t<input name=\"Search\" type=\"text\" placeholder=\"Search\" required=\"\">\n");
      out.write("\t\t\t\t\t\t<select id=\"agileinfo_search\" name=\"agileinfo_search\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"commodities\">Commodities</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"navs\">NAVs</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"quotes\">Quotes</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"videos\">Videos</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"news\">News</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"notices\">Notices</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"all\">All</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Search\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //header -->\n");
      out.write("<!-- navigation -->\n");
 /*	<div class="trade_navigation">
		<div class="container">
			<nav class="navbar nav_bottom">
			 <!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header nav_2">
				  <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
				</div> 
			   <!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<nav class="wthree_nav">
						<ul class="nav navbar-nav nav_1">
							<li class="act"><a href="index.html">Home</a></li>
							<li><a href="equity.jsp">Equity</a></li>
							<li><a href="commodities.jsp">Commodities</a></li>
							<li><a href="news.jsp">News</a></li>
							<li><a href="products.jsp">Products</a></li>
                                                        
						
							<li><a href="portfolio.jsp">Portfolio</a></li>
						</ul>
					</nav>
				</div>
			</nav>
		</div>
	</div>  */ 
      out.write("\n");
      out.write("<!-- //navigation -->");
      out.write("\n");
      out.write("<!-- //navigation -->\n");
      out.write("<!-- banner-bottom -->\n");
      out.write("\t<div class=\"banner-bottom\">\n");
      out.write("\t\t<div class=\"panel panel-default agile_panel\">\n");
      out.write("\t\t\t<div class=\"panel-body agile_panel_body\">\n");
      out.write("\t\t\t\t<ul class=\"demo1\">\n");
      out.write("\t\t\t\t\t<li class=\"news-item\">\n");
      out.write("\t\t\t\t\t\t<table class=\"w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"w3_agileits_td demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">NIFTY 50</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>8,638.23<i><span class=\"caret\"></span>-8.35(-0.10%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">SILVER</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>46,343.56<i><span class=\"caret\"></span>-186.00(-0.40%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;\">Dollar-Rupee</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>66.8650<i class=\"wthree_i\"><span class=\"caret caret1\"></span>0.00(0.00%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">CRUDEOIL</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>3,097.00<i><span class=\"caret\"></span>-7.00(-0.23%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"news-item\">\n");
      out.write("\t\t\t\t\t\t<table class=\"w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"w3_agileits_td demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">gold</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>31,350.23<i><span class=\"caret\"></span>-117.00(-0.37%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">ftsc</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>6.887.93<i><span class=\"caret\"></span>-5.99(-0.09%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">cac</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>4,436.70<i><span class=\"caret\"></span>-23.00(0.54%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">dax</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>10,596.00<i><span class=\"caret\"></span>-79.89(-0.75%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"news-item\">\n");
      out.write("\t\t\t\t\t\t<table class=\"w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"w3_agileits_td demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">sensex</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>2,7993.64<i><span class=\"caret\"></span>-66.59(-0.24%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">nhai</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>1,256.00<i style=\"color:#00AA00\"><span class=\"caret caret1\"></span>16.20(1.31%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;\">Euro-Rupee</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>75.42<i class=\"wthree_i\"><span class=\"caret caret1\"></span>0.03(0.04%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"demo1_w3_table_trade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"agileits_w3layouts_table\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td style=\"color:#01A9CE;text-transform:uppercase;\">iifl</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td>1,006.51<i><span class=\"caret\"></span>-1.25(-0.12%)</i></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div class=\"panel-footer\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t$(function () {\n");
      out.write("\t\t\t\t$(\".demo1\").bootstrapNews({\n");
      out.write("\t\t\t\t\tnewsPerPage: 1,\n");
      out.write("\t\t\t\t\tautoplay: true,\n");
      out.write("\t\t\t\t\tpauseOnHover:true,\n");
      out.write("\t\t\t\t\tdirection: 'up',\n");
      out.write("\t\t\t\t\tnewsTickerInterval: 3000,\n");
      out.write("\t\t\t\t\tonToDo: function () {\n");
      out.write("\t\t\t\t\t\t//console.log(this);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t$(\".demo2\").bootstrapNews({\n");
      out.write("\t\t\t\t\tnewsPerPage: 3,\n");
      out.write("\t\t\t\t\tautoplay: true,\n");
      out.write("\t\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\t\tnavigation: false,\n");
      out.write("\t\t\t\t\tdirection: 'up',\n");
      out.write("\t\t\t\t\tnewsTickerInterval: 2500,\n");
      out.write("\t\t\t\t\tonToDo: function () {\n");
      out.write("\t\t\t\t\t\t//console.log(this);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script src=\"js/jquery.bootstrap.newsbox.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t\t<div class='agileinfo_marquee'>\n");
      out.write("\t\t\t<div data-speed=\"10\" class=\"marquee\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"single.html\">NPAs of associate banks to weigh on SBI: Religare Capital<span>\\</span></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"single.html\">Julius Baer analyst sees opportunities in despised China market</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //banner-bottom -->\n");
      out.write("<!-- login -->\n");
      out.write("\t<div class=\"login\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3>Login</h3>\n");
      out.write("                        <form action=\"loginServ\" method=\"post\">\n");
      out.write("                         \n");
      out.write("                           \n");
      out.write("\t\t\t\t<span class=\"input input--kuro\">\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--kuro kuro_w3\" type=\"text\" name=\"username\" id=\"input-7\" placeholder=\"\" required=\"\">\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--kuro\" for=\"input-7\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--kuro\">Username</span>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t<span class=\"input input--kuro\">\n");
      out.write("\t\t\t\t\t<input class=\"input__field input__field--kuro kuro_w3\" type=\"password\" name=\"password\" id=\"input-8\" placeholder=\"\" required=\"\">\n");
      out.write("\t\t\t\t\t<label class=\"input__label input__label--kuro\" for=\"input-8\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input__label-content input__label-content--kuro\">Password</span>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t</span>\n");
      out.write("\t\t\t\t<div class=\"agileinfo_remember\">\n");
      out.write("\t\t\t\t\t<div class=\"agileinfo_remember_left\">\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" id=\"brand1\" value=\"\">\n");
      out.write("\t\t\t\t\t\t<label for=\"brand1\"><span></span>Remember me</label>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"agileinfo_remember_right\">\n");
      out.write("                                            <a href=\"reset.jsp\">Forgot Password?</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Submit\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<div class=\"w3l_login_form_bottom\">\n");
      out.write("\t\t\t\t<h4>(Or)<span>Share With</span></h4>\n");
      out.write("\t\t\t\t<div class=\"agileits_social_icons\">\n");
      out.write("\t\t\t\t\t<ul> \n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i><span class=\"text\">Facebook</span></a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"w3ls_w3_twitter\"><a href=\"#\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i><span class=\"text\">Twitter</span></a></li>\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t</ul> \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3l_login_form_bottom1\">\n");
      out.write("\t\t\t\t<h5>For New People</h5>\n");
      out.write("\t\t\t\t<a href=\"sign-up.jsp\">Register Now!</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //login -->\n");
      out.write("<!-- footer -->\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<ul class=\"agileits_w3layouts_footer_info\">\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">Home</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"news.jsp\">Markets</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"funds.jsp\">mutual funds</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"commodities.jsp\">commodities</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"portfolio.jsp\">portfolio</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"about.jsp\">About Us</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"ipo.jsp\">IPO</a><i>|</i></li>\n");
      out.write("\t\t\t\t<li><a href=\"sitemap.jsp\">sitemap</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t<p>© 2017 Virtual Stock Market. All rights reserved </p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
      out.write("\n");
      out.write("\n");
      out.write("<!-- //footer -->\n");
      out.write("<!-- stacked-graph -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/raphael.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.enumerable.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.tufte-graph.js\"></script>\n");
      out.write("\t <script type=\"text/javascript\">\n");
      out.write("      $(document).ready(function () {\n");
      out.write("\n");
      out.write("        jQuery('#stacked-graph').tufteBar({\n");
      out.write("          data: [\n");
      out.write("            [[1.5, 1.0, 0.51], {label: '2013'}],\n");
      out.write("            [[2.0, 1.03, 0.6], {label: '2014'}],\n");
      out.write("            [[2.4, 0.9,  2.0], {label: '2015'}],\n");
      out.write("            [[1.5, 2.6, 0.45], {label: '2016'}]\n");
      out.write("          ],\n");
      out.write("          barLabel:  function(index) {\n");
      out.write("            amount = ($(this[0]).sum() * 10000).toFixed(0);\n");
      out.write("            return '$' + $.tufteBar.formatNumber(amount);\n");
      out.write("          },\n");
      out.write("          axisLabel: function(index) { return this[1].label },\n");
      out.write("          legend: {\n");
      out.write("            data: [\"Finance\", \"Metal\", \"Telecom\"]\n");
      out.write("          }\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("<!-- //stacked-graph -->\n");
      out.write("<!-- script for marque -->\n");
      out.write("\t<script>\n");
      out.write("\t  $('.marquee').marquee({\n");
      out.write("\t\tgap: 100,\n");
      out.write("\t\tdelayBeforeStart: 0,\n");
      out.write("\t\tdirection: 'left',\n");
      out.write("\t\tduplicated: true,\n");
      out.write("\t\tpauseOnHover: true\n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("<!-- //script for marque -->\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\".dropdown\").hover(            \n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideDown(\"fast\");\n");
      out.write("            $(this).toggleClass('open');        \n");
      out.write("        },\n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideUp(\"fast\");\n");
      out.write("            $(this).toggleClass('open');       \n");
      out.write("        }\n");
      out.write("    );\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!-- //Bootstrap Core JavaScript -->\n");
      out.write("<!-- here stars scrolling icon -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //here ends scrolling icon -->\n");
      out.write("</body>\n");
      out.write("</html>");
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
}
