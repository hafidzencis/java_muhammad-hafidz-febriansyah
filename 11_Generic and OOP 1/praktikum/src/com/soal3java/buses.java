package com.soal3java;

public class buses extends vehicles {
    protected int wheel_count;
    protected String private_bus;


    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public String getWith_engine() {
        // TODO Auto-generated method stub
        return super.getWith_engine();
    }


    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void setWith_engine(String with_engine) {
        // TODO Auto-generated method stub
        super.setWith_engine(with_engine);
    }

    public int getWheel_count() {
        return wheel_count;
    }

    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }

    public String getPrivate_bus() {
        return private_bus;
    }

    public void setPrivate_bus(String private_bus) {
        this.private_bus = private_bus;
    }

    @Override
    public void identity_myself() {
        System.out.println("Hi, I'm Bus [" + private_bus+ "] My Name is " + name + ", My Engine Status is " + with_engine + ", I have " + wheel_count +" Wheel (s)");
    }
 

}
