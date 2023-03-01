package com.abhi;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 56, 22, 77} ;
        System.out.println(maxRange(arr, 1, 2));
    }
    static int maxRange(int[] arr, int start, int end){
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }


}
