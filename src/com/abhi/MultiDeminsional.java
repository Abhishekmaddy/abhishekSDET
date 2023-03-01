package com.abhi;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDeminsional {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //int[][] arr = new int[3][2];
//        System.out.println(arr.length);

        //Input
        for (int row = 0; row < arr.length; row++) {
            //for earch col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }

        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            //for earch col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//
//        }

        //output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }


        for(int[] ele : arr ){
            System.out.println(Arrays.toString(ele));
        }




    }
}
