package InterviewQuestions;

public class MaxChar {

    public static int maxNumber(int [] array){

        int maxNum=0;
        for(Integer n :array){
            if(maxNum<n) maxNum=n;
        }
        return maxNum;
    }

    public static void main(String[] args) {

      int [] b = {2,5,6,9,8,7,45,1,4,1222};

        System.out.println(maxNumber(b));
        }

    }

