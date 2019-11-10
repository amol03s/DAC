package com.training.test;

import com.training.beans.MyTable;
import com.training.thread.MyThread;

public class TestThrad {

	public static void main(String[] args) {
		MyTable t=new MyTable();
		MyTable u=new MyTable();
		MyThread th1=new MyThread(t,5);
		MyThread th2=new MyThread(u,7);
		Thread t1=new Thread(th1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("Thread 1");
		Thread t2=new Thread(th2);
		t1.start();
		t2.start();
		try {
			t1.join(300);
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Main ends here");
	}

}
