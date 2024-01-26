package thread;

public class ThreadExample2 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Runnable obj = new ThreadExample2();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}
