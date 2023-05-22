package de.zeroco.Utility;

public class Occurencess {
	
	public static void main(String[] args) {
		System.out.println(occurencesOfKey("hari hari Hari HAri haRI", null));

	}

	public static int occurencesOfKey(String source, String key) {
		if (Utility.isBlank(source) || (Utility.isBlank(key))) {
			return 0;
		}
		int count = 0;
		int indexnumber = 0;
		source = source.toLowerCase();
		key = key.toLowerCase();

		while ((indexnumber = source.indexOf(key, indexnumber)) != -1) {
			count++;
			indexnumber += key.length();
		}
		return count;
	}
	public static int countOccurenceOfChar(String word, char ch) {
		if (word.length() == 0) {
			return 0;
		}
//		if (word.charAt(0) == ch) {
//			return 1 + countOccurenceOfChar(word.substring(1), ch);
//		} else {
//			return countOccurenceOfChar(word.substring(1), ch);
//		}
		return (word.charAt(0) == ch ? 1 : 0) + countOccurenceOfChar(word.substring(1), ch);
	}
	public static int countOccurenceOfCharForLoop(String word, char ch) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	public static int countOccuranceOfChars(String word, char ch) {
		int i = 0;
		int count = 0;
		do {
			if (word.charAt(i) == ch) {
				count++;
			}
			i++;
		} while (i < word.length());	
		System.out.println(i);
		return count;	
	}
}
