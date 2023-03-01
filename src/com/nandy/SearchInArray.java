package com.nandy;

public class SearchInArray {
    public static void main(String[] args) {
        int[] nums = {2, 34, 42, 4, 6};
        int target = 4;
        int num = linearSearch(nums,target);
        System.out.println(num);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

}
