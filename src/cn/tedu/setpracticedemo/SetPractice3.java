package cn.tedu.setpracticedemo;

import java.util.TreeSet;

public class SetPractice3 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(9);
		ts.add(6);
		ts.add(-4);
		ts.add(3);
		
		//-4 3 6 9 自动排序
		System.out.println(ts);
		//-4 集合中的首个元素
		System.out.println(ts.first());
		//9 集合中最后一个元素
		System.out.println(ts.last());
		//[-4,3] 集合中小于6的元素，不包含6
		System.out.println(ts.headSet(6));
		//[3,6,9]集合中大于3 的元素包含3
		System.out.println(ts.tailSet(3));
		//[-4,3]集合中大于等于-4 小于不等于6的元素
		System.out.println(ts.subSet(-4,6));
		
		
	}
}
