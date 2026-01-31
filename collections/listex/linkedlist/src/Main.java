import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>(Arrays.asList("baby", "ball", "sampoo", "baby", "sampoo", "baby"));
        List<String> s = new LinkedList<>();
        List<String> u = new LinkedList<>();
        int high = 0;




        for (String l : ll) {


            if (!s.contains(l)) {

                int count = Collections.frequency(ll, l);
                if (count >1) {
                    high = count;

                    System.out.println(l + " - " + count + " times");

                }
                s.add(l);
    }
}
    }
            }


//      ll.add("n");
//      ll.add("i");
//      ll.add(0, "k");
//        System.out.println(ll);


