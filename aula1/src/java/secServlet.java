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
@WebServlet(urlPatterns = {"/secServlet"})
public class secServlet extends HttpServlet {

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
        
            out.println("<title>Exercicio 2</title>");
            out.println("<style> .nome{font-family: Verdana, Geneva, Tahoma, sans-serif; color: blue} .ende{color: red;} .cidade{color:green;}</style>");
            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Exercicio 2 - Aula 3</h1>");
            
            out.println("<p class=\"nome\">Marcos Henrique Bastos</p>");
            out.println("<p class=\"ende\">(41)984608890 Rua Nicaragua, n9</p>");
            out.println("<p class=\"cidade\">Curitiba</p>");
            out.println("<a href=\"https://www.google.com/\">Google</a>");

            out.println("<p class=\"nome\">Michelly Narita Kuriyama</p>");
            out.println("<p class=\"ende\">(41)99147-7419 Rua Terra Boa, n280</p>");
            out.println("<p class=\"cidade\">Curitiba</p>");
            out.println("<a href=\"https://www.google.com/\">Google</a>");
            
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
