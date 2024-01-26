package thread;

class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<3;i++) {
			System.out.println("Thread ID "+Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
public class Multithreading2 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			Runnable obj = new MyRunnable();
			Thread t = new Thread(obj);
			t.start();
		}
	}

}
