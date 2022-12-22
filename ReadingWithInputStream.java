package day51;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadingWithInputStream {
	//Input and Output Streams
	// - for type of files
	// - they work in binary level
	
	//Reader and Writer
	//- text based files
	public static void main(String[] args) {
		File notesFile = new File("resources/notes.txt");
//		try {
//			 notesFile.createNewFile();
//			System.out.println("File is created");
//		} catch(IOException e) {
//			System.out.println(e);
//		}
		InputStream in = null;
		
		try {
			in = new FileInputStream(notesFile);
			int b;
			while ((b = in.read()) != -1) {
				System.out.println((char)b);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}