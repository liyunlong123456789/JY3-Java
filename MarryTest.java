package com.neuedu.demo;

public class MarryTest {
	
	public static void main(String[] args)
	{
		Person girl = new Person("TJ2132183","����","Ů",18,false,"1532188743218218","����пո�������","18524654624",null);
		Person boy = new Person("TJ2132183","����","��",24,false,"1532188743218218","����пո���","18524654624",girl);
		boy.fere = girl;
		girl.fere = boy;
		boolean marry1  = boy.marry1(girl);
		System.out.println(marry1 == true?"��ϲ�㣬ϲ�ý���":"���ǿ��ԻؼҴ�һ������");
		System.out.println("�����Ļ��״̬��"+boy.marry);
		System.out.println("�����Ļ��״̬��"+girl.marry);
		System.out.println("�������µ�����"+boy.fere.name);
		System.out.println("�������µ�����"+girl.fere.name);
	}

}
