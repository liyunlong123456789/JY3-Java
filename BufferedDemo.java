package com.neuedu.Test;

import java.awt.image.BufferedImage;
import java.io.*;

public class BufferedDemo {
	public static void main(String[] args) {
		File file = new File("G:\\Hello.txt");
		try(FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);)
		{
			String str = null;
			while((str = reader.readLine()) !=null)
			{
				reader.skip(1);
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
