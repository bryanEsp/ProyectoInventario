<%-- 
    Document   : RegistrarInstitucion
    Created on : 01-sep-2019, 19:20:42
    Author     : SEVEN
--%>

<%@page import="ModeloVO.RolVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="../plantilla.jsp" %> 
<!DOCTYPE html>




<div id="Registros" class="scroll"  >
    <center>
        <%if (request.getAttribute("mensajeExito") != null) {%>
        <a  href="${pageContext.request.contextPath}/Institucion/consulta_institucion.jsp"><div class="btn btn-success" style="width: 60%; margin: auto">
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

    <div  id="formularioCliente" class="shadow-lg p-3 mb-5 bg-white rounded" style="height: 780px;">
        <form action="${pageContext.request.contextPath}/Cuarto_Frio" method="post">

            <div class="card-header">
                <h1 style="text-align: center;"><b> Registro Cuarto Frio </b></h1><br>
            </div>


            <div class="card-body">
                <!-- longitud -->     
                <label id="lb3"   class="label">longitud</label>
                <input type="text" id="txtlongitud" name='Longitud' onkeyup="quitar();"   class="form-control txt">
                <div id="error3" class="errores  "> Debe digitar la longitud</div>
                <div id="error11" class="errores  "> Solo se permiten letras</div><br><br>


                <!-- altitud -->     
                <label id="lb4" class="label">altitud</label>
                <input id="txtaltitud" name='Altura' type="text"   onkeyup="quitar();"   class="form-control txt">
                <div id="error7" class="errores  "> Debe digitar la altitud</div>
                <div id="error9" class="errores  "> Solo se permiten numeros</div><br><br>

                <!-- temperatura -->
                <label id="lb5" class="label">temperatura</label>
                <input id="txttemperatura" type="text" name="Temperatura" class="form-control txt" onkeyup="quitar();" >
                <div id="error8" class="errores "> Debe digitar la temperatura</div>
                <div id="error33" class="errores  "> Solo se permiten numeros</div><br><br>
                <input type="hidden" value="1" name="opcion" >

                <!-- estado -->     
                <label id="lb6" class="label">estado</label>
                <input id="txtestado" name='estado' type="Estado_cuartofrio"  onkeyup="quitar();"   class="form-control txt">
                <div id="error4" class="errores  "> Debe digitar el estado del cuarto frio</div>
                <div id="error44" class="errores  "> Solo se permiten letras</div><br><br>

                <!-- institucion -->     
                <label id="lb7" class="label">institucion</label>
                <input id="txtinstitucion" name='Institucion' type="text"   onkeyup="quitar();"   class="form-control txt">
                <div id="error5" class="errores  "> Debe digitar la institucion</div>
                <div id="error77" class="errores  "> Solo se permiten numeros</div><br><br>

            </div>
            <div class="card-footer">
                <input type="submit" id="registrar" class="btn btn-lg btn-dark" style="width: 100%;" value="Registrar"> 
            </div>
        </form>


    </div>
</div>
<script src="${pageContext.request.contextPath}/js/validarCuartoFrio.js"></script>
