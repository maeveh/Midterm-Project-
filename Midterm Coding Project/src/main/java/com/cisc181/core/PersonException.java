package com.cisc181.core;


public class PersonException extends Exception {
    
    // create exception for person with afollowing attribute 
    // person, use regex???

    Person person;

    public PersonException() {
    }
    
    
   // string 
    public PersonException(String arg0) {
        super(arg0);
    }
    
   // can be thrown
    public PersonException(Throwable arg0) {
        super(arg0);
    }

    public PersonException(String arg0, Throwable arg1) {
        super(arg0, arg1);
        // TODO Auto-generated constructor stub
    }
}
