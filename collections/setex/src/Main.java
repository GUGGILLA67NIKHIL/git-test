import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //hashset use haspmap to store the data . and hasmap use array of nodes(key,value)
        //hash
       // HashSet<Integer> hm = new HashSet<>();
        // linked hashset follows the inertion order it will print as you give the input bc it follows linkedhashmap amnd it follows link of nodes (key,value )
        //LinkedHashSet<Integer> hm=new LinkedHashSet<>();
        //treeset store the data in treemap it print the data in sorting order accending order as it follows binary order
        TreeSet<Integer> hm = new TreeSet<>();
        hm.add(1);
        hm.add(4);
        hm.add(8);
        hm.add(4);
        //hm.add(null);
        System.out.println(hm.subSet(0,65));
       // System.out.println(hm.isEmpty());
       // System.out.println(hm);


    }
}