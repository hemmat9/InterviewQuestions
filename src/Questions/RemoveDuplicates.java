package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] numbers = {2,5,3,8,6,2,5,4,10,2,3,5};

        List<Integer> list = new ArrayList<>();
        for(Integer num: numbers){
            list.add(num);
        }
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }
}
