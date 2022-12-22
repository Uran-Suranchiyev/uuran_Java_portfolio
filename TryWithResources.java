package day51;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
	public static void main(String[] args) {
		File notesFile = new File("resources/notes.txt");
		// try with resources will close resources automatically
		try (InputStream in = new FileInputStream(notesFile)) {
			int b;
			while ((b = in.read()) != -1) {
				System.out.println((char)b);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
