package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

public class studentClient {
	public studentClient() {}
	// 初始化用户名和密码
	static String userName = "admin";
	static String password = "admin";
	// 创建Scanner类
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		studentClient studentclient = new studentClient();
		studentclient.welcomePage();
		studentclient.studentIndex();
	}
	// 欢迎界面
	public  void welcomePage() {
		System.out.println("----------欢迎登录学生管理系统----------");
		System.out.println("1.登录             2.退出");
		System.out.println("---------------------------------");
		// 接受用户输入的1和2;
		System.out.println("请选择:");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("欢迎登录");
			System.out.println("请输入用户名");
			String username = scanner.next();
			System.out.println("请输入密码");
			String psw = scanner.next();
			Admin admin = new Admin(username,psw);
			boolean login = login(admin);
			if(login==true)
			{
				System.out.println("欢迎您，"+username);
			}else
			{
				System.out.println("登录失败...");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("已退出");
			exitSystem();
			break;
		default:
			System.out.println("输入有误,重新选择");
			welcomePage();
			break;
		}
	}

	// 登录方法
	public boolean login(Admin admin) {
		// 判断传入的用户名和密码是否一致
		if (userName.equals(admin.getUserName()) && password.equals(admin.getPassWord())) {
			return true;
		} else {
			return false;
		}
	}

	// 退出系统
	public void exitSystem() {
		System.exit(0);
	}
	//创建一个studentManager的对象
	StudentManager studentManager = new StudentManager(this);
	//学生管理的首页
	public void studentIndex()
	{
		System.out.println("**********请选择要操作的信息对应数字****************");
		System.out.println("*1.查看学生信息      2.添加学生信息       3.删除学生信息      4.修改学生信息     5.退出");
		System.out.println("**************************************");
		System.out.println("请选择:");
		//接收输入的选项
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			studentIndexOne();
			break;
			
		case 2:
			studentManager.addStuPage(scanner);
			break;
		case 3:
			System.out.println("请输入要删除的学生ID");
			StudentManager.stus = studentManager.delOneStudentByStuID();
			System.out.println("删除成功，自动返回上一层");
			studentIndex();
			break;
		case 4:
			studentIndexTow();
			break;
		case 5:
			exitSystem();
			break;
		default:
			System.out.println("输入错误，请重新输入");
			studentIndex();
			break;
		}
	}
	public void studentIndexOne()
	{
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+  1.查看所有学生信息          2.根据id查询学生信息          3.根据id查询学生姓名          4.返回上一层          +");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("请选择:");
		//接收输入的选项
		int nextInt = scanner.nextInt();
		switch(nextInt) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			System.out.println("查询完毕，系统将自动返回目录");
			studentIndexOne();
			break;
		case 2:
			studentManager.watchIdMissage();
			System.out.println("查询完毕，系统将自动返回目录");
			studentIndexOne();
			break;	
		case 3:
			studentManager.watchIdName();
			System.out.println("查询完毕，系统将自动返回目录");
			studentIndexOne();
			break;	
		case 4:
			studentIndex();
			break;
		default:
			System.out.println("输入错误，请重新输入");
			studentIndex();
			break;
		}
	}
	public void studentIndexTow()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1.根据ID修改学生全部信息                    2.根据ID修改学生部分信息                    3.返回上级目录                    4.系统退出");
		System.out.println("----------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择:");
		int id = scanner.nextInt();
		switch(id) {
		case 1:
			studentManager.updateStudentInfo(scanner);
			System.out.println("修改成功");
			System.out.println("系统自动返回上层目录....");
			studentIndexTow();
			break;
		case 2:
			studentManager.studentIdChange(scanner);
			System.out.println("修改成功");
			System.out.println("系统自动返回上层目录....");
			studentIndexTow();
			break;
		case 3:
			studentIndex();
			break;
		case 4:
			exitSystem();
			break;
		default:
			System.out.println("输入有误，请重新输入");
			studentIndexTow();
		}
	}
}
