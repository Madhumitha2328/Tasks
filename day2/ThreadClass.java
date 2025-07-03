package Thread;

public class ThreadClass implements Runnable {
	
  public void run() {
	  for(int i=0;i<100;i++) {
		  System.out.println(i);
	  }
  }
}   
  
