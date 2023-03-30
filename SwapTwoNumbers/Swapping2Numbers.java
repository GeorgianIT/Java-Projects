package SwapTwoNumbers;

public class Swapping2Numbers {
        public static void main(String[] args) {

            int a = 10, b = 20;
            System.out.println("Before swapping values are.." + a + " " + b);

            //Logic 1- Third variable
//            int aux = a;
//            a = b;
//            b = aux;
//            System.out.println("After swapping values are.." + a + " " + b);

            //Logic 2 - use + & - without using third variable
//            a = a + b; // 10 + 20 = 30
//            b = a - b; // 30 - 20 = 10
//            a = a - b; // 30 - 10 = 20
//
//            System.out.println("After swapping values are.." + a + " " + b);

            //Logic 3 - use * and / without using third variable
            //work when a & b != 0

//            a = a * b; //10 * 20 = 200
//            b = a / b; //200 / 20 = 10
//            a = a / b; //200 / 10 = 20
//            System.out.println("After swapping values are.." + a + " " + b);

            //Logic 4 - bitwise XOR (^)
            // a = 10 = 1010-
            // b = 20 = 10100
//            a = a ^ b; // 10 ^ 20 = 11110 = 30
//            b = a ^ b; // 30 ^ 20 = 1010 = 10
//            a = a ^ b; // 30 ^ 10 = 10100 = 20
//            System.out.println("After swapping values are.." + a + " " + b);

            //Logic 5 - Single Statement
//            b = a + b - (a = b); //execute right to left
//            //b= 30 - 20
//            //a = 20
//            //b = 10
//            System.out.println("After swapping values are.." + a + " " + b);
        }
    }

