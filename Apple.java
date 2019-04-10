package com.neuedu.test;

public class Apple extends Fruit {
	String name;
	
	public void  showName()
	{
		System.out.println("appleµÄÃû×Ö£º"+super.name);
		name = "Æ»¹û";
		
	}
}
