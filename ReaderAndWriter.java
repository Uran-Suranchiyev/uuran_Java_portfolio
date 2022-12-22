package day51;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		String path = "resources/OurClass.txt";
		try (BufferedReader bReader = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = bReader.readLine()) != null) {
				System.out.println(line);
				names.add(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("-------");
		String newPath = "resources/OurClassUpperCase.txt";
		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(newPath))) {
			for(String name : names) {
				bWriter.write(name.toUpperCase());
				bWriter.newLine();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
