package thread;


public class MultiThreading3 extends Thread{

	 void printStatements() {
		for(int i=0;i<3;i++) {
			System.out.println("Thread Id "+Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading3 t1 = new MultiThreading3();
		MultiThreading3 t2 = new MultiThreading3();
		t1.printStatements();
		t2.printStatements();
	}

}
