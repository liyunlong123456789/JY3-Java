package com.neuedu.demo;

public class MarryTest {
	
	public static void main(String[] args)
	{
		Person girl = new Person("TJ2132183","阿丽","女",18,false,"1532188743218218","天津市空港区东软","18524654624",null);
		Person boy = new Person("TJ2132183","阿东","男",24,false,"1532188743218218","天津市空港区","18524654624",girl);
		boy.fere = girl;
		girl.fere = boy;
		boolean marry1  = boy.marry1(girl);
		System.out.println(marry1 == true?"恭喜你，喜得娇妻":"你们可以回家打一架再来");
		System.out.println("阿东的婚否状态："+boy.marry);
		System.out.println("阿丽的婚否状态："+girl.marry);
		System.out.println("阿东伴侣的名字"+boy.fere.name);
		System.out.println("阿丽伴侣的名字"+girl.fere.name);
	}

}
