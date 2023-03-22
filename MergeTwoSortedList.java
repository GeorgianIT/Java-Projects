import java.util.Arrays;

public class MergeTwoSortedList {
    public void mergeTwoList(int[] list1, int[] list2){
        int[] output = new int[list1.length + list2.length] ;
        System.arraycopy(list1, 0, output,0, list1.length);
        System.arraycopy(list2, 0, output,list1.length, list2.length);
        System.out.println(Arrays.toString(output));

    }

}
