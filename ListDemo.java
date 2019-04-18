package com.neuedu.test;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {
			//ArrayList
			List<String> list = new ArrayList<String>();
			list.add("hello");
			list.add("world");
			//add(int index,E e)
 			list.add(1, "element");
			System.out.println(list);
			System.out.println("---------分割线--------------");
			//clear
//				list.clear();
//				System.out.println(list);
			//contains
			boolean contains = list.contains("element");
			System.out.println(list);
			System.out.println("---------分割线--------------");
			//get
			Object string = list.get(1);
			System.out.println(string);
			System.out.println("---------分割线--------------");
			//indexOf
			int indexOf = list.indexOf("hello");
			System.out.println(indexOf);
			System.out.println("---------分割线--------------");
			//isEmpty
			boolean empty = list.isEmpty();
			System.out.println(empty);
			System.out.println("---------分割线--------------");
			//remove
//				boolean remove = list.remove("hello");
//				System.out.println(remove);
//				System.out.println(list);
//			List <String>lists = new ArrayList();
//			lists.add("hello");
//			lists.add("world");
//			boolean removeAll = list.removeAll(lists);
//			System.out.println(list);
			System.out.println("---------分割线--------------");
			//set
			String set = list.set(1, "你好，世界");
			System.out.println(set);
			System.out.println(list);
			System.out.println("---------分割线--------------");
			//size
			System.out.println(list.size());
			System.out.println("---------分割线--------------");
			//遍历方式
			for(int i = 0; i< list.size();i++ ) 
			{
				System.out.println(list.get(i));
				System.out.println("---------分割线--------------");
			}
			//增强for循环
			for(String str:list)
			{
				System.out.println(str);
				System.out.println("---------分割线--------------");
			}
			//sublist(int fromIndex,int endIndex)开始位置、结束位置
			List<String> subList = list.subList(0, 1);
			System.out.println(subList);
			System.out.println("---------分割线--------------");
			//toArray
			Object[] array = list.toArray();
			for (Object object : array) {
				System.out.println(object);
				System.out.println("---------分割线--------------");
			}
			//addAll
			List<String> arrayList = new ArrayList<>();
			arrayList.add("1");
			arrayList.add("2");
			boolean addAll = list.addAll(0,arrayList);
			System.out.println(list);
			
			
			
			
			
			
	}
}
