package de.zeroco.Utility;

public class Utility {
	public String employeName;
	public int employeeId;
    public	static int number;
    public static String word;
    
	Utility(String name,int id){
		this.employeName=name;
		this.employeeId=id;
	}
	
	Utility(String name,int id,String city){
		this.employeName=name;
		this.employeeId=id;
	}
	
	public static void main(String[] args) {
		
//		Utility utility=new Utility("Hari",1);
//		Utility utilite=new Utility("Shiva",7,"SKHT");
//		System.out.println(getDefaultValues());
//		System.out.println(utility);
//		System.out.println(util);
//		System.out.println(getHashCode("HariKrishna"));
//		System.out.println(isBlank(91));
//		System.out.println(hasData(""));
	}
	
	public static String getDefaultValues() {
		return word +" "+number;
	}

	public String toString() {
		return employeName +" "+employeeId; 
	}
	
	public static int getHashCode(String name) {
		int result=name.hashCode();
		return result;
	}
	
	public static boolean isBlank(Object input) {
		if (input == null) {
			return true;
		} else if (input instanceof String) {
			if (((String) input).trim().equals(""))
				return true;
		} else if (input instanceof Character) {
			if ((char) input == ' ')
				return true;
		} else if (input instanceof Integer) {
			if ((int) input <= 0)
				return true;
		} else if (input instanceof Long) {
			if ((long) input <= 0)
				return true;
		} else if (input instanceof Float) {
			if ((float) input <= 0)
				return true;
		} else if (input instanceof Double) {
			if ((double) input <= 0)
				return true;
		} else if (input instanceof Boolean) {
			if ((boolean) input == false)
				return true;
		}
		return false;
	}

	public static boolean hasData(Object input) {
		return !isBlank(input);
	}
	

}
