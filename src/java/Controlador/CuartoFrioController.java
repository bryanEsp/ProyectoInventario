/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.CuartoFrioDAO;
import ModeloVO.CuartoFrioVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SEVEN
 */
@WebServlet(name = "CuartoFrioController", urlPatterns = {"/Cuarto_Frio"})
public class CuartoFrioController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int opcion = Integer.parseInt(request.getParameter("opcion"));

        String Cod_Cufi= request.getParameter("cod_Cufi");
        String longitud = request.getParameter("Longitud");
        String altura = request.getParameter("Altura");
        String temperatura = request.getParameter("Temperatura");
        String estado_cuartofrio = request.getParameter("Estado_cuartofrio");
        String institucion = request.getParameter("Institucion");

        CuartoFrioVO cuartofriovo = new CuartoFrioVO(Cod_Cufi, longitud, altura, temperatura, estado_cuartofrio, institucion);
        CuartoFrioDAO cuartofriodao = new CuartoFrioDAO(cuartofriovo);

        switch (opcion) {
            case 1:
                if (cuartofriodao.Agregarregistro()) {
                    request.setAttribute("mensajeExito", "El Cuarto Frio se actualizó correctamente");
                } else {

                    request.setAttribute("mensajeError", "El Cuarto Frio no pudo ser actualizado");
                }
                request.getRequestDispatcher("Cuarto_Frio/registrar_Cuarto_Frio.jsp").forward(request, response);

                break;
            case 2:
                CuartoFrioVO cuartofrivo = CuartoFrioDAO.consultarPorid(Cod_Cufi);

                if (cuartofrivo != null) {

                    request.setAttribute("volleno", cuartofrivo);
                    request.getRequestDispatcher("Cuarto_Frio/Actualizar_Cuarto_Frio.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "El cuarto frio NO existe");
                    request.getRequestDispatcher("Cuarto_Frio/consulta_Cuarto_Frio.jsp").forward(request, response);

                }
                break;
            case 3:
                if (cuartofriodao.ActualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El cuarto frio se actualizó correctamente");
                } else {
                    request.setAttribute("mensajeError", "El cuarto frio no pudo ser actualizado");
                }
                request.getRequestDispatcher("Cuarto_Frio/Actualizar_Cuarto_Frio.jsp").forward(request, response);
                break;
            case 4:
                if (cuartofriodao.EliminarRegistro()) {
                    request.setAttribute("mensajeExito", "El cuarto frio se Eliminado correctamente");
                } else {
                    request.setAttribute("mensajeError", "El cuarto frio no pudo ser Eliminado");
                }
                request.getRequestDispatcher("Cuarto_Frio/consulta_Cuarto_Frio.jsp").forward(request, response);
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
