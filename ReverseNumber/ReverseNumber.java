package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        //Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Nmber:");
        int num = sc.nextInt(); // stock the user number in num variable num = 1234

        //Using algorithm
//        int rev = 0;
//        while (num != 0){
//            rev = rev * 10 + num % 10; // 0 * 10 + 1234 % 10 = 0 + 4 = 4
//            num = num / 10;
//        }

        //Using String Buffer class

//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();


        //Using String Builder class

        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
       System.out.println("Reverse number is " + rev);
    }
}
