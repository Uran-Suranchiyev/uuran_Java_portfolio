package day50;

import java.io.File;

public class AbsVsRelativePath {
	public static void main(String[] args) {
		// Absolute file path is a path from root directory to your specific file
		File myNotes = new File("C:/Users/Beknazar/eclipse-workspace/sdet-java-b7/src/day50/notes.txt");
		System.out.println("File exists: " + myNotes.exists());
		System.out.println(myNotes.getAbsolutePath());
		
		// Relative file path is a path from the place where code is running to your specific file
		File myNoteRelativePath = new File("src/day50/notes.txt");
		System.out.println("File exists: " + myNoteRelativePath.exists());
		System.out.println(myNoteRelativePath.getAbsolutePath());
	}
}
