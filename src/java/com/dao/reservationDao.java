/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.util.DBConnection;
import inos.com.reservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AFIQ IDHAM
 */
public class reservationDao {
    Connection conn;

    public reservationDao() throws ClassNotFoundException {
        conn = DBConnection.getConnection();
    }
    public int reservation(reservation res){
int result = 0;
try{
String insertQuery = "INSERT INTO reservation (Name, Email, Date, Event, Description, speakername) VALUES (?, ?, ?, ?, ?, ?)";
PreparedStatement statement = conn.prepareStatement(insertQuery);
System.out.println(statement);
            statement.setString(1, res.getName());
            statement.setString(2, res.getEmail());
            statement.setString(3, res.getDate());
            statement.setString(4, res.getEvent());
            statement.setString(5, res.getDesc());
            statement.setString(6, res.getSpeakername());
            result = statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
}
     public void deleteUser(String name) {
        try {
            PreparedStatement preparedStatement = conn
                    .prepareStatement("delete from reservation where Name=?");
            //parameters start with 1
            preparedStatement.setString(1,name);
            preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
      }
    
    public void updateUser(reservation res) {
        try {
            PreparedStatement preparedStatement = conn
                    .prepareStatement("update reservation set Name=?, Email=?, Date=?, Event=?, Description=?, speakername=?" );
            //parameters start with 1
            preparedStatement.setString(1, res.getName());
            preparedStatement.setString(2, res.getEmail());
            preparedStatement.setString(3, res.getDate());
            preparedStatement.setString(4, res.getEvent());
            preparedStatement.setString(5, res.getDesc());
            preparedStatement.setString(6, res.getSpeakername());
            preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<reservation> getAllUsers() {
        List<reservation> ress  = new ArrayList<reservation>();
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from reservation");
            while (rs.next()) {
                reservation res = new reservation();
                res.setName(rs.getString("Name"));
                res.setEmail(rs.getString("Email"));
                res.setDate(rs.getString("Date"));
                res.setEvent(rs.getString("Event"));
                res.setDesc(rs.getString("Description"));
                res.setSpeakername(rs.getString("speakername"));
                ress.add(res);
            }
        }   catch (SQLException e) {
            e.printStackTrace();
        }
        return ress;
    }
    
    public reservation getUserById(String Name) {
        reservation res = new reservation();
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(
            "select* from reservation where Name=?");
            preparedStatement.setString(1, Name);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                res.setName(rs.getString("Name"));
                res.setEmail(rs.getString("Email"));
                res.setDate(rs.getString("Date"));
                res.setEvent(rs.getString("Event"));
                res.setDesc(rs.getString("Description"));
                res.setSpeakername(rs.getString("speakername"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
}
        return res;
    }
}