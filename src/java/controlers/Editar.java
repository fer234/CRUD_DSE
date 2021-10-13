/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelos.Usuarios;
import modelos.UsuariosOperaciones;

/**
 *
 * @author ferna
 */
public class Editar extends HttpServlet {

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
        // Creamos una instancia de la clase UsuariosOperaciones
        UsuariosOperaciones uu = new UsuariosOperaciones();
        // La instancia de la clase Usuarios recibe el paramtro id
        Usuarios usr = uu.getUsuarioPorId(Integer.parseInt(request.getParameter("id")));
        // Creamos una variables y las igualamos a nuestro objeto, gracias a nuestro metodo get
        int id = usr.getId();
        String nombre = usr.getNombre();
        String apellido = usr.getApellido();
        String correo = usr.getCorreo();
        String cargo = usr.getCargo();
        String telefono = usr.getTelefono();
        String direccion = usr.getDireccion();
        // Aqui manejamos nuestros atributos con request
        request.setAttribute("id", id);
        request.setAttribute("nombre", nombre);
        request.setAttribute("apellido", apellido);
        request.setAttribute("correo", correo);
        request.setAttribute("cargo", cargo);
        request.setAttribute("telefono", telefono);
        request.setAttribute("direccion", direccion);
        // Por ultimo redirigimos al formulario de edicion
        request.getRequestDispatcher("editar.jsp").forward(request, response);
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
