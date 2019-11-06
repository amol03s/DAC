package com.training.beans;
public class Circle extends Shape{
final float pi=3.142f;
  private int radius;
  public Circle(int r){
	  this.radius=r;
	  
  }
  public float area(){
          return pi*radius*radius;
  }
  
  public float perimeter(){
       return 2*pi*radius;
  }
}