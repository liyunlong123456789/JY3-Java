package com.neuedu;

import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) 
	{
		String name;
		String password;
	System.out.println("-----------------��ӭ��¼ѧ����Ϣ����ϵͳ-----------------");	
	System.out.println("\t"+"1.��¼"+"\t"+"2.�˳�");
	System.out.println("----------------------------------------------------------");
	Scanner scanner = new Scanner(System.in);
	System.out.println("��ѡ��");
	int num = scanner.nextInt();
	if(num == 1) 
	{
		
	
	System.out.println("��ӭ��¼��");
	while(1==1) 
	{
	System.out.println("�������û�����");
	name = scanner.next();
	System.out.println("���������룺");
	password = scanner.next();
	if(name.equals("admin")   &&  password.equals("admin"))
	{
		System.out.println("��¼�ɹ�");
		System.out.println("��ӭ����"+name);
		break;
	}
	}
	}else 
	{
		if( num == 2) {System.exit(0);}
	}
	
	}

}
