package SwapTwoNumbers;

public class Swapping2Numbers {
        public static void main(String[] args) {

            int a = 10, b = 20;
            System.out.println("Before swapping values are.." + a + " " + b);

            //Logic 1- Third variable
            int aux = a;
            a = b;
            b = aux;
            System.out.println("After swapping values are.." + a + " " + b);
        }
    }

