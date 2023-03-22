package SortingArrays;

import java.util.Arrays;

public class SortingArraysApp {
    public static void main(String[] args) {
        MergeArrays finalArray = new MergeArrays();
        int[] lamfacut = finalArray.mergeArrays(new int[]{1, 5, 7, 4, 3, 6, 8},new int[]{5, 2, 6, 7, 2, 5});

        BubbleSortAlgorithm ceplm = new BubbleSortAlgorithm();
        ceplm.bubbleSort(lamfacut);


    }


}
