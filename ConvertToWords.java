package de.zeroco.Utility;

public class ConvertToWords {

	private static final String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };
	private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	public static void main(String[] args) {
		System.out.println(getWords(8));

	}

	public static String getWords(int num) {
		if (num < 20) {
			return ones[num];
		}
		if (num < 100) {
			return tens[num / 10] + " " + getWords(num % 10);
		}
		if (num < 1000) {
			return ones[num / 100] + " hundred " + getWords(num % 100);
		}
		if (num < 1000000) {
			return getWords(num / 1000) + " thousand " + getWords(num % 1000);
		}
		if (num < 1000000000) {
			return getWords(num / 1000000) + " million " + getWords(num % 1000000);
		}
		return "number too large";
	}

}
