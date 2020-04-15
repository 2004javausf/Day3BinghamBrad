package com.revature.animals;

public class Dog {
	private String name;
	private boolean goodboy;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGoodboy() {
		return goodboy;
	}
	public void setGoodboy(boolean goodboy) {
		this.goodboy = goodboy;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", goodboy=" + goodboy + ", age=" + age + "]";
	}
	
}
