package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {
    public void romanToInteger(String s) {
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        int num = 0;

        for (int i = s.length() - 1; i >= 0; i--)
            if (i == s.length() - 1 || roman.get(Character.toString(s.charAt(i))) >= roman.get(Character.toString(s.charAt(i + 1))))
                num += roman.get(Character.toString(s.charAt(i)));
            else num -= roman.get(Character.toString(s.charAt(i)));

        System.out.println(num);

    }
}
