package com.soal2java;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(("++++++++++++++++")+"CALCULATOR"+("++++++++++++++++"));
        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");

        System.out.print("Masukkan Pilihan anda:");
        int pil1 = in.nextInt();
        boolean kode = true;
        if ( pil1 == 1) {
            while (kode) {

                System.out.print("Masukkan Value 1:");
                int val1 = in.nextInt();
                System.out.print("Masukkan Value 2:");
                int val2 = in.nextInt();
                System.out.println(("++++++++++++++++")+"CALCULATOR"+("++++++++++++++++"));
                System.out.println("Please Enter Calculation Operation");
                System.out.println("1. Add Value");
                System.out.println("2. Sub Value");
                System.out.println("3. Multiply Value");
                System.out.println("4. Divide Value");
                System.out.println(("++++++++++++++++")+"CALCULATOR"+("++++++++++++++++"));
                System.out.print("Masukkan Pilihan anda:");
                int pilcal = in.nextInt();
                if (pilcal == 1) {
                    System.out.println(("++++++++++++++++")+"CALCULATOR"+("++++++++++++++++"));
                    System.out.println("Pilihan Anda " + pilcal);
                    System.out.println("Hasil : " + (val1 + val2));
                } else if ( pilcal == 2) {
                    System.out.println(("++++++++++++++++")+"CALCULATOR"+("++++++++++++++++"));
                    System.out.println("Pilihan Anda " + pilcal);
                    System.out.println("Hasil : " + (val1 - val2)); 
                } else if ( pilcal == 3) {
                    System.out.println(("++++++++++++++++")+"CALCULATOR"+("++++++++++++++++"));
                    System.out.println("Pilihan Anda " + pilcal);
                    System.out.println("Hasil : " + (val1 * val2));
                } else if ( pilcal == 4){
                    System.out.println(("++++++++++++++++")+"CALCULATOR"+("++++++++++++++++"));
                    System.out.println("Pilihan Anda " + pilcal);
                    System.out.println("Hasil : " + (val1 / val2));
                }
                kode = false;
            }
        } else if ( pil1 == 99) {
            System.exit(0);
        }
        

    }
}
