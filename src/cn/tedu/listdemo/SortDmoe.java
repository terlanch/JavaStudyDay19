package cn.tedu.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortDmoe {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("vvv");
		list.add("ttt");
		list.add("iii");
		list.add("ggg");
		//讲list中的内容按照首字符进行排序
//		list.sort(new Comparator<String>(){
//
//			@Override
//			//比较两个字符串的首字符的差值
//			//o1的字符如果大于o2的字符（返回值是正数），那么将o2排在o1前面
//			//o1的字符如果小于o2的字符（返回值是负数），那么将o2排在o1后面
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.charAt(0) - o2.charAt(0);
//			}
//			
//		});
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.charAt(0) - o2.charAt(0);
			}
		});
		System.out.println(list);
	}
}
