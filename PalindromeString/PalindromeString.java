package PalindromeString;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "MADAM E MADAM";
        String rev = "";
        int len = str.length();

        for (int i = len - 1 ; i >= 0 ; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println("Str is a palindrome string");
        } else {
            System.out.println("Str is not a palindrome string");
        }

    }
}
