package com.neuedu.test;

public class Student {
	public Student() {
	}

	public Student(int id, String stuname, String stusex, int stuage, String stuGrade, String stuAddress, String stuTel,
			String stuEmail) {
		this.id = id;
		this.stuName = stuname;
		this.stusex = stusex;
		this.stuage = stuage;
		this.stuGrade = stuGrade;
		this.stuAddress = stuAddress;
		this.stuTel = stuTel;
		this.stuEmail = stuEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStusex() {
		return stusex;
	}

	public void setStusex(String stusex) {
		this.stusex = stusex;
	}

	public int getStuage() {
		return stuage;
	}

	public void setStuage(int stuage) {
		this.stuage = stuage;
	}

	public String getStuGrade() {
		return stuGrade;
	}

	public void setStuGrade(String stuGrade) {
		this.stuGrade = stuGrade;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public String getStuTel() {
		return stuTel;
	}

	public void setStuTel(String stuTel) {
		this.stuTel = stuTel;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	@Override
	public String toString() {
		return "Student [学生id为" + id + ", 学生名字为=" + stuName + ", 性别  " + stusex + ", 年龄  " + stuage + ", 年级  "
				+ stuGrade + ", 地址  " + stuAddress + ", 电话  " + stuTel + ", Email  " + stuEmail + "]";
	}

	private int id;
	private String stuName;
	private String stusex;
	private int stuage;
	private String stuGrade;
	private String stuAddress;
	private String stuTel;
	private String stuEmail;
}
