package com.neuedu;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) 
		{
			System.out.println("������һ������");
			int num = scanner.nextInt();
			if(num >= 0 && num <= 5)
			{
				break;
			}
		}
		System.out.println("�˳�");
	}

}
