package com.neuedu.test;
/*
 * ����ѡ����
 */
public class QuestionTest extends Question{
	//��׼��
	String answer;
	public QuestionTest()
	{
		
		
	}
	//������
	//��
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
