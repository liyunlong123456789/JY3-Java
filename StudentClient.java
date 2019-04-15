package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {
	//初始用户名和密码
	static String username = "admin";
	static String password = "admin"; 
	//创建scanner
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//创建客户端
		StudentClient studentClient =  new StudentClient();
		studentClient.welcomePage();
		studentClient.managerIndex();
	}
	//创建一个对象
	StudentManager sm = new StudentManager(this);
	//欢迎界面
	public void welcomePage()
	{
		System.out.println("-----------------欢迎登录学生信息管理系统-----------------");
		System.out.println("1.登录     2.退出");
		System.out.println("-------------------------------------------------------");
		//接受用户信息
		System.out.println("请选择：");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("欢迎登录！");
			System.out.println("请输入用户名:");
			String username = scanner.next();
			System.out.println("请输入密码:");
			String passsword = scanner.next();
			Admin admin = new Admin(username,passsword);
			boolean login = login(admin);
			if(login == true)
			{
				System.out.println("欢迎您"+username+"登录！");
			}else
			{
				System.out.println("登录失败！！！");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("退出成功");
			exitSystem();
			break;
			
		default:
			System.out.println("输入有误，请重新输入");
			welcomePage();
			break;
		}
		
		
		
		
	}
	//登录
	public boolean login(Admin admin) 
	{
		//判断用户名密码是否一致
		if(username.equals(admin.username) && password.equals(admin.password))
		{
			return true;
		}else 
		{
			return false;
		}
	}
	//退出
	public void exitSystem() 
	{
		System.exit(0);
	}
	
	
	//学生管理首页
	public void managerIndex() 
	{
		System.out.println("**************************请选择要操作的信息对应的数字**************************");
		System.out.println("*1.查看学生信息       2.添加学生信息      3.删除学生信息       4.修改学生信息       5.退出");
		System.out.println("***********************************************************************");
		System.out.println("请选择：");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			break;
		case 2:
			sm.addStu(scanner);
			break;
		case 3:
			System.out.println("请输入选择删除的ID");
			int ID = scanner.nextInt(); 
			sm.oneStudentId(ID);
			System.out.println("删除成功");
			managerIndex();
			
			
		break;
		default:
			break;
		}
	}
}
