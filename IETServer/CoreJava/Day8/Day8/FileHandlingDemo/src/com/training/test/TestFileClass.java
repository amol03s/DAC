package com.training.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileClass {
	public static void main(String[] args) {
			try (
				FileInputStream fis=new FileInputStream("abc.txt");
				FileOutputStream fout=new FileOutputStream("pqr.txt");){
				int i=fis.read();
				while(i!=-1) {
					fout.write(i);
					i=fis.read();
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
