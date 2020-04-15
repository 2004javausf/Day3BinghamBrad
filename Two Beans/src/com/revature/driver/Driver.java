package com.revature.driver;

import com.revature.animals.Cat;
import com.revature.animals.Dog;

public class Driver {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.setName("Miki");
		c.setAge(22);
		c.setCurious(true);
		System.out.println(c);
		
		Dog d = new Dog();
		d.setName("Pom");
		d.setGoodboy(true);
		d.setAge(5);
		System.out.println(d);

	}

}
