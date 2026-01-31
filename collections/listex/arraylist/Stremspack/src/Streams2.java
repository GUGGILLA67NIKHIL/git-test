import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Streams2 {
    public static void main(String[] args) {
        int number = 4;
        //IntStream.of(4).filter(n->n%2==0).peek(System.out::println).count();
        //IntStream.of(1,4,2,7,3,9,2,4,6,234,678,25,24,66,88,33,88).limit(4).forEach(System.out::println);
        //if we want to do streams in a range (we dont know the numbers ) then we use range
       // IntStream.range(0,100).filter(n->n%2==0).peek(System.out::println).count();
       // IntStream.rangeClosed(0,100).filter(n->n%2==0).peek(System.out::println).count();
        //IntStream.iterate(10,n->n+3).count();
//        IntStream.generate(()->new Random()
//                .nextInt(10))//this will give infinte random number between 0 to 10
//                .limit(10)//this will  limit the numebr till first 10
//                .distinct()
//                .forEach(System.out::println);
//

        //now we use sorce is string
        String name = "nikhil \nhow are you  \nand what doing";
        //1. a string  contains characters
        //2. a string contains words
        //3. a string contains sentance or lines
        //name.lines().limit(3).distinct().forEach(System.out::println);
        name.lines().forEach(System.out::println);


    }
}
