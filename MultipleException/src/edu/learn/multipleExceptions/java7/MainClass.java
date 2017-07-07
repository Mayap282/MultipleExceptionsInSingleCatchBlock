package edu.learn.multipleExceptions.java7;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		FileHandling f = new FileHandling();
		try {
			f.MultipleException();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
