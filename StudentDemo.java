package com.neuedu;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) 
	{
		String name;
		String password;
	System.out.println("-----------------欢迎登录学生信息管理系统-----------------");	
	System.out.println("\t"+"1.登录"+"\t"+"2.退出");
	System.out.println("----------------------------------------------------------");
	Scanner scanner = new Scanner(System.in);
	System.out.println("请选择：");
	int num = scanner.nextInt();
	if(num == 1) 
	{
		
	
	System.out.println("欢迎登录！");
	while(1==1) 
	{
	System.out.println("请输入用户名：");
	name = scanner.next();
	System.out.println("请输入密码：");
	password = scanner.next();
	if(name.equals("admin")   &&  password.equals("admin"))
	{
		System.out.println("登录成功");
		System.out.println("欢迎您，"+name);
		break;
	}
	}
	}else 
	{
		if( num == 2) {System.exit(0);}
	}
	
	}

}
