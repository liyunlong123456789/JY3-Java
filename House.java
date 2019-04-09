package com.neuedu.demo;

public class House {
	//结婚规则
	public boolean marryRules(Person p1,Person p2)
	{
		if(p1.gender != p2.gender)
		{
			if(p1.age >= 22 && p2.age >= 20  && p1.gender == "男"  || p1.age >= 20 && p2.age>= 22 && p1.gender == "女")
			{
				if(!p1.marry && !p2.marry)
				{
					p1.marry = true;
					p2.marry = true;
					p1.fere.name = p2.name;
					p2.fere.name = p1.name;
					return true;
				}
			}
		}
		return false;
	}

}
