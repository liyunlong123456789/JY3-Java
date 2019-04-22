package com.neuedu.Test;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) {
		 // ‰»Î¡˜
		File file = new File("G:\\Hello.txt");
		InputStream is = null;
		if(file.exists())
		{
			try {
				file.createNewFile();
				is  =  new FileInputStream(file);
				int len = 0;
				byte[] buffer = new byte[1024];
				String str = null;
				while((len=is.read(buffer))!=-1)
				{
					str = new String(buffer, 0, len);
				}
				System.out.println(str);
			} catch (IOException e) {
				e.printStackTrace();
			}finally 
			{
				if(null != is)
				{
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}		
	}
}
