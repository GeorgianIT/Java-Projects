package NumberOfEvenAndOdd;

import java.util.Scanner;

public class NumberOfEvenAndOdd {
    public static void main(String[] args) {

                System.out.println("Insert a number: ");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int odd = 0;
                int even = 0;
                while (num > 0) {
                    if (((num % 10) % 2) == 0)
                    {
                        even++;
                    }
                    else{
                        odd++;
                    }
                    num = num / 10;
                }
                System.out.println("Even digits: " +even + " Odd digits: " + odd);
            }
        }
