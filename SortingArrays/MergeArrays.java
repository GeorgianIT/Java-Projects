package SortingArrays;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class MergeArrays {
    public int[] mergeArrays(int[] arr1, int[] arr2){
        int[] output = new int[arr1.length+ arr2.length];

        arraycopy(arr1, 0, output,0,arr1.length);
        arraycopy(arr2,0,output,arr1.length,arr2.length);

        System.out.println(Arrays.toString(output));
        return output;
    }
}
