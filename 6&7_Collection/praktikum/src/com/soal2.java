package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soal2{
    static Integer[] AngkaMunculSekali(String angka) {
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for(int i = 0; i < angka.length(); i++) {
            int chars = (int)angka.charAt(i);
            count[chars - 48]++;
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            if(count[i] == 1) {
                list.add(i);
            }
        }
        Integer[] result = new Integer[list.size()]; 
        list.toArray(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(AngkaMunculSekali("76523752"))); 
        System.out.println(Arrays.toString(AngkaMunculSekali("1234123"))); 
        System.out.println(Arrays.toString(AngkaMunculSekali("1122"))); 
    }
}   
