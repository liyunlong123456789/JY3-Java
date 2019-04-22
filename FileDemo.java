package com.neudeu.Test;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
			File file = new File("G:\\Hello.txt");
			System.out.println(file.canExecute());
			System.out.println("--------------------------���Ƿָ���---------------------------");
			System.out.println(file.canRead());
			System.out.println("--------------------------���Ƿָ���---------------------------");
			System.out.println(file.canWrite());
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//delete
//			boolean delete = file.delete();
//			System.out.println(delete);
			
			//exists(�ж��Ƿ����)
			boolean exists = file.exists();
			System.out.println(exists);
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//getAbsolutePath(����·��)
			String absolutePath = file.getAbsolutePath();
			System.out.println(absolutePath);
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//getName(�ļ���)
			String name = file.getName();
			System.out.println(name);
			System.out.println("--------------------------���Ƿָ���---------------------------");
		
			//getParent
			String parent = file.getParent();
			System.out.println(parent);
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//isAbsolute
			boolean absolute = file.isAbsolute();
			System.out.println(absolute);
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//isDirectory(Ŀ¼)
			boolean directory = file.isDirectory();
			System.out.println(directory);
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//isHidden(�����ļ�)
			boolean hidden = file.isHidden();
			System.out.println(hidden);
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//length(�ļ��ı�����)
			long length = file.length();
			System.out.println(length);
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//list(��ѯ�ļ��е������ļ�)
//			String[] list = file.list();
//			for (String string : list) {
//				System.out.println(string);
//			}
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//listFiles(ȡ�ļ�)
//			File[] listFiles = file.listFiles();
//			for (File file2 : listFiles) {
//				System.out.println(file2.isDirectory());
//			}
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//mkDir(����Ŀ¼)
//			File file2 = new File("G:\\123\\321");
//		    if(!file2.exists()) 
//		    {
//		    	boolean mkdir = file2.mkdirs();
//		    	System.out.println(mkdir);
//		    }
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//renameTo
			File file3 = new File("G:\\123\\321\\world.txt");
			boolean renameTo = file.renameTo(file3);
			System.out.println(renameTo);
			System.out.println("--------------------------���Ƿָ���---------------------------");
			
			//createNewFile
			File file4 = new File("G:\\java.txt");
			if(!file4.exists()) 
			{
				try {
					boolean createNewFile = file.createNewFile();
					System.out.println(createNewFile);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
	}
}
