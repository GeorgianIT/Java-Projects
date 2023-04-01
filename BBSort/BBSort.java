package BBSort;

import java.util.Random;

public class BBSort {
     void BubbleSort() {
         Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i< numbers.length ; i++){
            numbers[i] = rand.nextInt(20);
        }

         System.out.println("Before:");
         printArray(numbers);


        boolean swappedSomething = true;
        while(swappedSomething){
            swappedSomething = false;
            for (int j = 0; j < numbers.length-1; j++) {
                if(numbers[j] > numbers[j+1]){
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
                swappedSomething = true;
                }
            }
        }
        System.out.println("Print Array:");
        printArray(numbers);

    }
    public static void printArray(int[] arr){
         int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }
    }

    public static void main(String[] args) {
        BBSort ob = new BBSort();
        ob.BubbleSort();
    }
}
