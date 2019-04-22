package com.neudeu.Test;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("张三",15));
		set.add(new Student("李四",15));
		set.add(new Student("王五",15));
		set.add(new Student("赵六",15));
		System.out.println(set);
		System.out.println("---------------我是分割线-------------------");
		//clear(清空)
//		set.clear();
//		System.out.println(set);
		//contains
		boolean contains = set.contains(new Student("张三",15));
		System.out.println(contains);
		System.out.println("---------------我是分割线-------------------");
		//isEmpty(是否为空)
		boolean empty = set.isEmpty();
		System.out.println(empty);
		System.out.println("---------------我是分割线-------------------");
		//迭代器
		for (Student student : set) {
			System.out.println(student);
		}
		System.out.println("---------------我是分割线-------------------");
		//set.iterator(迭代器)
		Iterator<Student> iterator = set.iterator();
//		boolean hasNext = iterator.hasNext();
//		System.out.println(hasNext);
//		Student next3 = iterator.next();
//		Student next2 = next3;
//		Student next = next2;
//		System.out.println(next);
		while(iterator.hasNext()) 
		{
			Student next4 = iterator.next();
			System.out.println(next4);
		}
		System.out.println("---------------我是分割线-------------------");
		//remove (移除)
		boolean remove = set.remove(new Student("张三",15));
		System.out.println(remove);
		System.out.println(set);
		
	}
}
