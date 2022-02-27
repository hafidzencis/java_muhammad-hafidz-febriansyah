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
