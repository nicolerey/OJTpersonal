package com.model;
// Generated 05 20, 15 2:11:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Exam generated by hbm2java
 */
public class Exam  implements java.io.Serializable {


     private int examId;
     private Course course;
     private String examTitle;
     private Date dateCreated;
     private Date dateEdited;
     private String questionDetails;
     private Date examDue;
     private float timeLimit;
     private Set<ExamScores> examScoreses = new HashSet<ExamScores>(0);

    public Exam() {
    }

	
    public Exam(int examId, Course course, String examTitle, Date dateCreated, Date dateEdited, String questionDetails, Date examDue, float timeLimit) {
        this.examId = examId;
        this.course = course;
        this.examTitle = examTitle;
        this.dateCreated = dateCreated;
        this.dateEdited = dateEdited;
        this.questionDetails = questionDetails;
        this.examDue = examDue;
        this.timeLimit = timeLimit;
    }
    public Exam(int examId, Course course, String examTitle, Date dateCreated, Date dateEdited, String questionDetails, Date examDue, float timeLimit, Set<ExamScores> examScoreses) {
       this.examId = examId;
       this.course = course;
       this.examTitle = examTitle;
       this.dateCreated = dateCreated;
       this.dateEdited = dateEdited;
       this.questionDetails = questionDetails;
       this.examDue = examDue;
       this.timeLimit = timeLimit;
       this.examScoreses = examScoreses;
    }
   
    public int getExamId() {
        return this.examId;
    }
    
    public void setExamId(int examId) {
        this.examId = examId;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public String getExamTitle() {
        return this.examTitle;
    }
    
    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Date getDateEdited() {
        return this.dateEdited;
    }
    
    public void setDateEdited(Date dateEdited) {
        this.dateEdited = dateEdited;
    }
    public String getQuestionDetails() {
        return this.questionDetails;
    }
    
    public void setQuestionDetails(String questionDetails) {
        this.questionDetails = questionDetails;
    }
    public Date getExamDue() {
        return this.examDue;
    }
    
    public void setExamDue(Date examDue) {
        this.examDue = examDue;
    }
    public float getTimeLimit() {
        return this.timeLimit;
    }
    
    public void setTimeLimit(float timeLimit) {
        this.timeLimit = timeLimit;
    }
    public Set<ExamScores> getExamScoreses() {
        return this.examScoreses;
    }
    
    public void setExamScoreses(Set<ExamScores> examScoreses) {
        this.examScoreses = examScoreses;
    }




}


