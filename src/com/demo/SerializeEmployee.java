package com.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) {
		
		try {
			Employee emp1 = new Employee(2022, "arvi");
			Employee emp2 = new Employee(2023, "abcd");
			Employee emp3 = new Employee(2024, "xyz");
			FileOutputStream file = new FileOutputStream("F:\\Softwares\\serializationdemo.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(emp1);
			out.writeObject(emp2);
			out.writeObject(emp3);
			out.close();
			System.out.println("serializaztion is successfully done......!!!!");	
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
