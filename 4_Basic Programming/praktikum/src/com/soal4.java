package com;
import java.util.Scanner;


public class soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int bilangan = input.nextInt();
        
        if (checkprimenumber(bilangan) == 1) {
            System.out.println("\nBukan Bilangan Prima");
        } else {
            System.out.println("\nBilangan Prima");
        }
        input.close();
    }

    static int checkprimenumber(int bil) {
        int i = 1;
        while ( i < bil) {
            if (bil % i == 0 && i != 1) {
                return 1;
            }
            else {
                i += 1;
            }
        }
        return 0;
    }
}
  