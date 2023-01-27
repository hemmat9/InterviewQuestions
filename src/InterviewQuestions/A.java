package InterviewQuestions;


public class A {
    public static void main(String[] args) {



       String [] arr = {"Java", "Python", "C++", "Javascript", "Java", "Python"};

       for(int i = 0; i<arr.length; i++){
           for(int j=i+1; j<arr.length; j++){

               if(arr[i]==arr[j]){
                   System.out.println(arr[i]+ " : is a duplicate elements in the array");
               }
           }
       }

       //grates number from the array

        int [] arr2 = {85,40005,65,85,59,1100,2};

       int max = arr2[0];
       for(int i= 0; i<arr2.length; i++){
           if(arr2[i]>max) max=arr2[i];
       }
        System.out.println(max);
        System.out.println("----------------------");

       for(int x: arr2){
           if(x%2==1){
               System.out.println("odd numbers are: "+ x);
           }
       }

       for(int x:arr2){
           if(x%2==0){
               System.out.print(x+", ");
           }
       }
        System.out.println("----------------------");

       String str = "I am fantastic";

        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.charAt(i));

        }
        System.out.println("-------------------------------------");

        String [] str3 = str.split(" ");

        for(String s:str3){
            StringBuffer sb = new StringBuffer(s);
            System.out.print(sb.reverse()+" ");
        }

    }

}

