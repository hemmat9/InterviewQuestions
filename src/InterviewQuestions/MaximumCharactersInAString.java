package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class MaximumCharactersInAString {


    public static void main(String[] args) {

        String str = "aabdddndddddddbklmauuuuuuuuuuuuuuuuuuuuuuuuuaatt";

        //logic map(a, 5)
        char[] charArray = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();

        for (Character ch : charArray) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';
        System.out.println("Maximum repeated character in String: ");
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (maxCount < entry.getValue()) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar + "=" + maxCount);

/*        int maxCount =0;
        char maxChar =' ';
        for(Map.Entry<Character, Integer> entry:charMap.entrySet()){
            if(maxCount< entry.getValue()){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println(maxChar+"="+maxCount);*/
    }
}


