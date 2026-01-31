import javax.swing.text.Style;
import java.util.*;


public class SortingPractice {
    public static void main(String[] args) {
    // Integer[] a= {1,4,2,6,9,3};
        //Comparator<Integer> rn= Comparator.comparingInt((Integer  i)->i).reversed();
        //Arrays.sort(a);
       // System.out.println(Arrays.toString(a));
//        List<Integer> l = new ArrayList<Integer>(Arrays.asList(a));
//     Collections.sort(l);
//        System.out.println(l);
        Student[] students= {
                new Student(101,"nik",95,90,90,90),
                new Student(102,"sri",92,90,90,90),
                new Student(103,"sagr",100,90,90,90),
                new Student(104,null,91,90,90,90),
        };
        Comparator<Student> cname = Comparator.comparing(s -> s.name,Comparator.nullsLast(Comparator.naturalOrder())) ;
        Comparator<Student> cm = Comparator.comparing(s -> s.marks) ;
        Comparator<Student> rn = Comparator.comparing(s -> s.n) ;
        Comparator<Student> cmm = Comparator.comparing(s -> s.maths) ;
        Comparator<Student> csci = Comparator.comparing(s -> s.science) ;
        Comparator<Student> cso= Comparator.comparing(s -> s.social) ;





//        Arrays.sort(students,cname.reversed());
//        System.out.println("sorted by name ");
//        System.out.println(Arrays.toString(students));
//        Arrays.sort(students,cname.reversed());


//        Arrays.sort(students,rn);
//        System.out.println("sorted by number ");
//        System.out.println(Arrays.toString(students));

        Arrays.sort(students,cm.thenComparing(cmm)
                .thenComparing(csci)
                .thenComparing(cso));
        System.out.println("sorted by marks ");
        System.out.println(Arrays.toString(students));




//        List<Student> l = new ArrayList<>(Arrays.asList(students));
//        Collections.sort(l);
//        System.out.println(l);
        }
    }
