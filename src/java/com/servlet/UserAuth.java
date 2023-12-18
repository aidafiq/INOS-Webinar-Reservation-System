/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.dao.registerDao;
import inos.com.register;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AFIQ IDHAM
 */
public class UserAuth extends HttpServlet {
private registerDao regDao;
    
    public UserAuth() throws ClassNotFoundException {
        super();
        regDao = new registerDao();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("login")) {
            String username = request.getParameter("UserName");
            register reg = regDao.login(username);
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            if (reg != null) {
                HttpSession session = request.getSession();
                session.setAttribute("UserName", username);
                rd.forward(request, response);
            }
            response.sendRedirect("login.jsp");
        }else if(action.equalsIgnoreCase("logout")){
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("login.jsp");
            
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        register reg = new register();
        reg.setUserName(request.getParameter("UserName"));
        reg.setPassword(request.getParameter("password"));
        if (action.equalsIgnoreCase("edit")) {
            
        } else {
            regDao.register(reg);
        }
        response.sendRedirect("login.jsp");
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
