package LengthOfTheLastWord;

public class LastWordSolution {
    public void lengthOfLastWord(String s) {
        int x;
        int j = 0;
        char[] charArray = s.toCharArray();
        char space = 32;
        String[] finalString;
        x= s.lastIndexOf(" ");
        s.trim();
        for (int i = 0; i < s.length(); i++) {
            if(charArray[i] == 32 ){
                j++;
            }
        }
        finalString = s.split(" ",j+1);

        System.out.println(finalString[finalString.length-1]);
    }
}
