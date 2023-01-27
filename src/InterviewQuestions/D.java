package InterviewQuestions;

public class D {
    public static void fibonacciNumbers(int howMany){

       int a,b,c;
       a=0;
       b=1;

       for (int i=1; i<=howMany; i++){
           System.out.println(a);
           c=a+b;
           a=b;
           b=c;
       }
    }
    public static void main(String[] args) {
        fibonacciNumbers(10);
    }
}
