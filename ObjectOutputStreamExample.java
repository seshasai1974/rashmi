package com.java.serialization.examples;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {

	public static void main(String[] args) {
		Employee emp = new Employee("Seshasai");

		emp.setAge(35);
		emp.setGender("Male");
		emp.setRole("Solution Architect");
		System.out.println(emp);
		
				
	try {
			FileOutputStream fos = new FileOutputStream("C:\\anathdaughter\\Seshasai_1.ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// write object to file
			oos.writeObject(emp);
			System.out.println("Object Serialised to a file");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		ObjectInputStream ois;
		try {
			FileInputStream is = new FileInputStream("C:\\anathdaughter\\Seshasai_1.ser");
			ois = new ObjectInputStream(is);
			Employee emp1 = (Employee) ois.readObject();
			System.out.println(emp1.toString());
			ois.close();
			is.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
		
	}

}