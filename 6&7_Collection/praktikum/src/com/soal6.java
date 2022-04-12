package com;

public class soal6 {
    public static void main(String[] args) {
        System.out.println(MaximumSumSubarrayOfSizeK(new Integer[]{2, 1, 5, 1, 3, 2}, 3)); 
        System.out.println();
        System.out.println(MaximumSumSubarrayOfSizeK(new Integer[]{2, 3, 4, 1, 5}, 2)); 
    }

    static int MaximumSumSubarrayOfSizeK(Integer[] arr, int k) {
        int result = 0;
        int sekarang = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i >= k) {
                sekarang = sekarang - arr[i - k] + arr[i];
            } else {
                sekarang += arr[i];
            }
            result = Math.max(sekarang, result);
        }
        return result;
    }
}
