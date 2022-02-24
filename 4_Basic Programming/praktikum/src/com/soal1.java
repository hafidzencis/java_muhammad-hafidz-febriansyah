package com;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        String kata = input.nextLine();
        checkkata(kata);
    }

    public static void checkkata(String semuakarakter) {
        String kata = semuakarakter.toLowerCase();
        int hurufvokal = 0;
        int hurufkonsonan = 0;
        int totalkarakter = 0;
        int length = kata.length();
        char[] arraychar = kata.toCharArray();
        for (int i = 0; i < length; i++) {
  
            if ( 'a' == arraychar[i]) {
                hurufvokal += 1;
                totalkarakter += 1;
            }
            else if ( 'e' == arraychar[i] ) {
                hurufvokal += 1;
                totalkarakter += 1;
            } 
            else if ( 'u' == arraychar[i] ){
                hurufvokal += 1;
                totalkarakter += 1;
            }
            else if ( 'i' == arraychar[i] ){
                hurufvokal += 1;
                totalkarakter += 1;
            }
            else if ( 'o' == arraychar[i] ){
                hurufvokal += 1;
                totalkarakter += 1;
            } 
            else if ( ' ' == arraychar[i] ) {
                continue;
            }
            else {
                hurufkonsonan += 1;
                totalkarakter += 1;
            }
            
        }
        System.out.println("\nJumlah Vokal : " + hurufvokal);
        System.out.println("Jumlah Konsonan : " + hurufkonsonan);
        System.out.println("Total Karakter : " + totalkarakter);
        
    }


}
