package com;

public class soal1 {
    
    public static int checkprimenumber(int bil) {
        long startTime = System.currentTimeMillis();
        int i = 1;
        while ( bil > i ) {
            if (bil % i == 0 && i != 1) {
                long endTime = System.currentTimeMillis();
                System.out.println("Waktu yang dibutuhkan : " + (endTime - startTime));
                return 1;
            }
            else {
                i += 1;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Waktu yang dibutuhkan : " + (endTime -startTime));
        return 0;
      
    }
    

    public static void main(String[] args) {
        
        if (checkprimenumber(1000000007) == 1 ){
            System.out.println("Bukan Bilangan Prima");
        }else{
            System.out.println("Bilangan Prima");
        }
        System.out.println();

        if (checkprimenumber(1500450271) == 1 ){
            System.out.println("Bukan Bilangan Prima");
        }else{
            System.out.println("Bilangan Prima");
        }
    }
}

    // static int checkprime(int bil){
    //     if (bil == 1) {
    //         return 0;
    //     }
    //     else if ( bil == 2) {
    //         return 1;
    //     }
    //     else if (bil > 2 && bil % 1 == 0 && bil % bil == 0 && bil % 2 != 0) {
    //         return 1;
    //     }else {
    //         return 0;
    //     }
    // }
    
    // public static void cekprime(int bil) {
    //     if (bil == 1) {
    //         System.out.println(0);
    //     }
    //     else if ( bil == 2) {
    //         System.out.println(1);
    //     }
    //     else if (bil > 2 && bil % 1 == 0 && bil % bil == 0 && bil % 2 != 0) {
    //         System.out.println(1);
    //     }
    // }
    // int x = 1000000007;
    // cekprime(x);