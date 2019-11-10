package com.training.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputDemo {

	public static void main(String[] args) {
		try (
			DataOutputStream dout=new DataOutputStream(new FileOutputStream("myfile.dat"));
			DataInputStream dis=new DataInputStream(new FileInputStream("myfile.dat"));){
			dout.writeDouble(34.5);
            dout.writeUTF("Kishori");
            System.out.println("writing done now read it");
            double d= dis.readDouble();
            String nm=dis.readUTF();
            System.out.println("The data : "+ d+ ","+nm);
            
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}}

}
