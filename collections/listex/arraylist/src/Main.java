import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>(Arrays.asList(4,5,0,9,8,10));

        int avg = al.size()/2;
        System.out.println(al.subList(0,avg)+""+ al.subList(avg,al.size()));
        List<Integer> l1 = al.subList(0, avg);
        List<Integer>l2= al.subList(avg,al.size());
        System.out.println(l1);
        System.out.println(l2);
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(l1);
        list.addAll(l2);
        System.out.println(list);


//      int sum = 0;
//      for (int a: al) {
//          if (a % 2 == 0) {
//              sum += a;
//              System.out.println(sum);
//          }
//      }
//   int avg=al.size();
//    avg = sum/avg;
//        System.out.println(avg);
//


        }
    }
