package com.training.test;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.training.thread.MyTask;

public class TestMyTask {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		ArrayList<Future<Integer>> f=new ArrayList<>();
		for(int i=1;i<=10;i=i+2) {
			Future e=es.submit(new MyTask(i,i+1));
			f.add(e);
		}
		int sum=0;
		for(Future a:f) {
			try {
				sum=sum+(Integer)a.get();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("sum : "+sum);
		es.shutdown();
	}
}
