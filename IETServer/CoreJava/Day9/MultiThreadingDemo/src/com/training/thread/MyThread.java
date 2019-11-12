package com.training.thread;
import com.training.beans.MyTable;
public class MyThread implements  Runnable{
	private MyTable ob;
	private int n;
	public MyThread(MyTable ob, int n){
		this.ob = ob;
		this.n = n;
	}
	public void run() {
		ob.printTable(n);
	}
}






