package InterviewQuestions;

public class PrimeNumber {
    public static void main(String[] args) {
        // Write a program to know if a given number is prime or not?
        // A prime number is bigger than 1, not divisible by any number, but by itself.
        // First ten prime numbers are (2,3,5,7,11,13,17,19,23,29);

        int givenN = 5;

        boolean isPrime = true;
        if (givenN > 1) {
            for (int i = 2; i < givenN; i++) {
                if (givenN % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        System.out.printf("Given number " + givenN + " is prime? " + isPrime);
    }
}
