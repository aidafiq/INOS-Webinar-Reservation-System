/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.util.DBConnection;
import inos.com.useraccount;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AFIQ IDHAM
 */
public class accountDao {
    Connection conn;

    public accountDao() throws ClassNotFoundException {
        conn = DBConnection.getConnection();
    }
    public int account(useraccount acc){
int result = 0;
try{
String insertQuery = "INSERT INTO userprofile (Name, Email, Matric, Program, Faculty) VALUES (?, ?, ?, ?, ?)";
PreparedStatement statement = conn.prepareStatement(insertQuery);
            statement.setString(1, acc.getName());
            statement.setString(2, acc.getEmail());
            statement.setString(3, acc.getMatric());
            statement.setString(4, acc.getProgram());
            statement.setString(5, acc.getFaculty());
            result = statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
}
    
    public useraccount selectUser(String name) {
        useraccount acc = null;
        try {
            String retrieveUserByid = "SELECT * FROM userprofile WHERE Name = ?";
            PreparedStatement ps = conn.prepareStatement(retrieveUserByid);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                acc = new useraccount();
                acc.setName(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return acc;
    }
}



