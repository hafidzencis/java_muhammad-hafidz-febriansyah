package com;
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int bil1 = input.nextInt();
        System.out.print("n = ");
        int bil2 = input.nextInt();
        System.out.println("\n"+(int)(Math.pow(bil1, bil2)));
        input.close();

    }
}
