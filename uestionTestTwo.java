package com.neuedu.test;

public class uestionTestTwo {
	
	public static void main(String[] args)
	{
		String[] options = new String[] {
				"������","�����Ȱ�","��־��","��������"
		};
		QuestionTest sq = new QuestionTest(1, "����������������˭", options, "�����Ȱ�");
		String[] ans = new String[] 
		{
			"�����Ȱ�"	
		};
		boolean checkAnswer =sq.checkAnswer(ans);
		sq.printQues();
		 System.out.println(checkAnswer == true?"�ش���ȷ":"�ش����");
	}

}
