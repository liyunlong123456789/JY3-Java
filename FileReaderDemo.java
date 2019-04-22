package com.neuedu.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
	public static void main(String[] args) {
		File file = new File("G:\\Hello.txt");
		try (Reader r = new FileReader(file);){
			char[] c = new char[1024];
			int len = 0;
			String string = null;
			while((len=r.read(c)) !=-1)
			{
				string = new String(c,0,len);
			}
			System.out.println(string);
		} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

