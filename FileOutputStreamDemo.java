package com.neuedu.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		File file = new File("G:\\neuedu.txt");
		OutputStream os = null;
		if (!file.exists()) {
			try {
				file.createNewFile();
				os = new FileOutputStream(file);
				String str = "今天周一";
				os.write(str.getBytes());
				System.out.println("写出成功.....");
			} catch (IOException e) {
				e.printStackTrace();
			}finally 
			{
				if(null != os)
				{
					try {
						os.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}
