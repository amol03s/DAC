package com.demo.test;
import java.util.Scanner;

public class TestException {
    public static float divide(int a,int b) {
    	try {
    	    float c=a/b;
    	    return c;
    	}catch(ArithmeticException e) {
    		System.out.println("b cannot be zero in divide function");
    	}
    	return 0.0f;
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number a");
		int a=sc.nextInt();
		for (int i=0;i<3;i++) {
		   System.out.println("enter number b");
		   int b=sc.nextInt();
		   try {
		      float ans=divide(a,b);
		     System.out.println("Division : "+ans );
		     break;
		   }catch(ArithmeticException e){
			   System.out.println("b cannot be zero");
		   }catch(NullPointerException e){
			   System.out.println("Object cannot be null");
		   }catch(Exception e){
			   System.out.println("Generalized exception");
			   
		   }finally {
			   System.out.println("In finally block");
		   }
		}
		System.out.println("this is end of program");
	}
}
