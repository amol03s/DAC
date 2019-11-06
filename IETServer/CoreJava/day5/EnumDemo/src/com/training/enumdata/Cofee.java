package com.training.enumdata;

public enum Cofee {
	Big(300,350.00),Medium(250,250.00),Small(150,150.00);
    private int size;
    private double price;
    private Cofee(int s,double p) {
    	size=s;
    	price=p;
    }
    public int getSize() {
    	return size;
    }
    public double getPrice(){
    	return price;
    }
}
