<%-- 
    Document   : Actualizar_Institucion
    Created on : 03-sep-2019, 6:50:48
    Author     : SEVEN
--%>
<%@ include file="../plantilla.jsp" %>  
<%@page import="ModeloVO.ItemsVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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

            <div  id="formularioCliente" class="shadow-lg p-3 mb-5 bg-white rounded" >

                <form action="${pageContext.request.contextPath}/Items" method="post">   
                    <%ItemsVO itemsvo = (ItemsVO) request.getAttribute("volleno");
                        if (itemsvo != null) {%>
                    <div class="card-header">
                        <h1 style="text-align: center;"><b> Registro Items </b></h1><br>
                    </div>


                    <div class="card-body">
                        <input type="hidden" name="Codigo_Barras" value="<%=itemsvo.getCodigo_barras()%>">

                        <!-- Nombre -->     
                        <label id="lb1"   class="label">Fecha_Vencimiento</label>
                        <input type="date" id="txtfecha" name='Fecha_Vencimiento' onkeyup="quitar();" value="<%= itemsvo.getFecha_vencimiento()%>"  class="form-control txt">
                        <div id="error3" class="errores  "> Debe seleccionar una fecha</div><br><br>


                        <!-- Celular -->     
                        <label id="lb2" class="label">Estante</label>
                        <input id="txtestante" name='Estante' type="text"  value="<%= itemsvo.getestante()%>"  onkeyup="quitar();"   class="form-control txt">
                        <div id="error5" class="errores  "> Debe digitar el estante</div>
                        <div id="error55" class="errores  "> Solo se permiten letras</div><br><br>

                        <!-- Direccion -->
                        <label id="lb3" class="label">Nivel</label>
                        <input id="txtnivel" type="text" name="Nivel" class="form-control txt" value="<%= itemsvo.getnivel()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe digitar el nivel</div><br><br>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>

                        <!-- Direccion -->
                        <label id="lb4" class="label">Profundidad</label>
                        <input id="txtprofundidad" type="text" name="Profundidad" class="form-control txt" value="<%= itemsvo.getprofundidad()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe digitar la profundidad</div><br><br>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>

                        <!-- Direccion -->
                        <label id="lb5" class="label">cantidad</label>
                        <input id="txtcantidad" type="text" name="Cantidad" class="form-control txt" value="<%= itemsvo.getcantidad()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe digitar la cantidad del producto</div><br><br>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>
                        <!-- Direccion -->
                        <label id="lb6" class="label">Observaciones</label>
                        <input id="txtobservacion" type="text" name="Observacion" class="form-control txt" value="<%= itemsvo.getobservacion()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe ingresar la observacion</div><br><br>

                        <!-- Direccion -->
                        <label id="lb7" class="label">Lote</label>
                        <input id="txtlote" type="text" name="Lote" class="form-control txt" value="<%= itemsvo.getlote()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe digitar el lote</div><br><br>
                        <div id="error55" class="errores  "> Solo se permiten letras</div><br><br>

                        <!-- Direccion -->
                        <label id="lb9" class="label">Embalaje</label>
                        <input id="txtembalaje" type="text" name="Embalaje" class="form-control txt" value="<%= itemsvo.getembalaje()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe ingresar el embalaje</div><br><br>

                        <!-- Direccion -->
                        <label id="lb10" class="label">Codigo del producto</label>
                        <input id="txtproducto" type="text" name="Cod_Producto" class="form-control txt" value="<%= itemsvo.getcod_producto()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe seleccionar el codigo del producto</div><br><br>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>

                        <!-- Direccion -->
                        <label id="lb11" class="label">Codigo del cuarto frio</label>
                        <input id="txtcuartofrio" type="text" name="Cuarto_Frio" class="form-control txt" value="<%= itemsvo.getcuarto_frio()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe digitar el nivel</div><br><br>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>
                    </div>


                    <div class="card-footer">
                        <input type="hidden" value="3" name="opcion" >
                        <input type="submit" class="btn btn-lg btn-dark" style="width: 100%;" value="Actualizar"> 
                    </div>

                    <%}%>
                </form>


            </div>
        </div>      
        <script src="${pageContext.request.contextPath}/js/validarItems.js"></script>  
    </body>
</html>
