package com.neuedu.test;
/*
 * ѡ����
 */
public class Question {
	//���
	int id;
	//���
	String text;
	//ѡ��
	String[] options = {};
	//���𰸷���
	public boolean checkAnswer(String[] ans) 
	{
		return false;
	}
	//��ӡ��Ŀ
	public void printQues() 
	{
		System.out.println("���"+id+"�����"+text);
		for(String str : options)
		{
			System.out.println("\t"+str);
			
		}
		System.out.println();
	}

}
