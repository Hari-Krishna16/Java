package de.zeroco.Utility;

public class MethodOverloading {

	public static void main(String[] args) {
//
//		System.out.println(getStudent("Hari Krishna", 10, "10-B"));
//		System.out.println(getStudent(124721, 15, 462, 89));
//		System.out.println(getStudent("Subramanyam", "Mathematics"));
//		System.out.println(getTreatment("AnanthRam", 'M', 36, "74-91B,Gandhi Street,Tirupathi"));
//		System.out.println(getTreatment("Abdominal pain", "Emergency-Ward", "B+"));
//		System.out.println(getTreatment("Vamsi Reddy", " gastroenterologist"));
//		System.out.println(getTreatment(50000, 11000));
		System.out.println(getConversion("HELLO", "HARI"));
	}

	// School ManageMent Code
	public static String getStudent(String studentName, int studentClass, String section) {
		return studentName + " " + studentClass + " " + section;
	}

	public static String getStudent(int studentId, int studentAge, int studentMarks, int studentAttendence) {
		return studentId + " " + studentAge + " " + studentMarks + " " + studentAttendence;
	}

	public static String getStudent(String classTeacher, String subject) {
		return classTeacher + " " + subject;
	}
	// School ManageMent Code End

	// Hospital Management Code
	public static String getTreatment(String patientName, char gender, int age, String address) {
		return patientName + " " + gender + " " + age + " " + address;
	}

	public static String getTreatment(String problem, String ward, String bloodGroup) {
		return problem + " " + ward + " " + bloodGroup;
	}

	public static String getTreatment(String doctorName, String specilization) {
		return doctorName + " " + specilization;
	}

	public static int getTreatment(int operationBill, int medicineBill) {
		return operationBill + medicineBill;
	}
	// Hospital Management Code

	// calculate rate of Interest
	public static double getCalculation(double principal, double interestRate, double time) {
		double simpleInterest = (principal * interestRate * time) / 100;
		return simpleInterest;
	}

	public static double getCalculation(double principal, double interestRate, double time, double penalty) {
		double fixedDepositInterest = (principal * interestRate * time) / 100 - penalty;
		return fixedDepositInterest;
	}

	// method overloading using strings

	public static String getConversion(String word, String name) {
		return word.toLowerCase() + " " + name.toLowerCase();
	}

}
