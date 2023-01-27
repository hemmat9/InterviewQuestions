package InterviewQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String x = "madam";

        String reverse ="";

        for (int i = x.length()-1; i >=0 ; i--) {
            reverse+=x.charAt(i);
        }
        if(x.equalsIgnoreCase(reverse)){
            System.out.println(x+ " is palindrome");
        }else {
            System.out.println(x+ " is not palindrome");
        }
    }
}
