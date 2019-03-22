package cn.tedu.setpracticedemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetPractice2 {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("hello");
		hashSet.add("world");
		hashSet.add("hashSet");
		System.out.println(hashSet);//world hashSet hell
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("hello");
		lhs.add("world");
		lhs.add("linkedHashSet");
		System.out.println(lhs);//hello world linkedHashSet
		
		lhs.remove("hello");
		lhs.add("hello");
		System.out.println(lhs);//world linkedHashSet hello
		
		//‘Ÿ¥ŒÃÌº”
		lhs.add("hello");
		System.out.println(lhs);
		
	}
}
