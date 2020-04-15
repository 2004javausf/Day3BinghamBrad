package com.revature.driver;

import com.revature.animals.Cat;
import com.revature.animals.Dog;

public class Driver {
	
	public static void main(String [] args) {
		
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.setAge(2);
		c.setCurious(true);
		c.setName("Jynx");
		
		d.setAge(5);
		d.setGoodboy(true);
		d.setName("Sputnik");
		
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.isCurious());
		
		System.out.println("");
		
		System.out.println(d);
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.isGoodboy());

	}

}
