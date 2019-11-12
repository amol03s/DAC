package com.training.test;

import com.training.beans.Storage;
import com.training.thread.Consumer;
import com.training.thread.Producer;

public class TestProducerConsumer {
	public static void main(String[] args) {
		Storage s=new Storage();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		p.start();
		c.start();
		try {
			p.join();
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ends");
		
	}

}
