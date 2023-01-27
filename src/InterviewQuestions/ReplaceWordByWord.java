package InterviewQuestions;

public class ReplaceWordByWord {
    public static void main(String[] args) {
        String str3 ="This is sentence I want to reverse";

        String []strArray=str3.split(" ");

        for (String word:strArray
        ) {
            StringBuilder stringBuilder1= new StringBuilder(word);
            System.out.print(stringBuilder1.reverse()+" ");
        }
        System.out.println();
        String str1 ="My name is Farhad, I am a student of Syntax";
        String [] strArray2=str1.split(" ");

        for (String word:strArray2) {
            StringBuilder stringBuilder = new StringBuilder(word);
            System.out.print(stringBuilder.reverse()+ " ");
        }
        System.out.println();
        String str2="Afghanistan is a country located in the Asia";
        String [] array=str2.split(" ");
        for (String words:array
             ) {
            StringBuilder stringBuilder = new StringBuilder(words);
            System.out.print(stringBuilder.reverse()+" ");
        }
        System.out.println();
        String str4="Ghulam jan is in the Market buying groceries";
        String [] array2=str4.split(" ");
        for (String word:array2) {
            StringBuilder stringBuilder= new StringBuilder(word);
            System.out.print(stringBuilder.reverse()+ " ");
        }

    }
}
