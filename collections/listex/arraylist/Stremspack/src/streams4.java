import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class streams4 {
    public static void main(String[] args) throws IOException {
        //Strams i/O as sources==== egs : FILES, BUFFERREADER,FILEREADER.
        // flatmap as intermediate operation
        //collect as terminal operation

        //----files-----
//        Files.list(Path.of("/Users/USER/Desktop"))
//                .filter(path -> new File(path.toUri()).isDirectory())
//                .forEach(System.out::println);

//          Files.lines(Path.of("/Users/USER/Downloads/Untitled.txt"))
//          .map(n->n.toUpperCase(Locale.ROOT))
//          .forEach(System.out::println);

        //------bufferreader----
      BufferedReader b= new BufferedReader(new FileReader("/Users/USER/Downloads/Untitled.txt"));
//        b.lines().forEach(System.out::println);



        Map<Object, List<String>> l = b.lines()
                .map(n -> n.split(" "))
                .flatMap(word -> Arrays.stream(word))
                        .collect(Collectors.groupingBy(word->word.length()));
                             //  Collectors.toMap(word->word, word->word.length())));
        System.out.println(l);

               // .forEach(a-> System.out.println());
//i am testing

    }
}
