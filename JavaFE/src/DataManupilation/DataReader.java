package DataManupilation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	public static void main(String []args) throws IOException {
		String line = null;
		BufferedReader data = null;
		
		try {
			data= new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File is not there!");
		}
		
		while((line = data.readLine())!=null) {
			System.out.println(line);
		}
		data.close();
	}
}
