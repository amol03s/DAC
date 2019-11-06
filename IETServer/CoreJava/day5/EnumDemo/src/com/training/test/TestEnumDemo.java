package com.training.test;

import com.training.enumdata.Cofee;

public class TestEnumDemo {

	public static void main(String[] args) {
		Cofee c=Cofee.Small;
		switch(c) {
		case Big:
			System.out.println("You assigned Big");
			
			break;
		case Medium:
			System.out.println("You assigned Medium");
			break;
		case Small:
			System.out.println("You assigned Small");
			break;
		}
		System.out.println("Price : "+c.getPrice());
		System.out.println("Size : "+c.getSize());
	}

}
