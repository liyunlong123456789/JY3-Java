package com.neuedu.test;

public class StringDemo {
	
	public static void main(String[] args) {
			//length
			String str = "hello";
			System.out.println(str.length());
			String[] strs = {"1","2"};
			System.out.println(strs.length);
			//charAt
			char chatAt = str.charAt(0);
			System.out.println(chatAt);
			//substring
			String substring = str.substring(1,4);
			System.out.println(substring);
			//compareTo   compareToIgnore
			String str2 = "abc";
			String str3 = "ABC";
			int compareTo = str2.compareTo(str3);
			System.out.println(compareTo);
			//concat
			String concat = str2.concat(str3);
			System.out.println(concat);
			
			//indexOf   
			String str4 = "neuedu";
			int indexOf = str4.indexOf("u");
			System.out.println(indexOf);
			//lastindexOf
			String str5 = "neuedu";
			int lastIndexOf = str5.lastIndexOf("e");
			System.out.println(lastIndexOf);
			
			//toLowerCase(小写)    toUpperCase(大写)
			String lowerCase = str5.toLowerCase();
			System.out.println(lowerCase);
			String upperCase = lowerCase.toUpperCase();
			System.out.println(upperCase);
			
			//replace(字符)    replaceFirst(替换第一次出现，字符串)
			String str6 = "neusoftn";
			String replace = str6.replace('n', 'a');		
			System.out.println(replace);
			
			//trim 去前、后空格
			String str7 = "            789     789             ";
			String trim = str7.trim();
			System.out.println(trim);
			//startWith  endsWith
			String str8 = "www.baidu.com";
			boolean startsWith = str8.startsWith("www");
			System.out.println(startsWith);
			boolean endsWith = str8.endsWith("cn");
			System.out.println(endsWith);
			//contains
			String str9 = "l  love  me";
			boolean contains = str9.contains("love");
			System.out.println(contains);
			//split 切割
			String str10 = "1,李四,18,天津,津jd7922";
			String[] split = str10.split(",");
			System.out.println(split[1]);
			//equals equalsIgnoreCase(相等忽略大小写)
			String str11 = "CSDN";
			String str12 = "csdn";
			System.out.println(str11.equalsIgnoreCase(str12));
			//gdk
			byte[] bs = new byte[] {1,2,3};
			String string = new String(bs);
			System.out.println(string);
			
			//将其他类型转换为字符串
			String valueOf = String.valueOf(true);
			System.out.println(valueOf);
			String valueOf2 = String.valueOf(1.5 );
			System.out.println(valueOf2);
	}
}
