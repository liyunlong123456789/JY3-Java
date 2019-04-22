package com.neudeu.Test;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Student> sets = new TreeSet<>();
		sets.add(new Student("a",16));
		sets.add(new Student("b",18));
		sets.add(new Student("A",20));
		sets.add(new Student("B",24));
		System.out.println(sets);
	}
}
