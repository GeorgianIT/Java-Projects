package SumOfElementsInArray;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int a[] = {5,4,1,6,8};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int sum2 = 0;
        for (int value: a) {
            sum2 += value;
        }
        System.out.println("The sum is: " + sum + " " + sum2);
    }
}
