/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.servlet;

import com.dao.accountDao;
import com.dao.speakerDao;
import inos.com.speakeraccount;
import inos.com.useraccount;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AFIQ IDHAM
 */
public class AccountAuth extends HttpServlet {
private accountDao accDao;
private speakerDao spDao;

    
    public AccountAuth() throws ClassNotFoundException {
        super();
        accDao = new accountDao();
        spDao = new speakerDao();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        speakeraccount acc = new speakeraccount();
        acc.setName(request.getParameter("Name"));
        acc.setEmail(request.getParameter("Email"));
        acc.setPhone(request.getParameter("Phone"));
        acc.setAddress(request.getParameter("address"));
        acc.setOccupation(request.getParameter("occupation"));
        if (action.equalsIgnoreCase("edit")) {
            
        } else {
            spDao.account(acc);
        }
        response.sendRedirect("account.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        useraccount acc = new useraccount();
        acc.setName(request.getParameter("Name"));
        acc.setEmail(request.getParameter("Email"));
        acc.setMatric(request.getParameter("Matric"));
        acc.setProgram(request.getParameter("Program"));
        acc.setFaculty(request.getParameter("Faculty"));
        
            accDao.account(acc);
            useraccount ua = accDao.selectUser(acc.getName());
            RequestDispatcher rd = request.getRequestDispatcher("reservation.jsp");
            request.setAttribute("Name", ua);
            rd.forward(request, response);
        
       
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

