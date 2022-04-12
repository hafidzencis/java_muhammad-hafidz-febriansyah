package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class soal4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ArrayUnique(new Integer[]{1, 2, 3, 4}, new Integer[]{1, 3, 5, 10, 16}))); // [2, 4]
        System.out.println(Arrays.toString(ArrayUnique(new Integer[]{3, 8}, new Integer[]{2, 8}))); 
    }

    static Integer[] ArrayUnique(Integer[] arr, Integer[] arr2) {
        HashMap<Integer, Boolean> exist = new HashMap<Integer, Boolean>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr2.length; i++) {
            exist.put(Integer.valueOf(arr2[i]), true);
        }
        for(int i = 0; i < arr.length; i++) {
            if(!exist.containsKey(arr[i])) {
                list.add(arr[i]);
            }
        }
        Integer[] result = new Integer[list.size()]; 
        list.toArray(result);
        return result;
    }
}
