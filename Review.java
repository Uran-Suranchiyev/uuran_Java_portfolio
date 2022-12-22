package day51;

import java.io.File;
import java.io.IOException;

public class Review {
	public static void main(String[] args) {
		// File represents files and directories
		//- read meta about the file
		//- create new file or directory
		//- delete files and directories
		
		// absolute path is path from root  directory
		File file = new File("C:/Users/Beknazar/Desktop/Uran/Driver licence/I94 - Official Website12_9_22.pdf");
		System.out.println(file.exists());
		System.out.println("Size: " + file.length() + " B");
		System.out.println("--------");
		
		File fileTwo = new File("src/day03/HelloClass.java");
		System.out.println(fileTwo.exists());
		System.out.println("Size: " + fileTwo.length() + "B");
		System.out.println(fileTwo.getAbsolutePath());
		System.out.println("--------");
		
		File newFile = new File("/C:/Users/Beknazar/Desktop/day51D.txt");
		try {
			if (!newFile.exists()) {
				boolean isCreated = newFile.createNewFile();
				System.out.println("not exists");
			} else {
				System.out.println("it exists");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("--------");
		
		File newDir = new File("/C:/Users/Beknazar/Desktop/narutoRulit.txt");
		if (!newDir.exists()) {
			newDir.mkdir();
			System.out.println("new dir is created");
		}	else {
			System.out.println("dir exists");
		}
	}
		
}
