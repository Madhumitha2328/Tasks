package Thread;

public class ThreadClass2 extends Thread{
@Override
	public void run() { 
	for (int i=1000;i<1100;i++) {
		System.out.println(i);
		
	}
	try {
		Thread.sleep(1000);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	for(int i=0;i<100;i++) {
		System.out.println(i);
	}
}
}
