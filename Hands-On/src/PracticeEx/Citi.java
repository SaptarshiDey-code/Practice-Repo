package PracticeEx;

import java.io.Serializable;

public class Citi  {
	int id;
	String name;
	int age;
	String city;
	public Citi(int id,String name,int age,String city) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
