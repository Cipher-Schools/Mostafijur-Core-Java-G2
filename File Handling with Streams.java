import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {

    try{
      File input = new File("src/main/java/test.txt");
      File output = new File("src/main/java/test2.txt");

      FileInputStream fis = new FileInputStream(input);
      FileOutputStream fos = new FileOutputStream(output);
      int c;
      while((c = fis.read()) != -1){
        System.out.println(c);

        if(c>=48 && c<=57)
        fos.write(c);
      }

      fis.close();
      fos.close();
    }

    catch(Exception e){
      e.printStackTrace();
    }
    try{
    BufferedReader b = new BufferedReader(new FileReader("src/main/java/test.txt"));

    String line;
    while((line = b.readLine()) != null){
      System.out.println(line);
    }
    }
    catch(Exception e){
      e.printStackTrace();
    }
  /*
  try{
    Scanner sc = new Scanner(new File("src/main/java/test.txt"));

    while(sc.hasNext()){
      System.out.println(sc.next());
    }
  }

    catch(Exception e){
      e.printStackTrace();
    }
  */
    
    
  }
}

// files --> text, pdf, dat, bin -->