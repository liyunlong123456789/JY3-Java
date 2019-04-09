package com.neuedu.demo;

public class CircleTset {
	public static void main(String[] agrs)
	{
		
		Point center = new Point(0,0);
		
		Circle circle = new Circle(center,2);
		
		Point comparePoint = new Point(2,0);
		
		System.out.print(circle.contains(comparePoint.x,comparePoint.y) == true? "在圆内":"在圆外");
	}
	
	

}
