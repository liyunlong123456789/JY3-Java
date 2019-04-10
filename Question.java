package com.neuedu.test;
/*
 * 选择题
 */
public class Question {
	//题号
	int id;
	//题干
	String text;
	//选项
	String[] options = {};
	//检查答案方法
	public boolean checkAnswer(String[] ans) 
	{
		return false;
	}
	//打印题目
	public void printQues() 
	{
		System.out.println("题号"+id+"，题干"+text);
		for(String str : options)
		{
			System.out.println("\t"+str);
			
		}
		System.out.println();
	}

}
