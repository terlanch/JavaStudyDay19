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
		
		//��ȡStream����
		Stream<String> stream = list.stream();
		//ɸѡlist����c��ͷ��Ԫ��
		stream.filter(str -> str.startsWith("c")).sorted((s1,s2) -> s1.compareTo(s2)).forEach(str -> System.out.println(str));
		
//		stream.filter(new Predicate<String>(){
//
//			@Override
//			//t����list�е�Ԫ��
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
