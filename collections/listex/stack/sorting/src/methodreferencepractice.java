import java.util.Arrays;
import java.util.List;

public class methodreferencepractice {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("nik","Anil","satya");

        //if the method is instance (that does not have static ) then we need to create a object to call that method
        Foreachmethod fr = new Foreachmethod();
        names.forEach(fr::geek);
        //(or)
        names.forEach(new Foreachmethod()::geek);


    }
}
