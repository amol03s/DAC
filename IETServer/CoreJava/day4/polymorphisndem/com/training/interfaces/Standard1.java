package com.training.interfaces;

public interface Standard1{
    void method1();
	int myvar=12;
	default void m2(){
	   System.out.println("This is default method");
	}
} 