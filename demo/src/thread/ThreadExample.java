package thread;

import java.util.*;
import java.lang.*;

public class ThreadExample extends Thread{

	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		Thread t1 = new ThreadExample();
		Thread t2 = new ThreadExample();
		t1.start();
		t2.start();
	}

}
