package day50;

import java.io.File;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) {
		File sdet = new File("src/day50/sdet");
		File target = new File("src/day50/sdet/target");
		target.mkdir();
		File src = new File("src/day50/sdet/src");
		src.mkdir();
		try {
			File test = new File(target.getAbsolutePath() + "/test.txt");
			test.createNewFile();
			
			File hello = new File(src.getAbsolutePath() + "/hello.txt");
			hello.createNewFile();
			
			File oop = new File(src.getAbsolutePath() + "/oop.txt");
			oop.createNewFile();
			
			File pom = new File(sdet.getAbsolutePath() + "/pom.xml");
			pom.createNewFile();
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
