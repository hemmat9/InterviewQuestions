package InterviewQuestions;

public class HowtoFindMaxAndMinNumberFromAnArray {

    public static void maxAndMinArrayNumber(int [] array){

        int max = array[0];
        int min = array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>max) max= array[i];
            if(array[i]<min) min= array[i];
        }
        System.out.println("The maximum number in the array is: "+max);
        System.out.println("The minimum number in the array is: "+ min);
    }

    public static void main(String[] args) {

       int [] farhad = {5,6,8,7,9,78};
       maxAndMinArrayNumber(farhad);

    }

    }

