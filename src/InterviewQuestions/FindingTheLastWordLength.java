package InterviewQuestions;

public class FindingTheLastWordLength {
    public static void main(String[] args) {

    String str = "    Java is   Object   Oriented   Programming   Language   ";
    String [] arr = str.trim().split(" ");

        System.out.println(arr[arr.length-1].length());
}
}