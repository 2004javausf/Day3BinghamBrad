package com.revature.animals;

public class Cat {
	private String name;
	private boolean curious;
	private int age;
	
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
	public boolean isCurious() {
		return curious;
	}
	public void setCurious(boolean curious) {
		this.curious = curious;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", curious=" + curious + ", age=" + age + "]";
	}
	
}
