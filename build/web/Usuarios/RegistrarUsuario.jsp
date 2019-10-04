<%-- 
    Document   : RegistrarUsuario
    Created on : 04-sep-2019, 0:11:05
    Author     : SEVEN
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.InstitucionDAO"%>
<%@page import="ModeloVO.InstitucionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../plantilla.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--  Parte de formulario para los campos  -->

        <div id="Registros" class="scroll"  >
            <center>
                <%if (request.getAttribute("mensajeExito") != null) {%>
                <a  href="${pageContext.request.contextPath}/Usuarios/ConsultarUsuario.jsp"><div class="btn btn-success" style="width: 60%; margin: auto">
                        ${mensajeExito}
                    </div></a>
                    <%} else if (request.getAttribute("mensajeError") != null) {%>
                <div class="btn btn-danger" style="width: 60%; margin: auto">
                    ${mensajeError}
                </div>
                <%} else {
                    }%>
            </center>
            <br>

            <div  id="formularioCliente" class="shadow-lg p-3 mb-5 bg-white rounded" style="height: 1050px">
                <form action="${pageContext.request.contextPath}/Usuario" method="post">
                    <div class="card-header">
                        <h1 style="text-align: center;"><b> Registro Usuario </b></h1><br>
                    </div>


                    <div class="card-body">
                        <!-- Numero Documento -->  
                        <label id="lb1" class="label">Numero Documento</label>
                        <input id="txtDocumento" name="Cedula" type="text" minlength="8" name="text" onkeyup="quitar();" minlength="8" placeholder="Digite su numero de documento" class="form-control txt" >
                        <div id="error1" class="errores  "> Debe digitar su Numero de documento</div>
                        <div id="error11" class="errores  "> Solo se permiten numeros</div><br><br>


                        <!-- Nombre -->     
                        <label id="lb3" class="label">Nombre</label>
                        <input type="text" name="Nombre" id="txtNombre" name="text" onkeyup="quitar();"  placeholder="Digite su nombre" class="form-control txt">
                        <div id="error3" class="errores  "> Debe digitar su Nombre</div>
                        <div id="error33" class="errores  "> Solo se permiten letras</div><br><br>

                        <!-- Apellido -->     
                        <label id="lb4" class="label">Apellido</label>
                        <input type="text" name="Apellido" id="txtApellido" onkeyup="quitar();" placeholder="Digite su apellido" name="text"  class="form-control txt">
                        <div id="error4" class="errores  "> Debe digitar su Apellido</div>
                        <div id="error44" class="errores  "> Solo se permiten letras</div><br><br>

                        <!-- Celular -->     
                        <label id="lb5" class="label">Celular</label>
                        <input id="txtcelular" name="Celular" type="text" minlength="8" name="text" onkeyup="quitar();" placeholder="Digite su celular"  class="form-control txt">
                        <div id="error5" class="errores  "> Debe digitar su Celular</div>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>

                        <!-- Direccion -->
                        <label id="lb6" class="label">Direccion</label>
                        <input id="txtdireccion" name="Direccion" type="text" name="text" class="form-control txt" onkeyup="quitar();" placeholder="Digite su direccion">
                        <div id="error6" class="errores "> Debe digitar su Direccion</div><br><br>

                        <!-- Correo -->
                        <label id="lb7" class="label">Correo</label>
                        <input type="text" name="Correo" id="txtcorreo" onkeyup="quitar();" class="form-control txt" placeholder="Digite su correo">
                        <div id="error7" class="errores  "> Debe digitar su Correo electronico</div>
                        <div id="error77" class="errores  "> El correo no es valido, verificar</div><br><br>
                        <!-- Clave -->
                        <label  id="lb8" class="label">Clave</label>
                        <input id="txtclave" name="Clave" type="text" name="text"  onkeyup="quitar();"  class="form-control txt" placeholder="Digite su clave"><br><br>
                        <div id="error8" class="errores  "> Debe digitar su Contraseña</div>

                        <!-- Cargo -->
                        <label id="lb9" class="label">Cargo</label>
                        <select id="txtCargo" name="Cargo" onclick="quitar();"  class="form-control txt">
                            <option value="Seleccione">Selecione</option>
                            <option value="Admin">Administrador</option>
                            <option value="Almacenista">Almacenista</option> 
                        </select> <br><br>
                        <label id="lb2" class="label">Institucion</label>
                        <div id="error9" class="errores  "> Debe seleccionar el cargo correspondiente</div>
                        <!-- Institucion -->
                        <select name="Institu" class="form-control txt" id="txtTipo">
                            <option></option>
                            <%
                                InstitucionVO instivo = new InstitucionVO();
                                InstitucionDAO instiDAO = new InstitucionDAO();
                                ArrayList<InstitucionVO> listaVehiculos = instiDAO.listarInstitucion();

                                for (int i = 0; i < listaVehiculos.size(); i++) {

                                    instivo = listaVehiculos.get(i);
                            %>
                            <option value="<%= instivo.getCod_insti()%>"  >  <%= instivo.getNombre()%></option>
                            <% }%>
                        </select><br><br>
                        <input type="hidden" value="1" name="opcion" >
                    </div>

                    <div class="card-footer">
                        <input type="submit" id="registrar" class="btn btn-lg btn-dark" style="width: 100%;" value="Registrar"> 
                    </div>
                </form>
            </div>
            <script src="${pageContext.request.contextPath}/js/validarCamposRU.js"></script>
    </body>
</html>
