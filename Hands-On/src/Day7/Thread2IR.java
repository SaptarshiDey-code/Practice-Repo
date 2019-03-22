package Day7;

public class Thread2IR implements Runnable
{

	
	public static void main(String args[]) {
		System.out.println(Thread.currentThread().getName()+"--->Started");
		Runnable R=new Thread2IR();
		Thread T=new Thread(R);
		//T.run();
		T.start();
		
		System.out.println(Thread.currentThread().getName()+"--->Stopped");
	}
}

