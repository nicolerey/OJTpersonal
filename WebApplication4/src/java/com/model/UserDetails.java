package com.model;
// Generated 05 20, 15 2:11:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserDetails generated by hbm2java
 */
public class UserDetails  implements java.io.Serializable {


     private int userId;
     private UserType userType;
     private String userName;
     private String password;
     private String firstName;
     private String middleName;
     private String lastName;
     private Date birthday;
     private String position;
     private String email;
     private Date dateCreated;
     private boolean recordStatus;
     private String businessUnit;
     private Set<CoursesAssigned> coursesAssigneds = new HashSet<CoursesAssigned>(0);
     private Set<ExamScores> examScoreses = new HashSet<ExamScores>(0);

    public UserDetails() {
    }

	
    public UserDetails(int userId, UserType userType, String userName, String password, String firstName, String middleName, String lastName, Date birthday, String position, String email, Date dateCreated, boolean recordStatus, String businessUnit) {
        this.userId = userId;
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.position = position;
        this.email = email;
        this.dateCreated = dateCreated;
        this.recordStatus = recordStatus;
        this.businessUnit = businessUnit;
    }
    public UserDetails(int userId, UserType userType, String userName, String password, String firstName, String middleName, String lastName, Date birthday, String position, String email, Date dateCreated, boolean recordStatus, String businessUnit, Set<CoursesAssigned> coursesAssigneds, Set<ExamScores> examScoreses) {
       this.userId = userId;
       this.userType = userType;
       this.userName = userName;
       this.password = password;
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.birthday = birthday;
       this.position = position;
       this.email = email;
       this.dateCreated = dateCreated;
       this.recordStatus = recordStatus;
       this.businessUnit = businessUnit;
       this.coursesAssigneds = coursesAssigneds;
       this.examScoreses = examScoreses;
    }
   
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public UserType getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public boolean isRecordStatus() {
        return this.recordStatus;
    }
    
    public void setRecordStatus(boolean recordStatus) {
        this.recordStatus = recordStatus;
    }
    public String getBusinessUnit() {
        return this.businessUnit;
    }
    
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }
    public Set<CoursesAssigned> getCoursesAssigneds() {
        return this.coursesAssigneds;
    }
    
    public void setCoursesAssigneds(Set<CoursesAssigned> coursesAssigneds) {
        this.coursesAssigneds = coursesAssigneds;
    }
    public Set<ExamScores> getExamScoreses() {
        return this.examScoreses;
    }
    
    public void setExamScoreses(Set<ExamScores> examScoreses) {
        this.examScoreses = examScoreses;
    }




}

