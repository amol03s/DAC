package com.training.thread;

import com.training.beans.Storage;

public class Producer extends Thread{
	private Storage s;

	public Producer(Storage s) {
		super();
		this.s = s;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			s.put(i);
		}
	}
	

}
