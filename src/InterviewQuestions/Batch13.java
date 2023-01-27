package InterviewQuestions;

import java.util.Scanner;

public class Batch13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of your array: ");
        int size = scan.nextInt();
        String [] countries = new String [size];

        for(int i=0; i<size; i++){
            countries[i]= scan.nextLine();
        }
       /* for(String j:countries){
            if(j.equalsIgnoreCase("Afghanistan")) {
                System.out.println(j + ":Kabul");
            }else if(j.equalsIgnoreCase("France")) {
                System.out.println(j + ":Paris");
            }else if(j.equalsIgnoreCase("China")) {
                System.out.println(j + ":Beijing");
            }else if(j.equalsIgnoreCase("Germany"))
                System.out.println(j+":Frankfort");
        }*/

    }
}
