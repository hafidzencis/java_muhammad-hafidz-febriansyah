package com.soal1java;

public class cat {
    public String fur_color;
    protected int num_of_leg;
    

    public void show_identity(String color, int leg) {
        System.out.println("Saya Kucing dengan detail, Warna Bulu: "+ color +" dengan jumlah kaki : " + leg );

    }
    public static void main(String[] args) {
        cat kuc = new cat();
        kuc.show_identity("hitam", 4);
        kuc.show_identity("Putih", 3);
        
    }
}
