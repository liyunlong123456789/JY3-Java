package com.neuedu.test;

public class Test4 {
	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		boolean z = (x!=2 && y==y++);
		System.out.println(z);
		System.out.println("y="+y);
	}
}
