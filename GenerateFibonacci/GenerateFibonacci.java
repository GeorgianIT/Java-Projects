package GenerateFibonacci;

import java.util.Scanner;

public class GenerateFibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number of iterations: ");
        int iterations = sc.nextInt();
        var sum = 0;
        int count = 0;
        while(count < iterations){
            sum = a + b;
            a = b;
            b = sum;
            count++;
            System.out.print(" "+sum);
        }
    }
}
