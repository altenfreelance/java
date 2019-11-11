package com.altenfreelance;

import java.util.Arrays;

public class Sort {
    private static int[] flip(int[] arr, int k){
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

    private static int maxIndex(int[] arr){
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
}
