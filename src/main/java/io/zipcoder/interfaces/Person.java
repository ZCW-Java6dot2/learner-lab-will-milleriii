package io.zipcoder.interfaces;

public class Person {

    private String name;
    private final long id;



    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
