package com;
import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int bilangan = input.nextInt();

        for (int i = 1; i <= bilangan; i++) {
            for (int j = bilangan; j >= i; j--) {
                    System.out.print(" ");
                }
            for (int k = 1; k <=i ; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        input.close();
        
    }
}    
