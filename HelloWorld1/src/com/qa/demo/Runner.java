package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		//Main Runner
		
		Person pawel = new Person("Pawel", 5.7, 8.8, "Java Programmer", 30);
		Person peter = new Person("Peter", 5.7, 8.5, "ISS Astronaut", 40);
		Person gurveer = new Person("Gurveer", 5.11, 8.5, "Dolphin Trainer", 45);
		Person fowsia = new Person("Fowsia", 6.0, 8.5, "Synchronised Swimmer", 25);
		
		//calling greet() method from Person 
		pawel.greet();
		peter.greet();
		gurveer.greet();
		fowsia.greet();
		
		//calling nameheight() method from Person
		pawel.nameheight();
		peter.nameheight();
		gurveer.nameheight();
		fowsia.nameheight();
		
		
	
	}
}
