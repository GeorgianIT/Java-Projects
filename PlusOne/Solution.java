package PlusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        int[] output = new int[digits.length];

        for (int i = 0; i < output.length; i++) {
            output[i] = digits[i];
        }
        output[digits.length-1] = digits[digits.length-1] +=1;

        return output;
    }
}
