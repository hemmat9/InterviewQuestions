package InterviewQuestions;

public class FibonacciNumbers {

    public static void main(String[] args) {


        int a,b,c,d;
        a=0;
        b=1;
        d=1;

        for (int i = 1; i <=15 ; i++) {

            System.out.println(d+"): "+a+" ");
            c=a+b;
            a=b;
            b=c;
            d++;

        }
        
    }

}
