package com.neuedu.demo;
/*
 * 编号
 * 名字
 * 性别
 * 年龄
 * 婚否
 * 身份证
 * 地址
 * 电话
 * 伴侣
 */


public class Person {
	
	public Person()
	{
		
	}
	public Person(String number,String name,String gender,int age,boolean marry,String card,String site,String phone,Person fere) 
	{
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.marry = marry;
		this.card = card;
		this.site = site;
		this.phone = phone;
		this.fere = fere;
	}
		String number;
		String name;
		String gender;
		int age;
		boolean marry;
		String card;
		String site;
		String phone;
		Person fere;
		
		//结婚
		public boolean marry1(Person aPerson)
		{
			House house = new House();
			boolean marryRules = house.marryRules(this, aPerson);
			return marryRules;
			
		}
		
}
