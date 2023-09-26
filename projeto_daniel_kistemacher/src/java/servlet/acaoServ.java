package servlet;

import dao.EventoDAO;
import entidade.Evento;
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
public class acaoServ extends HttpServlet {

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
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
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
    
        String a = request.getParameter("a");
        
        if (a.equals("editarEvento")) {
            int idEvento = Integer.parseInt (request.getParameter("id"));
            
            Evento evento = new EventoDAO().consultarEventoId(idEvento);
            
            request.setAttribute("evento", evento);
            
            encaminharPagina("cadastroEvento.jsp", request, response);
        }
        
        if (a.equals("excluirEvento")) {
            int idEvento = Integer.parseInt (request.getParameter("id"));
            
            if (new EventoDAO().excluir(idEvento)) {
                encaminharPagina("cadastroEvento.jsp", request, response);
            } else {
                encaminharPagina("erro.jsp", request, response);
            }
        }
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
        
        String a = request.getParameter("a");
        
        if (a.equals("salvarEvento")) {
            String codigo = request.getParameter("codigo");
            String nome = request.getParameter("nome");
            String categoria_Id = request.getParameter("categoriaId");
            int categoriaId = Integer.parseInt(categoria_Id);
            String dataEvento = request.getParameter("dataEvento");
            String valorCustoEvento = request.getParameter("valorCusto");
            double valorCusto = Double.parseDouble(valorCustoEvento);
            String observacoes = request.getParameter("observacoes");
            
            if (nome.equals("") 
                || categoriaId == 0
                || dataEvento.equals("")
                || valorCustoEvento == null
                || observacoes.equals("")) {
                
                encaminharPagina("cadastroEvento.jsp", request, response);
            } else {
                Evento evento = new Evento();
                int idEvento = Integer.parseInt(codigo);
                evento.setId_evento(idEvento);
                evento.setNome_evento(nome);
                evento.setData_evento(dataEvento);
                evento.setCategoria_id(categoriaId);
                evento.setValor_custo_evento(valorCusto);
                evento.setObservacoes(observacoes);

                if (idEvento == 0) {
                    if (new EventoDAO().salvar(evento)) {
                        encaminharPagina("sucesso.jsp", request, response);
                    } else {
                        encaminharPagina("erro.jsp", request, response);
                    }
                } else {
                    if (new EventoDAO().atualizar(evento)) {
                        encaminharPagina("sucesso.jsp", request, response);
                    } else {
                        encaminharPagina("erro.jsp", request, response);
                    }
                }
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