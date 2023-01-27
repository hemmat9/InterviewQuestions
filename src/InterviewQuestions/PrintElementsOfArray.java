package InterviewQuestions;

import java.util.Arrays;

public class PrintElementsOfArray {
    public static void main(String[] args) {


        String[] str = {"Java", "Python", "JavaScript", "C#", "Java"};

        for(int i=0; i<str.length; i++){
            for(int j=i+1; j<str.length; j++){
                if(str[i]==str[j]){
                    System.out.println(str[i]);
                }
            }
        }
    }
}