package com.training.beans;

public class Storage {
	private int n;
	private boolean flag;
	
	synchronized public void put(int x) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		n=x;
		System.out.println("Put : "+n);
		flag=true;
		notify();
	}
	
	synchronized public void get(){
		if(flag==false){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get : "+n);
		flag=false;
		notify();
	}
	

}
