package Thread;

public class RunningClass {
         
	public static void main(String[]agrs) {
		//thread1 starting procedure
		ThreadClass tc = new ThreadClass();
		Thread tc1 = new Thread(tc);
		tc1.start();
		
		//thread2 starting procedure
		ThreadClass2 tc2 = new ThreadClass2();
		tc2.start();
		
	}
}
