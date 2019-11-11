package com.altenfreelance;

import java.util.Arrays;

public class Main {

    public static int[] flip(int[] arr, int k){
        // Flips an array from beginning to k
        if (arr.length <= 1){
            return arr;
        }

        for(int i = 0 ; i<k/2; i++){
            int temp = arr[i];
            arr[i] = arr[k-i-1];
            arr[k-i-1] = temp;
        }
        return arr;
    }
//    public static int[] flip(int[] arr){
//        return flip(arr, arr.length);
////        return;
//    }

    public static int[] pancakeSort(int[] arr){
        for (int k = arr.length; k > 0; k--){
            // Get sub-array ( Index 0 to k)
            int[] tempArray = Arrays.copyOfRange(arr, 0, k);

            // Find index of greatest from beginning to k
            int maxIndex = maxIndex(tempArray);

            // Do a flip from beg to greatestIndex
            arr = flip(arr, maxIndex+1);
            //System.out.println("Partial flip : " + Arrays.toString(arr));

            // Do a full flip from beg to k
            arr = flip(arr, k);
            //System.out.println("fULL flip : " + Arrays.toString(arr));

        }
        return arr;
    }

    public static int maxIndex(int[] arr){
        int maxIndex = 0 ;
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
                maxIndex = i;
            }
        }
        // System.out.println("Mac index in maxIndex : " + maxIndex + " (" + maxVal +") ");

        return maxIndex;
    }


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

            int[] sorted = pancakeSort(arrToBeSorted);

            System.out.println("Sorted : " + Arrays.toString(sorted));
            System.out.println("--------------");
            System.out.println("");
        }
    }
}
