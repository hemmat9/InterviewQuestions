package InterviewQuestions;

public class FindingAnIntegerIsPalindromOrNot {

    public static void main(String[] args) {

       int num = 221;

       StringBuilder sb = new StringBuilder(String.valueOf(num));
       StringBuilder reverse = sb.reverse();

        int i = Integer.parseInt(reverse.toString());

        if(num==i){
            System.out.println(num+ " is a Palindrome number.");
        }else {
            System.out.println(num+ " is not a palindrome");
        }

        int num2 = 122;
        int rev = 0;
        int org_num = num;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        if(rev == org_num) {
            System.out.println(rev + " is palindrome");
        }else {
            System.out.println(rev + " is not palindrome");
        }
    }
    }
