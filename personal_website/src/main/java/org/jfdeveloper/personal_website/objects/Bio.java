package org.jfdeveloper.personal_website.objects;

public class Bio {
	
	String name;
	String age;
	String dob;
	public Bio(String name, String age, String dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getDob() {
		return dob;
	}
	@Override
	public String toString() {
		return "Bio [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
}
