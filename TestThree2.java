package com.neuedu.test;

import java.util.Scanner;

public class TestThree2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个X数");
		int x = scanner.nextInt();
		System.out.println("请输入一Y数");
		int y = scanner.nextInt();
		if(x>y ) 
		{
			System.out.println(x);
		}else 
		{
			System.out.println(y);
		}
	}
}
