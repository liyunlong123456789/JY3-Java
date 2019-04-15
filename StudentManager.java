package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

//学生管理类
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
	//声明数组
	static Student[] stus = new Student[0];
	//删除后数组
	static Student[] newStus;
	
	
	//添加学生
	public void addStudent(Student student)
	{
		stus = Arrays.copyOf(stus, stus.length+1);
		stus[stus.length-1] = student;
	}
	//添加学生界面
	public void addStu(Scanner scanner) 
	{
		System.out.println("请输入学生ID：");
		int id = scanner.nextInt();
		System.out.println("请输入学生姓名：");
		String name = scanner.next();
		System.out.println("请输入学生性别：");
		char sex = scanner.next().charAt(0);
		System.out.println("请输入学生年龄（只能1-120之内的数字）：");
		short age = scanner.nextShort();
		System.out.println("请输入学生所属年级（只能处级、中级、高级）：");
		String grade = scanner.next();
		System.out.println("请输入学生地址：");
		String address = scanner.next();
		System.out.println("请输入学生联系方式：");
		int tel = scanner.nextInt();
		System.out.println("请输入学生电子邮箱（包含@和.com）：");
		String email = scanner.next();
		
		
		StudentManager studentManager = new StudentManager();
		Student stu = new Student(id,name,sex,age,grade,address,tel,email);
		studentManager.addStudent(stu);
		System.out.println("数据保存成功，系统将自动返回上层目录~");
		sc.managerIndex();
	}
	
	
	
	
	
	//根据id删除
	public Student[] oneStudentId(int id)
	{
		int j = 0;
		//数组中的元素
		for(int i=0;i<stus.length;i++)
		{
			newStus = new Student[stus.length-1];
			//判断学生是否有id
			if(id != stus[i].id)
			{
				newStus[j]=stus[i];
				j++;
			}
		}
		stus = newStus;
		return newStus;
	}
   //根据id修改学生
	public void dateStudentInfo(Student student)
	{
		//找到要修改的学生
		for(int i=0;i<stus.length;i++) 
		{
			if(stus[i].id == student.id) 
			{
				//找到id相同的学生
				stus[i] = student;
				
			}
		}
	}
	
	
}
