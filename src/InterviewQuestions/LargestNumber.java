package InterviewQuestions;

public class LargestNumber {

    public static void main(String[] args) {
        int x = 1000;
        int y = 20;
        int z = 151;

        if(x>y && x>z){
            System.out.println(x+" is the largest number");
        }else if(y>x && y>z){
            System.out.println(y+ " is the largest number");
        }else if(z>x && z>y){
            System.out.println(z +" is the largest number");
        }


    }


}
