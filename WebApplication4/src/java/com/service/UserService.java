/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.UserDao;
import com.model.Chapter;
import com.model.Course;
import com.model.Exam;
import com.model.ExamScores;
import com.model.Presentation;
import com.model.UserDetails;

/**
 *
 * @author zeek
 */
public class UserService {
    private static UserDao ud = new UserDao();
    
    public boolean isValid(UserDetails user){
        return ud.isValid(user);
    }
    
    public Iterable<Presentation> getAllPresentations(Chapter chapter){
        return ud.getAllPresentations(chapter);
    }
    
    public Iterable<Exam> getAllExamsOfCourse(Course course){
        return ud.getAllExamsOfCourse(course);
    }
    
    public Iterable<Chapter> getAllChapterOfCourse(Course course){
        return ud.getAllChapterOfCourse(course);
    }
    
    public Iterable<Course> searchCourse(String strCourseKywrd){
        return ud.searchCourse(strCourseKywrd);
    }
    
    public Iterable<ExamScores> getExamScores(UserDetails user){
        return ud.getExamScores(user);
    }
    
    public Iterable<Course> getAllCoursesAssigned(UserDetails user){
        return ud.getAllCoursesAssigned(user);
    }
    
    public void updateProfile(UserDetails user){
        ud.updateProfile(user);
    }
    
    public void updatePassword(UserDetails user){
        ud.updatePassword(user);
    }
}
