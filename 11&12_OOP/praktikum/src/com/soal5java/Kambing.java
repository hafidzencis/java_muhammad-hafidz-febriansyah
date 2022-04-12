package com.soal5java;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Kambing extends Kandang{
    private String symbol = "K";
    Attribute[] bText = new Attribute[]{BLUE_TEXT(), BOLD()};

    @Override
    public void cetakKandang(int n){
        System.out.println("|||");
        System.out.println("|" + (this.isOpen ? colorize(this.symbol, bText) : n) + "|");
        System.out.println("|||");
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
