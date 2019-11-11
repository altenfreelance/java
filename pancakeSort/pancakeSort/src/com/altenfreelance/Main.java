package com.altenfreelance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Some array to be sorted

        int[][] testArrays = new int[][]{
                {4,3,8,5,1,0},
                {1,2,0},
                {0,2,3,78,34},
                {},
                {9,8,0,7},
                {1,2},
                {6},
                {-56,3-7,100, -2323}
        };

        for (int i = 0; i < testArrays.length; i++){
            int[] arrToBeSorted = testArrays[i];

            System.out.println("Original : " + Arrays.toString(arrToBeSorted));

            int[] sorted = Sort.pancakeSort(arrToBeSorted);

            System.out.println("Sorted : " + Arrays.toString(sorted));
            System.out.println("--------------");
            System.out.println("");
        }
    }
}
