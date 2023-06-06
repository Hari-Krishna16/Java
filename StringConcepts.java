package de.zeroco.Strings;

import java.util.regex.Pattern;

public class StringConcepts {

	public static void main(String[] args) {
//		System.out.println(isValidMailId("harikrishakaaki@gmail.com"));
//		System.out.println(isValidPassword("@B9ac7"));
		System.out.println(getFormattedValue("Andhra Pradesh1234$"));
	}

	public static boolean isValidMailId(String mail) {
		return Pattern.matches("[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+", mail);
	}

	public static boolean isValidPassword(String password) {
		return Pattern.matches("[A-Za-z0-9+!@$%&)(]{6}", password);
	}

	public static String getFormattedValue(String input) {
		  String replacedValue = input.replaceAll("[^A-Za-z]+", "_").toLowerCase().trim();
		    if (replacedValue.endsWith("_")) {
		        replacedValue = replacedValue.substring(0, replacedValue.length() - 1);
		    }
		    return replacedValue;
	}
	
}
