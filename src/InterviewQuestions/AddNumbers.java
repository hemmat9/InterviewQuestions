package InterviewQuestions;

public class AddNumbers {
    public static void main(String[] args) {

        String str = "FarhadMohammadgul";
        int length = str.length();
        char [] arr = str.toCharArray();

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(arr[i]==arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }

        }


    }
}
