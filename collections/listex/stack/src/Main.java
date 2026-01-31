import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /* LIFO == last in first out --- stack
      A stack is the implement class of list and extends the vector class use LIFO
         FIFO == first in first out --- queue
       */


        Stack<String> books= new Stack();
        books.push("red");
        books.push("black");
        books.push("White");
        System.out.println(books.search("White"));
        System.out.println(books.indexOf("White"));

        System.out.println(books);
       /* System.out.println(books.remove("red"));
        System.out.println(books.set(0,"yellow"));
        System.out.println(books);
        System.out.println("size of stack "+ books.size());
        System.out.println("capacity "+ books.capacity());*/
    }
}