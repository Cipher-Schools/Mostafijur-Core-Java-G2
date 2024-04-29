import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
  public static void main(String[] args) {

    /*
    File file = new File("src/main/java/test1.txt");

    try{
      System.out.println(file.createNewFile());
    }
    catch(Exception e){
      e.printStackTrace();
      System.out.println("Error");
    }
    */
   /*
    char arr[] = new char[100];

    try{
      FileReader fileReader = new FileReader("src/main/java/tes.txt");

      fileReader.read(arr);
      System.out.println(arr);

      fileReader.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }
    */

    String data = "New data added to file";

    try{
      FileWriter fileWriter = new FileWriter("src/main/java/test.txt");

      fileWriter.write(data);
      fileWriter.close();
    }
    catch(Exception e){
      e.printStackTrace();
    }

    File file = new File("src/main/java/test1.txt");

    try{
      System.out.println(file.delete());
    }
    catch(Exception e){
      e.printStackTrace();
      System.out.println("Error");
    }
  }
}

// files --> text, pdf, dat, bin -->