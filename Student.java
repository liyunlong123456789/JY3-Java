package com.neuedu.test;
/*
 *ѧ����
 *id
 *����
 *�Ա�
 *����
 *�꼶
 *��ַ
 *��ϵ��ʽ
 *��������
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
		return "id=" + id + ",����=" + name + ", �Ա�=" + sex + ", ����=" + age + ", �༶=" + grade
				+ ", ��ַ=" + address + ", ��ϵ��ʽ=" + tel + ", �����ַ=" + email + "]";
	}

	int id;// id
	String name;// ����
	char sex;// �Ա�
	short age;// ����
	String grade;// �꼶
	String address;// ��ַ
	int tel;// ��ϵ��ʽ
	String email;// ��������

}
