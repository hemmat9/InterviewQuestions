package InterviewQuestions;

public class PrintNumberFrom2DArray {
    public static void main(String[] args) {
        double [][] numbers = {
                {1.4,2.0,3.3,2.0},
                {4.0,1.5,6.1,1.0},
                {1.2,3.1,4.0,1.6}
        };


        for (int i = 0; i < numbers.length; i++) {
            double sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {

                sum+=numbers[i][j];
            }
            System.out.println(sum);
        }

        }
    }

