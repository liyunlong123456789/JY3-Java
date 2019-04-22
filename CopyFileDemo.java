package com.neuedu.Test;

import java.io.*;
import java.util.Scanner;

public class CopyFileDemo {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("请输入文件名");
		String srcFilePath = scanner.nextLine();
		String[] split = srcFilePath.split("\\.");
		File srcFile = new File(srcFilePath);
		File destFile = new  File(split[0]+"-副本."+split[1]);
		InputStream  is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(srcFile);
			os = new FileOutputStream(destFile);
			int len = 0;
			byte[] buffer = new byte[1024];
			try {
				while ((len=is.read(buffer)) != -1)
				{
					os.write(buffer,0,len);
				}
				System.out.println("复制成功.....");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally
		{
			if(null != os) 
			{
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(null != is) 
			{
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
