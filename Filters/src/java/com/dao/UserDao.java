/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.UserBean;
import com.util.DbUtil;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asi
 */
public class UserDao extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public static boolean isValid(UserBean user){
        boolean result = false;
        DbUtil db = new DbUtil();
        Connection connection = db.getConnection();
        
        try{
            PreparedStatement stmt = connection.prepareStatement("select * from users where username=? and password=?;");
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next())
                result = true;
            
            rs.close();
            stmt.close();
            db.disconnect();
        }
        catch(SQLException e){
            System.out.println("CONNECTION PROBLEM");
            e.printStackTrace();
        }
        
        return result;
    }
    
    public static int getUserID(UserBean user){
        int userID = 0;
        DbUtil db = new DbUtil();
        Connection connection = db.getConnection();
        
        try{
            Statement stmt = connection.createStatement();
            
            String query = "select userID from users where username='"+user.getUsername()+"';";
            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next())
                userID = rs.getInt("userID");
            
            rs.close();
            stmt.close();
            db.disconnect();
        }
        catch(SQLException e){
            System.out.println("CONNECTION PROBLEM");
            e.printStackTrace();
        }
        
        return userID;
    }
    
    public static List<UserBean> getAllUsers(String username){
        List<UserBean> users = new ArrayList();
        DbUtil db = new DbUtil();
        Connection connection = db.getConnection();
        
        try{
            Statement stmt = connection.createStatement();
            
            String query = "select * from users where username!='"+username+"';";            
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                UserBean ub = new UserBean();
                ub.setUserID(rs.getInt("userID"));
                ub.setUsername(rs.getString("username"));
                ub.setPassword(rs.getString("password"));
                users.add(ub);
            }
            
            rs.close();
            stmt.close();
            db.disconnect();
        }
        catch(SQLException e){
            System.out.println("CONNECTION PROBLEM");
            e.printStackTrace();
        }
        
        return users;
    }
    
    public static void deleteUser(int userid){
        DbUtil db = new DbUtil();
        Connection connection = db.getConnection();
        
        try{
            Statement stmt = connection.createStatement();
            
            String query = "delete from users where userID="+userid+";";           
            stmt.executeUpdate(query);
            
            stmt.close();
            db.disconnect();
        }
        catch(SQLException e){
            System.out.println("CONNECTION PROBLEM");
            e.printStackTrace();
        }
    }
    
    public static void addUser(UserBean ub){
        DbUtil db = new DbUtil();
        Connection connection = db.getConnection();
        
        try{
            Statement stmt = connection.createStatement();
            
            String query = "insert into users values (NULL, '"+ub.getUsername()+"', '"+ub.getPassword()+"');";           
            stmt.executeUpdate(query);
            
            stmt.close();
            db.disconnect();
        }
        catch(SQLException e){
            System.out.println("CONNECTION PROBLEM");
            e.printStackTrace();
        }
    }
    
    public static void editUser(UserBean ub){
        DbUtil db = new DbUtil();
        Connection connection = db.getConnection();
        
        try{
            Statement stmt = connection.createStatement();
            
            String query = "update users set username='"+ub.getUsername()+"', password='"+ub.getPassword()+"' where userID='"+ub.getUserID()+"';";           
            stmt.executeUpdate(query);
            
            stmt.close();
            db.disconnect();
        }
        catch(SQLException e){
            System.out.println("CONNECTION PROBLEM");
            e.printStackTrace();
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
