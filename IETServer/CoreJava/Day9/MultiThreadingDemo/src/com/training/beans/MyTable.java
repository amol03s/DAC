package com.training.beans;
public class MyTable {
	synchronized public void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n +"*"+i+"="+(n*i));
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
