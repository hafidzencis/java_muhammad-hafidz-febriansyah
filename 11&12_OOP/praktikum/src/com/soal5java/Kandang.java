package com.soal5java;

public abstract class Kandang {
    String symbol;
    boolean isOpen;

    public void cetakKandang(int n){
        System.out.println("|||");
        System.out.println("|" + n + "|");
        System.out.println("|||");
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean getIsOpen(){
        return isOpen;
    }

    public void setIsOpen(boolean isOpen){
        this.isOpen = isOpen;
    }
}
