package com.cisc181.core;

import java.util.UUID;
import org.hibernate.id.SelectGenerator.SelectGeneratorDelegate;



public class Enrollment {

    // class enrollemnet with attributes
    // sectionID, StudentID, enrollement ID, grade
    // double grade - setGRade
 
    
    private UUID SectionID, StudentID, EnrollmentID;
    private double Grade;
    
    // attribute enrollment with provate constructor
    private Enrollment() {
    }
    
    // public enrollment call section and student ID
    public Enrollment(UUID StudentID, UUID SectionID) {
        this.SectionID = SectionID;
        this.StudentID = StudentID;
        
        EnrollmentID = ((StudentID.toString() + SectionID.toString()).getBytes());
    }
    
    // section ID
    public UUID getSectionID() {
        return SectionID;
    }
    
    // student id
    public UUID getStudentID() {
        return StudentID;
    }
 
    //make getGrade a double
    public double getGrade() {
        return Grade;
    }
     public void setGrade(double Grade) {
        this.Grade = Grade; 
    }
}
