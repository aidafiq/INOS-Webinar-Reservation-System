/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.util.DBConnection;
import inos.com.speakeraccount;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author AFIQ IDHAM
 */
public class speakerDao {
    Connection conn;

    public speakerDao() throws ClassNotFoundException {
        conn = DBConnection.getConnection();
    }
    public int account(speakeraccount ac){
int result = 0;
try{
String insertQuery = "INSERT INTO speakerprofile (Name, Email, Phone, address, occupation) VALUES (?, ?, ?, ?, ?)";
PreparedStatement statement = conn.prepareStatement(insertQuery);
            statement.setString(1, ac.getName());
            statement.setString(2, ac.getEmail());
            statement.setString(3, ac.getPhone());
            statement.setString(4, ac.getAddress());
            statement.setString(5, ac.getOccupation());
            result = statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
}
}