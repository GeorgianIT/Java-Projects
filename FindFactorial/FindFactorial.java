package FindFactorial;

import java.util.Random;

public class FindFactorial {
    public static void main(String[] args) {

        Random rand = new Random();
        int num = rand.nextInt(10);
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of !"+ num + " is: " + factorial);
    }
}
