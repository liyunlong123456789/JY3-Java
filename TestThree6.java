package com.neuedu.test;

import java.util.Scanner;

public class TestThree6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("«Î ‰»Î≥…º®");
		int str = scanner.nextInt();
		if(str<0 || str>100) 
		{
			System.out.println("≥…º®¥ÌŒÛ");
		}
		switch (str/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("E");
			break;
		}
	}
}
