import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Stream3 {

    public static void main(String[] args) {

        BinaryOperator<Integer> b= new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer f) {
                return a+f;
            }
        };
     Integer min =Stream.<Integer>builder()
                .add(2).add(8).add(16).build().parallel().filter(n->n%2==0).reduce(1,b);
        System.out.println(min);

    }
}
