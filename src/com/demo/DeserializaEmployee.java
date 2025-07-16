package com.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializaEmployee {

	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("F:\\Softwares\\serializationdemo.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			Object obj1 = in.readObject();
			Object obj2 = in.readObject();
			Object obj3 = in.readObject();
			
			Employee e1 = (Employee) obj1;
			Employee e2 = (Employee) obj2;
			Employee e3 = (Employee) obj3;
			
			System.out.println(e1.id + " " + e1.name);
			System.out.println(e2.id + " " + e2.name);
			System.out.println(e3.id + " " + e3.name);
			in.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
