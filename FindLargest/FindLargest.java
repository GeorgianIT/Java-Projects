package FindLargest;

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert number a: ");
        int a = sc.nextInt();
        System.out.println("Insert number b: ");
        int b = sc.nextInt();
        System.out.println("Insert number c: ");
        int c= sc.nextInt();
        int[] arr = new int[]{a,b,c};
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The numbers are: " +arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println("The largest number is: " + max);
    }
}
