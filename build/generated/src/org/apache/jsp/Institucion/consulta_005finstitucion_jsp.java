package org.apache.jsp.Institucion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.InstitucionDAO;
import ModeloVO.InstitucionVO;
import ModeloVO.RolVO;

public final class consulta_005finstitucion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Institucion/../plantilla.jsp");
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
      out.write("                            <li><a href=\"\">Registrar Producto</a> </li>\n");
      out.write("                            <li><a href=\"\">Consultar Producto</a> </li>\n");
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
      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"Registros\" class=\"scroll\"  >\n");
      out.write("            <div  id=\"formularioCliente\" class=\"shadow-lg p-3 mb-5 bg-white rounded table-responsive\"style=\"width: 90%;height: 800px;  \">\n");
      out.write("                ");
if (request.getAttribute("mensajeExito") != null) {
      out.write("\n");
      out.write("                <div class=\"alert alert-success\" style=\"width: 60%; margin: auto\">\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");
} else if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                <div class=\"alert alert-danger\" style=\"width: 60%; margin: auto\">\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </div>\n");
      out.write("                ");
} else {
                    }
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <center>\n");
      out.write("                    <input type=\"text\"  name=\"busca\" id=\"busca\"   onkeyup=\"search()\"   class=\"form-control\">\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <table id=\"datos\" class=\"table  table-responsive-md table-hover table-light \" style=\"width: 100%;height: 100px;\">\n");
      out.write("                        <thead class=\"thead-dark\">\n");
      out.write("                            <tr id=\"encabezado\" >\n");
      out.write("                                <th scope=\"col\">Código</th>\n");
      out.write("                                <th scope=\"col\">Nombre</th>\n");
      out.write("                                <th scope=\"col\"> Celular</th>\n");
      out.write("                                <th scope=\"col\">Dirección</th>\n");
      out.write("                                <th scope=\"col\">Actualización</th>\n");
      out.write("                                <th scope=\"col\">Eliminación</th>                                \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                InstitucionVO instivo = new InstitucionVO();
                                InstitucionDAO instiDAO = new InstitucionDAO();
                                ArrayList<InstitucionVO> listaVehiculos = instiDAO.listarInstitucion();

                                    for (int i = 0; i < listaVehiculos.size(); i++) {

                                        instivo = listaVehiculos.get(i);
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td >");
      out.print( instivo.getCod_insti());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( instivo.getNombre());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( instivo.getCelular());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( instivo.getDireccion());
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Institucion\" method=\"post\">\n");
      out.write("                                        <button class=\"btn btn-lg btn-primary\">Editar</button>\n");
      out.write("                                        <input type=\"hidden\" name=\"cod_insti\" value=\"");
      out.print(instivo.getCod_insti());
      out.write("\">\n");
      out.write("                                        <input type=\"hidden\" name=\"opcion\" value=\"2\">\n");
      out.write("                                    </form>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Institucion\" method=\"post\">\n");
      out.write("                                        <button class=\"btn btn-lg btn-danger\">Eliminar</button>\n");
      out.write("                                        <input type=\"hidden\" name=\"cod_insti\" value=\"");
      out.print( instivo.getCod_insti());
      out.write("\">\n");
      out.write("                                        <input type=\"hidden\" name=\"opcion\" value=\"4\">\n");
      out.write("                                    </form>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
