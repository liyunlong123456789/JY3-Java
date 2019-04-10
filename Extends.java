package com.neuedu.test;

public class Extends {
	public static void main(String[] args)
	{
		noteComputer noteComputer = new noteComputer();
		noteComputer.playGame();
	}

}
class Computer
{
	String brand;
	String type;
	public void playGame() 
	{
		System.out.println("Gaming");
		
	}
	public void playCode() 
	{
		System.out.println("Coding");
		
	}
}
class noteComputer extends Computer
{
	public void playGame()
	{
		System.out.println("ÍæLOL");
		
	}
	public void playCode(String name) 
	{
		System.out.println(name+"´úÂë");
	}
}

