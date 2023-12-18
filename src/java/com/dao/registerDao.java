/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import com.util.DBConnection;
import inos.com.register;
import java.sql.*;

/**
 *
 * @author AFIQ IDHAM
 */
public class registerDao {
    private Connection con;

    public registerDao() throws ClassNotFoundException {
        con = DBConnection.getConnection();
    }

    public int register(register reg) {
        int result = 0;
        try {
            String insertQuery = "INSERT INTO login (UserName, Password) VALUES (?, ?)";
            PreparedStatement statement = con.prepareStatement(insertQuery);
            statement.setString(1, reg.getUserName());
            statement.setString(2, reg.getPassword());
            result = statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public register login(String username) {
        register reg = null;
        try {
            String retrieveUserByid = "SELECT * FROM login WHERE UserName = ?";
            PreparedStatement ps = con.prepareStatement(retrieveUserByid);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                reg = new register();
                reg.setUserName(rs.getString(1));
                reg.setPassword(rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reg;
    }
    

}
