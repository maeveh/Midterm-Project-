package com.cisc181.core;



import java.util.Date;
import java.util.UUID;



public class Semester {
    
    // create class semester with following attribites
    // semester ID, Startdate, and enddate
 
    private UUID SemesterID;
    private Date StartDate, EndDate;

    public Semester() {
        SemesterID = UUID.randomUUID();
    }
    // making semester public for the UUID
  
    // attribute seemsterID
    public UUID getSemesterID() {
        return SemesterID;
    }
    public void setSemesterID(UUID semesterID) {
        SemesterID = semesterID;
    }
    
    
    //aatrriubte startDate
    public Date getStartDate() {
        return StartDate;
    }
    // set start date
    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    //attribute end date
    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }
}
