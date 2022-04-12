package com.soal5java;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Bebek extends Kandang{
    private String symbol = "B";
    Attribute[] yText = new Attribute[]{YELLOW_TEXT(), BOLD()};

    @Override
    public void cetakKandang(int n){
        System.out.println("|||");
        System.out.println("|" + (this.isOpen ? colorize(this.symbol, yText) : n) + "|");
        System.out.println("|||");
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
