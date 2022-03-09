package com.soal3java;

/**
 * vehicles
 */
public class vehicles {

    protected String name;
    protected String with_engine;

    
    public String getName() {
        return name;
    }
    public String getWith_engine() {
        return with_engine;
    }
    public void setWith_engine(String with_engine) {
        this.with_engine = with_engine;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void identity_myself(){
        System.out.println("Hi, I'm Parent of All Vehicles,My Name is " + name + ", My Engine Status is " + with_engine);
    }

    
}