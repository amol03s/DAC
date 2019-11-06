package com.training.test;

import java.util.Scanner;
import com.training.beans.*;

public class TestShapeHirarchy{
public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
           System.out.println("1.Triangle");
	   System.out.println("2.Circle");
	   System.out.println("3.Rectangle");
	   System.out.println("4.Exit");
	   System.out.println("Choice :");
	   int choice=sc.nextInt();
	   Shape s=null;
	   switch(choice){
	          case 1:
		       Triangle t=new Triangle(10,23,24,5);
				System.out.println("Area : "+t.area());
				System.out.println("Perimeter : "+t.perimeter());
		        break;
		  case 2: 
		        s=new Circle(12);
			//System.out.println("Area : "+s.area());
			//System.out.println("Perimeter : "+s.perimeter());
		        break;
		  case 3: 
		        break;
		  case 4: 
		        System.exit(0);
	   }
       System.out.println("Area : "+s.area());
       System.out.println("Perimeter : "+s.perimeter());
       
  }
}
