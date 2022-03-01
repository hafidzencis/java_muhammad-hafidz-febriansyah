package com;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.*;
import java.util.stream.Stream;

public class soal1 {

    public static void main(String[] args) {


        String[] a = {"kazuya","jin","lee"};
        String[] b = {"kazuya", "feng"};
        
        String[] c =  {"lee", "jin"};
        String[] d = {"kazuya", "panda"};
        System.out.println(mergearray(a,b)); 
        System.out.println();
        System.out.println(mergearray(c,d)); 
    }

    static List<String> mergearray(String[] list1,String[] list2){
        List<String> listarr = new ArrayList<String>();

        String[] x =  list1;
        String[] y =  list2;

        
        for (String str1 : x) {
            listarr.add(str1);
            
        }
        for (String str2 : y) {
            listarr.add(str2);
        }
    
        return listarr;
    }

}
