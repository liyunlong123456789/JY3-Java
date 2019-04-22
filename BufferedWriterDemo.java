package com.neuedu.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		File file = new File("G:\\Hello.txt");
		try(Writer fileWriter = new FileWriter(file,true);
			BufferedWriter bf =	new BufferedWriter(fileWriter);)
		{
			bf.newLine();//������
			bf.write("�����Ǵ��");
			bf.append('��');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
