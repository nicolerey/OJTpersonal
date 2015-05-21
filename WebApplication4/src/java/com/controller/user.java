/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.UserDao;
import com.model.Chapter;
import com.model.Course;
import com.model.CoursesAssigned;
import com.model.Exam;
import com.model.ExamScores;
import com.model.Presentation;
import com.model.UserDetails;
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
public class user extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static UserDao ud = new UserDao();
    static PrintWriter pw;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //isValid(request,response);
        //getAllPresentations(request,response);
        //getAllExamsOfCourse(request,response);
        //getAllChapterOfCourse(request, response);
        //searchCourse(request, response);
        //getExamScores(request, response);
        //getAllCourse(request, response);
        //updateProfile(request, response);
        //updatePassword(request, response);
    }
    
    public static void updatePassword(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        UserDetails user = new UserDetails();
        user.setUserId(Integer.parseInt(request.getParameter("userId")));
        user.setPassword(request.getParameter("password"));
        
        ud.updatePassword(user);
    }
    
    public static void updateProfile(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        UserDetails user = new UserDetails();
        user.setUserId(Integer.parseInt(request.getParameter("userId")));
        user.setFirstName(request.getParameter("firstname"));
        
        ud.updateProfile(user);
    }
    
    public static void getAllCourse(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        UserDetails user = new UserDetails();
        user.setUserId(Integer.parseInt(request.getParameter("userId")));
        Iterable<Course> course = ud.getAllCoursesAssigned(user);
        for(Course c : course)
            pw.print(c.getCourseTitle());
    }
    
    public static void getExamScores(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        UserDetails user = new UserDetails();
        user.setUserId(Integer.parseInt(request.getParameter("userId")));
        Iterable<ExamScores> examScores = ud.getExamScores(user);
        for(ExamScores es : examScores)
            pw.print(es.getScore());
    }
    
    public static void searchCourse(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        String courseKywrd = request.getParameter("courseKywrd");
        Iterable<Course> course = ud.searchCourse(courseKywrd);
        for(Course c : course)
            pw.print(c.getCourseTitle());
    }
    
    public static void getAllChapterOfCourse(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        Course course = new Course();
        course.setCourseId(Integer.parseInt(request.getParameter("courseId")));
        
        Iterable<Chapter> chapter = ud.getAllChapterOfCourse(course);
        for(Chapter ch : chapter)
            pw.print(ch.getDescription());
    }
    
    //
    public static void getAllExamsOfCourse(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        Course course = new Course();
        course.setCourseId(Integer.parseInt(request.getParameter("courseId")));
        
        Iterable<Exam> exam = ud.getAllExamsOfCourse(course);
        for(Exam exm : exam)
            pw.print(exm.getExamId());
    }
    
    public static void isValid(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        UserDetails user = new UserDetails();
        user.setUserName(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        
        pw.print(ud.isValid(user));
    }
    
    public static void getAllPresentations(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pw = response.getWriter();
        
        Chapter chapter = new Chapter();
        chapter.setChapterId(Integer.parseInt(request.getParameter("chapterId")));
        
        Iterable<Presentation> presentation = ud.getAllPresentations(chapter);
        for(Presentation pr : presentation)
            pw.print(pr.getFileName());
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
