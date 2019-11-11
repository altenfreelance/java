package test;

import com.altenfreelance.Sort;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    //
    //    {1,2,0},
    //    {0,2,3,78,34},
    //    {},
    //    {9,8,0,7},
    //    {1,2},
    //    {6},
    //    {-56,3-7,100, -2323}

    @org.junit.jupiter.api.Test
    void pancakeSortForPositiveArray() {
        int[] posArray = {3,0,2,78,34};
        int[] expectedArr = {0,2,3,34,78};
        int [] sortedArr = Sort.pancakeSort(posArray);
        Assert.assertArrayEquals(sortedArr, expectedArr);
    }

    @org.junit.jupiter.api.Test
    void pancakeSortForNegativeArray() {
        int[] negArray = {-3, -2, -78, -34};
        int[] expectedArr = {-78, -34, -3, -2};
        int [] sortedArr = Sort.pancakeSort(negArray);
        Assert.assertArrayEquals(sortedArr, expectedArr);
    }

    //    Would add in more
}