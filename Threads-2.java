/*package whatever //do not write package name here */

import java.io.*;
import java.lang.Thread;
import java.lang.Runnable;

class GFG {
	public static void main (String[] args) {
		
		Thread thread1 = new Thread(() -> {
		    System.out.println("Inside new thread1");
		});
		
		Thread thread2 = new Thread(() -> {
		    System.out.println("Inside new thread2");
		});
		
		//thread.setDaemon(true);
		thread2.setPriority(7); // 1-10
		thread1.setPriority(4);
		thread1.start();
		thread2.start();
		
		System.out.println("Inside main thread");
	}
}