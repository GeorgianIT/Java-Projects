package PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Nmber:");
        int num = sc.nextInt(); // stock the user number in num variable num = 1234
        int org_num = num;
        //Using algorithm
        int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10; // 0 * 10 + 1234 % 10 = 0 + 4 = 4
            num = num / 10;
        }
        if(rev == org_num){
            System.out.println("The number is a Palindrome");
        } else {
            System.out.println("The number is not a Palindrome");
        }

    }
}
