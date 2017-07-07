package edu.learn.multipleExceptions.java7;

import java.io.*;

public class FileHandling {
	
	@SuppressWarnings("resource")
	public  void MultipleException() throws IOException{
		char[] in = new char[50];
		try{
			
			File f = new File("data.txt");
			FileWriter fw = new FileWriter(f);
			if(f.exists())
				fw.write("Hello Miss Kaddu");
			else
				throw new MyException("file does not exist");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(f);
			fr.read(in);
			for (char c : in) 
				System.out.print(c);
			fr.close();
			throw new MyException2("file is read sucessfully");
			
			 
		}catch(MyException | MyException2 e){
			
		}
	}

}
