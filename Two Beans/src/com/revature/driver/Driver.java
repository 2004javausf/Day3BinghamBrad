package com.revature.driver;

import com.revature.animals.Cat;
import com.revature.animals.Dog;

public class Driver {

	public static void main(String[] args) {
		
		Cat h= new Cat();
		System.out.println(h);
		h.setName("Dom");
		h.setAge(34);
	
		Dog a= new Dog();
		System.out.println(a);
		a.setName("Dom");
		a.setAge(34);
		
		System.out.println(a.getName());
		System.out.println(a.getAge());
	
}
}
