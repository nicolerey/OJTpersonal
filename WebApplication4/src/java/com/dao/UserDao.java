/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Chapter;
import com.model.Course;
import com.model.CoursesAssigned;
import com.model.Exam;
import com.model.ExamScores;
import com.model.Presentation;
import com.model.UserDetails;
import com.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Distinct;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author zeek
 */
public class UserDao {
    private HibernateUtil dbUtil;
    
    public boolean isValid(UserDetails user){
        boolean check = false;
        Session session = dbUtil.getSessionFactory().openSession();
        Iterable<UserDetails> result = session.createCriteria(UserDetails.class)
                .add(Restrictions.eq("userName", user.getUserName()))
                .add(Restrictions.eq("password", user.getPassword())).list();
        for(UserDetails ud : result)
            check = true;
        
        return check;
    }
    
    public Iterable<Presentation> getAllPresentations(Chapter chapter){
        Session session = dbUtil.getSessionFactory().openSession();
        
        return session.createCriteria(Presentation.class).add(Restrictions.eq("chapter.chapterId", chapter.getChapterId())).list();
    }
    
    public Iterable<Exam> getAllExamsOfCourse(Course course){
        Session session = dbUtil.getSessionFactory().openSession();
        
        return session.createCriteria(Exam.class).add(Restrictions.eq("course.courseId", course.getCourseId())).list();
    }
    
    public Iterable<Chapter> getAllChapterOfCourse(Course course){
        Session session = dbUtil.getSessionFactory().openSession();
        
        return session.createCriteria(Chapter.class).add(Restrictions.eq("course.courseId", course.getCourseId())).list();
    }
    
    public Iterable<Course> searchCourse(String strCourseKywrd){
        Session session = dbUtil.getSessionFactory().openSession();
        
        return session.createCriteria(Course.class).add(Restrictions.like("courseTitle", "%"+strCourseKywrd+"%")).list();
    }
    
    public Iterable<ExamScores> getExamScores(UserDetails user){
        Session session = dbUtil.getSessionFactory().openSession();
        
        return session.createCriteria(ExamScores.class).add(Restrictions.eq("userDetails.userId", user.getUserId())).list();
    }
    
    public Iterable<Course> getAllCoursesAssigned(UserDetails user){
        Session session = dbUtil.getSessionFactory().openSession();
        
        Iterable<Course> course = session.createCriteria(CoursesAssigned.class)
                .add(Restrictions.eq("userDetails.userId", user.getUserId()))
                .setProjection(Projections.distinct(Projections.property("course"))).list();
        
        return course;
    }
    
    public void updateProfile(UserDetails user){
        Session session = dbUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try{
            tx = session.beginTransaction();
            UserDetails newUser = (UserDetails)session.get(UserDetails.class, user.getUserId());
            newUser.setBirthday(user.getBirthday());
            newUser.setBusinessUnit(user.getBusinessUnit());
            newUser.setEmail(user.getEmail());
            newUser.setFirstName(user.getFirstName());
            newUser.setLastName(user.getLastName());
            newUser.setMiddleName(user.getMiddleName());
            newUser.setPosition(user.getPosition());
            newUser.setUserName(user.getUserName());
            
            session.update(newUser);
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }
    
    public void updatePassword(UserDetails user){
        Session session = dbUtil.getSessionFactory().openSession();
        Transaction tx = null;
        
        try{
            tx = session.beginTransaction();
            UserDetails newUser = (UserDetails)session.get(UserDetails.class, user.getUserId());
            newUser.setPassword(user.getPassword());
            
            session.update(newUser);
            tx.commit();
        }
        catch(HibernateException e){
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        }
        finally{
            session.close();
        }
    }
}