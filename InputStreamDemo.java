package com.neudeu.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("G:\\Hello.txt");
			try {
				byte[] b = new byte[1024];
				//int read = is.read(b);
				String string = null;
				int len = 0;
				while ((len = is.read(b)) != -1) {
				
					string = new String(b,0,len);
				}
				
				System.out.println(string);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
