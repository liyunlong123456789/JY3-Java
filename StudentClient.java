package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

public class studentClient {
	public studentClient() {}
	// ��ʼ���û���������
	static String userName = "admin";
	static String password = "admin";
	// ����Scanner��
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		studentClient studentclient = new studentClient();
		studentclient.welcomePage();
		studentclient.studentIndex();
	}
	// ��ӭ����
	public  void welcomePage() {
		System.out.println("----------��ӭ��¼ѧ������ϵͳ----------");
		System.out.println("1.��¼             2.�˳�");
		System.out.println("---------------------------------");
		// �����û������1��2;
		System.out.println("��ѡ��:");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			System.out.println("��ӭ��¼");
			System.out.println("�������û���");
			String username = scanner.next();
			System.out.println("����������");
			String psw = scanner.next();
			Admin admin = new Admin(username,psw);
			boolean login = login(admin);
			if(login==true)
			{
				System.out.println("��ӭ����"+username);
			}else
			{
				System.out.println("��¼ʧ��...");
				welcomePage();
			}
			break;
		case 2:
			System.out.println("���˳�");
			exitSystem();
			break;
		default:
			System.out.println("��������,����ѡ��");
			welcomePage();
			break;
		}
	}

	// ��¼����
	public boolean login(Admin admin) {
		// �жϴ�����û����������Ƿ�һ��
		if (userName.equals(admin.getUserName()) && password.equals(admin.getPassWord())) {
			return true;
		} else {
			return false;
		}
	}

	// �˳�ϵͳ
	public void exitSystem() {
		System.exit(0);
	}
	//����һ��studentManager�Ķ���
	StudentManager studentManager = new StudentManager(this);
	//ѧ���������ҳ
	public void studentIndex()
	{
		System.out.println("**********��ѡ��Ҫ��������Ϣ��Ӧ����****************");
		System.out.println("*1.�鿴ѧ����Ϣ      2.���ѧ����Ϣ       3.ɾ��ѧ����Ϣ      4.�޸�ѧ����Ϣ     5.�˳�");
		System.out.println("**************************************");
		System.out.println("��ѡ��:");
		//���������ѡ��
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			studentIndexOne();
			break;
			
		case 2:
			studentManager.addStuPage(scanner);
			break;
		case 3:
			System.out.println("������Ҫɾ����ѧ��ID");
			StudentManager.stus = studentManager.delOneStudentByStuID();
			System.out.println("ɾ���ɹ����Զ�������һ��");
			studentIndex();
			break;
		case 4:
			studentIndexTow();
			break;
		case 5:
			exitSystem();
			break;
		default:
			System.out.println("�����������������");
			studentIndex();
			break;
		}
	}
	public void studentIndexOne()
	{
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+  1.�鿴����ѧ����Ϣ          2.����id��ѯѧ����Ϣ          3.����id��ѯѧ������          4.������һ��          +");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("��ѡ��:");
		//���������ѡ��
		int nextInt = scanner.nextInt();
		switch(nextInt) {
		case 1:
			System.out.println(Arrays.toString(StudentManager.stus));
			System.out.println("��ѯ��ϣ�ϵͳ���Զ�����Ŀ¼");
			studentIndexOne();
			break;
		case 2:
			studentManager.watchIdMissage();
			System.out.println("��ѯ��ϣ�ϵͳ���Զ�����Ŀ¼");
			studentIndexOne();
			break;	
		case 3:
			studentManager.watchIdName();
			System.out.println("��ѯ��ϣ�ϵͳ���Զ�����Ŀ¼");
			studentIndexOne();
			break;	
		case 4:
			studentIndex();
			break;
		default:
			System.out.println("�����������������");
			studentIndex();
			break;
		}
	}
	public void studentIndexTow()
	{
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("1.����ID�޸�ѧ��ȫ����Ϣ                    2.����ID�޸�ѧ��������Ϣ                    3.�����ϼ�Ŀ¼                    4.ϵͳ�˳�");
		System.out.println("----------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��:");
		int id = scanner.nextInt();
		switch(id) {
		case 1:
			studentManager.updateStudentInfo(scanner);
			System.out.println("�޸ĳɹ�");
			System.out.println("ϵͳ�Զ������ϲ�Ŀ¼....");
			studentIndexTow();
			break;
		case 2:
			studentManager.studentIdChange(scanner);
			System.out.println("�޸ĳɹ�");
			System.out.println("ϵͳ�Զ������ϲ�Ŀ¼....");
			studentIndexTow();
			break;
		case 3:
			studentIndex();
			break;
		case 4:
			exitSystem();
			break;
		default:
			System.out.println("������������������");
			studentIndexTow();
		}
	}
}
