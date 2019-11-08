package com.training.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<>();
		lst.add(20);
		lst.add(30);
		lst.add(5);
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		int m=Collections.max(lst);
		System.out.println("Max : "+m);
		Collections.shuffle(lst);
		System.out.println(lst);
		Collections.shuffle(lst);
		System.out.println(lst);
		Collections.min(lst);
		System.out.println(lst);
	}

}
