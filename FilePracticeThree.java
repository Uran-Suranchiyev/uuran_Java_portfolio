package day50;

import java.io.File;

public class FilePracticeThree {
	public static void main(String[] args) {
		File day50 = new File("src/day50");
		
		if (day50.isDirectory()) {
			File[] files = day50.listFiles();
			
			for (File file : files) {
				System.out.println(file.getAbsolutePath());
			}
		}
		else {
			System.out.println("It is not directory");
		}
	}
}
