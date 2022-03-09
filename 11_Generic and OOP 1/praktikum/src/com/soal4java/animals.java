package com.soal4java;

public class animals {
    protected String nama;
    protected String jenisMakanan;
    protected String jenisGigi;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJenisMakanan() {
        return jenisMakanan;
    }
    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }
    public String getJenisGigi() {
        return jenisGigi;
    }
    public void setJenisGigi(String jenisGigi) {
        this.jenisGigi = jenisGigi;
    }

    public void identity_myself(){
        System.out.println("Hi I'm Parent of All Animal, My Name is " + nama);
    }
}
