package com.soal5java.soal5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board board = new Board();
        board.showMenu();
        System.out.print("Pilih menu: ");
        int pilihan = scanner.nextInt();
        if (pilihan == 1) {
            System.out.print("Masukan jumlah kandang: ");
            int jumlah = scanner.nextInt();
            board.randomizeKandang(jumlah);
            int closed = jumlah;
            do {
                board.clearScreen();
                System.out.print("PERCOBAAN BUKA:");
                board.showAllKandang();
                System.out.print("Pilih kandang yang ingin dibuka: ");
                int nomorKandang = scanner.nextInt();
                scanner.nextLine();  // clear stdin
                board.showPilihanKandang();
                String typeKandang = scanner.nextLine();
                boolean result = board.tebakKandang(nomorKandang - 1, typeKandang);
                if(result) {
                    System.out.println(ANSI_GREEN + "Tebakan Benar!" + ANSI_RESET);
                    closed--;
                } else {
                    System.out.println(ANSI_YELLOW + "Tebakan Salah" + ANSI_RESET);
                    closed = jumlah;
                    board.randomizeKandang(jumlah);
                }
                System.out.println();
            } while (closed > 0);
            System.out.println(ANSI_GREEN + "Selamat! anda menebak semua kandang" + ANSI_RESET);
        }
    }
}

class Board {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    private List<Kandang> kandangs = new ArrayList<>();

    private String[][] typeKandang = {{"K", ANSI_BLUE, "Kambing"}, {"B", ANSI_YELLOW, "Bebek"}, {"z", ANSI_RED, "Zebra"},};

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void showMenu() {
        System.out.println("----------------------------------");
        System.out.println(ANSI_BLUE + "            TEBAK KANDANG         " + ANSI_RESET);
        System.out.println("----------------------------------");
        System.out.println("1. Jumlah Kandang");
        System.out.println("99. Exit");
        System.out.println("----------------------------------");
    }

    public void randomizeKandang(int jumlah) {
        kandangs.clear();

        Random random = new Random();

        for (int i = 0; i < jumlah; i++) {
            Kandang kandang = new Kandang();
            int randValue = random.nextInt(typeKandang.length);
            kandang.buatKandang(typeKandang[randValue][0], typeKandang[randValue][1]);
            kandangs.add(kandang);
        }
    }

    public void showAllKandang() {
        for(int i = 0; i < kandangs.size(); i++) {
            Kandang kandang = kandangs.get(i);
            if(kandang.opened) {
                kandang.revealKandang();
            } else {
                kandang.lihatKandang(Integer.toString(i + 1));
            }
        }
    }

    public void showPilihanKandang() {
        System.out.println("---PILIHAN---");
        for(int i = 0; i < typeKandang.length; i++) {
            System.out.println(typeKandang[i][1] + typeKandang[i][0] + ANSI_RESET + ": " + typeKandang[i][2]);
        }
        System.out.print("Masukkan tebakan: ");
    }

    public boolean tebakKandang(int index, String tebakan) {
        Kandang kandang = kandangs.get(index);
        return kandang.bukaKandang(tebakan);
    }
}

class Kandang {
    private String type;
    private String color;
    public boolean opened;

    public static final String ANSI_RESET = "\u001B[0m";

    public boolean bukaKandang(String type) {
        boolean result = this.type.equals(type);
        if (result) this.opened = true;
        return result;
    }

    public void buatKandang(String type, String color) {
        this.type = type;
        this.color = color;
        this.opened = false;
    }

    public void lihatKandang(String symbol) {
        System.out.println("\n|||");
        System.out.println("|" + symbol + "|");
        System.out.println("|||\n");
    }

    public void revealKandang() {
        lihatKandang(color + this.type + ANSI_RESET);
    }
}
