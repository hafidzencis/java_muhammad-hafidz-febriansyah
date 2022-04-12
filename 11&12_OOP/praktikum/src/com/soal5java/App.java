package com.soal5java;

import com.diogonunes.jcolor.Attribute;

import java.util.Scanner;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;
import static com.diogonunes.jcolor.Attribute.YELLOW_TEXT;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board1 = new Board();
        int jumlahKandang;
        int menuEntry;
        int opened = 0;

        System.out.println("---------------------");
        Attribute[] bText = new Attribute[]{BLUE_TEXT(), BOLD()};
        System.out.println(colorize("Tebak Kandang", bText));
        System.out.println("---------------------");

        do{
            System.out.println("1. Jumlah Kandang");
            System.out.println("99. Exit");
            System.out.println("---------------------");
            System.out.print("Pilih menu:");
            menuEntry = scanner.nextInt();

            if(menuEntry == 99){
                System.out.println("Goodbye!");
                System.exit(0);
            }
            if(menuEntry != 1){
                System.out.printf("Menu %d not in range%n", menuEntry);
                System.out.println("---------------------");
            }
        }while(menuEntry != 1);

        System.out.print("Masukkan jumlah kandang:");
        jumlahKandang = scanner.nextInt();
        board1.generateKandang(jumlahKandang);

        do{
            board1.printKandang();
            System.out.print("Pilih kandang yang ingin dibuka:");
            int kandangDipilih = scanner.nextInt();
            scanner.nextLine();

            if(kandangDipilih<1 || kandangDipilih>jumlahKandang){
                System.out.println("Kandang dipilih not in range");
                continue;
            }

            System.out.println("----PILIHAN------");
            Attribute[] kFormat = new Attribute[]{BLUE_TEXT(), BOLD()};
            System.out.println(colorize("K", kFormat) + ": Kambing");
            Attribute[] zFormat = new Attribute[]{RED_TEXT(), BOLD()};
            System.out.println(colorize("Z", zFormat) + ": Zebra");
            Attribute[] bFormat = new Attribute[]{YELLOW_TEXT(), BOLD()};
            System.out.println(colorize("B", bFormat) + ": Bebek");

            System.out.print("Masukkan tebakan:");
            String tebakan = scanner.nextLine();
            if(!"KBZ".contains(tebakan)){
                System.out.println("Tebakan not in range");
                continue;
            }

            System.out.println("PERCOBAAN BUKA");
            board1.printPercobaan(kandangDipilih, tebakan);

            boolean isInside = board1.checkPercoban(kandangDipilih, tebakan);
            if(isInside){
                Attribute[] gText = new Attribute[]{GREEN_TEXT(), BOLD()};
                System.out.println(colorize("Tebakan benar", gText));
                opened++;
            }else{
                Attribute[] yText = new Attribute[]{YELLOW_TEXT(), BOLD()};
                System.out.println(colorize("Tebakan salah", yText));
                opened = 0;
            }
        }while(opened < jumlahKandang);

        board1.printKandang();

        System.out.println("Game selesai, Hurray!");

        System.exit(0);
    }
}
