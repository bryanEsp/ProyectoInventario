package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Inicio Sesion</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.7.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/Style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"Contenedor\">\n");
      out.write("            <div class=\"d-flex justify-content-center h-100\">\n");
      out.write("                <div class=\"Campos\">\n");
      out.write("                    <center>\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <h3>Inicio Sesion</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </center>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <form action=\"Usuario\" method=\"post\">\n");
      out.write("                            <div class=\"input-group form-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"text\" id=\"itMail\" name=\"Correo\"  class=\"form-control\" placeholder=\"correo\">\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"error2\" class=\"errores\"> Digite su correo</div>\n");
      out.write("                            <div id=\"error22\" class=\"errores\"> Correo no valido, vuelva a intentar</div>\n");
      out.write("                            <div class=\"input-group form-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"password\" name=\"Clave\" id=\"itpassword\" class=\"form-control\" placeholder=\"password\" minlength=\"1\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"error1\" class=\"errores\"> Digite su Password</div>\n");
      out.write("\n");
      out.write("                            <div class=\"row align-items-center remember\">\n");
      out.write("                                <input id=\"chb1\" type=\"checkbox\" >Visualizar contraseña\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input type=\"submit\"  id=\"bEnviar\" value=\"Login\" class=\"btn float-right login_btn\">\n");
      out.write("                            </div>\n");
      out.write("                            <input type=\"hidden\" name=\"opcion\" value=\"5\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer\">\n");
      out.write("                        <div class=\"d-flex justify-content-center links\">\n");
      out.write("                            Problemas con su cuenta?<a href=\"#\">Click aqui</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"d-flex justify-content-center\">\n");
      out.write("                            <a href=\"#\">Olvido su contraseña?</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("        <div class=\"alert alert-danger\" style=\"width: 60%; margin: auto;top:-150px\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
} else {
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <script >\n");
      out.write("            var expr = /^[a-zA-Z0-9_\\.\\-]+@[a-zA-Z0-9\\-]+\\.[a-zA-Z0-9\\-\\.]+$/;\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#bEnviar\").click(function () {\n");
      out.write("                    var correo = $(\"#itMail\").val();\n");
      out.write("                    var password = $(\"#itpassword\").val();\n");
      out.write("                    if (correo == \"\") {\n");
      out.write("                        $(\"#error22 \").fadeOut();\n");
      out.write("                        $(\"#error2\").fadeIn(\"slow\");\n");
      out.write("                        return false;\n");
      out.write("                    } else {\n");
      out.write("                        $(\"#error2\").fadeOut();\n");
      out.write("\n");
      out.write("                        if (!expr.test(correo)) {\n");
      out.write("                            $(\"#error22\").fadeIn(\"slow\");\n");
      out.write("                            return false;\n");
      out.write("                        } else {\n");
      out.write("                            $(\"#error22\").fadeOut();\n");
      out.write("\n");
      out.write("                            if (password == \"\") {\n");
      out.write("                                $(\"#error1\").fadeIn(\"slow\");\n");
      out.write("                                return false;\n");
      out.write("                            } else {\n");
      out.write("                                $(\"#error1\").fadeOut();\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#chb1').on('change', function (event) {\n");
      out.write("                if ($('#chb1').is(':checked')) {\n");
      out.write("                    $('#itpassword').get(0).type = 'text';\n");
      out.write("                } else {\n");
      out.write("                    $('#itpassword').get(0).type = 'password';\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
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
