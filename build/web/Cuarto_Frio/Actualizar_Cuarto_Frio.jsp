<%-- 
    Document   : Actualizar_Institucion
    Created on : 03-sep-2019, 6:50:48
    Author     : SEVEN
--%>
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
            <center>
                <%if (request.getAttribute("mensajeExito") != null) {%>
                <div class="btn btn-success" style="width: 60%; margin: auto">
                    ${mensajeExito}
                </div>
                <%} else if (request.getAttribute("mensajeError") != null) {%>
                <div class="btn btn-danger" style="width: 60%; margin: auto">
                    ${mensajeError}
                </div>
                <%} else {
                    }%>
            </center>
            <br>
            <div  id="formularioCliente" class="shadow-lg p-3 mb-5 bg-white rounded" style="height: 600px;">


                <form action="${pageContext.request.contextPath}/Cuarto_Frio" method="post">
                    <%CuartoFrioVO cuartofriovo = (CuartoFrioVO) request.getAttribute("volleno");
                        if (cuartofriovo != null) {%>
                    <div class="card-header">
                        <h1 style="text-align: center;"><b> Actualizacion Cuarto Frio </b></h1><br>
                    </div>


                    <div class="card-body">
                        <input type="hidden" name="cod_Cufi" value="<%=cuartofriovo.getCod_Cufi()%>">

                        <!-- longitud -->     
                        <label id="lb3"   class="label">longitud</label>
                        <input type="text" id="txtNombre" name='Longitud' onkeyup="quitar();"  value="<%=cuartofriovo.getLongitud()%>" class="form-control txt">
                        <div id="error3" class="errores  "> Debe digitar la longitud</div>
                        <div id="error33" class="errores  "> Solo se permiten letras</div><br><br>


                        <!-- altitud -->     
                        <label id="lb5" class="label">altitud</label>
                        <input id="txtaltitud" name='Altura' type="text"  onkeyup="quitar();" value="<%=cuartofriovo.getAltura()%>"  class="form-control txt">
                        <div id="error5" class="errores  "> Debe digitar la altitud</div>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>

                        <!-- temperatura -->
                        <label id="lb6" class="label">temperatura</label>
                        <input id="txttemperatura" type="text" name="Temperatura" class="form-control txt" value="<%=cuartofriovo.gettemperatura()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe digitar la temperatura</div><br><br>
                        <div id="error55" class="errores  "> Solo se permiten letras</div><br><br>

                        <!-- estado -->     
                        <label id="lb5" class="label">estado</label>
                        <input id="txtestado" name='estado' type="Estado_cuartofrio" onkeyup="quitar();"  value="<%=cuartofriovo.getEstado_Cuartofrio()%>" class="form-control txt">
                        <div id="error5" class="errores  "> Debe digitar el estado del cuarto frio</div>
                        <div id="error33" class="errores  "> Solo se permiten letras</div><br><br>

                        <!-- institucion -->     
                        <label id="lb5" class="label">institucion</label>
                        <input id="txtinstitucion" name='Institucion' type="text" minlength="8"  onkeyup="quitar();" value="<%=cuartofriovo.getInstitucion()%>"  class="form-control txt">
                        <div id="error5" class="errores  "> Debe digitar la institucion</div>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>


                    </div>

                    <div class="card-footer">
                        <input type="hidden" value="3" name="opcion" >
                        <input type="submit" id="registrar" class="btn btn-lg btn-dark" style="width: 100%;" value="Actualizar"> 
                    </div>
                    <%}%>
                </form>


            </div>

        </div>      
        <script>
            $('#myModal').on('shown.bs.modal', function () {
                $('#myInput').trigger('focus')
            })
        </script>     
    </body>
</html>
