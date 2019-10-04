<%@page import="ModeloVO.RolVO"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Menu </title>
        <meta charset="utf-8">
        <meta http-equiv="Expires" content="0">
        <meta http-equiv="Last-Modified" content="0">
        <meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
        <meta http-equiv="Pragma" content="no-cache">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/EstiloPlantilla.css">
        <link href="${pageContext.request.contextPath}css/prompt.css" rel="stylesheet" type="text/css"/>
    </head>
    <body   class="scroll" >

        <%

            response.setHeader("Pragma", "no-cache");
            response.addHeader("Cache-control", "must-revalidate");
            response.addHeader("Cache-control", "no-cache");
            response.addHeader("Cache-control", "no-store");
            response.setDateHeader("Expires", 0);

            try {
                if (session.getAttribute("usuario") == null) {

                    request.getRequestDispatcher("index.jsp").forward(request, response);

                }

            } catch (Exception e) {

                request.getRequestDispatcher("index.jsp").forward(request, response);

            }

        %>
        <%            HttpSession miSession = (HttpSession) request.getSession();
            RolVO rol = (RolVO) miSession.getAttribute("usuario");
            if (rol.getRolID().equals("Admin")) {
        %>


        <!--  MenÃº superior -->

        <div id="nav" class="navbar-light" >
            <button class="btn-menu" style="float: left;background-color:transparent;color:White"><i class="fas fa-bars"></i></button>
            <button style="width: 18%;float: left;visibility: hidden;"></button>
            <ul id="menu-nav"  style="float: left;width: 70%;">
                <li><a href="#">Institucion</a>
                    <ul class="Sub-menu"> 
                        <li><a href="${pageContext.request.contextPath}/Institucion/registrar_Institucion.jsp">Registrar </a></li>
                        <li><a href="${pageContext.request.contextPath}/Institucion/consulta_institucion.jsp">Consultar </a></li>

                    </ul>
                </li>
                <li><a href="">Cuarto Frio</a>
                    <ul class="Sub-menu"> 
                        <li><a href="${pageContext.request.contextPath}/Cuarto_Frio/registrar_Cuarto_Frio.jsp">Registrar </a></li>
                        <li><a href="${pageContext.request.contextPath}/Cuarto_Frio/consulta_Cuarto_Frio.jsp">Consultar </a></li>

                    </ul>
                </li>

                <li style="float: right;"><a href=""><i class="fas fa-cog"></i> Opciones</a>
                    <ul  class="Sub-menu"> 
                        <li> <form action="${pageContext.request.contextPath}/Usuario" method="post" id="form2">
                                <a onclick="document.getElementById('form2').submit()" >Mi perfil</a>
                                <input type="hidden" name="Cedula" value="<%= rol.getUsuID()%>">
                                <input type="hidden" name="opcion" value="6">
                            </form>
                        </li>
                        <li>
                            <form id="myform" method ="post" action="${pageContext.request.contextPath}/sesion">
                                <a  onclick="document.getElementById('myform').submit()" type="submit" class="btn btn-danger">Cerrar Sesión </a>
                            </form>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>


        <!--  Menu lateral Izquierdo  -->


        <div class="contenedor scroll shadow-lg p-3 mb-5 " >
            <center>
                <h2 style="color:white;" >TERMIOT</h2>
                <br>
                <img style="border-radius:50%;padding: 20px;" src="${pageContext.request.contextPath}/img/Usuario2.png" class="img-fluid" id="img" alt="Responsive image">
                <h1 style="color:white"><%= rol.getRolID()%></h1>
                <input type="hidden"  value="<%= rol.getUsuID()%>">
            </center>
            <br><br>
            <ul class="Menu " id="lista" >
                <h5>

                    <li ><a href="${pageContext.request.contextPath}/menu.jsp"><i class="icono izquierda fas fa-home"></i> Principal </i></a></li>
                    <li ><a href="#"><i class="icono izquierda fas fa-users"></i> Usuarios </i></a>
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/Usuarios/RegistrarUsuario.jsp">Registrar Usuario</a> </li>
                            <li><a href="${pageContext.request.contextPath}/Usuarios/ConsultarUsuario.jsp">Consultar Usuario</a> </li>
                        </ul>
                    </li>
                    <li ><a href="#"><i class="icono izquierda fas fa-boxes"></i>Productos </i></a> 
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/Producto/registrar_producto.jsp">Registrar Producto</a> </li>
                            <li><a href="${pageContext.request.contextPath}/Producto/consultar_producto.jsp">Consultar Producto</a> </li>

                        </ul>
                    </li>
                    <li><a href="#"><i class="icono izquierda fas fa-truck "></i> Proveedores </i></a> 
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/Proveedor/registrar_Proveedor.jsp">Registrar Proveedor</a> </li>
                            <li><a href="${pageContext.request.contextPath}/Proveedor/consulta_Proveedor.jsp">Consultar Proveedor</a> </li>
                        </ul>
                    </li>
                    <li><a href="#"><i class="icono izquierda fas fa-boxes "></i> Items </i></a> 
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/Items/registrar_Items.jsp">Registrar Items</a> </li>
                            <li><a href="${pageContext.request.contextPath}/Items/consulta_Items.jsp">Consultar Items</a> </li>

                        </ul>
                    </li>
                    <li><a href="#"><i class="icono izquierda fab fa-wpforms"></i> Manuales </i></a>
                        <ul>
                            <li><a href="#">Ver manual</a> </li>
                        </ul> 
                    </li>
                    <li style="visibility: hidden;">esta es la lista es invisible para generar espacio</li><li></li><li></li>
                </h5>  
            </ul>
        </div>
        <% } else if (rol.getRolID().equals("Almacenista")) {
        %>


        <!--  MenÃº superior -->

        <div id="nav" class="navbar-light" >
            <button class="btn-menu" style="float: left;background-color: transparent;color:White"><i class="fas fa-bars"></i></button>
            <button style="width: 18%;float: left;visibility: hidden;"></button>
            <ul id="menu-nav"  style="float: left;width: 70%;">

                <li style="float: right;"><a href=""><i class="fas fa-cog"></i> Opciones</a>
                    <ul  class="Sub-menu"> 
                        <li> <form action="${pageContext.request.contextPath}/Usuario" method="post" id="form2">
                                <a onclick="document.getElementById('form2').submit()" >Mi perfil</a>
                                <input type="hidden" name="Cedula" value="<%= rol.getUsuID()%>">
                                <input type="hidden" name="opcion" value="6">
                            </form>
                        </li>
                        <li>
                            <form id="myform" method ="post" action="${pageContext.request.contextPath}/sesion">
                                <a  onclick="document.getElementById('myform').submit()" type="submit" class="btn btn-danger">Cerrar Sesión </a>
                            </form>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>


        <!--  Menu lateral Izquierdo  -->


        <div class="contenedor scroll shadow-lg p-3 mb-5 " >
            <center>
                <h2 style="color:white;" >TERMIOT</h2>
                <br>
                <img style="border-radius:50%;padding: 20px;" src="${pageContext.request.contextPath}/img/esta.jpg" class="img-fluid" id="img" alt="Responsive image">
                <h1 style="color:white"><%= rol.getRolID()%></h1>
                <input type="hidden"  value="<%= rol.getUsuID()%>">
            </center>
            <br><br>
            <ul class="Menu " id="lista" >
                <h5>

                    <li ><a href="${pageContext.request.contextPath}/menu.jsp"><i class="icono izquierda fas fa-home"></i> Principal </i></a></li>

                    <li ><a href="#"><i class="icono izquierda fas fa-boxes"></i>Productos </i></a> 
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/Producto/registrar_producto.jsp">Registrar Producto</a> </li>
                            <li><a href="${pageContext.request.contextPath}/Producto/consultar_producto.jsp">Consultar Producto</a> </li>
                        </ul>
                    </li>

                    <li><a href="#"><i class="icono izquierda fas fa-truck "></i> Proveedores </i></a> 
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/Proveedor/registrar_Proveedor.jsp">Registrar Proveedor</a> </li>
                            <li><a href="${pageContext.request.contextPath}/Proveedor/consulta_Proveedor.jsp">Consultar Proveedor</a> </li>
                        </ul>
                    </li>
                    <li><a href="#"><i class="icono izquierda fas fa-boxes "></i> Items </i></a> 
                        <ul>
                            <li><a href="${pageContext.request.contextPath}/Items/registrar_Items.jsp">Registrar Items</a> </li>
                            <li><a href="${pageContext.request.contextPath}/Items/consulta_Items.jsp">Consultar Items</a> </li>
                        </ul>
                    </li>
                    <li><a href="#"><i class="icono izquierda fab fa-wpforms"></i> Manuales </i></a>
                        <ul>
                            <li><a href="#">Ver manual</a> </li>
                        </ul> 
                    </li>
                    <li style="visibility: hidden;">esta es la lista es invisible para generar espacio</li><li></li><li></li>
                </h5>  
            </ul>
        </div>
        <% }
        %>





        <!--Archivos de javascript -->
        <!--Jquery -->
        <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script> 

        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="js/Prompt.js" type="text/javascript"></script>
        <script src="js/Eliminar.js" type="text/javascript"></script>
        <!--Archivos de javascript-->
        <!--Archivos de javascript el cual permite colocar los iconos al lado del boton mediante fontawsome-->
        <script src="${pageContext.request.contextPath}/js/Fs.js"></script>
        <script src="${pageContext.request.contextPath}/js/busquedaajax.js"></script>
        <script src="${pageContext.request.contextPath}/js/Main.js"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js"></script>
    </body>
</html>
