package com.neuedu.test;
/*
 * 单项选择提
 */
public class QuestionTest extends Question{
	//标准答案
	String answer;
	public QuestionTest()
	{
		
		
	}
	//构造器
	//题
	public QuestionTest(int id,String text,String[] ops,String answer) 
	{
		this.id = id;
		this.text = text;
		this.options = ops;
		this.answer = answer;
	}
	@Override
	public boolean checkAnswer(String[] ans) {
		if(ans == null || ans.length != 1)
		{
			return false;
		}else
		{
			return this.answer.equals(ans[0]);
		}
	}
	
	
}
