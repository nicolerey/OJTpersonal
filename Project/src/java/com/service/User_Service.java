/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.User_DAO;
import com.model.CourseBean;
import com.model.UserBean;

/**
 *
 * @author zeek
 */
public class User_Service {
    private User_DAO ud = new User_DAO();
    
    public Iterable<CourseBean> getAllCourses(UserBean ub){
        return ud.getAllCourses(ub);
    }
}
