<%-- 
    Document   : RegistrarInstitucion
    Created on : 01-sep-2019, 19:20:42
    Author     : SEVEN
--%>

<%@page import="ModeloDAO.CuartoFrioDAO"%>
<%@page import="ModeloVO.CuartoFrioVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@page import="ModeloVO.ProductoVO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../plantilla.jsp" %>  
<!DOCTYPE html>


<div id="Registros" class="scroll"  >
    <center>
        <%if (request.getAttribute("mensajeExito") != null) {%>
        <a  href="${pageContext.request.contextPath}/Items/consulta_Items.jsp"><div class="btn btn-success" style="width: 60%; margin: auto">
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

    <div  id="formularioCliente" class="shadow-lg p-3 mb-5 bg-white rounded">
        <form action="${pageContext.request.contextPath}/Items" method="post">

            <div class="card-header">
                <h1 style="text-align: center;"><b> Registro Items </b></h1><br>
            </div>


            <div class="card-body">
                <!-- Direccion -->
                <label id="lb444" class="label">Codigo de Barras</label>
                <input id="barras" type="text" name="Codigo_Barras" class="form-control txt"  onkeyup="quitar();" >
                <div id="error45" class="errores "> Debe digitar el codigo de barras</div><br><br>
                <div id="error445" class="errores  "> Solo se permiten numeros</div><br><br>
                
                <!-- Nombre -->     
                <label id="lb1"   class="label">Fecha_Vencimiento</label>
                <input type="date" id="txtfecha" name='Fecha_Vencimiento' onclick="quitar();"  class="form-control txt">
                <div id="error3" class="errores  "> Debe seleccionar una fecha</div><br><br>
                <div id="error" class="errores  "> Debe verificar que el campo de la fecha sea el mayor</div><br><br>


                <!-- Celular -->     
                <label id="lb2" class="label">Estante</label>
                <input id="txtestante" name='Estante' type="text"   onkeyup="quitar();"   class="form-control txt">
                <div id="error5" class="errores  "> Debe digitar el estante</div>
                <div id="error55" class="errores  "> Solo se permiten letras</div><br><br>

                <!-- Direccion -->
                <label id="lb3" class="label">Nivel</label>
                <input id="txtnivel" type="text" name="Nivel" class="form-control txt"  onkeyup="quitar();" >
                <div id="error6" class="errores "> Debe digitar el nivel</div><br><br>
                <div id="error33" class="errores  "> Solo se permiten numeros</div><br><br>

                <!-- Direccion -->
                <label id="lb4" class="label">Profundidad</label>
                <input id="txtprofundidad" type="text" name="Profundidad" class="form-control txt"  onkeyup="quitar();" >
                <div id="error4" class="errores "> Debe digitar la profundidad</div><br><br>
                <div id="error44" class="errores  "> Solo se permiten numeros</div><br><br>

                <!-- Direccion -->
                <label id="lb5" class="label">cantidad</label>
                <input id="txtcantidad" type="text" name="Cantidad" class="form-control txt"  onkeyup="quitar();" >
                <div id="error555" class="errores "> Debe digitar la cantidad del producto</div><br><br>
                <div id="error77" class="errores  "> Solo se permiten numeros</div><br><br>
                <!-- Direccion -->
                <label id="lb6" class="label">Observaciones</label>
                <input id="txtobservacion" type="text" name="Observacion" class="form-control txt"  onkeyup="quitar();" >
                <div id="error8" class="errores "> Debe ingresar la observacion</div><br><br>

                <!-- Direccion -->
                <label id="lb7" class="label">Lote</label>
                <input id="txtlote" type="text" name="Lote" class="form-control txt"  onkeyup="quitar();" >
                <div id="error9" class="errores "> Debe digitar el lote</div><br><br>
                <div id="error11" class="errores  "> Solo se permiten letras</div><br><br>

                <!-- Direccion -->
                <label id="lb9" class="label">Embalaje</label>
                <input id="txtembalaje" type="text" name="Embalaje" class="form-control txt"  onkeyup="quitar();" >
                <div id="error13" class="errores "> Debe ingresar el embalaje</div><br><br>

                <!-- Direccion -->
                <label id="lb10" class="label">Codigo del producto</label>
                <select name="Cod_Producto" id="txtproducto" class="form-control txt"  onclick="quitar();">
                    <option>Seleccione Producto</option>
                    <%
                        ProductoVO prodVO = new ProductoVO();
                        ProductoDAO produDAO = new ProductoDAO();
                        ArrayList<ProductoVO> listaproducto = produDAO.listarproductos();

                        for (int i = 0; i < listaproducto.size(); i++) {

                            prodVO = listaproducto.get(i);
                    %>
                    <option value="<%= prodVO.getCodigoPro()%>"> <%= prodVO.getCodigoPro()%> </option>
                    <%  }%>
                </select>
                <div id="error15" class="errores "> Debe seleccionar el codigo del producto</div><br><br>
                <div id="error16" class="errores  "> Solo se permiten numeros</div><br><br>

                <!-- Direccion -->
                <label id="lb11" class="label">Codigo del cuarto frio</label>                
                <select name="Cuarto_Frio" id="txtcuartofrio" class="form-control txt" onclick="quitar();">
                    <option>Seleccione Cuarto frio</option>
                    <%
                        CuartoFrioVO cuartoVO = new CuartoFrioVO();
                        CuartoFrioDAO cuartoDAO = new CuartoFrioDAO();
                        ArrayList<CuartoFrioVO> listacuarto = cuartoDAO.listarInstitucion();

                        for (int i = 0; i < listacuarto.size(); i++) {

                            cuartoVO = listacuarto.get(i);
                    %>
                    <option value="<%= cuartoVO.getCod_Cufi()%>"> <%= cuartoVO.getCod_Cufi()%> </option>
                    <%  }%>
                </select>

                <div id="error17" class="errores "> Debe seleccionar el cuarto frio</div><br><br>
                <div id="error18" class="errores  "> Solo se permiten numeros</div><br><br>
            </div>

            <div class="card-footer">
                <input type="hidden" value="1" name="opcion" >
                <input type="submit" id="registrar" class="btn btn-lg btn-dark" style="width: 100%;" value="Registrar"> 
            </div>
        </form>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/validarItems.js"></script>
