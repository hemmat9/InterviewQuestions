package InterviewQuestions;

public class Calculation {
    public static void percentage(double num, double percentage){

        System.out.println(num/100*percentage);
    }
    public static void percentageAmount(double fullAmount, double amount){

        System.out.println(amount/100*fullAmount);

    }


    public static void main(String[] args) {
        percentage(2000,1);
        percentageAmount(10000,2000);
    }
}
