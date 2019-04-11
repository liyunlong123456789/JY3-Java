package com.neuedu;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] num = 
			{
				1,2,3,4	
			};
		int[] nums = new int [num.length];
		for(int i=0;i<num.length;i++)
		{
			nums[i] = num[i];
		}
		System.out.println(Arrays.toString(nums));
		nums[0] = -1;
		nums[1] = -2;
		nums[2] = -3;
		nums[3] = -4;
		//System.out.println(num[1]);
		//System.out.println(nums[3]);
		//数组扩展System.arraycopy(原数组src，位置POS，目标数组dest，目标数组开始位置destpos，长度length)
		int[] src = 
			{
				-1,-2,-3,-4	
			};
		int[] dest = new int [src.length];
			
		System.arraycopy(src, 0, dest, 0, 3);
		System.out.println(Arrays.toString(dest));
		
		
	}

}
