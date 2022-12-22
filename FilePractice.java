package day50;

import java.io.File;
import java.io.IOException;

public class FilePractice {
	public static void main(String[] args) {
		File myNotes = new File("C:/Users/Beknazar/eclipse-workspace/sdet-java-b7/src/day50/notes.txt");
		
		System.out.println("File exist " + myNotes.exists());
		System.out.println("File name" + myNotes.getName());
		System.out.println(myNotes.getAbsolutePath());
		System.out.println(myNotes.isFile());
		System.out.println(myNotes.isDirectory());
		System.out.println(myNotes.length());
		System.out.println(myNotes.lastModified());
		System.out.println("______________");
		
		File myNewFile = new File("C:/Users/Beknazar/eclipse-workspace/sdet-java-b7/src/day50/nameList.txt");
		if (!myNewFile.exists()) {
			try {
				System.out.println("File doesn't exist");
				System.out.println("Creating file : " + myNewFile);
				boolean isCreated  = myNewFile.createNewFile();
				System.out.println("File is created: " + isCreated);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("File is already exist");
		}
	}
}
