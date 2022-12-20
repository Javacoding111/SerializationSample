package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.test.model.Employee;

public class SerializeTest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp = new Employee(1, "Swarupa");
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:/users/swaru/Downloads/test");
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		outputStream.writeObject(emp);
		outputStream.close();
		fileOutputStream.close();
		
		//Deserialization
		FileInputStream fileInputSream = new FileInputStream("C:/users/swaru/Downloads/test");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputSream);
		Employee recreateObj = (Employee)inputStream.readObject();
		System.out.println(recreateObj);
		
	}

}
