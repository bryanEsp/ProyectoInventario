<%-- 
    Document   : consulta_institucion.jsp
    Created on : 03-sep-2019, 5:19:49
    Author     : SEVEN
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.CuartoFrioDAO"%>
<%@page import="ModeloVO.CuartoFrioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../plantilla.jsp" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="Registros" class="scroll"  >
            <div  id="formularioCliente" class="shadow-lg p-3 mb-5 bg-white rounded table-responsive"style="width: 90%;height: 800px;  ">
                <%if (request.getAttribute("mensajeExito") != null) {%>
                <div class="alert alert-success" style="width: 60%; margin: auto">
                    ${mensajeExito}
                </div>
                <%} else if (request.getAttribute("mensajeError") != null) {%>
                <div class="alert alert-danger" style="width: 60%; margin: auto">
                    ${mensajeError}
                </div>
                <%} else {
                    }%>
                <br>
                <center> 
                    <input type="text"  name="busca" id="busca"  autofocus=""    onkeyup="search()"   class="form-control">
                    <br>
                    <br>
                    <table id="datos" class="table  table-responsive-md table-hover table-light " style="width: 100%;height: 100px;">
                        <thead class="thead-dark">
                            <tr id="encabezado" >
                                <th scope="col">Código</th>
                                <th scope="col">longitud</th>
                                <th scope="col"> altitud</th>
                                <th scope="col">temperatura</th>
                                <th scope="col">estado</th>
                                <th scope="col">institucion</th>                                
                                <th scope="col">Editar</th> 
                                <th scope="col">Eliminar</th>      
                            </tr>
                        </thead>
                        <tbody  >
                            <%
                                CuartoFrioVO cuartofriovo = new CuartoFrioVO();
                                CuartoFrioDAO cuartofrioDAO = new CuartoFrioDAO();
                                ArrayList<CuartoFrioVO> listaVehiculos = cuartofrioDAO.listarInstitucion();

                                for (int i = 0; i < listaVehiculos.size(); i++) {

                                    cuartofriovo = listaVehiculos.get(i);
                            %>
                            <tr>

                                <td ><%= cuartofriovo.getCod_Cufi()%></td>
                                <td><%= cuartofriovo.getLongitud()%></td>
                                <td><%= cuartofriovo.getAltura()%></td>
                                <td><%= cuartofriovo.gettemperatura()%></td>
                                <td><%= cuartofriovo.getEstado_Cuartofrio()%></td>
                                <td><%= cuartofriovo.getInstitucion()%></td>
                                <td>
                                    <form action="${pageContext.request.contextPath}/Cuarto_Frio" method="post">
                                        <button class="btn btn-lg btn-primary">Editar</button>
                                        <input type="hidden" name="cod_Cufi" value="<%=cuartofriovo.getCod_Cufi()%>">
                                        <input type="hidden" name="opcion" value="2">
                                    </form>
                                </td>
                                <td>
                                    <form action="${pageContext.request.contextPath}/Cuarto_Frio" method="post">
                                        <button class="btn btn-lg btn-danger">Eliminar</button>
                                        <input type="hidden" name="cod_Cufi" value="<%= cuartofriovo.getCod_Cufi()%>">
                                        <input type="hidden" name="opcion" value="4">
                                    </form>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </center>
            </div>
        </div>
    </body>
</html>