package InterviewQuestions;

public class Polindrome {
    public static void main(String[] args) {

        String original = "Ghafoor";
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {

            reverse += original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println(original + " is Polindrome");

        } else {
            System.out.println(original + " is not Polindrome");

        }



        }

    }
