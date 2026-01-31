import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        //this below part is to create a properties file
        File file = new File("dbConfig.properties");
        //check it exits or not if not hthen create
        if(!file.exists()){
            file.createNewFile();

        }
        System.out.println(file.exists());
        //after creating adding properties into the file
        Properties pro= new Properties();
        pro.setProperty("url","localhost");
        pro.setProperty("username","nikhil");
        pro.setProperty("passwprd","Nikhil@1234");
 //to accesss the file we need to create the below object
        FileOutputStream f= new FileOutputStream(file);

        pro.store(f," new properties is created ");
      Set<String> keys= pro.stringPropertyNames();
        System.out.println(keys);
    }
}