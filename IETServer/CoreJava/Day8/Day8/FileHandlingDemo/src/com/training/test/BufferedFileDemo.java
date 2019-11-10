package com.training.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileDemo {

	public static void main(String[] args) {
		
	
			try (
				BufferedInputStream bis=new BufferedInputStream(new FileInputStream("abc.txt"));
				BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("pqr.txt",true));){
				int i=bis.read();
				while(i!=-1) {
					bout.write(i);
					i=bis.read();
				}
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		

	}

}
