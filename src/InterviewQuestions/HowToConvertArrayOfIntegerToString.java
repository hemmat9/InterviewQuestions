package InterviewQuestions;

import java.util.Arrays;

public class HowToConvertArrayOfIntegerToString {

    public static void main(String[] args) {


        // input primitive integer array
        int[] intArray = {1, 2, 3, 4, 5};

        String[] strArray = new String[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            strArray[i] = String.valueOf(intArray[i]);
        }

        System.out.println(Arrays.toString(strArray));
    }
}