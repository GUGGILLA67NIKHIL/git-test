import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("nikhil");
        StringBuffer sb2 = new StringBuffer("nikhil");
        System.out.println(sb1==sb2);
        sb1.append("gugilla");
        System.out.println(sb1==sb2);

        System.out.println(sb1);
        StringBuffer sb3= new StringBuffer("nikhilguggilla");
        System.out.println(sb1==sb3);


        System.out.println("+==============");

    String s1 = "nikhil";
    String s2 = "nikhil";
        System.out.println(s1==s2 );


        s1=s1+"guggilla";
        System.out.println(s1==s2);

    String s3 = "nikhilguggilla";
        System.out.println(s1==s3 );




    }
}