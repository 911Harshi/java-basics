package basics;

import objectclass.Util;

public class Student {
	String name;
	int age;
	/**
	 * * default constructor --harshitha
	 * */
	public Student() {}	
	
	/**
	 * lahari constructor
	 *  @param name
	 * @param age
	 */
	public Student(String name) {
		this.name = name;
		
	}
	/**
	 * this is sathvika constructor
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = Util.incrementByTen(age);
	}
	static String COLLEGE_NAME = "NIT";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
