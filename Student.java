package com.neudeu.Test;

public class Student implements Comparable<Student>{
	public Student() {
		
	}
	
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		
		//return this.getAge() - o.getAge();//比较年龄，从小到大
		return this.getName().compareTo(o.getName());//比较名字  
	}

	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null) 
//		{
//			return false;
//		}
//		if(obj instanceof Student)
//		{
//			Student stu = (Student)obj;
//			if(this.name.equals(stu.getName()) && this.age == stu.getAge())
//			{
//				return true;
//			}
//		}
//		return false;
//	}
	
	
}
