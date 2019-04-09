package com.neuedu.demo;

public class Circle {
	public Circle() 
	{
		
	}
	public Circle(Point p1,int r) 
	{
		this.p1 = p1;
		this.r =r;
	}
	
	Point p1;
	int r;
	public double getArea(int r)
	{
		return Math.PI*r*r;
	}
	
	public boolean contains(Point p)
	{
		boolean result = Math.pow((p.x - p1.x),2)+Math.pow((p.y - p1.y),2) <= r*r;
		return result;
	}
	public boolean contains(int x,int y)
	{
		boolean result = Math.pow((x - p1.x),2)+Math.pow((y - p1.y),2) <= r*r;
		return result;
	}


}
class Point
{
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	
	int y;
}