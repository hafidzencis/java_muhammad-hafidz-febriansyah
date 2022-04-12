package com.soal5java;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<Kandang> listKandang = new ArrayList<>();

    void generateKandang(int n){
        for(int i=0; i<n; i++){
            int iRandom = (int)Math.floor(Math.random()*3);
            switch (iRandom) {
                case 0 ->listKandang.add(new Kambing());
                case 1 -> listKandang.add(new Zebra());
                case 2 -> listKandang.add(new Bebek());
            }
        }
    }

    void printKandang(){
        for(int i=0; i<listKandang.size(); i++){
            listKandang.get(i).cetakKandang(i+1);
            if(i!=listKandang.size()-1){
                System.out.println("---");
            }
        }
    }

    void printPercobaan(int n, String symbol){
        for(int i=0; i<listKandang.size(); i++){
            if(i == n-1){
                System.out.println("|||");
                System.out.println("|" + (symbol) + "|");
                System.out.println("|||");
            }else{
                listKandang.get(i).cetakKandang(i+1);
            }

            if(i!=listKandang.size()-1){
                System.out.println("---");
            }
        }
    }

    boolean checkPercoban(int n, String symbol){
        boolean check = listKandang.get(n-1).getSymbol().equals(symbol);
        if(check){
            listKandang.get(n-1).setIsOpen(true);
        }else{
            for(int i=0; i<listKandang.size(); i++){
                listKandang.get(i).setIsOpen(false);
            }
        }
        return check;
    }
}
