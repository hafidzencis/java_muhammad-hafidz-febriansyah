package com;

import java.util.ArrayList;
import java.util.List;

/**
 * soal3
 */
public class soal3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6};
        int target1 = 6;
        System.out.println(hitungTarget(arr1,target1));

        int[] arr2 = {2,5,9,11};
        int target2 = 11;
        System.out.println();

        System.out.println(hitungTarget(arr2,target2));
    }

     static List hitungTarget(int[] arr, int sum){
        List attr = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((arr[i] + arr[j]) == sum){
                   attr.add(i);
                   attr.add(j);
                }
            }
           
        }
        return attr;
    }
    
}