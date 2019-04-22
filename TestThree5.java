package com.neuedu.test;

import java.util.Scanner;

public class TestThree5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈë½±½ğ");
		int str = scanner.nextInt();
		double a = 0;
		if(str<100000) 
		{
			a = str*10/100;
		}else if(str<200000) 
		{
			a= (str-100000)*7.5/100+10000;
		}else if(str<400000) 
		{
			a = (str-200000)*5/100+17500;
		}else if (str <= 600000) 
		{
			a= (str-400000)*3/100+27500;
		}else if(str <= 1000000) 
		{
			a = (str- 600000)*1.5/100+33500;
		}if(str>1000000) 
		{
			a = (str -1000000)*1/100+39500;
		}
		System.out.println(a);
	}
}
