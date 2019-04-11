package com.neuedu.test;

public class Static {
	public static void main(String[] args) {
		new B();
	}
}
class A
{
	static
	{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	public A() 
	{
		System.out.println("3");
	}
	static 
	{
		System.out.println("4");
	}
	
}
class B extends A
{
	static
	{
		System.out.println("5");
	}
	{
		System.out.println("6");
	}
	public B() 
	{
		System.out.println("7");
	}
	
	{
		System.out.println("8");
	}
}