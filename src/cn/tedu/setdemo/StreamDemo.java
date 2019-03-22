package cn.tedu.setdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("c2");
		list.add("c1");
		list.add("c3");
		list.add("oc");
		
		//获取Stream对象
		Stream<String> stream = list.stream();
		//筛选list中以c开头的元素
		stream.filter(str -> str.startsWith("c")).sorted((s1,s2) -> s1.compareTo(s2)).forEach(str -> System.out.println(str));
		
//		stream.filter(new Predicate<String>(){
//
//			@Override
//			//t就是list中的元素
//			public boolean test(String t) {
//				// TODO Auto-generated method stub
//				return t.startsWith("c");
//			}
//			
//		}).sorted(new Comparator<String>(){
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.charAt(1) - o2.charAt(1);
//			}
//			
//		})
//		.forEach(new Consumer<String>(){
//
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
		
		System.out.println(list);
	}
}
