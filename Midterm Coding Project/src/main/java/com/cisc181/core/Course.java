package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;

public class Course {
    // creat clas names Course with following attributes
    // Course ID, COurseName, Gradepoints
    // make major an attribute 
    
    private String CourseName; // string because name 
    private UUID CourseID;
    private int GradePoints;
    private Major;

    public Course(String courseName, int gradePoints, eMajor major) {
        super();
        setCourseID(UUID.randomUUID());
        CourseName = courseName;
        GradePoints = gradePoints;
        Major = major;
    }

    // attribute course ID
    public UUID getCourseID() {
        return CourseID;
    }
    public void setCourseID(UUID courseID) {
        CourseID = courseID;
    }
    
    // atrribute course name
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    // use 'get' to call grade points 
    public int getGradePoints() {
        return GradePoints;
    }
    public void setGradePoints(int gradePoints) {
        GradePoints = gradePoints;
    }

    // make major an atrtivute
    public eMajor getMajor() {
        return Major;
    }
}
