/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author michellynk
 */
@WebServlet(urlPatterns = {"/primServlet"})
public class primServlet extends HttpServlet {

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
            out.println("<title>Check 1 - WEB 2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 style= \"color:blue; font-family:verdana; font-size:big;\" > SEPT - Setor de Educacao Profissional e Tecnologica</h1>");
            out.println("<h1 style= \"color:black; font-family:arial; font-size:small;\">Rua Dr Alcides Vieira Arcoverde, 1225</h1>");
            out.println("<table border=\"1\">"
                    + "<tr > "
                    + "<td>"
                    + "<a>Analise e desenvolvimento de sistemas</a>"
                    + "</td>"+ "<td>"+"<a href=\"http://www.sept.ufpr.br/portal/analisesistemas/\">http://www.sept.ufpr.br/portal/analisesistemas/</a>"+"</td>"+ "</tr> "
                    + "<tr> "+ "<td>"+ "<a>Comunicacao Institucional<h2>"
                    + "</td>"+ "<td>"+"<a href=\"http://www.sept.ufpr.br/portal/comunicacaoinstitucional/\">http://www.sept.ufpr.br/portal/comunicacaoinstitucional/</a>"+"</td>"+ "</tr> "
                    + "<tr> "+ "<td>"+ "<a>Gestao da qualidade<h2>"
                    + "</td>"+ "<td>"+"<a href=\"http://www.sept.ufpr.br/portal/gestaoqualidade/\">http://www.sept.ufpr.br/portal/gestaoqualidade/</a>"+"</td>"+ "</tr> "           
                    + "<tr> "+ "<td>"+ "<a>Gestao Publica<h2>"
                    + "</td>"+ "<td>"+"<a href=\"http://www.sept.ufpr.br/portal/gestaopublica/\">http://www.sept.ufpr.br/portal/gestaopublica/</a>"+"</td>"+ "</tr> "
                    + "<tr> "+ "<td>"+ "<a>Luteria<h2>"
                    + "</td>"+ "<td>"+"<a href=\"http://www.sept.ufpr.br/portal/luteria/\">http://www.sept.ufpr.br/portal/luteria/</a>"+"</td>"+ "</tr> "
                    + "<tr> "+ "<td>"+ "<a>Negocios Imobiliarios<h2>"
                    + "</td>"+ "<td>"+"<a href=\"http://200.17.200.17/negociosimobiliarios.html\">http://200.17.200.17/negociosimobiliarios.html</a>"+"</td>"+ "</tr> "
                    + "<tr> "+ "<td>"+ "<a>Producao Cenica<h2>"
                    + "</td>"+ "<td>"+"<a href=\"http://www.tpc.ufpr.br/\">http://www.tpc.ufpr.br/</a>"+"</td>"+ "</tr> "
                    + "<tr> "+ "<td>"+ "<a>Secretariado<a>"
            + "</td>"+ "<td>"+"<a href=\"http://www.sept.ufpr.br/portal/secretariado/\">http://www.sept.ufpr.br/portal/secretariado/</a>"+"</td>"+ "</tr> ");
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
