package com.neuedu;

import java.util.Scanner;

public class StudentDemo3 {
	public StudentDemo3() 
	{
		String num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("*************************���ѧ����Ϣ***************************");
		
		System.out.println("������ѧ��id��");
		do {
		 num = scanner.next();
		
		if(num == "3" ) 
		{
			System.out.println("��id3���ڣ����������룺");
		}
		}while(num == "3");
		System.out.println("������ѧ��������");
		String num3 = scanner.next();
		System.out.println("������ѧ���Ա�");
		String num4 = scanner.next();
		do {
			
		
		if(num4 == "��"  ||  num4 =="Ů")
		{
			break;
		}
		}while(num4 == "��");
		System.out.println("������ѧ�����䣨ֻ��1-120֮�ڵ����֣���");
		String num5 = scanner.next();
		System.out.println("������ѧ�������꼶��ֻ�ܳ������м����߼�����");
		String num6 = scanner.next();
		System.out.println("������ѧ����ַ��");
		String num7 = scanner.next();
		System.out.println("������ѧ����ϵ��ʽ��11λ�ֻ��ţ���");
		String num8 = scanner.next();
		System.out.println("������ѧ���������䣨����@��.com����");
		String num9 = scanner.next();
	}

}
