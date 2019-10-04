$(document).ready(function () {

    var lestras = /^[a-z]+$/i;
    var correos = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
    //Obtener el valor al dar click al boton registrar
    $("#registrar").click(function () {
        var longitud = $("#txtlongitud").val();
        var altitud = $("#txtaltitud").val();
        var temperatura = $("#txttemperatura").val();
        var estado_cuarto = $("#txtestado").val();
        var institucion = $("#txtinstitucion").val();
        //longitud 
        if (longitud == "") {
            $('#txtlongitud').addClass('txterror');
            $('#txtlongitud').addClass('alert alert-danger');
            $('#lb3').addClass('labelerror');
            $("#error3").fadeIn("slow");
            return false;
        } else if (isNaN(longitud)) {
            $("#txtlongitud").addClass('txterror');
            $("#lb3").addClass('labelerror');
            $("#txtlongitud").addClass('alert alert-danger');
            $("#error11").fadeIn("slow");
            return false;
        }

// Altitud
        else if (altitud == "") {
            $("#txtaltitud").addClass('txterror');
            $("#lb4").addClass('labelerror');
            $("#txtaltitud").addClass('alert alert-danger');
            $("#error7").fadeIn("slow");
            return false;
        } else if (isNaN(altitud)) {
            $("#txtaltitud").addClass('txterror');
            $("#lb4").addClass('labelerror');
            $("#txtaltitud").addClass('alert alert-danger');
            $("#error9").fadeIn("slow");
            return false;
        }

//temperatura
        else if (temperatura == "") {
            $("#txttemperatura").addClass('txterror');
            $("#lb5").addClass('labelerror');
            $("#txttemperatura").addClass('alert alert-danger');
            $("#error8").fadeIn("slow");
            return false;
        } else if (isNaN(temperatura)) {
            $("#txttemperatura").addClass('txterror');
            $("#lb5").addClass('labelerror');
            $("#txttemperatura").addClass('alert alert-danger');
            $("#error33").fadeIn("slow");
            return false;
        }
//estado_cuarto
        else if (estado_cuarto == "") {
            $("#txtestado").addClass('txterror');
            $("#lb6").addClass('labelerror');
            $("#txtestado").addClass('alert alert-danger');
            $("#error4").fadeIn("slow");
            return false;
        } else if (!lestras.test(estado_cuarto)) {
            $("#txtestado").addClass('txterror');
            $("#lb6").addClass('labelerror');
            $("#txtestado").addClass('alert alert-danger');
            $("#error44").fadeIn("slow");
            return false;
        }
//institucion 
        if (institucion == "") {
            $('#txtinstitucion').addClass('txterror');
            $('#txtinstitucion').addClass('alert alert-danger');
            $('#lb7').addClass('labelerror');
            $("#error5").fadeIn("slow");
            return false;
        } else if (isNaN(institucion)) {
            $("#txtinstitucion").addClass('txterror');
            $("#lb7").addClass('labelerror');
            $("#txtinstitucion").addClass('alert alert-danger');
            $("#error77").fadeIn("slow");
            return false;
        }
    });


//longitud
    $("#txtlongitud").keyup(function () {
        $('#txtlongitud').removeClass('alert alert-danger');
        $("#txtlongitud").removeClass('txterror');
        $("#lb3").removeClass('labelerror');
    });
    // Ocultar altitud
    $("#txtaltitud").keyup(function () {
        $('#txtaltitud').removeClass('alert alert-danger');
        $("#txtaltitud").removeClass('txterror');
        $("#lb4").removeClass('labelerror');
    });
    // Ocultar temperatura
    $("#txttemperatura").click(function () {
        $('#txttemperatura').removeClass('alert alert-danger');
        $("#txttemperatura").removeClass('txterror');
        $("#lb5").removeClass('labelerror');
    });
    //Apellido estado
    $("#txtestado").keyup(function () {
        $('#txtestado').removeClass('alert alert-danger');
        $("#txtestado").removeClass('txterror');
        $("#lb6").removeClass('labelerror');
    });
    //institucion Ocultar
    $("#txtinstitucion").keyup(function () {
        $('#txtinstitucion').removeClass('alert alert-danger');
        $("#txtinstitucion").removeClass('txterror');
        $("#lb7").removeClass('labelerror');
    });
});
//Funcion para quitar el alerta-danger
function quitar() {
    document.getElementById('error3').style.display = "none";
    document.getElementById('error33').style.display = "none";
    document.getElementById('error11').style.display = "none";
    document.getElementById('error4').style.display = "none";
    document.getElementById('error5').style.display = "none";
    document.getElementById('error7').style.display = "none";
    document.getElementById('error77').style.display = "none";
    document.getElementById('error8').style.display = "none";
    document.getElementById('error9').style.display  = "none";
    document.getElementById('error44').style.display  = "none";
}


