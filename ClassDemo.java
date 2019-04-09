package com.neuedu.tset;

public class ClassDemo {
	public static void main(String[] args) {
	Books a1 = new Books();
	a1.number = 100;
	a1.name = "耿耿余淮";
	a1.price = 25.8;
	a1.author = "八月长安";
	a1.isbn = "7961629254245";
	a1.type = "爱情长篇小说";
	a1.press = "新华书店";
	System.out.println("a1的页数："+a1.number);
	System.out.println("a1的名字："+a1.name);
	System.out.println("a1的价格："+a1.price);
	System.out.println("a1的作者："+a1.author);
	System.out.println("a1的编码："+a1.isbn);
	System.out.println("a1的类型："+a1.type);
	System.out.print("a1的出版社："+a1.press);
	
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
		System.out.print("正在读书。。。");
	}
	
}