package com.neuedu.test;

import java.util.LinkedList;
import java.util.List;

public class LinkDemo {
	public static void main(String[] args) {
		LinkedList<String> datas = new LinkedList<>();
		datas.add("hello");
		datas.add("hello");
		datas.add("hello");
		System.out.println(datas);
		//addFirst   addLast   (ͷ��β)
		datas.addFirst("���");
		datas.addLast("����");
		System.out.println(datas);
		
		
		
	}

}
