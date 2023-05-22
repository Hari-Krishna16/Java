package de.zeroco.Utility;

public class Convertion {
	
	public static void main(String[] args) {
		System.out.println(convertionToBinary(10));
		System.out.println(convertionToDecimal(1010));
	}

	public static String convertionToBinary(int decimal) {
		String binaryNumber = "";
		while (decimal > 0) {
			int remainder = decimal % 2;
			binaryNumber = remainder + binaryNumber;
			decimal = decimal / 2;
		}
		return binaryNumber;
	}

	public static int convertionToDecimal(int binary) {
		int decimal = 0;
		for (int i = 0; binary > 0; i++) {
			int number = binary % 10;
			decimal += number * Math.pow(2, i);
			binary /= 10;
		}
		return decimal;
	}
}
