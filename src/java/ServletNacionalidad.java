import accesodato.Coneccion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Nacionalidad;


@WebServlet(urlPatterns = {"/ServletNacionalidad"})
public class ServletNacionalidad extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //ESTA PARTE VA NUESTRO CODIGO
            Nacionalidad nacionalidad = new Nacionalidad();
           
            
            // SI LA VARIABLE ENVIADA DESDE INDEX.JSP DE NOMBRE ELIMINAR NO VIENE VACIA "ELIMINA"
            if (request.getParameter("eliminar")!= null) {
                int eliminar_id=Integer.parseInt(request.getParameter("eliminar"));
                nacionalidad.setNacionalidad_id(eliminar_id);
                nacionalidad.eliminar();
                response.sendRedirect("nacionalidades/index.jsp");
            // SI LA VARIABLE ENVIADA DESDE EDITAR.JSP DE NOMBRE EDITAR NO VIENE VACIA "RECIBE LOS DATOS"
            }else if(request.getParameter("editar")!=null){
                 // OJO CON LA VARIABLE ID QUE ESTA EN EL CAMPO HIDDEN DEL FORMULARIO EDITAR
                int id=Integer.parseInt(request.getParameter("id"));
                String nombre_nacionalidad = request.getParameter("nombre_nacionalidad");
                String estado = request.getParameter("estado");
                nacionalidad.setNacionalidad_id(id);
                nacionalidad.setNombre_nacionalidad(nombre_nacionalidad);
                nacionalidad.setEstado(estado);
                //SE LLAMA AL METODO ACTUALIZAR DE LA CLASE USUARIO
                nacionalidad.actualizar();
                //SE REDIRECCIONA AL INDEX
                response.sendRedirect("nacionalidades/index.jsp");
            }
            // EN CASO DE QUE NO SE ELIMINE NI SE ACTUALICE SE GUARDA
            else if(request.getParameter("guardar")!=null) {
                
                out.println("USTED DESEA GUARDAR!!");
                String nombre_nacionalidad = request.getParameter("nombre_nacionalidad");
                nacionalidad.setNombre_nacionalidad(nombre_nacionalidad);
                nacionalidad.crear();
                response.sendRedirect("nacionalidades/index.jsp");

            }

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
