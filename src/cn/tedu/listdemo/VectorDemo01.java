package cn.tedu.listdemo;
import java.util.Enumeration;
/*
 * vector在JDK1.0就有了，查询速度快，增删速度慢
 * 线程安全
 * 
 * vector默认容量为10，容量增加量为0
 * 
 * vector的特有迭代器是Enumeration<E>
 * 迭代器是循环遍历集合的一个集合工具
 */
import java.util.Vector;

public class VectorDemo01 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(10,5);
		for(int i = 0;i < 16;i++){
			v.add("abc");
		}
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			String s = e.nextElement();
			System.out.print(s+" ");
			
		}
		System.out.println(v.capacity());
	}
}
