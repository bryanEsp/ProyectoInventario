/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.RolDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.RolVO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SEVEN
 */
@WebServlet(name = "ControladorUsuario", urlPatterns = {"/Usuario"})
public class ControladorUsuario extends HttpServlet {

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
        String cedula_u = request.getParameter("Cedula");
        String nombre = request.getParameter("Nombre");
        String apellido = request.getParameter("Apellido");
        String celular = request.getParameter("Celular");
        String direccion = request.getParameter("Direccion");
        String cargo = request.getParameter("Cargo");
        String Fechar_registro = request.getParameter("Fecha");
        String correo = request.getParameter("Correo");
        String clave = request.getParameter("Clave");
        String insti = request.getParameter("Institu");
        String estado = request.getParameter("Estado_Usu");

        UsuarioVO usuvo = new UsuarioVO(cedula_u, nombre, apellido, celular, direccion, cargo, correo, Fechar_registro, clave, insti, estado);
        UsuarioDAO usuDAO = new UsuarioDAO(usuvo);

        RolVO rolvo = new RolVO();
        RolDAO roldao = new RolDAO();

        switch (opcion) {
            case 1:
                if (usuDAO.Agregarregistro()) {
                    request.setAttribute("mensajeExito", "El usuario se registro correctamente");
                } else {

                    request.setAttribute("mensajeError", "El usuario no pudo ser Registrado");
                }
                request.getRequestDispatcher("Usuarios/RegistrarUsuario.jsp").forward(request, response);

                break;
            case 2:

                UsuarioVO ususvo = UsuarioDAO.consultarPorid(cedula_u);

                if (ususvo != null) {

                    request.setAttribute("volleno", ususvo);
                    request.getRequestDispatcher("Usuarios/ActualizarUsuario.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "El usuario NO existe");
                    request.getRequestDispatcher("Usuarios/ConsultarUsuario.jsp").forward(request, response);

                }
                break;
            case 3:
                if (usuDAO.ActualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se actualizó correctamente");
                } else {
                    request.setAttribute("mensajeError", "El usuario no pudo ser actualizado");
                }
                request.getRequestDispatcher("Usuarios/ActualizarUsuario.jsp").forward(request, response);
                break;
            case 4:
                if (usuDAO.EliminarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se Eliminado correctamente");
                } else {
                    request.setAttribute("mensajeError", "El usuario no pudo ser Eliminado");
                }
                request.getRequestDispatcher("Usuarios/ConsultarUsuario.jsp").forward(request, response);
                break;

            case 5:
                if (usuDAO.validarAcceso(correo, clave)) {
                    RolVO rolVO = RolDAO.consultarRol(correo);
                    if (rolVO != null) {
                        HttpSession session = request.getSession();
                        session.setAttribute("usuario", rolVO);
                        request.getRequestDispatcher("menu.jsp").forward(request, response);
                    } else {
                        request.setAttribute("mensajeError", "El usuario no tiene un cargo asignado");
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }

                } else {
                    request.setAttribute("mensajeError", "El usuario y/o la contraseña son incorrectas");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }

                break;
            case 6:
                UsuarioVO ususvo2 = UsuarioDAO.consultarPorid(cedula_u);

                if (ususvo2 != null) {

                    request.setAttribute("volleno", ususvo2);
                    request.getRequestDispatcher("Usuarios/Perfil.jsp").forward(request, response);
                } else {
                    request.setAttribute("mensajeError", "El usuario NO existe");
                    request.getRequestDispatcher("menu.jsp").forward(request, response);

                }
                break;
            case 7:
                if (usuDAO.ActualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se actualizó correctamente");
                } else {
                    request.setAttribute("mensajeError", "El usuario no pudo ser actualizado");
                }
                request.getRequestDispatcher("Usuarios/Perfil.jsp").forward(request, response);
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
