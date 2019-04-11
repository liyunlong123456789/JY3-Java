package com.neuedu;

public class Array {
	public static void main(String[] args) 
	{
		/*
		 * 含[值]静态初始化
		 * 含[ ]动态初始化
		 */
		//int[] num = new int[4];(第一种方法)
		int[] num =new int[]
				{
					//第二种方法
				};
		//int[] num =
		//{
			
		//};(第三种方法)
		num[0] = 10;
		num[1]= 15;
		for(int i = 0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}

}
