package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class webinar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Webinar</title>\n");
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
      out.write("            \n");
      out.write("            .footer {\n");
      out.write("                position: fixed;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: #ccffff;\n");
      out.write("                color: #003399;\n");
      out.write("                text-align: center;\n");
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
      out.write("            <label for=\"tab-nav-1\">Academic Skills</label>\n");
      out.write("            <input type=\"radio\" name=\"tabs\" id=\"tab-nav-2\">\n");
      out.write("            <label for=\"tab-nav-2\">Research and Innovation</label>\n");
      out.write("            <input type=\"radio\" name=\"tabs\" id=\"tab-nav-3\">\n");
      out.write("            <label for=\"tab-nav-3\">Career Development and Job Research</label>\n");
      out.write("            <div class=\"tabs\">\n");
      out.write("                <div>\n");
      out.write("                    <h2>Academic Skills</h2>\n");
      out.write("                    <img src=\"ikan.jpg\" width=\"500\">\n");
      out.write("                    <p>Oceanography and environmental science are both interdisciplinary fields that require a wide range \n");
      out.write("                        of academic skills. Some of the most important skills for these fields include:<br><br>\n");
      out.write("                        Critical thinking: The ability to analyze information and form your own conclusions.\n");
      out.write("                        Problem solving: The ability to identify and solve problems.<br>\n");
      out.write("                        Communication: The ability to express your ideas clearly and effectively, both in writing and in speech.<br>\n");
      out.write("                        Research: The ability to find and evaluate information.<br>\n");
      out.write("                        Quantitative skills: The ability to understand and use mathematical and statistical concepts.<br>\n");
      out.write("                        Computer skills: The ability to use computers to collect, analyze, and present data.<br>\n");
      out.write("                        Fieldwork skills: The ability to collect data in the field, such as by conducting experiments, \n");
      out.write("                        taking measurements, and observing organisms.<br>\n");
      out.write("                        Teamwork skills: The ability to work effectively with others, both in the field and in the laboratory.<br></p>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <h2>Research and Innovation</h2>\n");
      out.write("                    <img src=\"ikan.jpg\" width=\"500\">\n");
      out.write("                    <p>\n");
      out.write("                        Ocean acidification: Ocean acidification is a major threat to marine life, as it makes it difficult for \n");
      out.write("                        organisms to build shells and skeletons. Researchers are working to understand the effects of ocean \n");
      out.write("                        acidification, and to develop ways to mitigate its impact.<br><br>\n");
      out.write("                        Marine pollution: Marine pollution is a major problem, as it can harm marine life and contaminate seafood. \n");
      out.write("                        Researchers are working to develop new methods to clean up marine pollution, and to prevent it from \n");
      out.write("                        happening in the first place.<br><br>\n");
      out.write("                        Marine biodiversity: The ocean is home to a vast diversity of life, much of which is still unknown. \n");
      out.write("                        Researchers are working to catalog and understand marine biodiversity, and to identify species that are \n");
      out.write("                        at risk of extinction.<br><br>\n");
      out.write("                        Marine ecosystems: Marine ecosystems are complex and interconnected, and they play an important role in \n");
      out.write("                        regulating the Earth's climate and environment. Researchers are working to understand how marine ecosystems \n");
      out.write("                        function, and how they can be managed to sustain healthy populations of marine life.<br></p>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <h2>Career Development and Job Research</h2>\n");
      out.write("                    <img src=\"ikan.jpg\" width=\"500\">\n");
      out.write("                    <p>Get a good education: A bachelor's degree in oceanography or environmental science is the minimum requirement \n");
      out.write("                        for most entry-level jobs in this field. However, many employers prefer to hire candidates with a master's degree or Ph.D.<br><br>\n");
      out.write("                        Get experience: Gaining experience in oceanography or environmental science is essential for landing a good job in this field. \n");
      out.write("                        You can get experience through internships, volunteer work, or by working in a related field, such as marine biology or chemistry.<br><br>\n");
      out.write("                        Network: Networking with other oceanographers and environmental scientists is a great way to learn about job opportunities and to \n");
      out.write("                        get your foot in the door. Attend conferences, workshops, and other events related to your field.<br><br></p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.6/prefixfree.min.js\"></script>\n");
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
