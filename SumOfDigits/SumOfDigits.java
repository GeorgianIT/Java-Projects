package SumOfDigits;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Insert a number to calculate the sum of digits: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;


        while (num > 0){
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
