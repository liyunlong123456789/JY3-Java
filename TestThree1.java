package com.neuedu.test;

import java.util.Scanner;

public class TestThree1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int str = scanner.nextInt();
		if(str%2 == 0) 
		{
			System.out.println("输入的数值是偶数");
		}
		System.out.println(str);
	}
}
