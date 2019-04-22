package com.neuedu.test;

public class TestThree7 {
	public static void main(String[] args) {
		double  a = 30000;
		double sum = 30000;
		
		for(int i = 1; i<10;i++)
		{
			a = a*1.06;
			sum = sum+a;
		}
		System.out.println(a);
		System.out.println(sum);
	}
}
