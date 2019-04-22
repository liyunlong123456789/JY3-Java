package com.neuedu.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamDemo {
	public static void main(String[] args) {
//		Account account = new Account("小东子","jingdongone");
//		File file = new File("G:\\Account.txt");
//		try (FileOutputStream fileOutputStream = new FileOutputStream(file);
//			ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);)
//		{
//			oos.writeObject(account);
//			System.out.println("写出成功.....");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		//读取序列化文件的内容
	}
}
class Account implements Serializable
{
	public Account() 
	{
		
	}
	
	public Account(String userName, String psw) {
		this.userName = userName;
		this.psw = psw;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	
	@Override
	public String toString() {
		return "用户名:" + userName + ", 密码:" + psw;
	}


	private String userName;
	private transient String psw;
	
}