package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        // Using + (String concatenation) operator

        String str = "ABCDEFG";
//        String rev = "";
//        int len = str.length();
//        for (int i = len - 1; i >= 0; i--) {
//                rev = rev + str.charAt(i);
//        }
//


        //Using Character Array

//        char a[] = str.toCharArray();
//        for (int i = a.length - 1; i >= 0 ; i--) {
//            rev += a[i];
//        }

        //Using String Buffer Class

        StringBuffer sbf = new StringBuffer(str);
        StringBuffer rev = sbf.reverse();

        System.out.println("The reverse string is: " + rev);
    }
}
