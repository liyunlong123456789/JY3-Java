package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

public class StudentClient {
	//��ʼ�û���������
	static String username = "admin";
	static String password = "admin"; 
	//����scanner
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//�����ͻ���
		StudentClient studentClient =  new StudentClient();
		studentClient.welcomePage();
		studentClient.managerIndex();
	}
	//����һ������
	StudentManager sm = new StudentManager(this);
	//��ӭ����
	public void welcomePage()
	{
		System.out.println("-----------------��ӭ��¼ѧ����Ϣ����ϵͳ-----------------");
		System.out.println("1.��¼     2.�˳�");
		System.out.println("-------------------------------------------------------");
		//�����û���Ϣ
		System.out.println("��ѡ��");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("��ӭ��¼��");
			System.out.println("�������û���:");
			String username = scanner.next();
			System.out.println("����������:");
			String passsword = scanner.next();
			Admin admin = new Admin(username,passsword);
			boolean login = login(admin);
			if(login == true)
			{
				System.out.println("��ӭ��"+username+"��¼��");
			}else
			{
				System.out.println("��¼ʧ�ܣ�����");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("�˳��ɹ�");
			exitSystem();
			break;
			
		default:
			System.out.println("������������������");
			welcomePage();
			break;
		}
		
		
		
		
	}
	//��¼
	public boolean login(Admin admin) 
	{
		//�ж��û��������Ƿ�һ��
		if(username.equals(admin.username) && password.equals(admin.password))
		{
			return true;
		}else 
		{
			return false;
		}
	}
	//�˳�
	public void exitSystem() 
	{
		System.exit(0);
	}
	
	
	//ѧ��������ҳ
	public void managerIndex() 
	{
		System.out.println("**************************��ѡ��Ҫ��������Ϣ��Ӧ������**************************");
		System.out.println("*1.�鿴ѧ����Ϣ       2.���ѧ����Ϣ      3.ɾ��ѧ����Ϣ       4.�޸�ѧ����Ϣ       5.�˳�");
		System.out.println("***********************************************************************");
		System.out.println("��ѡ��");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			break;
		case 2:
			sm.addStu(scanner);
			break;
		case 3:
			System.out.println("������ѡ��ɾ����ID");
			int ID = scanner.nextInt(); 
			sm.oneStudentId(ID);
			System.out.println("ɾ���ɹ�");
			managerIndex();
			
			
		break;
		default:
			break;
		}
	}
}
