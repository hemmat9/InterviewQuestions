package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReverseAnArrayList {

    public static List<String> reverse (List <String> data){

        List<String>  arr = new ArrayList<>();
        for(int i = data.size()-1; i >=0; i--){
            arr.add(data.get(i));
        }

        return arr;

    }
   public static void duplicate (List <String> data){

        List<String> arr = new ArrayList<>(data);
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i)==arr.get(j)){
                    System.out.println(arr.get(i));
                }
            }
        }
   }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(56);
        arr.add(33);


        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }

    }



}



