/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zeek
 */
public class HelloWorldServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("userName");
        String course = request.getParameter("course");
        String[] languages = request.getParameterValues("language[]");
        String fighter = request.getParameter("fighter");
        
        out.println("<pre><h1>Hello "+name+"!</h1>");
        out.println("<h2>Are you sure you're enrolled in "+course+"?</h2>");
        out.println("<h4>You need to learn this languages to pass: </h4><h3>");
        for(String lang : languages){
            out.print("*"+lang+" ");
        }
        out.println("</h3>");
        if(fighter.equals("Manny")){
            out.println("Winner of fight is "+fighter+"!");
        }
        else{
            out.println("Loser of fight is "+fighter+"!");
        }
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }
    
    public void init() throws ServletException{
    
    }
    
    public void destroy(){
        
    }
}
