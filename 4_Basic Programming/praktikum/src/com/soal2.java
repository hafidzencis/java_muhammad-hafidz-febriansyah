package com;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        String kata = input.nextLine();
        System.out.println("\n"+checkkata(kata));
    }

    static boolean checkkata(String semuakarakter) {
        String kata = semuakarakter.toLowerCase();
        int hurufx = 0;
        int hurufo = 0;
        int length = kata.length();
        char[] arraychar = kata.toCharArray();
        for (int i = 0; i < length; i++) {
  
            if ( 'x' == arraychar[i]) {
                hurufx += 1;
            }
            else if ( 'o' == arraychar[i] ) {
                hurufo += 1;
            }            
        }
        if ( hurufx == hurufo) {
            return true;
        } else {
            return false;
        }
        
    }


}
