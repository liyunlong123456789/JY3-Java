package com.neuedu.test;

import java.util.Scanner;

public class TestThree1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int str = scanner.nextInt();
		if(str%2 == 0) 
		{
			System.out.println("�������ֵ��ż��");
		}
		System.out.println(str);
	}
}
