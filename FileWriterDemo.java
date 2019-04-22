package com.neuedu.Test;

import java.io.*;

public class FileWriterDemo {
	public static void main(String[] args) {
		File file = new File("G:\\Hello.txt");
		try (Writer writer = new FileWriter(file);) 
		{
			char[] c = {'Äã','ºÃ','ÊÀ','½ç'};
			writer.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
