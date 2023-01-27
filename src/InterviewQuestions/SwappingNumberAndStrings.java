package InterviewQuestions;

public class SwappingNumberAndStrings {
    public static void main(String[] args) {
        // Swap 2 numbers without temporary variable, Swap 2 strings without temporary variable.

        int a = 20;
        int b = 10;

        a = a + b;//a=30
        b = a - b;//b=20
        a = a - b;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------How to swap two strings-----------------------");

        String x = "Farhad";
        String y = "Farid";

        x = x + y;
        y = x.substring(0, (x.length() - y.length()));
        x = x.substring(y.length());
        System.out.println(x);
        System.out.println(y);

    }
}