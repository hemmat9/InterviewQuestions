package InterviewQuestions;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        int a = 1;
        while(a<=10){
            System.out.println(a);
            a++;
        }

        int secretNumber =5;
        Scanner scan = new Scanner(System.in);
        int guessedNumber;
        do{
            System.out.println("please guess my secrete number");
            guessedNumber=scan.nextInt();
        }while(secretNumber!=guessedNumber);
        System.out.println("you got it");
    }
}
