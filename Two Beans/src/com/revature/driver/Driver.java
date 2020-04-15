package com.revature.driver;

import com.revature.animals.Cat;
import com.revature.animals.Dog;

public class Driver {
	public static void main (String [] args) {
		
		Cat c = new Cat();
		
		c.setAge(5);
		c.setCurious(false);
		c.setName("Benny");
		
		System.out.println(c);
		
		Dog d = new Dog();
		d.setName("Bear");
		d.setAge(7);
		d.setGoodboy(true);
	
		System.out.println(d);
	}
	

}