package thread;

class MultiThreadExample extends Thread{
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("The Current running Thread is"+Thread.currentThread().getId());
		}
	}
}
public class Multithreading1 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			MultiThreadExample obj = new MultiThreadExample();
			obj.start();
		}
	}

}
