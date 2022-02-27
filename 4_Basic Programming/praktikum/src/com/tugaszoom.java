package com;
import java.util.Scanner;

public class tugaszoom {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan angka : ");
        // int n = input.nextInt();
        
        // if (n >= 1 && n <= 100) {
        //     if (n % 2 == 0) {
        //         if ( n <=5) {
        //             System.out.println("Not Weird");
        //         }
        //         else if ( n <= 20) {
        //             System.out.println("Weird");
        //         }
        //         else {
        //             System.out.println("NOt Weird");
        //         }
                   
        //     }
        //     else {
        //         System.out.println("Weird");
        //     }
        // } else {
        //     System.out.println("Invalid");
        // }
        tugaszoom foo = new tugaszoom();
        System.out.println(foo.RtoC(30)); 
        System.out.println(foo.CtoF(45));
    }

        // tugas 2
        private static float RtoC(float angka) {
           return ( (5*angka) / 4);
        }
        private static float CtoF(float angka) {
           return ( (9*angka) / 5 + 32);
        }
    
        private static float CtoR(float angka) {
            return ( (4*angka) / 5 ) ;
        }
    
   
}
