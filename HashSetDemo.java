package com.neudeu.Test;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("����",15));
		set.add(new Student("����",15));
		set.add(new Student("����",15));
		set.add(new Student("����",15));
		System.out.println(set);
		System.out.println("---------------���Ƿָ���-------------------");
		//clear(���)
//		set.clear();
//		System.out.println(set);
		//contains
		boolean contains = set.contains(new Student("����",15));
		System.out.println(contains);
		System.out.println("---------------���Ƿָ���-------------------");
		//isEmpty(�Ƿ�Ϊ��)
		boolean empty = set.isEmpty();
		System.out.println(empty);
		System.out.println("---------------���Ƿָ���-------------------");
		//������
		for (Student student : set) {
			System.out.println(student);
		}
		System.out.println("---------------���Ƿָ���-------------------");
		//set.iterator(������)
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
		System.out.println("---------------���Ƿָ���-------------------");
		//remove (�Ƴ�)
		boolean remove = set.remove(new Student("����",15));
		System.out.println(remove);
		System.out.println(set);
		
	}
}
