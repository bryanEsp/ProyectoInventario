package org.apache.jsp.Items;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.CuartoFrioDAO;
import ModeloVO.CuartoFrioVO;
import java.util.ArrayList;
import ModeloDAO.ProductoDAO;
import ModeloVO.ProductoVO;
import ModeloVO.RolVO;
import ModeloVO.RolVO;

public final class registrar_005fItems_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Items/../plantilla.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Menu </title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"Expires\" content=\"0\">\n");
      out.write("        <meta http-equiv=\"Last-Modified\" content=\"0\">\n");
      out.write("        <meta http-equiv=\"Cache-Control\" content=\"no-cache, mustrevalidate\">\n");
      out.write("        <meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/EstiloPlantilla.css\">\n");
      out.write("    </head>\n");
      out.write("    <body   class=\"scroll\" background=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/seleccionameesta.jpg\">\n");
      out.write("\n");
      out.write("        ");

            HttpSession miSession = (HttpSession) request.getSession();
            RolVO rol = (RolVO) miSession.getAttribute("usuario");
            if (rol.getRolID().equals("Admin")) {
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  MenÃº superior -->\n");
      out.write("\n");
      out.write("        <div id=\"nav\" class=\"navbar-light\" >\n");
      out.write("            <button class=\"btn-menu\" style=\"float: left;background-color:transparent;color:White\"><i class=\"fas fa-bars\"></i></button>\n");
      out.write("            <button style=\"width: 18%;float: left;visibility: hidden;\"></button>\n");
      out.write("            <ul id=\"menu-nav\"  style=\"float: left;width: 70%;\">\n");
      out.write("                <li><a href=\"#\">Institucion</a>\n");
      out.write("                    <ul class=\"Sub-menu\"> \n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Institucion/registrar_Institucion.jsp\">Registrar </a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Institucion/consulta_institucion.jsp\">Consultar </a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"\">Cuarto Frio</a>\n");
      out.write("                    <ul class=\"Sub-menu\"> \n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Cuarto_Frio/registrar_Cuarto_Frio.jsp\">Registrar </a></li>\n");
      out.write("                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Cuarto_Frio/consulta_Cuarto_Frio.jsp\">Consultar </a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li style=\"float: right;\"><a href=\"\"><i class=\"fas fa-cog\"></i> Opciones</a>\n");
      out.write("                    <ul  class=\"Sub-menu\"> \n");
      out.write("                        <li> <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Usuario\" method=\"post\" id=\"form2\">\n");
      out.write("                                <a onclick=\"document.getElementById('form2').submit()\" >Mi perfil</a>\n");
      out.write("                                <input type=\"hidden\" name=\"Cedula\" value=\"");
      out.print( rol.getUsuID());
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"opcion\" value=\"6\">\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <form id=\"myform\" method =\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sesion\">\n");
      out.write("                                <a  onclick=\"document.getElementById('myform').submit()\" type=\"submit\" class=\"btn btn-danger\">Cerrar Sesión </a>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  Menu lateral Izquierdo  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"contenedor scroll shadow-lg p-3 mb-5 \" >\n");
      out.write("            <center>\n");
      out.write("                <h2 style=\"color:white;\" >TERMIOT</h2>\n");
      out.write("                <br>\n");
      out.write("                <img style=\"border-radius:50%;padding: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/Usuario2.png\" class=\"img-fluid\" id=\"img\" alt=\"Responsive image\">\n");
      out.write("                <h1 style=\"color:white\">");
      out.print( rol.getRolID());
      out.write("</h1>\n");
      out.write("                <input type=\"hidden\"  value=\"");
      out.print( rol.getUsuID());
      out.write("\">\n");
      out.write("            </center>\n");
      out.write("            <br><br>\n");
      out.write("            <ul class=\"Menu \" id=\"lista\" >\n");
      out.write("                <h5>\n");
      out.write("\n");
      out.write("                    <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/menu.jsp\"><i class=\"icono izquierda fas fa-home\"></i> Principal </i></a></li>\n");
      out.write("                    <li ><a href=\"#\"><i class=\"icono izquierda fas fa-users\"></i> Usuarios </i></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Usuarios/RegistrarUsuario.jsp\">Registrar Usuario</a> </li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Usuarios/ConsultarUsuario.jsp\">Consultar Usuario</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li ><a href=\"#\"><i class=\"icono izquierda fas fa-boxes\"></i>Productos </i></a> \n");
      out.write("                        <ul>\n");
      out.write("         \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"icono izquierda fas fa-truck \"></i> Proveedores </i></a> \n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Proveedor/registrar_Proveedor.jsp\">Registrar Proveedor</a> </li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Proveedor/consulta_Proveedor.jsp\">Consultar Proveedor</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"icono izquierda fas fa-boxes \"></i> Items </i></a> \n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Registrar Items</a> </li>\n");
      out.write("                            <li><a href=\"#\">Consultar Items</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"icono izquierda fab fa-wpforms\"></i> Manuales </i></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Ver manual</a> </li>\n");
      out.write("                        </ul> \n");
      out.write("                    </li>\n");
      out.write("                    <li style=\"visibility: hidden;\">esta es la lista es invisible para generar espacio</li><li></li><li></li>\n");
      out.write("                </h5>  \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        ");
 } else if (rol.getRolID().equals("Almacenista")) {
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  MenÃº superior -->\n");
      out.write("\n");
      out.write("        <div id=\"nav\" class=\"navbar-light\" >\n");
      out.write("            <button class=\"btn-menu\" style=\"float: left;background-color: transparent;color:White\"><i class=\"fas fa-bars\"></i></button>\n");
      out.write("            <button style=\"width: 18%;float: left;visibility: hidden;\"></button>\n");
      out.write("            <ul id=\"menu-nav\"  style=\"float: left;width: 70%;\">\n");
      out.write("\n");
      out.write("                <li style=\"float: right;\"><a href=\"\"><i class=\"fas fa-cog\"></i> Opciones</a>\n");
      out.write("                    <ul  class=\"Sub-menu\"> \n");
      out.write("                        <li> <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Usuario\" method=\"post\" id=\"form2\">\n");
      out.write("                                <a onclick=\"document.getElementById('form2').submit()\" >Mi perfil</a>\n");
      out.write("                                <input type=\"hidden\" name=\"Cedula\" value=\"");
      out.print( rol.getUsuID());
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"opcion\" value=\"6\">\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <form id=\"myform\" method =\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sesion\">\n");
      out.write("                                <a  onclick=\"document.getElementById('myform').submit()\" type=\"submit\" class=\"btn btn-danger\">Cerrar Sesión </a>\n");
      out.write("                            </form>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  Menu lateral Izquierdo  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"contenedor scroll shadow-lg p-3 mb-5 \" >\n");
      out.write("            <center>\n");
      out.write("                <h2 style=\"color:white;\" >TERMIOT</h2>\n");
      out.write("                <br>\n");
      out.write("                <img style=\"border-radius:50%;padding: 20px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/img/esta.jpg\" class=\"img-fluid\" id=\"img\" alt=\"Responsive image\">\n");
      out.write("                <h1 style=\"color:white\">");
      out.print( rol.getRolID());
      out.write("</h1>\n");
      out.write("                <input type=\"hidden\"  value=\"");
      out.print( rol.getUsuID());
      out.write("\">\n");
      out.write("            </center>\n");
      out.write("            <br><br>\n");
      out.write("            <ul class=\"Menu \" id=\"lista\" >\n");
      out.write("                <h5>\n");
      out.write("\n");
      out.write("                    <li ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/menu.jsp\"><i class=\"icono izquierda fas fa-home\"></i> Principal </i></a></li>\n");
      out.write("\n");
      out.write("                    <li ><a href=\"#\"><i class=\"icono izquierda fas fa-boxes\"></i>Productos </i></a> \n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\">Registrar Producto</a> </li>\n");
      out.write("                            <li><a href=\"\">Consultar Producto</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"#\"><i class=\"icono izquierda fas fa-truck \"></i> Proveedores </i></a> \n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Proveedor/registrar_Proveedor.jsp\">Registrar Proveedor</a> </li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Proveedor/consulta_Proveedor.jsp\">Consultar Proveedor</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"icono izquierda fas fa-boxes \"></i> Items </i></a> \n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Registrar Items</a> </li>\n");
      out.write("                            <li><a href=\"#\">Consultar Items</a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"icono izquierda fab fa-wpforms\"></i> Manuales </i></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Ver manual</a> </li>\n");
      out.write("                        </ul> \n");
      out.write("                    </li>\n");
      out.write("                    <li style=\"visibility: hidden;\">esta es la lista es invisible para generar espacio</li><li></li><li></li>\n");
      out.write("                </h5>  \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        ");
 }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Archivos de javascript -->\n");
      out.write("        <!--Jquery -->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-3.4.1.js\"></script> \n");
      out.write("\n");
      out.write("        <!--Archivos de javascript-->\n");
      out.write("        <!--Archivos de javascript el cual permite colocar los iconos al lado del boton mediante fontawsome-->\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/Fs.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/busquedaajax.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/Main.js\"></script>\n");
      out.write("        <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/jquery-1.7.1.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"Registros\" class=\"scroll\"  >\n");
      out.write("    <center>\n");
      out.write("        ");
if (request.getAttribute("mensajeExito") != null) {
      out.write("\n");
      out.write("        <a  href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Items/consulta_items.jsp\"><div class=\"btn btn-success\" style=\"width: 60%; margin: auto\">\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </div></a>\n");
      out.write("            ");
} else if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("        <div class=\"btn btn-danger\" style=\"width: 60%; margin: auto\">\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
} else {
            }
      out.write("\n");
      out.write("    </center>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <div  id=\"formularioCliente\" class=\"shadow-lg p-3 mb-5 bg-white rounded\">\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Items\" method=\"post\">\n");
      out.write("\n");
      out.write("            <div class=\"card-header\">\n");
      out.write("                <h1 style=\"text-align: center;\"><b> Registro Items </b></h1><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <!-- Nombre -->     \n");
      out.write("                <label id=\"lb1\"   class=\"label\">Fecha_Vencimiento</label>\n");
      out.write("                <input type=\"date\" id=\"txtfecha\" name='FechaVencimiento' onclick=\"quitar();\"  class=\"form-control txt\">\n");
      out.write("                <div id=\"error3\" class=\"errores  \"> Debe seleccionar una fecha</div><br><br>\n");
      out.write("                <div id=\"error\" class=\"errores  \"> Debe verificar que el campo de la fecha sea el mayor</div><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Celular -->     \n");
      out.write("                <label id=\"lb2\" class=\"label\">Estante</label>\n");
      out.write("                <input id=\"txtestante\" name='Estante' type=\"text\" minlength=\"8\"   onkeyup=\"quitar();\"   class=\"form-control txt\">\n");
      out.write("                <div id=\"error5\" class=\"errores  \"> Debe digitar el estante</div>\n");
      out.write("                <div id=\"error55\" class=\"errores  \"> Solo se permiten letras</div><br><br>\n");
      out.write("\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb3\" class=\"label\">Nivel</label>\n");
      out.write("                <input id=\"txtnivel\" type=\"text\" name=\"Nivel\" class=\"form-control txt\"  onkeyup=\"quitar();\" >\n");
      out.write("                <div id=\"error6\" class=\"errores \"> Debe digitar el nivel</div><br><br>\n");
      out.write("                <div id=\"error33\" class=\"errores  \"> Solo se permiten numeros</div><br><br>\n");
      out.write("\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb4\" class=\"label\">Profundidad</label>\n");
      out.write("                <input id=\"txtprofundidad\" type=\"text\" name=\"Profundidad\" class=\"form-control txt\"  onkeyup=\"quitar();\" >\n");
      out.write("                <div id=\"error4\" class=\"errores \"> Debe digitar la profundidad</div><br><br>\n");
      out.write("                <div id=\"error44\" class=\"errores  \"> Solo se permiten numeros</div><br><br>\n");
      out.write("\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb5\" class=\"label\">cantidad</label>\n");
      out.write("                <input id=\"txtcantidad\" type=\"text\" name=\"Cantidad\" class=\"form-control txt\"  onkeyup=\"quitar();\" >\n");
      out.write("                <div id=\"error5\" class=\"errores \"> Debe digitar la cantidad del producto</div><br><br>\n");
      out.write("                <div id=\"error77\" class=\"errores  \"> Solo se permiten numeros</div><br><br>\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb6\" class=\"label\">Observaciones</label>\n");
      out.write("                <input id=\"txtobservacion\" type=\"text\" name=\"Observacion\" class=\"form-control txt\"  onkeyup=\"quitar();\" >\n");
      out.write("                <div id=\"error8\" class=\"errores \"> Debe ingresar la observacion</div><br><br>\n");
      out.write("\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb7\" class=\"label\">Lote</label>\n");
      out.write("                <input id=\"txtlote\" type=\"text\" name=\"Lote\" class=\"form-control txt\"  onkeyup=\"quitar();\" >\n");
      out.write("                <div id=\"error9\" class=\"errores \"> Debe digitar el lote</div><br><br>\n");
      out.write("                <div id=\"error11\" class=\"errores  \"> Solo se permiten letras</div><br><br>\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb8\" class=\"label\">Fecha de ingreso</label>\n");
      out.write("                <input id=\"txtingresofechahor\" type=\"date\" name=\"Ingresofechahor\" class=\"form-control txt\"  onkeyup=\"quitar();\" >\n");
      out.write("                <div id=\"error10\" class=\"errores \"> Debe seleccionar la fecha y hora de ingreso</div><br><br>\n");
      out.write("                <div id=\"error12\" class=\"errores  \"> Solo se permiten numeros</div><br><br>\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb9\" class=\"label\">Embalaje</label>\n");
      out.write("                <input id=\"txtembalaje\" type=\"text\" name=\"Embalaje\" class=\"form-control txt\"  onkeyup=\"quitar();\" >\n");
      out.write("                <div id=\"error13\" class=\"errores \"> Debe ingresar el embalaje</div><br><br>\n");
      out.write("\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb10\" class=\"label\">Codigo del producto</label>\n");
      out.write("                <select name=\"Producto\" id=\"txtproducto\" class=\"form-control txt\">\n");
      out.write("                    <option>Seleccione Producto</option>\n");
      out.write("                    ");
                                                    
                        ProductoVO prodVO = new ProductoVO();
                        ProductoDAO produDAO = new ProductoDAO();
                        ArrayList<ProductoVO> listaproducto = produDAO.listarproductos();

                        for (int i = 0; i < listaproducto.size(); i++) {

                            prodVO = listaproducto.get(i);
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( prodVO.getCodigoPro());
      out.write("\"> ");
      out.print( prodVO.getCodigoPro());
      out.write(" </option>\n");
      out.write("                    ");
  }
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <div id=\"error15\" class=\"errores \"> Debe seleccionar el codigo del producto</div><br><br>\n");
      out.write("                <div id=\"error16\" class=\"errores  \"> Solo se permiten numeros</div><br><br>\n");
      out.write("\n");
      out.write("                <!-- Direccion -->\n");
      out.write("                <label id=\"lb11\" class=\"label\">Codigo del cuarto frio</label>                \n");
      out.write("                 <select name=\"Cuartofrio\" id=\"txtcuartofrio\" class=\"form-control txt\">\n");
      out.write("                    <option>Seleccione Cuarto frio</option>\n");
      out.write("                    ");
                                                    
                        CuartoFrioVO cuartoVO = new CuartoFrioVO();
                        CuartoFrioDAO cuartoDAO = new CuartoFrioDAO();
                        ArrayList<CuartoFrioVO> listacuarto = cuartoDAO.listarInstitucion();

                        for (int i = 0; i < listacuarto.size(); i++) {

                            cuartoVO = listacuarto.get(i);
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( cuartoVO.getCod_Cufi());
      out.write("\"> ");
      out.print( cuartoVO.getCod_Cufi());
      out.write(" </option>\n");
      out.write("                    ");
  }
      out.write("\n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("                <div id=\"error17\" class=\"errores \"> Debe seleccionar el cuarto frio</div><br><br>\n");
      out.write("                <div id=\"error18\" class=\"errores  \"> Solo se permiten numeros</div><br><br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card-footer\">\n");
      out.write("                <input type=\"hidden\" value=\"3\" name=\"opcion\" >\n");
      out.write("                <input type=\"submit\" id=\"registrar\" class=\"btn btn-lg btn-dark\" style=\"width: 100%;\" value=\"Actualizar\"> \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/js/validarItem.js\"></script>\n");
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
