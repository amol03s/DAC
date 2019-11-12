package com.training.thread;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer>{
    private int a,b;
    
	public MyTask(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	
}
