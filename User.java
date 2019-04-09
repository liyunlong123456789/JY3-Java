package com.neuedu.demo;

public class User {
	
	public User() {
		usernames = new String[] {"hello"};
		psw = new String[] {"123456789"};
		
	}
	String username;
	
	
	String password;
	
	String [] usernames;
	
	String [] psw;
	
	public boolean checkUser(String username,String password)
	{
		
		for(int i=0;i<usernames.length;i++)
		{
			
			if(usernames[i].equals(username)  && psw[i].equals(password) )
			{
				
				return true;
			}
		}
		return false;
	}

}
