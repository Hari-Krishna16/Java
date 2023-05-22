package de.zeroco.Utility;

public class GetObject implements Cloneable{

	public int id;
	public String name;
	public String address;
	public static final String COMPANY = "ZeroCode Innovations";

	public GetObject(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static String getClassName() {
		Class<? extends String> strClass = COMPANY.getClass();
		if(strClass.equals(COMPANY.getClass())) return "its String class";
		return strClass.getName();
	}

	public String toString() {
		return name + " " + id + " " + address;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		GetObject getObject = new GetObject(12, "Hari", "TPT");
		GetObject secondObject=(GetObject)getObject.clone();
		System.out.println(secondObject);
//		System.out.println(getObject.toString());
//		System.out.println(COMPANY.hashCode());
//		System.out.println(getObject.getClass());
//		System.out.println(getClassName());
	
	}

}

