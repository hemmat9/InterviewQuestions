package InterviewQuestions;

public class FindingPrimeNumberBetween2Numbers {
    public static void addPrimeNumbers(int start, int end) {

        if (start > 1) {
            for (int i = start; i <= end; i++) {
                boolean isPrime = true;
                for (int j = start; j <i ; j++) {
                    if(i%j==0){
                        isPrime=false;
                    }
                }
                if(isPrime){
                    System.out.print(i+" ");
                }
            }
        } else {
            System.out.println("Strating number must be higher than 1");
        }
    }
    public static void main (String [] args){

        addPrimeNumbers(3,101);
    }

}
