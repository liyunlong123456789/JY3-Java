package com.neudeu.Test;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, Student> maps = new HashMap<>();
		maps.put("stu001", new Student("����",15));
		maps.put("stu002", new Student("����",16));
		maps.put("stu003", new Student("����",17));
		maps.put("stu004", new Student("����",18));
		System.out.println(maps);
		
		
	}

}
