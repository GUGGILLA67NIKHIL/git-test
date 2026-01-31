import java.util.List;
import java.util.Optional;

public class optpract {

    public static void main(String[] args) {
        List<Student> st=List.of(new Student("mihara",24,"hyd"),
                new Student("madhu",21," "),
                new Student("achu",19,null),
                new Student("apple",13,null),
                new Student("anil",25,"wrgl"));
        Student students = st.get(2);
        Optional<String> address = students.getAddress();
        address.ifPresentOrElse(s -> System.out.println(s.length()),()-> System.out.println("null"));



        String name= students.getName();
        System.out.println(name);
        int roll = students.getRoll();
        System.out.println(roll);


    }
}