package com.training.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		List<Integer> ob=new ArrayList<>();
		
		List<Integer> ob1=new ArrayList<>();
		ob.add(10);
		ob.add(20);
		ob.add(10);
		ob.add(20);
		ob.add(5);
		ob.add(3);
		System.out.println(ob);
		System.out.println("Using for each ");
		for(Integer i:ob) {
			System.out.println(i);
		}
		System.out.println("using Iterator");
		Iterator<Integer> it=ob.iterator();
		while(it.hasNext()) {
			Integer x=it.next();
			System.out.println(x);
		}
		ob1.add(10);
		ob1.add(20);
		ob1.add(13);
		//ob.addAll(ob1);
		int pos=ob.indexOf(10);
		System.out.println(pos+"--->"+ob.get(pos));
		int pos1=ob.lastIndexOf(10);
		System.out.println(pos1+"--->"+ob.get(pos1));
		

	}

}
