package com.training.beans;
import com.training.interfaces.*;
  public class Triangle extends Shape implements Standard1{
  private int base,s1,s2,height;
  
  public Triangle(int b,int s1,int s2,int h){
	        base=b;
		this.s1=s1;
		this.s2=s2;
		height=h;
  }
  public void method1(){
	  System.out.println("This is method1");
  }
  public float area(){
          return 0.5f*base*height;
  }
  
  public float perimeter(){
       return base+s1+s2;
  }
}
