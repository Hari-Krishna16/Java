package de.zeroco.Utility;

public class Operators {

	public static final int HEALTH_INSURENCE = 250;
	public static final int LEAVE=200;

	public static void main(String[] args) {
//		System.out.println(eligibilityToParticipate(21, 'M'));
//		System.out.println(eligibilityToVisit('F', 33));
//		System.out.println(eligibilityToVoteing("Aadhar"));
//	    System.out.println(eligibilityOfVisiting('F', 9));
//		System.out.println(salarayBreakUp(5000, 3, 3));
//		System.out.println(transportSystem(134,"Hyderabad"));
//		System.out.println(examResults(4));
//		System.out.println(evenOddNumber(23));
	}

	public static String eligibilityToParticipate(int age, char gender) {
		if ((age >= 18) && (gender == 'M')) {
			return "he is eligble";
		}
		return "he is not eligble";
	}

	public static String eligibilityToVisit(char gender, int age) {
		if ((gender == 'M')) {
			return "Allow";
		} else if ((gender == 'F') && (age <= 10)) {
			return "Allow";
		} else {
			return " not allwoed ";
		}
	}

	public static String eligibilityToVoteing(String identity) {
		if ((identity == "Aadhar") || (identity == "pancard") || (identity == "voterId")) {
			return "allow to vote";
		} else {
			return "not allowed ";
		}
	}

	public static String eligibilityOfVisiting(char gender, int age) {
		return ((gender == 'M') || (gender == 'F') && (age <= 10)) ? "allow" : "not allow";
		
	}

	public static String transportSystem(int busNumber, String city) {
		String bus = ((busNumber == 125) && (city == "Hyderabad"))
				? "MGBS-->Panjagutta-->Ammeerpet-->KPHB-->LingamPalli" : "no busses";
		return bus;
	}

	public static String examResults(int marks) {
		String result = (marks > 35) ? "pass" : "falil";
		return result;
	}

	public static String evenOddNumber(int number) {
		String result = (number % 2 == 0) ? "even" : "Odd";
		return result;
	}

	public static int salarayBreakUp(int salary, int overDuties, int leaves) {
		int tax = 180;
		int overduty = 250;
		salary = salary - HEALTH_INSURENCE;
		salary = salary - tax;
		salary = salary + overDuties * overduty;
		salary = salary - leaves * LEAVE;
		return salary;
	}

}
