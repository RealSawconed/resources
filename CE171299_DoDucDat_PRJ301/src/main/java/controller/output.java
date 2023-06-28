/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS PC
 */
public class output extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String name, birthday, gender, email, address;

            name = request.getParameter("name");
            birthday = request.getParameter("birthday");
            gender = request.getParameter("genders");
            email = request.getParameter("email");
            address = request.getParameter("address");
            String[] hobbie = request.getParameterValues("hobbies");
            System.out.println(hobbie);

            String hobbieString = "";
            for (int i = 0; i < hobbie.length; i++) {
                hobbieString += ", " + hobbie[i];
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel='stylesheet' href='css/outputStyle.css'/>");
            out.println("<title>Servlet output</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div class='container'>");
            out.println("<table>");
            
            out.println("<tr>");
            out.println("<th>id</th>");
            out.println("<th>Name</th>");
            out.println("<th>Gender</th>");
            out.println("<th>Birthdate</th>");
            out.println("<th>Email</th>");
            out.println("<th>Address</th>");
            out.println("<th>Hobbies</th>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<td>1</td>");
            out.println("<td>" + name + "</td>");
            out.println("<td>" + gender + "</td>");
            out.println("<td>" + birthday + "</td>");
            out.println("<td>" + email + "</td>");
            out.println("<td>" + address + "</td>");
            out.println("<td>" + hobbieString.substring(1) + "</td>");
            out.println("</tr>");            
            
            out.println("</table>");
            out.println("</div>");
            
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
//        processRequest(request, response);
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
