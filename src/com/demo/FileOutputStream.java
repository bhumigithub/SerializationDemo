package com.demo;

import java.io.IOException;
import java.io.*;

public class FileOutputStream {

	public static void main(String[] args) {
		
		try {
			FileOutputStream write = new FileOutputStream("C:\\Users\\Owner\\Desktop\\Velocity java\\1-6-2023\\1-7-2023\\gitAndFIleDemo.txt");
			write.write(95);
			write.clone();
			System.out.println("success.......");
		}catch (IOException e) {
			System.out.println(e);
		}

	}

}
