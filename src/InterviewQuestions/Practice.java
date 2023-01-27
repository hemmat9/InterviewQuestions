package InterviewQuestions;

public class Practice {

    public static void main(String[] args) {

     int num = 122;//the reverse form of a value should be the same as original value/ madam== madam, 121 == 121

     StringBuilder  sb = new StringBuilder(String.valueOf(num));
     StringBuilder reverse = sb.reverse();

     int i = Integer.parseInt(reverse.toString());

     if(num==i){
         System.out.println(num+ " is a Palindrome number");
     }else {
         System.out.println(num+ " is not a Palindrome number");
     }




    }
}