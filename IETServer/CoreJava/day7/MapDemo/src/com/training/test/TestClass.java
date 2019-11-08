package com.training.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestClass {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("DAC", 200);
		hm.put("DBMS", 60);
		hm.put("DAC", 240);
		hm.put("DTISS", 50);
		hm.put("DVLSI", 40);
		hm.put("DHPCSA", 40);
		System.out.println(hm);
		
		System.out.println("Using key Set");
		Set<String> s=hm.keySet();
		System.out.println("In For Each loop KeySet is ="+hm.keySet());
		for (String s1:s) {
			if(hm.get(s1)>50)
			{
				System.out.println(s1+"---->"+hm.get(s1));
			}
		}
		/*OR*/
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			String s1=it.next();
			if(hm.get(s1)>50)
			{
				System.out.println(s1+"---->"+hm.get(s1));
			}
		}
		/*OR*/
		System.out.println("Entery Set");
        Set<Map.Entry<String,Integer>> es = hm.entrySet();
        System.out.println("IN  Map Entry "+hm.entrySet());
        for(Map.Entry<String,Integer> e:es) {
        	System.out.println(e.getKey()+"---->"+e.getValue());
        	
        }

	}

}
