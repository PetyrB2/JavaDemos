package com.qa.demo;

public class Person {

	// ATTRIBUTES - Normally you keep these PRIVATE

	private String name;
	private double height;
	private double shoesize;
	private String jobtitle;
	private int age;


	// CONSTRUCTOR with all fields
public Person(String name, double height, double shoesize, String jobtitle, int age) {
	super();
	this.name = name;
	this.height = height;
	this.shoesize = shoesize;
	this.jobtitle = jobtitle;
	this.age = age;
}

// CONSTRUCTOR with name and height fields
	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}

	
// METHOD 1 calling all fields and spaced out nicely
	public void greet() {
		System.out.println("---------------------------------------");
		System.out.println("Hi there. My name is " + name + ".");
		System.out.println("My age is " + age + ".");
		System.out.println("My height is " + height + ".");
		System.out.println("My shoesize is " + shoesize + " and my job title is " + jobtitle);
	}

// METHOD 2 with only the name and height fields 
	public void nameheight() {
		System.out.println("---------------------------------------");
		System.out.println("Hi there. My name is " + name + " and my height is " + height + " in feet and inches.");
	}

}