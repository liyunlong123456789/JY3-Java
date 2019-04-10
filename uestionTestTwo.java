package com.neuedu.test;

public class uestionTestTwo {
	
	public static void main(String[] args)
	{
		String[] options = new String[] {
				"范冰冰","迪丽热巴","林志玲","古力娜扎"
		};
		QuestionTest sq = new QuestionTest(1, "世界上最美的人是谁", options, "迪丽热巴");
		String[] ans = new String[] 
		{
			"迪丽热巴"	
		};
		boolean checkAnswer =sq.checkAnswer(ans);
		sq.printQues();
		 System.out.println(checkAnswer == true?"回答正确":"回答错误");
	}

}
