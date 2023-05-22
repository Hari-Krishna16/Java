package de.zeroco.Utility;
import java.util.Random;
public class GenerateCaptcha {

	public static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String ALPHABETS_ALLCASESS = ALPHABETS.toLowerCase() + ALPHABETS;
	public static final String ALPHA_NUMERIC = ALPHABETS_ALLCASESS + "0123456789";

	public static void main(String[] args) {
//		System.out.println(getCaptcha());
		System.out.println(getCaptcha(5));
//		System.out.println(getCaptcha(7, "ALPhAnumeric"));
	}

	public static String getCaptcha(int size, String type) {
		if ((Utility.isBlank(size)) || (Utility.isBlank(type))) {
			return "enter valid data";
		} else if ((size >= 10)) {
			size = 10;
		}
		Random random = new Random();
		String captchaString = "";
		String result = "";
		if (type.equalsIgnoreCase("AlphaNumeric")) {
			result = ALPHA_NUMERIC;
		} else if (type.equalsIgnoreCase("AlphaBetic")) {
			result = ALPHABETS_ALLCASESS;
		}
		for (int i = 0; i < size; i++) {
			int randomIndex = random.nextInt(result.length());
			char randomChar = result.charAt(randomIndex);
			captchaString += randomChar;
		}
		return captchaString;
	}

	public static String getCaptcha(int size) {
		if ((Utility.isBlank(size)))
			return "enter valid data";
		return getCaptcha(size, "AlphaBetic");
	}

	public static String getCaptcha() {
		return getCaptcha(6);
	}

}