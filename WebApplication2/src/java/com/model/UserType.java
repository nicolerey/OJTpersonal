package com.model;
// Generated 05 19, 15 11:49:40 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * UserType generated by hbm2java
 */
public class UserType  implements java.io.Serializable {


     private int userTypeId;
     private String userType;
     private Set<UserDetails> userDetailses = new HashSet<UserDetails>(0);

    public UserType() {
    }

	
    public UserType(int userTypeId, String userType) {
        this.userTypeId = userTypeId;
        this.userType = userType;
    }
    public UserType(int userTypeId, String userType, Set<UserDetails> userDetailses) {
       this.userTypeId = userTypeId;
       this.userType = userType;
       this.userDetailses = userDetailses;
    }
   
    public int getUserTypeId() {
        return this.userTypeId;
    }
    
    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }
    public String getUserType() {
        return this.userType;
    }
    
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public Set<UserDetails> getUserDetailses() {
        return this.userDetailses;
    }
    
    public void setUserDetailses(Set<UserDetails> userDetailses) {
        this.userDetailses = userDetailses;
    }




}


