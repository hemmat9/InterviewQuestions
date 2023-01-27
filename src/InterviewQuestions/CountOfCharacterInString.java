package InterviewQuestions;


public class CountOfCharacterInString {

    public static void main(String[] args) {

        String[] str = {"Java", "Python", "JavaScript", "C#", "Java", "Python"};

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    System.out.println(str[i]);
                }
            }
        }
    }
}
