package InterviewQuestions;

public class C {

    public static int addNumbers(int num1, int num2){
        int sum=0;
        for(int i=num1; i<=num2; i++){
            sum+=i;
        }
        return sum;

    }
    public static void swapStrings(String x, String y){
       x=x+y;
       y=x.substring(0,(x).length()-y.length());
       x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        swapStrings("A", "B");
        System.out.println(addNumbers(1,100));

    }
}
