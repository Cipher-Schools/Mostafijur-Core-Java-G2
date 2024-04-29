
import java.lang.Thread;
import java.lang.Runnable;

/*
public class MyClass extends Thread {
    
    @Override
    public void run(){
        System.out.println("New thread created");
        System.out.println("New thread created");
    }
    
    //main thread
    public static void main(String args[]) {
        
      MyClass obj = new MyClass();
      obj.start();
      System.out.println("Inside main thread");
    }
}
*/

/*
public class MyClass implements Runnable {

    @Override
    public void run(){
        System.out.println("New thread created");
        System.out.println("New thread created");
    }
    
    //main thread
    public static void main(String args[]) {
        
      MyClass obj = new MyClass();
      Thread thread = new Thread(obj);
      thread.start();
      System.out.println("Inside main thread");
    }
}
*/


class Myclass{
    //main thread
    public static void main(String args[]) {
        
      //Runnable obj = () -> System.out.println("Inside new thread");
      
      Thread thread1 = new Thread(()->{
          
          System.out.println("Inside thread 1");
          
      });
      
      Thread thread2 = new Thread(()->{
          
          System.out.println("Inside thread 2");
          
      });
      
      thread2.setPriority(Thread.MAX_PRIORITY);
      
      //thread.setDaemon(false);
      
      thread1.start();
      thread2.start();
    }
}




