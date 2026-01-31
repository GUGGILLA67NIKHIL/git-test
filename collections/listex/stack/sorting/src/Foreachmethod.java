import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreachmethod {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 3, 6, 8, 10);

        //these two are external loops
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i));
//        }
//        for (Integer i : l){
//            System.out.println(i);
//        }
        // these is internal loop
        l.forEach( System.out::println);


    }
    public  void geek(String name){
        System.out.println("my name is "+ name);
    }
}
