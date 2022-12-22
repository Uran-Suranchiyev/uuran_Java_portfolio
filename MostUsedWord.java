package day51;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostUsedWord {
	public static void main(String[] args) {
		// 1 Get content from the files as String
		String content = getFileCountent("resources/article.txt");
		content = content.replace(",", "");
		content = content.replace(".", "");
		content = content.replace("!", "");
		content = content.replace("?", "");
		content = content.replace(")", "");
		content = content.replace("(", "");
		content = content.replace(":", "");
		content = content.toLowerCase();
		
		// 2 Split by space to get array of words
		String[] words = content.split(" ");
		// 3 put into the Map by counting each word
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				int count = wordCount.get(word);
				wordCount.put(word, count + 1);
			} else {
			wordCount.put(word, 1);
			}
		}
		//Iterate over the map and find out most used word
		System.out.println(wordCount);
		String mostUsedWord = null;
		int mostUsed = 0;
		
		for (String key : wordCount.keySet()) {
			int count = wordCount.get(key);
			if (mostUsed < count) {
				mostUsed = count;
				mostUsedWord = key;
			}
		}
		
		System.out.println("Most used word is " + mostUsedWord + "was used " + mostUsed + " times." );
		System.out.println("--------------");
		
		// find out list of words most used times
		List<Word>  listWords = new ArrayList<>();
		for (String wordName : wordCount.keySet()) {
			int count = wordCount.get(wordName);
			listWords.add(new Word(wordName, count));
		}
		
		Collections.sort(listWords);
		for (int i = 0; i < listWords.size(); i++) {
			Word word = listWords.get(i);
			System.out.println((i + 1) + ". " + word.name + " " + word.count);
		}
	}
	
	public static String getFileCountent(String path) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line + " ");
			}
		}catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}
}

class Word implements Comparable<Word> {
	public String name;
	public int count;
	
	public Word(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return String.format("{word=%s, count=%s}", name, count);
	}
	@Override
	public int compareTo(Word o) {
		Word other = (Word) o;
		return Integer.compare(other.count, count);
	}
}