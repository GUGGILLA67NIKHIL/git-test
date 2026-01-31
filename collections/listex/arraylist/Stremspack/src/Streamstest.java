import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Streamstest {
    public static void main(String[] args) {
     //List<Integer> list= List.of(1,2,5,7,8,4);
        Integer[] list= {1,3,5,7,4,8,2};

Long c= Arrays.stream(list)
        .filter(n->n%2==0)
        .sorted()
        .map(t->{
            String s="";
            for(int i=0;i<t;i++)
                s+="*";
            return s;
        })
        .peek(System.out::println)
        .count();
        System.out.println("elements in list "+c);

    }
}