package com.neuedu.test;

public class TestThree3 {
	public static void main(String[] args) {
		int i =1;
		int sum = 0;
//		while(i<=100 ) 
//		{
//			sum = sum+i;
//			//i++;
//			i=i+2;
//		}
		//System.out.println(sum);
		do {
			sum = sum+i;
			i++;
		}while( i <= 100);
		System.out.println(sum);
	}
}
