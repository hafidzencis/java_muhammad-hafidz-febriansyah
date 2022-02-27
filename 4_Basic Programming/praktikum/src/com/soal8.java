package com;
import java.util.Scanner;

public class soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int bilangan = input.nextInt();
        System.out.print("Masukkan angka : ");
        int n = input.nextInt();

        for (int i = 1; i < bilangan + 1; i++) 
        {

         for (int j = 1; j < bilangan + 1; j++) 
        {
            System.out.print(i * j + "\t");
        }
            System.out.println();
        }       
        input.close();

    }
}
