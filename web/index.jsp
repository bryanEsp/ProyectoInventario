<%-- 
    Document   : index
    Created on : 31-ago-2019, 23:47:05
    Author     : SEVEN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio Sesion</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/Style.css">
    </head>
    <body>
        <div class="Contenedor">
            <div class="d-flex justify-content-center h-100">
                <div class="Campos">
                    <center>
                        <div class="card-header">
                            <h3>Inicio Sesion</h3>
                        </div>
                    </center>
                    <div class="card-body">
                        <form action="Usuario" method="post">
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" id="itMail" name="Correo"  class="form-control" placeholder="correo">
                            </div>
                            <div id="error2" class="errores"> Digite su correo</div>
                            <div id="error22" class="errores"> Correo no valido, vuelva a intentar</div>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="password" name="Clave" id="itpassword" class="form-control" placeholder="password" minlength="1" required>
                            </div>
                            <div id="error1" class="errores"> Digite su Password</div>

                            <div class="row align-items-center remember">
                                <input id="chb1" type="checkbox" >Visualizar contraseña
                            </div>
                            <div class="form-group">
                                <input type="submit"  id="bEnviar" value="Login" class="btn float-right login_btn">
                            </div>
                            <input type="hidden" name="opcion" value="5">
                        </form>
                    </div>
                    <div class="card-footer">
                        <div class="d-flex justify-content-center links">
                            Problemas con su cuenta?<a href="#">Click aqui</a>
                        </div>
                        <div class="d-flex justify-content-center">
                            <a href="#">Olvido su contraseña?</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%if (request.getAttribute("mensajeError") != null) {%>
        <div class="alert alert-danger" style="width: 60%; margin: auto;top:-150px">
            ${mensajeError}
        </div>
        <%} else {%>
        <%}%>

        <script >
            var expr = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
            $(document).ready(function () {
                $("#bEnviar").click(function () {
                    var correo = $("#itMail").val();
                    var password = $("#itpassword").val();
                    if (correo == "") {
                        $("#error22 ").fadeOut();
                        $("#error2").fadeIn("slow");
                        return false;
                    } else {
                        $("#error2").fadeOut();

                        if (!expr.test(correo)) {
                            $("#error22").fadeIn("slow");
                            return false;
                        } else {
                            $("#error22").fadeOut();

                            if (password == "") {
                                $("#error1").fadeIn("slow");
                                return false;
                            } else {
                                $("#error1").fadeOut();
                            }
                        }
                    }
                });
            });

            $('#chb1').on('change', function (event) {
                if ($('#chb1').is(':checked')) {
                    $('#itpassword').get(0).type = 'text';
                } else {
                    $('#itpassword').get(0).type = 'password';
                }
            });


        </script>
    </body>
</html>
