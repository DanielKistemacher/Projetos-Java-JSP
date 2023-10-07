package servlet;

import dao.UsuarioDAO;
import entidade.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel
 */
public class loginServ extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginServ</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginServ at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
    //    processRequest(request, response);
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
       // processRequest(request, response);
        
       
        String a = request.getParameter("evento");
        
        //AUTENTICANDO LOGIN
        if (a.equals("fazerLogin")) {
            String usuarioDigitado = request.getParameter("user");
            String senhaDigitada = request.getParameter("senha");

            if (usuarioDigitado.equals("") || senhaDigitada.equals("")) {
                encaminharPagina("index.jsp", request, response);
            } else if (new UsuarioDAO().autenticarLogin(usuarioDigitado, senhaDigitada)) {
                // APROVOU LOGIN
                encaminharPagina("paginaPrincipal.jsp", request, response);
            } else {
                //RECUSOU LOGIN
                request.setAttribute("errorMessage", "Usuário ou senha inválidos.");
                encaminharPagina("login.jsp", request, response);
            }
        }
        
        
        //CADASTRANDO UM NOVO USUÁRIO
        if (a.equals("salvarUsuario")) {
            String nomeUsuario = request.getParameter("nomeUsuario");
            String senhaUsuario = request.getParameter("senhaUsuario");
            
            Usuario usuario = new Usuario();
            usuario.setNomeUsuario(nomeUsuario);
            usuario.setSenhaUsuario(senhaUsuario);
            
            if (new UsuarioDAO().salvar(usuario)) {
                encaminharPagina("login.jsp", request, response);
            }
        }
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
    
    private void encaminharPagina(String pagina, HttpServletRequest request, HttpServletResponse response){
        try {
            RequestDispatcher rd = request.getRequestDispatcher(pagina);
            rd.forward(request, response);
        } catch (Exception e) {
            System.out.println("Erro ao encaminhar: " + e);
        }
    }
}
