package InterviewQuestions;

public class AMethodThatAddNumbersAndArrayNumbers {
    public static void add(int...arr) {
        int sum=0;
        for(int number: arr) {
            sum+=number;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        AMethodThatAddNumbersAndArrayNumbers.add(10,12,14,15,87,9899,999,888,555,22,444,555,45);
        int []arr= {45,78,65,98};

        AMethodThatAddNumbersAndArrayNumbers.add(arr);
    }
}
