package com.soal3java;

public class cars extends vehicles{

    protected int wheel_count;
    protected String engine_type;

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }
    
    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }
    @Override
    public String getWith_engine() {
        // TODO Auto-generated method stub
        return super.getWith_engine();
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
    public String getEngine_type() {
        return engine_type;
    }
    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    @Override
    public void identity_myself() {
        System.out.println("Hi, I'm Car,My Name is " + name + ", My Engine Status is " + with_engine + ", I have " + wheel_count + " Wheel(s), My Engine type = " +engine_type);
    }
}
