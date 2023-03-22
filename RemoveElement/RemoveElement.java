package RemoveElement;

public class RemoveElement {
    public void removeElement(int[] nums, int val){
        int c= 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                c++;}
        }
        System.out.println(c);
    }
}
