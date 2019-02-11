package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.registerController;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register page</title>\n");
      out.write("        <style>\n");
      out.write("            #regform\n");
      out.write("            {\n");
      out.write("                text-align:justify;\n");
      out.write("                padding: 15px 15px;\n");
      out.write("                background-color: #003366;\n");
      out.write("                height:400px;\n");
      out.write("                border-radius: 15px;\n");
      out.write("            }\n");
      out.write("            td\n");
      out.write("            {\n");
      out.write("                width: 100px;\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            p\n");
      out.write("            {\n");
      out.write("                text-align: centre;\n");
      out.write("                font-size: 16pt;\n");
      out.write("                color:#000066;\n");
      out.write("            }\n");
      out.write("            h3\n");
      out.write("            {\n");
      out.write("                text-align: centre;\n");
      out.write("                background-color: #003366;\n");
      out.write("                color :#fff;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"registerController\" method=\"post\">\n");
      out.write("            <table id=\"regform\" cellspacing=\"20\" align=\"centre\">\n");
      out.write("                <tr>\n");
      out.write("                    <td><h3 style=\"color:black\">Register</h3></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" autocomplete=\"on\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email:</td>\n");
      out.write("                    <td><input type=\"email\" name=\"email\" autocomplete=\"on\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Location:</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"location\" value=\"CBD\" required>CBD <br></td>\n");
      out.write("                    <td><input type=\"radio\" name=\"location\" value=\"NJOKERIO\">NJOKERIO <br></td>\n");
      out.write("                    <td><input type=\"radio\" name=\"location\" value=\"GATE\"> GATE<br></td>\n");
      out.write("                    <td><input type=\"radio\" name=\"location\" value=\"TATTON\"> TATTON <br></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" utocomplete=\"off\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Confirm Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"confirmPassword\" autocomplete=\"off\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                 ");

                   if(request.getAttribute("bad_form") != null && request.getAttribute("bad_form") == true ){
                        response.setContentType("text/html");
                        //PrintWriter out = response.getWriter();
                        out.println("<HTML><BODY><p style=color:red> Please enter matching passwords"
                                +"</BODY></HTML>" );
                       
                   }  
                  
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\" value=\"register\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
