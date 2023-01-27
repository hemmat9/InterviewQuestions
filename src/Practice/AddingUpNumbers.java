package Practice;

import java.util.Random;

public class AddingUpNumbers {

    public static void main(String[] args) {
        //1-100 1+2+3+4+5.....+100
       // System.out.println(AddNumbers(1,10));//1+3+5+7+9


    }

    static int AddNumbers(int start, int end){

        int sum=0;
        for (int i = start; i <= end ; i++) {
                sum+=i;
        }
       return sum;
    }
}
