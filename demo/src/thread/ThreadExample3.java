package thread;

class printNumbers implements Runnable{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadExample3 {

	public static void main(String[] args) {
		Runnable obj = new printNumbers();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}
