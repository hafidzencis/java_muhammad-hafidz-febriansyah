package com.soal1java;

public class fish {
    public String type;
    protected String feed;

    public void storeObject(String type, String feed) {
        this.type = type;
        this.feed = feed;
    }

    public void show_identity() {
        System.out.println("saya Ikan dengan detail, Jenis: " + type + ", makanan: " + feed);
    }

    public static void main(String[] args) {
        fish ik = new fish();
        ik.storeObject("Paus", "plankton");
        ik.show_identity();
        ik.storeObject("Cupang", "Cacing");
        ik.show_identity();
        ik.storeObject("arwana", "jangkrik");
        ik.show_identity();
        ik.storeObject("sapu - sapu", "pelet");
        ik.show_identity();
    }
}
