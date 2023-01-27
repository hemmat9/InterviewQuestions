package Questions;

import java.util.*;

public class A {

    public static boolean isPrime(int givenN){

        boolean isPrime = true;
        if(givenN>1){
            for (int i = 2; i < givenN ; i++) {
                if(givenN%i==0){
                    isPrime = false;
                    break;
                }
            }
        }else {
            isPrime =false;
        }
        return isPrime;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(10));
    }
}



