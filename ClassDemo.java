package com.neuedu.tset;

public class ClassDemo {
	public static void main(String[] args) {
	Books a1 = new Books();
	a1.number = 100;
	a1.name = "�����໴";
	a1.price = 25.8;
	a1.author = "���³���";
	a1.isbn = "7961629254245";
	a1.type = "���鳤ƪС˵";
	a1.press = "�»����";
	System.out.println("a1��ҳ����"+a1.number);
	System.out.println("a1�����֣�"+a1.name);
	System.out.println("a1�ļ۸�"+a1.price);
	System.out.println("a1�����ߣ�"+a1.author);
	System.out.println("a1�ı��룺"+a1.isbn);
	System.out.println("a1�����ͣ�"+a1.type);
	System.out.print("a1�ĳ����磺"+a1.press);
	
}	
	
}
class Books
{
	int number;
	String name;
	double price;
	String author;
	String isbn;
	String  type;
	String  press;
	public void look()
	{
		System.out.print("���ڶ��顣����");
	}
	
}