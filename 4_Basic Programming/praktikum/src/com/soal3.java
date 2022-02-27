package com;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = input.nextInt();
        faktorbilangan(bilangan);
        input.close();

    }

    static void faktorbilangan(int bil) {
        for (int i = 1; i <= bil; i++) {
            if ( bil % i == 0) {
                System.out.println(i);
            }
        }
        
    }
    
    
}

