package com.neuedu.demo;

import java.util.Scanner;

public class Test {
	private static String username;

	public static void main(String[] args)
	{
		
		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������û�����");
		String usernam = scanner.next();
		System.out.print("���������룺");
		String psw = scanner.next();
		boolean checkUser = user.checkUser(usernam, psw);
		//System.out.print(checkUser);
		System.out.print(checkUser == true ? "��¼�ɹ�":"��¼ʧ��");
		scanner.close();
		
	}

}
