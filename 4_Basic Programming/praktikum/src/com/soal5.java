package com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class soal5 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Masukkan Teks : ");
        String kata = input.nextLine();
        System.out.println(checkpalindrome(kata));
        input.close();

         
        }
        static String checkpalindrome(String cekkata) {
        String asli = cekkata;
        String dibalik = "";
        int panjangkata = cekkata.length();
        for (int i = panjangkata - 1; i >= 0; i--) {
            dibalik += asli.charAt(i);
        }
        if (asli.equals(dibalik)) {
            return ("\nPalindrome");
        }
        else {
           return ("\nBukan Palindrome");
        }
    }

}



  



