package com.soal5java;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Zebra extends Kandang{
    private String symbol = "Z";
    Attribute[] rText = new Attribute[]{RED_TEXT(), BOLD()};

    @Override
    public void cetakKandang(int n){
        System.out.println("|||");
        System.out.println("|" + (isOpen ? colorize(symbol, rText) : n) + "|");
        System.out.println("|||");
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

}
