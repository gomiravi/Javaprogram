package threads;

public class ThreadByThread  extends Thread{
int time;
public ThreadByThread(int time,String name) {
	super(name);
	this.time=time;
	start();
	
}
public void run() {
	
	for(int i=0;i<5;i++)
	{
		System.out.println(Thread.currentThread());
		try {
			sleep(time);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
