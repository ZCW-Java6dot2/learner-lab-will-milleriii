package io.zipcoder.interfaces;

import java.util.HashMap;

public class Classroom {
    private HashMap<String, Person> schoolRoster;

    public Classroom(){
        schoolRoster = new HashMap<String, Person>();
    }

    public HashMap<String, Person> getRoster(){
        for (Student s: TechConnect.getStudents()){
            schoolRoster.put(s.getName(), s);
        }
        for (Instructor i: ZipCodeWilmington.getInstructors()){
            schoolRoster.put(i.getName(), i);
        }
        return schoolRoster;
    }

}
