package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Homepage</title>\n");
      out.write("        <style>\n");
      out.write("            .navbar {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: lightcyan;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a {\n");
      out.write("                float: left;\n");
      out.write("                font-size: 16px;\n");
      out.write("                color: darkblue;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown {\n");
      out.write("                float: left;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown .dropbtn {\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-size: 16px;  \n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                color: darkblue;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                background-color: inherit;\n");
      out.write("                font-family: inherit;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar a:hover, .dropdown:hover .dropbtn, .dropbtn:focus {\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                min-width: 160px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                float: none;\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .show {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer {\n");
      out.write("                position: fixed;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #ccffff;\n");
      out.write("                color: #003399;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .row {\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Create three equal columns that sits next to each other */\n");
      out.write("            .column {\n");
      out.write("                flex: 33.33%;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <img src=\"logo.png\" width=\"220\" align=\"left\">\n");
      out.write("            <a href=\"home.jsp\">Home</a>\n");
      out.write("            <a href=\"webinar.jsp\">Webinar</a>\n");
      out.write("            <a href=\"reservation.jsp\">Reservation</a>\n");
      out.write("            <a href=\"account.jsp\">Account</a>\n");
      out.write("            <a href=\"contact.jsp\">Contact us</a>\n");
      out.write("            <a href=\"support.jsp\">Help/Support</a>\n");
      out.write("            <a href=\"about.jsp\">About us</a>\n");
      out.write("            <div class=\"dropdown\" >\n");
      out.write("                <button class=\"dropbtn\" onclick=\"myFunction()\" align=\"right\"><img src=\"user.png\" width=\"15\" height=\"15\">\n");
      out.write("                    <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"dropdown-content\" id=\"myDropdown\">\n");
      out.write("                    <a href=\"login.jsp\">Login</a>\n");
      out.write("                    <a href=\"#\">Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            /* When the user clicks on the button, \n");
      out.write("             toggle between hiding and showing the dropdown content */\n");
      out.write("            function myFunction() {\n");
      out.write("                document.getElementById(\"myDropdown\").classList.toggle(\"show\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // Close the dropdown if the user clicks outside of it\n");
      out.write("            window.onclick = function (e) {\n");
      out.write("                if (!e.target.matches('.dropbtn')) {\n");
      out.write("                    var myDropdown = document.getElementById(\"myDropdown\");\n");
      out.write("                    if (myDropdown.classList.contains('show')) {\n");
      out.write("                        myDropdown.classList.remove('show');\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <div class=\"container\">  \n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <!-- Indicators -->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <!-- Wrapper for slides -->\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <img src=\"underwater.jpg\" style=\"width:100%; height: 500px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"ikan.jpg\" style=\"width:100%; height: 500px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"seminar.jpg\" style=\"width:100%; height: 500px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"seminar2.jpg\" style=\"width:100%; height: 500px;\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Left and right controls -->\n");
      out.write("                <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <a href=\"webinar.jsp\"><img src=\"h1.jpg\" alt=\"Snow\" style=\"width:100%\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <a href=\"reservation.jsp\"><img src=\"h2.jpg\" alt=\"Forest\" style=\"width:100%\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <p>&COPY; 2023 INOS. All rights reserved.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
}
