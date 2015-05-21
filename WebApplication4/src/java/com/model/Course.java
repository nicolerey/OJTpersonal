package com.model;
// Generated 05 20, 15 2:11:56 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Course generated by hbm2java
 */
public class Course  implements java.io.Serializable {


     private int courseId;
     private CourseCategory courseCategory;
     private String courseTitle;
     private String courseOutline;
     private Date dateCreated;
     private Date lastEdited;
     private Set<Exam> exams = new HashSet<Exam>(0);
     private Set<Chapter> chapters = new HashSet<Chapter>(0);
     private Set<CoursesAssigned> coursesAssigneds = new HashSet<CoursesAssigned>(0);

    public Course() {
    }

	
    public Course(int courseId, CourseCategory courseCategory, String courseTitle, String courseOutline, Date dateCreated, Date lastEdited) {
        this.courseId = courseId;
        this.courseCategory = courseCategory;
        this.courseTitle = courseTitle;
        this.courseOutline = courseOutline;
        this.dateCreated = dateCreated;
        this.lastEdited = lastEdited;
    }
    public Course(int courseId, CourseCategory courseCategory, String courseTitle, String courseOutline, Date dateCreated, Date lastEdited, Set<Exam> exams, Set<Chapter> chapters, Set<CoursesAssigned> coursesAssigneds) {
       this.courseId = courseId;
       this.courseCategory = courseCategory;
       this.courseTitle = courseTitle;
       this.courseOutline = courseOutline;
       this.dateCreated = dateCreated;
       this.lastEdited = lastEdited;
       this.exams = exams;
       this.chapters = chapters;
       this.coursesAssigneds = coursesAssigneds;
    }
   
    public int getCourseId() {
        return this.courseId;
    }
    
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public CourseCategory getCourseCategory() {
        return this.courseCategory;
    }
    
    public void setCourseCategory(CourseCategory courseCategory) {
        this.courseCategory = courseCategory;
    }
    public String getCourseTitle() {
        return this.courseTitle;
    }
    
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
    public String getCourseOutline() {
        return this.courseOutline;
    }
    
    public void setCourseOutline(String courseOutline) {
        this.courseOutline = courseOutline;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Date getLastEdited() {
        return this.lastEdited;
    }
    
    public void setLastEdited(Date lastEdited) {
        this.lastEdited = lastEdited;
    }
    public Set<Exam> getExams() {
        return this.exams;
    }
    
    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }
    public Set<Chapter> getChapters() {
        return this.chapters;
    }
    
    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }
    public Set<CoursesAssigned> getCoursesAssigneds() {
        return this.coursesAssigneds;
    }
    
    public void setCoursesAssigneds(Set<CoursesAssigned> coursesAssigneds) {
        this.coursesAssigneds = coursesAssigneds;
    }




}

