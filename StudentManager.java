package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

//ѧ��������
public class StudentManager
{
	StudentClient sc;
	
	public StudentManager()
	{
		
	}
	public StudentManager(StudentClient sc)
	{
		this.sc = sc;
	}
	//��������
	static Student[] stus = new Student[0];
	//ɾ��������
	static Student[] newStus;
	
	
	//���ѧ��
	public void addStudent(Student student)
	{
		stus = Arrays.copyOf(stus, stus.length+1);
		stus[stus.length-1] = student;
	}
	//���ѧ������
	public void addStu(Scanner scanner) 
	{
		System.out.println("������ѧ��ID��");
		int id = scanner.nextInt();
		System.out.println("������ѧ��������");
		String name = scanner.next();
		System.out.println("������ѧ���Ա�");
		char sex = scanner.next().charAt(0);
		System.out.println("������ѧ�����䣨ֻ��1-120֮�ڵ����֣���");
		short age = scanner.nextShort();
		System.out.println("������ѧ�������꼶��ֻ�ܴ������м����߼�����");
		String grade = scanner.next();
		System.out.println("������ѧ����ַ��");
		String address = scanner.next();
		System.out.println("������ѧ����ϵ��ʽ��");
		int tel = scanner.nextInt();
		System.out.println("������ѧ���������䣨����@��.com����");
		String email = scanner.next();
		
		
		StudentManager studentManager = new StudentManager();
		Student stu = new Student(id,name,sex,age,grade,address,tel,email);
		studentManager.addStudent(stu);
		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
		sc.managerIndex();
	}
	
	
	
	
	
	//����idɾ��
	public Student[] oneStudentId(int id)
	{
		int j = 0;
		//�����е�Ԫ��
		for(int i=0;i<stus.length;i++)
		{
			newStus = new Student[stus.length-1];
			//�ж�ѧ���Ƿ���id
			if(id != stus[i].id)
			{
				newStus[j]=stus[i];
				j++;
			}
		}
		stus = newStus;
		return newStus;
	}
   //����id�޸�ѧ��
	public void dateStudentInfo(Student student)
	{
		//�ҵ�Ҫ�޸ĵ�ѧ��
		for(int i=0;i<stus.length;i++) 
		{
			if(stus[i].id == student.id) 
			{
				//�ҵ�id��ͬ��ѧ��
				stus[i] = student;
				
			}
		}
	}
	
	
}
