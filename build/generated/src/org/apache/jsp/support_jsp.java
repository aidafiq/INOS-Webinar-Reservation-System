package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class support_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <title>Help/Support</title>\n");
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
      out.write("        <div class=\"tabbed\">\n");
      out.write("            <input type=\"radio\" name=\"tabs\" id=\"tab-nav-1\" checked>\n");
      out.write("            <label for=\"tab-nav-1\">Webinars</label>\n");
      out.write("            <input type=\"radio\" name=\"tabs\" id=\"tab-nav-2\">\n");
      out.write("            <label for=\"tab-nav-2\">Reservation</label>\n");
      out.write("                <div>\n");
      out.write("                    <h2>Webinars</h2>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sit amet nulla tortor, a posuere urna.\n");
      out.write("                        Praesent urna quam, semper ut ultricies et, mollis ac elit. </p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <h2>Reservation</h2>\n");
      out.write("                    <p>Maecenas dictum, urna ut consequat condimentum, est dui commodo diam, ac pretium dui ante eu quam.\n");
      out.write("                        Curabitur posuere metus nec tellus venenatis placerat. Ut egestas neque in odio vulputate gravida.\n");
      out.write("                        In at justo ac est laoreet eleifend vel quis arcu. Aliquam erat volutpat. Proin vitae vehicula\n");
      out.write("                        neque. Nam tempus erat ac ante tincidunt tincidunt. Pellentesque eu nibh sapien. Nunc augue magna,\n");
      out.write("                        lacinia eget congue eget, mattis id tortor. Fusce id vestibulum neque. Proin tincidunt tellus ut\n");
      out.write("                        risus lobortis cursus. Duis sit amet urna vel sapien ullamcorper varius.</p>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.6/prefixfree.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("    <footer>\n");
      out.write("\n");
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
