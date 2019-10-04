<%@ include file="../plantilla.jsp" %> 

<div class="oscurecer" id="oscurecer"></div>
<div class="registrocat" id="registrocat">

    <h1 style="text-align: center;"><b> Registro Categoria </b></h1><br>
    <form action="${pageContext.request.contextPath}/Categoria"  method="post">
        <!-- Nombre Categoria -->  
        <label id="lbc1" class="label" autofocus>Nombre Categoria</label>
        <input type="text"  name="nombre" onkeyup="quitar();"  placeholder="Digite el Nombre de laNueva Categoria" class="form-control txt" >
        <div id="error3" class="errores  "> Digite el Nombre de la Nueva Categoria</div>
        <div id="error33" class="errores  "> Solo se permiten letras</div><br><br>


        <!-- Descripcion Categoria -->     
        <label id="lbc2" class="label">Descripcion</label>
        <!--<tetxtarea name="descripcion" type="text" maxlenght="150" placeholder="Digite una Pequeña Descripcion del Producto..."  onkeyup="quitar();" ></tetxtarea>-->
        <textarea name="descripcion" placeholder="Digite una Pequeña Descripcion de la categoria..." onkeyup="quitar();" class="form-control txt" maxlenght="5" ></textarea>
        <div id="error4" class="errores  "> Espacio Vacio Ingrese la Descripcion </div><br><br><br>
        <div class="card-footer">
            <input type="submit" id="registrar" class="btn btn-lg btn-dark" style="width: 100%;"value="Registrar">
            <input type="hidden" name="opcion" value="1">
        </div>
    </form>
        
</div>
    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<!DOCTYPE html>

<!--  Parte de formulario para los campos  --> 

<div id="Registros" class="scroll"  >

    <center>
        <%if (request.getAttribute("mensajeExito") != null) {%>
        <a  href="${pageContext.request.contextPath}/Producto/consultar_producto.jsp"><div class="btn btn-success" style="width: 60%; margin: auto">
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
        <form action="${pageContext.request.contextPath}/Productos" method="post" > 

            <div class="card-header">
                <h1 style="text-align: center;"><b> Registro Producto </b></h1><br>
            </div>


            <div class="card-body">


                <!-- Nombre producto -->  
                <label id="lb1" class="label" autofocus>Nombre Producto</label>
                <input id="nombre" type="text"  name="nombre" onkeyup="quitar();"  placeholder="Digite el Nombre del Nuevo producto" class="form-control txt" >
                <div id="error3" class="errores  "> Digite el Nombre del Nuevo Productoo</div>
                <div id="error33" class="errores  "> Solo se permiten letras</div><br><br>


                <!-- Descripcion Producto -->     
                <label id="lb2" class="label">Descripcion</label>
                <!--<tetxtarea name="descripcion" type="text" maxlenght="150" placeholder="Digite una Pequeña Descripcion del Producto..."  onkeyup="quitar();" ></tetxtarea>-->
                <textarea id="descripcion" name="descripcion" placeholder="Digite una Pequeña Descripcion del Producto..." onkeyup="quitar();" class="form-control txt" maxlenght="5" ></textarea>
                <div id="error4" class="errores  "> Espacio Vacio Ingrese la Descripcion </div><br><br><br>


                <!-- Unidad Medida -->  
                <label id="lb3" class="label">Unidad de Medida</label>

                <select name="UnidaddeMedida" id="txtTipo"  onclick="quitar();" class="form-control txt">
                    <option>Unidad de Medida</option>
                    <option>Mg</option>
                    <option>Gr</option>
                </select>
                <div id="error77" class="errores  "> Debe Seleccionar la unidad de Medida </div><br><br>


                <!-- Peso -->     
                <label id="lb4" class="label">Peso</label>
                <input type="number" id="Peso" name="Peso" onkeyup="quitar();"  placeholder="Digite el Peso del Producto" class="form-control txt" >
                <div id="errorPV" class="errores  "> Espacio Vacio Ingrese el Peso </div>
                <div id="errorPN" class="errores  "> Solo se permiten Numeros</div><br><br>

                <!-- Cantidad General --> 
                <label id="lb5" class="label">Cantidad general</label>
                <input type="number" id="CantidadGeneral" name="CantidadGeneral" onkeyup="quitar();"  placeholder="Digite la Cantidad Existente del Mismo Producto" class="form-control txt" >
                <div id="errorCGV" class="errores  "> Espacio Vacio Ingrese La Cantidad General </div>
                <div id="errorCGN" class="errores  "> Solo se permiten Numeros</div><br><br>

                <!-- Temperatura -->     
                <label id="lb6" class="label">Temperatura</label>
                <input type="number" id="Temperatura" name="Temperatura" onkeyup="quitar();"  placeholder="Digite la Temperatura del Producto" class="form-control txt" ><label id="lb3" class="label">°</label>
                <div id="errorTV" class="errores  "> Debe digitar la temperatura</div>
                <div id="errorTN" class="errores  "> Solo se permiten Numeros</div><br><br>

                <!-- Categoria-->     
                <label id="lb7" class="label">Categoria</label>
                <select name="Categoria"class="form-control txt" id="txtTipo2"  onclick="quitar();">
                    <option>Seleccione Categoria</option>
                    <%                        CategoriaVO catVO = new CategoriaVO();
                        CategoriaDAO catDAO = new CategoriaDAO();
                        ArrayList<CategoriaVO> listacategoria = catDAO.listarproductocategoria();

                        for (int i = 0; i < listacategoria.size(); i++) {

                            catVO = listacategoria.get(i);
                    %>
                    <option value="<%= catVO.getIdCat()%>"> <%= catVO.getNombreCat()%> </option>
                    <%  }%>
                </select>
                <div id="error111" class="errores  "> Debe Seleccionar una Categoria </div>


                <button type="submit" id="nuevac" value="Registrar Categoria" class="btn btn-lg btn-primary"><a href="${pageContext.request.contextPath}/Categoria/registrar_categoria.jsp"></a></button>

                <!-- <input type="textarea" id="" name="categoria" onkeyup="quitar();"  placeholder="Ingrese el Numero de la Categoria" class="form-control txt"> -->
                <div id="error3" class="errores  "> Debe Seleccionar una Categoria </div>


            </div>

            <br><br>

            <div class="card-footer">
                <input type="submit" id="registrar" class="btn btn-lg btn-dark" style="width: 100%;"value="Registrar">
                <input type="hidden" name="opcion" value="1">
            </div>
        </form>

    </div>

</div>

<script src="${pageContext.request.contextPath}/js/validarCamposProductos.js"></script>

