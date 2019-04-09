package com.neuedu.demo;

import java.util.Scanner;

public class Test {
	private static String username;

	public static void main(String[] args)
	{
		
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String usernam = scanner.next();
		System.out.print("请输入密码：");
		String psw = scanner.next();
		boolean checkUser = user.checkUser(usernam, psw);
		//System.out.print(checkUser);
		System.out.print(checkUser == true ? "登录成功":"登录失败");
		scanner.close();
		
	}

}
