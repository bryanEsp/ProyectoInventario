
<%@page import="ModeloVO.ProveedorVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../plantilla.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="Registros" class="scroll"  >
            <div  id="formularioCliente" class="shadow-lg p-3 mb-5 bg-white rounded" style="height: 450px;">

                <%if (request.getAttribute("mensajeExito") != null) {%>

                <div id="esta" style="display: block" class="modal" tabindex="-1" role="dialog">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Notificacin</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>

                            </div>
                            <div class="modal-body">
                                ${mensajeExito}
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal" onclick="ocultar();">Close</button>
                                <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="mostrar();">Ver tabla</button>
                            </div>
                        </div>
                    </div>
                </div>
                <%} else if (request.getAttribute("mensajeError") != null) {%>
                <div class="alert alert-danger" style="width: 60%; margin: auto">
                    ${mensajeError}
                </div>
                <%} else {
                    }%>
                <form action="${pageContext.request.contextPath}/Proveer" method="post">
                    <%ProveedorVO proveevo = (ProveedorVO) request.getAttribute("volleno");
                        if (proveevo != null) {%>
                    <div class="card-header">
                        <h1 style="text-align: center;"><b> Registro Proveedor </b></h1><br>
                    </div>


                    <div class="card-body">
                        <input type="hidden" name="NIT" value="<%=proveevo.getNIT()%>">

                        <!-- Nombre -->     
                        <label id="lb3"   class="label">Nombre</label>
                        <input type="text" id="txtNombre" name='Nombre' onkeyup="quitar();" value="<%= proveevo.getNombre()%>"  class="form-control txt">
                        <div id="error3" class="errores  "> Debe digitar su Nombre</div>
                        <div id="error33" class="errores  "> Solo se permiten letras</div><br><br>


                        <!-- Celular -->     
                        <label id="lb5" class="label">Celular</label>
                        <input id="txtcelular" name='Celular' type="text" minlength="8" value="<%= proveevo.getCelular()%>"  onkeyup="quitar();"   class="form-control txt">
                        <div id="error5" class="errores  "> Debe digitar su Celular</div>
                        <div id="error55" class="errores  "> Solo se permiten numeros</div><br><br>

                        <!-- Direccion -->
                        <label id="lb6" class="label">Dirección</label>
                        <input id="txtdireccion" type="text" name="Direccion" class="form-control txt" value="<%= proveevo.getDireccion()%>" onkeyup="quitar();" >
                        <div id="error6" class="errores "> Debe digitar su Direccion</div><br><br>

                        <!-- Correo -->
                        <label id="lb6" class="label">Correo</label>
                        <input id="txtcorreo" type="email" name="Correo" class="form-control txt" value="<%= proveevo.getcorreo()%>" class="form-control txt" >

                    </div>


                    <div class="card-footer">
                        <input type="hidden" value="3" name="opcion" >
                        <input type="submit" id="registrar" class="btn btn-lg btn-dark" style="width: 100%;" value="Actualizar"> 
                    </div>
                    <%}%>
                </form>
            </div>


        </div>

    </div>      
    <script>
        $('#myModal').on('shown.bs.modal', function () {
            $('#myInput').trigger('focus')
        })
        function  ocultar() {
            document.getElementById('esta').style.display = "none";
        }
        function  mostrar() {
            window.location="Proveedor/consulta_Proveedor.jsp";
        }

    </script>     
</body>
</html>
