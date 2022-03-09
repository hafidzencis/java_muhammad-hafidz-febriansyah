package com.soal4java;

public class main {
    public static void main(String[] args) {
        animals an = new animals();
        an.setNama("Binatang");
        an.identity_myself();

        herbivor her = new herbivor();
        her.setNama("Kambing");
        her.setJenisMakanan("tumbuhan");
        her.setJenisGigi("tumpul");
        her.identity_myself();

        her.setNama("Sapi");
        her.setJenisMakanan("tumbuhan");
        her.setJenisGigi("tumpul");
        her.identity_myself();

        carnivor car = new carnivor();
        car.setNama("Singa");
        car.setJenisMakanan("daging");
        car.setJenisGigi("tajam");
        car.identity_myself();

        car.setNama("harimau");
        car.setJenisMakanan("daging");
        car.setJenisGigi("tajam");
        car.identity_myself();

        omnivor om = new omnivor();
        om.setNama("ayam");
        om.setJenisMakanan("semua");
        om.setJenisGigi("tumpul dan tajam");
        om.identity_myself();

        om.setNama("tikus ");
        om.setJenisMakanan("semua");
        om.setJenisGigi("tumpul dan tajam");
        om.identity_myself();
    }   
}
