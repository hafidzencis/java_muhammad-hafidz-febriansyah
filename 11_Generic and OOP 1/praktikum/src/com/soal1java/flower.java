package com.soal1java;

public class flower {
    public String nama;
    protected String color;
    private int num_of_petal;

    public void storeObject(String nama,String color,int num_of_petal) {
        this.nama = nama;
        this.color = color;
        this.num_of_petal = num_of_petal;
    }

    public void show_identity(){
        System.out.println("saya Bunga dengan detail, Jenis; " + nama +", color: " + color + ", num of petal: " + num_of_petal);
    }

    public static void main(String[] args) {
        flower fl = new flower();

        fl.storeObject("bangkai", "merah", 12);
        fl.show_identity();
        fl.storeObject("anggrek", "putih", 8);
        fl.show_identity();
        fl.storeObject("mawar", "merah", 3);
        fl.show_identity();
        fl.storeObject("melati", "kuning", 5);
        fl.show_identity();
    }
}
