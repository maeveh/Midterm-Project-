package com.cisc181.core;
import java.util.UUID;



public class Section {
    // create a new clas named 'SEction"
    // has following attributes: course ID, Semseter ID, and Section ID, and Room ID
  
    // all IDs will be provate 
    private int RoomID, UUID CourseID, SemesterID, SectionID;
    
    // allowing to get room id - must be public access
    public int getRoomID() {
        return RoomID;
    }
    public void setRoomID(int roomID) {
        RoomID = roomID;
    }
    
    //SEMSTER AND COURSE ID
    public Section(Course c, Semester s, int room) {
        CourseID = c.getCourseID();
        SemesterID = s.getSemesterID();
      
    //make the ID    
    setSectionID((CourseID.toString() + SemesterID.toString()).getBytes());
    RoomID = room;
    }
        
    // attribute section ID
    public UUID getSectionID() {
        return SectionID;
    }
    public void setSectionID(UUID sectionID) {
        SectionID = sectionID;
    }
}
