package com.model;
// Generated 05 19, 15 11:49:40 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Chapter generated by hbm2java
 */
public class Chapter  implements java.io.Serializable {


     private int chapterId;
     private Course course;
     private String description;
     private Set<Presentation> presentations = new HashSet<Presentation>(0);

    public Chapter() {
    }

	
    public Chapter(int chapterId, Course course, String description) {
        this.chapterId = chapterId;
        this.course = course;
        this.description = description;
    }
    public Chapter(int chapterId, Course course, String description, Set<Presentation> presentations) {
       this.chapterId = chapterId;
       this.course = course;
       this.description = description;
       this.presentations = presentations;
    }
   
    public int getChapterId() {
        return this.chapterId;
    }
    
    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<Presentation> getPresentations() {
        return this.presentations;
    }
    
    public void setPresentations(Set<Presentation> presentations) {
        this.presentations = presentations;
    }




}


