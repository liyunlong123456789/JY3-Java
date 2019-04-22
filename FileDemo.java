package com.neudeu.Test;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
			File file = new File("G:\\Hello.txt");
			System.out.println(file.canExecute());
			System.out.println("--------------------------我是分割线---------------------------");
			System.out.println(file.canRead());
			System.out.println("--------------------------我是分割线---------------------------");
			System.out.println(file.canWrite());
			System.out.println("--------------------------我是分割线---------------------------");
			
			//delete
//			boolean delete = file.delete();
//			System.out.println(delete);
			
			//exists(判断是否存在)
			boolean exists = file.exists();
			System.out.println(exists);
			System.out.println("--------------------------我是分割线---------------------------");
			
			//getAbsolutePath(绝对路径)
			String absolutePath = file.getAbsolutePath();
			System.out.println(absolutePath);
			System.out.println("--------------------------我是分割线---------------------------");
			
			//getName(文件名)
			String name = file.getName();
			System.out.println(name);
			System.out.println("--------------------------我是分割线---------------------------");
		
			//getParent
			String parent = file.getParent();
			System.out.println(parent);
			System.out.println("--------------------------我是分割线---------------------------");
			
			//isAbsolute
			boolean absolute = file.isAbsolute();
			System.out.println(absolute);
			System.out.println("--------------------------我是分割线---------------------------");
			
			//isDirectory(目录)
			boolean directory = file.isDirectory();
			System.out.println(directory);
			System.out.println("--------------------------我是分割线---------------------------");
			
			//isHidden(隐藏文件)
			boolean hidden = file.isHidden();
			System.out.println(hidden);
			System.out.println("--------------------------我是分割线---------------------------");
			
			//length(文件文本长度)
			long length = file.length();
			System.out.println(length);
			System.out.println("--------------------------我是分割线---------------------------");
			
			//list(查询文件夹的所有文件)
//			String[] list = file.list();
//			for (String string : list) {
//				System.out.println(string);
//			}
			System.out.println("--------------------------我是分割线---------------------------");
			
			//listFiles(取文件)
//			File[] listFiles = file.listFiles();
//			for (File file2 : listFiles) {
//				System.out.println(file2.isDirectory());
//			}
			System.out.println("--------------------------我是分割线---------------------------");
			
			//mkDir(创建目录)
//			File file2 = new File("G:\\123\\321");
//		    if(!file2.exists()) 
//		    {
//		    	boolean mkdir = file2.mkdirs();
//		    	System.out.println(mkdir);
//		    }
			System.out.println("--------------------------我是分割线---------------------------");
			
			//renameTo
			File file3 = new File("G:\\123\\321\\world.txt");
			boolean renameTo = file.renameTo(file3);
			System.out.println(renameTo);
			System.out.println("--------------------------我是分割线---------------------------");
			
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
