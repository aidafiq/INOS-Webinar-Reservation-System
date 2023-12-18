package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Account</title>\n");
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
      out.write("            team-members{\n");
      out.write("                color: #99ffff;\n");
      out.write("                align-content: center;\n");
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
      out.write("            <label for=\"tab-nav-1\">Our Company</label>\n");
      out.write("            <input type=\"radio\" name=\"tabs\" id=\"tab-nav-2\">\n");
      out.write("            <label for=\"tab-nav-2\">Our Team</label>\n");
      out.write("            <input type=\"radio\" name=\"tabs\" id=\"tab-nav-3\">\n");
      out.write("            <label for=\"tab-nav-3\">Mission and Vision</label>\n");
      out.write("\n");
      out.write("            <div class=\"tabs\">\n");
      out.write("                <div>\n");
      out.write("                    <h2>Our Service</h2>\n");
      out.write("                    <p>The system built in middle of 2023 which the idea was triggered\n");
      out.write("                        by a group of students in University of Malaysia Terengganu. The team \n");
      out.write("                        members are majoring in Degree of Computer Science(Mobile Computing)\n");
      out.write("                        with Hons.The system provides the customers to reserve the webinar or \n");
      out.write("                        workshop. It can make the transaction easier to process.</p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <h1>Team Members</h1>\n");
      out.write("\n");
      out.write("                    <img src=\"3.jpg\" alt=\"3\" style=\"width:150px;\" />\n");
      out.write("                    <h3>Izazi - Head of Team</h3>\n");
      out.write("\n");
      out.write("                    <img src=\"1.jpg\" alt=\"1\" style=\"width:150px;\"/>\n");
      out.write("                    <h3>Adib - Designer</h3>\n");
      out.write("\n");
      out.write("                    <img src=\"2.jpg\" alt=\"2\" style=\"width:150px;\"/>\n");
      out.write("                    <h3>Afiq - Developer</h3>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <h2>Vision</h2>\n");
      out.write("                    <p>An institute to bring the human-touch back into nature.</p>\n");
      out.write("                    <h2>Mission</h2>\n");
      out.write("                    <p>To provide experience and knowledge about ocean and environment.</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <p>&COPY; 2023 INOS. All rights reserved.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
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
}
