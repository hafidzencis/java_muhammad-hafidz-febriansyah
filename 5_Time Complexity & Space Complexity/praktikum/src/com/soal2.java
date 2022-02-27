package com;

public class soal2 {

    static int faseexpo(int bil1, int bil2){
        long startTime = System.nanoTime();
        int dikali = bil1;
        int result = bil1;
        int bil21 = bil2;
        while ( 1 < bil21) {
            result *= dikali;
            bil21 -= 1;
        }
        long endTime = System.nanoTime();
        System.out.println("Waktu yang dibutuhkan : " +(endTime -startTime));
        return result ;
    }



    public static void main(String[] args) {
        System.out.println(faseexpo(2,3));
        System.out.println();
        System.out.println(faseexpo(5,3));
        System.out.println();
        System.out.println(faseexpo(10,2));
        System.out.println();
        System.out.println(faseexpo(2,5));
        System.out.println();
        System.out.println(faseexpo(7,3));
    }   
}
