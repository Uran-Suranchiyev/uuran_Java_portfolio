package day51;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WritingWithOutputStream {
	public static void main(String[] args) {
		// InputStream - read
		// OutputStream - write
		
		File file = new File("resources/test.txt");
		
		try (OutputStream output = new FileOutputStream(file)) {
			output.write(54);
			output.write(53);
			 
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("Done writing");
	}
}
