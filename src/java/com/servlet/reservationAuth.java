/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.dao.reservationDao;
import inos.com.reservation;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AFIQ IDHAM
 */
public class reservationAuth extends HttpServlet {

    private reservationDao resDao;

    public reservationAuth() throws ClassNotFoundException, SQLException {
        super();
        resDao = new reservationDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
                
            try{
            switch(action)
            {
                case "/delete":
                    deleteReservation(request,response);
                    break;
                    
            }
            }catch(SQLException e){
                e.printStackTrace();
            }
    }

@Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        reservation res = new reservation();
        res.setName(request.getParameter("Name"));
        res.setEmail(request.getParameter("Email"));
        res.setDate(request.getParameter("Date"));
        res.setEvent(request.getParameter("Event"));
        res.setDesc(request.getParameter("Description"));
        res.setSpeakername(request.getParameter("speakername"));
            resDao.reservation(res);
            response.sendRedirect("reservation.jsp");

    }
private void deleteReservation(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException{
        String id = request.getParameter("id");
        resDao.deleteUser(id);
         response.sendRedirect("list");
    }
        
    
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
