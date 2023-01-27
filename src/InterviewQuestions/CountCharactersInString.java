package InterviewQuestions;
import java.util.*;
public class CountCharactersInString {
    public static void main(String[] args) {
        String str = "Farhad is a QA Automation Engineer";
        char [] chars = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        //logic--> Characters are inserted as keys and the respective count is inserted as values
        //and, if the map contains the character then increase the value by 1.
        //(A, 2), (r, 1)
        for(Character ch: chars){
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);
            }else {
                charMap.put(ch, 1);
            }
        }
        //loop through only keys
        Set<Character> keys = charMap.keySet();//we take set to store unique values

        for(Character ch: keys){
            if(charMap.get(ch)>1){//this condition will only print if the key is more than 1 time, otherwise it will not print
                System.out.println("Character "+ ch+" repeated "+ charMap.get(ch)+" times");
            }
        }
        //second method
        // System.out.println(str.length()-str.replaceAll("b", "").length());
    }
}


