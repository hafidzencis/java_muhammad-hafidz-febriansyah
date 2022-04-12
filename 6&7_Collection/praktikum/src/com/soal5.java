package com;

public class soal5 {
    public static void main(String[] args) {
        System.out.println(RemoveDuplicate(new Integer[]{2, 3, 3, 3, 6, 9, 9}));
        System.out.println();
        System.out.println(RemoveDuplicate(new Integer[]{2, 2, 2, 11}));
    }

    static int RemoveDuplicate(Integer[] arr) {
        int angkaSama = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                angkaSama++;
            }
        }
        return arr.length - angkaSama;
    }
}
