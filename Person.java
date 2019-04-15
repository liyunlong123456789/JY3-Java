package com.neudeu.Polymorphism;

public class Person {
	public static void main(String[] args) {
		Person person = new Person();
		Bus bus = new Bus();
		person.play(bus);
	}

	public void play(Vehicle v) 
	{
		v.trip();
	}
}
