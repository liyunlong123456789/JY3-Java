package com.neuedu.test;
/*
 *学生类
 *id
 *姓名
 *性别
 *年龄
 *年级
 *地址
 *联系方式
 *电子邮箱
 */

public class Student 
{
	public Student(int id,String name,char sex,short age,String grade,String address,int tel,String email) 
	{
		this.id = id;
		this.name =name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
		this.address = address;
		this.tel = tel;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ",名字=" + name + ", 性别=" + sex + ", 年龄=" + age + ", 班级=" + grade
				+ ", 地址=" + address + ", 联系方式=" + tel + ", 邮箱地址=" + email + "]";
	}

	int id;// id
	String name;// 姓名
	char sex;// 性别
	short age;// 年龄
	String grade;// 年级
	String address;// 地址
	int tel;// 联系方式
	String email;// 电子邮箱

}
