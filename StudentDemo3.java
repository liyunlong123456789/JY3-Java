package com.neuedu;

import java.util.Scanner;

public class StudentDemo3 {
	public StudentDemo3() 
	{
		String num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("*************************添加学生信息***************************");
		
		System.out.println("请输入学生id：");
		do {
		 num = scanner.next();
		
		if(num == "3" ) 
		{
			System.out.println("此id3存在，请重新输入：");
		}
		}while(num == "3");
		System.out.println("请输入学生姓名：");
		String num3 = scanner.next();
		System.out.println("请输入学生性别：");
		String num4 = scanner.next();
		do {
			
		
		if(num4 == "男"  ||  num4 =="女")
		{
			break;
		}
		}while(num4 == "男");
		System.out.println("请输入学生年龄（只能1-120之内的数字）：");
		String num5 = scanner.next();
		System.out.println("请输入学生所属年级（只能初级、中级、高级）：");
		String num6 = scanner.next();
		System.out.println("请输入学生地址：");
		String num7 = scanner.next();
		System.out.println("请输入学生联系方式（11位手机号）：");
		String num8 = scanner.next();
		System.out.println("请输入学生电子邮箱（包含@和.com）：");
		String num9 = scanner.next();
	}

}
