package de.zeroco.Utility;

public class GetConstructors {

	public  int id;
	public  String name;
	public String company;
	

	public GetConstructors (String name) {
		this.name = name;
	}

	public GetConstructors (int id, String name) {
		this(name);
		this.id = id;
	}

	public GetConstructors (int id, String name, String company) {
		this(id, name);
		this.company = company;
	}

	public static void main(String[] args) {
		GetConstructors  getConstructor = new GetConstructors ("hari");
          System.out.println(getConstructor.name);
          System.out.println(getConstructor.id);
          System.out.println(getConstructor.company);
	}
}

