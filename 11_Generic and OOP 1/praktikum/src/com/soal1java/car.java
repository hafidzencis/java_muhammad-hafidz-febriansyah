package com.soal1java;

public class car {
    public String type;
    protected String color;
    private int num_of_tire;

    public void storeObject(String nama,String color,int num_of_tire) {
        this.type = nama;
        this.color = color;
        this.num_of_tire = num_of_tire;
    }

    public void show_identity(){
        System.out.println("saya mobil dengan detail, Jenis; " + type +", color: " + color + ", num of tire: " + num_of_tire);
    }

    public static void main(String[] args) {
        car fl = new car();

        fl.storeObject("sedan", "merah", 4);
        fl.show_identity();
        fl.storeObject("truk", "hijau", 6);
        fl.show_identity();
        fl.storeObject("tronton", "coklat", 12);
        fl.show_identity();
        fl.storeObject("angkot", "kuning", 4);
        fl.show_identity();
    }
}

